package lk.mas.kreeda_1987.departmentRegisterPro.controller;

import lk.mas.kreeda_1987.departmentRegisterPro.dto.Role;
import lk.mas.kreeda_1987.departmentRegisterPro.dto.UserDTO;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/employ")
public class EmployController {
//Todo: Handle employ detail as CRUD OP

    //save employ
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> saveEmploy(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);

    }

    @GetMapping(value = "{employId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> getSelectedEmploy(@PathVariable String employId) {
        System.out.println("Employ ID is" + employId);
        var userDTO = new UserDTO(userId:"stu1", firstName:"jv,", lastName = "do", email:"sda", addressLine1:
        "a", addressLine2:"b", addressLine3:"c", city:"sdasd", password:"dawdad", Role.EMPLOY);
        if (employId.equals(userDTO.getUserId())) {
            return new ResponseEntity<>(userDTO, HttpStatus.OK);

        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDTO>> getAllEmploy() {
        List<userDTO> employList = Arrays.asList(
                new UserDTO(
                        userId:"U003",
                firstName:"Clara",
                lastName:"Nguyen",
                email:"clara.nguyen@example.com",
                addressLine1:"789 Pine Road",
                addressLine2:"Suite 210",
                addressLine3:"das",
                city:"Chicago",
                password:"clara@2025",
                Role.EMPLOY),
        new UserDTO(
                userId:"U002",
                firstName:"SAS",
                lastName:"Martinez",
                email:"bob.martinez@example.com",
                addressLine1:"456 Oak Avenue",
                addressLine2:"sas",
                addressLine3:"s",
                city:"Los Angeles",
                password:"bobSecure!45",
                Role.EMPLOY)



       );
        return new ResponseEntity<>(employList, HttpStatus.OK)
    }
        @PatchMapping
            public void updateEmploy(@RequestParam("stuId") String employ,@RequestParam  String stuCity,@RequestBody UserDTO tobeUpdateDetails ){
            System.out.println("employ id is" + studentId);
            System.out.println("employ city" + stuCity);
            System.out.println("updated" + tobeUpdateDetails);
        }

    ;
}
}



}
