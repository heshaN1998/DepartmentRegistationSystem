package lk.mas.kreeda_1987.departmentRegisterPro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO implements Serializable {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String addressLine1;
    private String getAddressLine2;
    private String getAddressLine3;
    private String city;
    private String password;
    private Role role;

}
