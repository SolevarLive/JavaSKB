package org.example.Servis;

import org.example.School.SchoolMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.example.participants.Student;
import org.example.participants.Teacher;

@Component
public class SchoolDependencySet {
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
