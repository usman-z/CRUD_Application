import { Component, OnInit } from '@angular/core';
import { StudentService } from './services/student.service';
import { StudentData } from './models/student.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  constructor (private studentService: StudentService) { }

  studentId: number = 1;
  studentData?: StudentData;


  ngOnInit(): void {
    this.getStudentById(1);
  }

  onSubmit() {
    this.getStudentById(this.studentId);
  }

  private getAllStudents () {
    this.studentService.getAllStudents().subscribe({
      next: (response) => {
        this.studentData = response;
      }
    });
  }

  private getStudentById (id: number) {
    this.studentService.getStudentById(id).subscribe({
      next: (response) => {
        this.studentData = response;
      }
    });
  }

  private addStudent () {
    this.studentService.addStudent();
  }

  private updateStudentById (id: number) {
    this.studentService.updateStudentById(id);
  }

  private deleteStudentById (id: number) {
    this.studentService.deleteStudentById(id);
  }

}
