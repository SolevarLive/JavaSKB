package org.example.Service;

import org.example.School.SchoolMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.example.participants.Student;
import org.example.participants.Teacher;

@Component
public class SchoolDependencyСonstructorService {
    private SchoolMember teacher;
    private SchoolMember student;

    @Autowired
    public SchoolDependencyСonstructorService(Teacher teacher, Student student){
        this.teacher = teacher;
        this.student = student;
    }
}
