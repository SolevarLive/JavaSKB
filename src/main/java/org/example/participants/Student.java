package org.example.participants;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.example.School.SchoolMember;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student implements SchoolMember {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void introduce() {
        System.out.println("Привет, я студент, мое имя " + name);
    }

    @PostConstruct
    public void init(){
        System.out.println(" Объект студент создан!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Объект студент уничтожен!");
    }
}
