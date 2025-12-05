import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
providedIn: 'root'
})
export class ItemService {
private apiUrl = 'http://localhost:8080/api/itens';

constructor(private http: HttpClient) { }

addItem(item: any): Observable<any> {
return this.http.post(this.apiUrl, item);
}

getAllItems(): Observable<any[]> {
return this.http.get<any[]>(this.apiUrl);
}

getItemsByCategoria(categoria: string): Observable<any[]> {
return this.http.get<any[]>('${this.apiUrl}/categoria/${categoria}');
}

updateItem(id: number, item: any): Observable<any> {
return this.http.put('${this.apiUrl}/${id}', item);
}

deleteItem(id: number): Observable<void> {
return this.http.delete<void>('${this.apiUrl}/${id}');
}
}