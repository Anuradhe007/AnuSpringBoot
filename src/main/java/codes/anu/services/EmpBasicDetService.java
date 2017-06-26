package codes.anu.services;

import codes.anu.DTOs.EmployeeBasicDetailsDTO;
import codes.anu.Repositories.EmployeeBasicDetailsRepo;
import codes.anu.entities.EmployeeBasicDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpBasicDetService {

    @Autowired
    EmployeeBasicDetailsRepo employeeBasicDetailsRepo;

    public void saveEmpBasicDet(EmployeeBasicDetailsDTO employeeBasicDetailsDTO) {
        employeeBasicDetailsRepo.saveAndFlush(EmployeeBasicDetails.valueOf(employeeBasicDetailsDTO));
    }
}
