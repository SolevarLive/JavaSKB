package org.example.Service;

import org.example.School.SchoolMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.example.participants.Student;
import org.example.participants.Teacher;

@Component
public class SchoolDependencySetService {
    private SchoolMember teacher;
    private SchoolMember student;

    @Autowired
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    @Autowired
    public void SetStudent(Student student){
        this.student = student;
    }
}
