package org.example.Servis;

import org.example.School.SchoolMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.example.participants.Student;
import org.example.participants.Teacher;

@Component
public class SchoolDependencyСonstructor {
    private SchoolMember teacher;
    private SchoolMember student;

    @Autowired
    public SchoolDependencyСonstructor(Teacher teacher, Student student){
        this.teacher = teacher;
        this.student = student;
    }
}
