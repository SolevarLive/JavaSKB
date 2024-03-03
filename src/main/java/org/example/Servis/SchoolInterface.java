package org.example.Servis;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.example.School.SchoolMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class SchoolInterface {
    final SchoolMember teacher;
    final SchoolMember student;

    @Autowired
    public SchoolInterface(@Qualifier("teacher") SchoolMember teacher,
                           @Qualifier("student") SchoolMember student ){
        this.teacher = teacher;
        this.student = student;
    }

    public void members(){
        teacher.introduce();
        student.introduce();
    }

}
