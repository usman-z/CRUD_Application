import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StudentData } from '../models/student.model'; 

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http: HttpClient) {}

  getAllStudents(): Observable<StudentData> {    
    return this.http.get<StudentData>("http://localhost:8080/student/get");
  }

  getStudentById(id: number): Observable<StudentData> {    
    return this.http.get<StudentData>("http://localhost:8080/student/get/"+id);
  }

  addStudent(): void {    
    this.http.get<StudentData>("http://localhost:8080/student/add");
  }

  updateStudentById(id: number): void {    
    this.http.get<StudentData>("http://localhost:8080/student/update/"+id);
  }

  deleteStudentById(id: number): void {    
    this.http.get<StudentData>("http://localhost:8080/student/delete/"+id);
  }
}
