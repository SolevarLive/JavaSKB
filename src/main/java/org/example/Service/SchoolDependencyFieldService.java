package org.example.Service;

import org.example.School.SchoolMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolDependencyFieldService {
    @Autowired
    SchoolMember teacher;
    @Autowired
    SchoolMember student;

}
