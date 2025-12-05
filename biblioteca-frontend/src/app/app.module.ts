import { NgModule } from '@angular/core';
//import { Component } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ItemAddComponent } from './item/item-add.component';
import { ItemListComponent } from './item/item-list.component';
import { ItemFilterComponent } from './item/item-filter.component';
import { ItemEditComponent } from './item/item-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    ItemAddComponent,
    ItemListComponent,
    ItemFilterComponent,
    ItemEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
