import { Component, OnInit } from '@angular/core';
import { ItemService } from './item.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
    selector: 'app-item-edit',
    templateUrl: './item-edit.component.html',
    styleUrls: ['./item-edit.component.css']
})
export class ItemEditComponent implements OnInit {
    item: any = {};
    tipo: string = '';

    constructor(
        private service: ItemService,
        private route: ActivatedRoute,
        private router: Router
    ) { }

    ngOnInit(): void {
        const id = this.route.snapshot.paramMap.get('id');
        if (id) {
            this.service.getAllItems().subscribe({
                next: (items) => {
                    this.item = items.find(item => item.id === +id);
                    this.tipo = this.item['@type'];
                },
                error: (err) => console.error('Erro ao carregar:', err)
            });
        }
    }

    onSubmit(): void {
        this.item['@type'] = this.tipo;
        this.service.updateItem(this.item.id, this.item).subscribe({
            next: () => this.router.navigate(['/list']),
            error: (err) => console.error('Erro ao atualizar:', err)
        });
    }
}