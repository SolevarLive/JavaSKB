package org.example.service;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.example.school.SchoolMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class SchoolInterfaceService {
    final SchoolMember teacher;
    final SchoolMember student;

    @Autowired
    public SchoolInterfaceService(@Qualifier("teacher") SchoolMember teacher,
                                  @Qualifier("student") SchoolMember student ){
        this.teacher = teacher;
        this.student = student;
    }

    public void members(){
        teacher.introduce();
        student.introduce();
    }

}
