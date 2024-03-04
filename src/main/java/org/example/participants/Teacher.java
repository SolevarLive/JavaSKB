package org.example.participants;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.example.school.SchoolMember;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Teacher implements SchoolMember {
    String name;

    public Teacher(String name){
        this.name = name;
    }

    @Override
    public void introduce(){
        System.out.println("Привет, я учитель, мое имя " + name);
    }

    @PostConstruct
    public void init(){
        System.out.println(" Объект учитель создан!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Объект учитель уничтожен!");
    }
}
