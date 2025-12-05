import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ItemAddComponent } from './item/item - add.component';
import { ItemListComponent } from './item/item - list.component';
import { ItemFilterComponent } from './item/item - filter.component';
import { ItemEditComponent } from './item/item - edit.component';

const routes: Routes = [
    { path: 'add', component: ItemAddComponent },
{ path: 'list', component: ItemListComponent },
{ path: 'filter', component: ItemFilterComponent },
{ path: 'edit /: id', component: ItemEditComponent },
{ path: '', redirectTo: '/list', pathMatch: 'full' }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }