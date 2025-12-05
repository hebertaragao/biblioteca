import { Component, OnInit } from '@angular/core';
import { ItemService } from './item.service';

@Component({
    selector: 'app-item-list',
    templateUrl: './item-list.component.html',
    styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {
    items: any[] = [];

    constructor(private service: ItemService) { }

    ngOnInit(): void {
        this.service.getAllItems().subscribe({
            next: (data) => this.items = data,
            error: (err) => console.error('Erro ao listar:', err)
        });
    }

    deleteItem(id: number): void {
        if (confirm('Deseja excluir este item?')) {
            this.service.deleteItem(id).subscribe({
                next: () => this.items = this.items.filter(item => item.id !== id), error: (err) => console.error('Erro ao excluir:', err)
            });
        }
    }
}
