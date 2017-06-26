package codes.anu.DTOs;

public class EmployeeJobDetailsDTO {

    private String industry;
    private Integer salary;

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
