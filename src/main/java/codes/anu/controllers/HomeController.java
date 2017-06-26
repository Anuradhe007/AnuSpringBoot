package codes.anu.controllers;

import codes.anu.DTOs.EmployeeBasicDetailsDTO;
import codes.anu.services.EmpBasicDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private EmpBasicDetService empBasicDetService;

    @RequestMapping("/home")
    public String getHomePage() {
        return "home";
    }

    @RequestMapping(value = "/saveDetails", method = RequestMethod.POST)
    public String saveEmpDetails(EmployeeBasicDetailsDTO employeeBasicDetailsDTO) {
        empBasicDetService.saveEmpBasicDet(employeeBasicDetailsDTO);
        return "redirect:home";
    }
}
