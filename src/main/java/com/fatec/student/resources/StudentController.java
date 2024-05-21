package com.fatec.student.resources;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fatec.student.entities.Student;



@RestController
@RequestMapping("students")
public class StudentController {

@GetMapping    
public List<Student> getStudents(){
    Student s1 = new Student();

    s1.setId(1);
    s1.setName("Lucas Felix");
    s1.setCourse("Análise e Desenvolvimento de Sistemas");

    Student s2 = new Student();

    s2.setId(2);
    s2.setName("Mateus Felix");
    s2.setCourse("Gestão da Técnologia da Informação");

    Student s3 = new Student();

    s3.setId(3);
    s3.setName("Leonardo Louco");
    s3.setCourse("Eventos");

    ArrayList<Student> lista = new ArrayList<Student>();

    lista.add(s1);
    lista.add(s2);
    lista.add(s3);


    return lista;

}
    
}
