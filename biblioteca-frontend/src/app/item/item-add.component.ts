import { Component } from '@angular/core';
import { ItemService } from './item.service';
import { Router } from '@angular/router';

@Component({
selector: 'app-item-add',
templateUrl: './item-add.component.hmtl',
styleUrls: ['./item-add.component.css'],
})
export class ItemAddComponent {
item: any = {};
tipo: string = '';

constructor(private service: ItemService, private router: Router)
{ }

onSubmit() {
this.item['@type'] = this.tipo;
this.service.addItem(this.item).subscribe({
next: () => this.router.navigate(['/list']),
error: (err) => console.error('Erro ao adicionar:', err)
});
}
}