package org.example.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class User {

    String name;
    Collection<?extends GrantedAuthority> roles;

}
