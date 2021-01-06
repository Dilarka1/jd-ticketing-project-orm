package com.cybertek.dto;


import com.cybertek.utils.Gender;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean enabled;
    private String phone;
    private RoleDTO role;
    private Gender gender;

/*
rejected value [RoleDTO(id=2, description=Manager)];
codes [typeMismatch.userDTO.role.id,typeMismatch.role.id,typeMismatch.id,
typeMismatch.java.lang.Long,typeMismatch];
arguments [org.springframework.context.support.DefaultMessageSourceResolvable:
codes [userDTO.role.id,role.id]; arguments []; default message [role.id]];
default message [Failed to convert property value of type 'java.lang.String'
 to required type 'java.lang.Long' for property 'role.id'; nested exception
 is java.lang.NumberFormatException: For input string: "RoleDTO(id=2,description=Manager)"]
 */
}
