package lk.mas.kreeda_1987.departmentRegisterPro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/v1/healthtest")

public class HealthTest {
    @GetMapping
    public String employDataTest(){
        return "Department Registration is running";
    }


}
