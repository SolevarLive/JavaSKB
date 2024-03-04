package org.example.Config;

import org.example.School.SchoolMember;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.participants.Student;
import org.example.participants.Teacher;

@Configuration
public class AppConfig {

    @Bean
    public SchoolMember teacher(){
        return new Teacher("Женя");
    }

    @Bean
    public SchoolMember student(){
        return new Student();
    }
}
