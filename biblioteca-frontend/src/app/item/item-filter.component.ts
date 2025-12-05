import { Component } from '@angular/core';
import { ItemService } from './item.service';

@Component({
    selector: 'app-item-filter',
    templateUrl: './item-filter.component.html',
    styleUrls: ['./item-filter.component.css']
})
export class ItemFilterComponent {
    categoria: string = '';
    items: any[] = [];

    constructor(private service: ItemService) { }

    onFilter(): void {
        if (this.categoria) {
            this.service.getItemsByCategoria(this.categoria).subscribe({
                next: (data) => this.items = data,
                error: (err) => console.error('Erro ao filtrar:', err)
            });
        }
    }

    resetFilter(): void {
        this.categoria = '';
        this.items = [];
    }
}