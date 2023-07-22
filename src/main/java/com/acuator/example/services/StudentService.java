package com.acuator.example.services;

import com.acuator.example.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    private ArrayList<Student> studentList = new ArrayList<>();

    public Student addStudent(Student student){
        studentList.add(student);
        return student;
    }
}
