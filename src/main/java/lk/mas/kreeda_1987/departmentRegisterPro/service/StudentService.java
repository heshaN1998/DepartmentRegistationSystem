package lk.mas.kreeda_1987.departmentRegisterPro.service;

import lk.mas.kreeda_1987.departmentRegisterPro.dto.UserDTO;

import java.util.List;

public interface StudentService {
    void saveStudent(UserDTO student);
    UserDTO getSelected(String StudentId);
    List<UserDTO> getAllStudent();
    void updateStudent(String studentId,UserDTO toBeUpdatedStudent);
    void deleteStudent(String studentId);

}
