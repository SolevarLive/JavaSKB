package org.example.Servis;

import org.example.School.SchoolMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolDependencyField {
    @Autowired
    SchoolMember teacher;
    @Autowired
    SchoolMember student;

}
