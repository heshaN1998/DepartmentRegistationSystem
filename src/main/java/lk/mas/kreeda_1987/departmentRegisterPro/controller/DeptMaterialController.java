package lk.mas.kreeda_1987.departmentRegisterPro.controller;

import lk.mas.kreeda_1987.departmentRegisterPro.dto.DeptMaterialDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

@RestController
@RequestMapping(api/v1/material)
public class DeptMaterialController {
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DeptMaterialDTO> saveMaterial( @RequestParam(materialIdentity) String materialId,
                                                         @RequestParam String fileName,
                                                         @RequestParam String materialType,
                                                         @RequestParam MultipartFile material,
                                                         @RequestParam(required = false) String uploadAt,
                                                         @RequestParam String courseId){
   //create obj incoming multipart
        var  courseMaterial = new DeptMaterialDTO();

        //BUILD MULTIPART FILE AS A sTRING
        //1 CREATE BYTE COLLECTION FROM THE MULTIPART FILE
        try {
            byte [] bytes=material.getBytes();
            //2 develop a string based on the byte collection
            String base64Material = Base64.getEncoder().encodeToString(materialBytes);
            //3 handle upload time
            String uploadTime = uploadAt != null ? uploadAt : LocalDate.now().format(DateTimeFormatter.ISO_DATE);
            //4 BUILD THE ENTIRE OBJECT
            courseMaterial.setCourseId(materialId);
            courseMaterial.setMaterialType(materialType);
            courseMaterial.setFileName(fileName);
            courseMaterial.setMaterial(base64Material);
            courseMaterial.setUploadAt(uploadTime);
            courseMaterial.setCourseId(courseId);

        }catch (Exception ex){
            ex.printStackTrace();
        }
            return ResponseEntity.ok(courseMaterial);

    }
}
