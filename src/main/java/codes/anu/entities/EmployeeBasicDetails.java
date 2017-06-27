package codes.anu.entities;

import codes.anu.DTOs.EmployeeBasicDetailsDTO;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="emp_basic_details")
public class EmployeeBasicDetails implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private Integer age;
    @Column(name = "email")
    private String email;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id")
    private EmployeeJobDetails employeeJobDetails;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeJobDetails getEmployeeJobDetails() {
        return employeeJobDetails;
    }

    public void setEmployeeJobDetails(EmployeeJobDetails employeeJobDetails) {
        this.employeeJobDetails = employeeJobDetails;
    }

    public static EmployeeBasicDetails valueOf(EmployeeBasicDetailsDTO employeeBasicDetailsDTO) {
        EmployeeBasicDetails employeeBasicDetails = new EmployeeBasicDetails();
        EmployeeJobDetails employeeJobDetails = new EmployeeJobDetails();
        employeeBasicDetails.setAge(employeeBasicDetailsDTO.getAge());
        employeeBasicDetails.setEmail(employeeBasicDetailsDTO.getEmail());
        employeeBasicDetails.setFirstName(employeeBasicDetailsDTO.getFirstName());
        employeeBasicDetails.setLastName(employeeBasicDetailsDTO.getLastName());
        employeeJobDetails.setIndustry(employeeBasicDetailsDTO.getEmployeeJobDetailsDTO().getIndustry());
        employeeJobDetails.setSalary(employeeBasicDetailsDTO.getEmployeeJobDetailsDTO().getSalary());
        employeeBasicDetails.setEmployeeJobDetails(employeeJobDetails);
        return employeeBasicDetails;
    }
}
