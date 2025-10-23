package lk.mas.kreeda_1987.departmentRegisterPro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeptMaterialDTO implements Serializable {
    private String materialId;
    private  String fileName;
    private  String materialType;
    private  String material;
    private  String uploadAt;
    private  String courseId;
}

