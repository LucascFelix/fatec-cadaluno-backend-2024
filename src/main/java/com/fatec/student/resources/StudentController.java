package com.fatec.student.resources;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fatec.student.entities.Student;
import com.fatec.student.services.StudentService;



@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping    

    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok(studentService.getStudents());
}

    @GetMapping("{id}")

    public ResponseEntity<Student> getStudentById(@PathVariable int id){
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @DeleteMapping("{id}")

    public ResponseEntity<Void> deleteStudentById(@PathVariable int id){
        this.studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping

    public Student save(@RequestBody Student student){
        return this.studentService.save(student);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody Student student){
        this.studentService.update(id,student);
    }
    
}
