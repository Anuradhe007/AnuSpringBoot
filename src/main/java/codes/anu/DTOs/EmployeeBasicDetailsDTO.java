package codes.anu.DTOs;

public class EmployeeBasicDetailsDTO {

    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private EmployeeJobDetailsDTO employeeJobDetailsDTO;

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

    public EmployeeJobDetailsDTO getEmployeeJobDetailsDTO() {
        return employeeJobDetailsDTO;
    }

    public void setEmployeeJobDetailsDTO(EmployeeJobDetailsDTO employeeJobDetailsDTO) {
        this.employeeJobDetailsDTO = employeeJobDetailsDTO;
    }
}
