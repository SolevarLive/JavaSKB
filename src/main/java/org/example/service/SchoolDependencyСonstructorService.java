package org.example.service;

import org.example.school.SchoolMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.example.participants.Student;
import org.example.participants.Teacher;

@Component
public class SchoolDependencyСonstructorService {
    private SchoolMember teacher;
    private SchoolMember student;


    public SchoolDependencyСonstructorService(Teacher teacher, Student student){
        this.teacher = teacher;
        this.student = student;
    }
}
