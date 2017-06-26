package codes.anu.Repositories;

import codes.anu.entities.EmployeeBasicDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeBasicDetailsRepo extends JpaRepository<EmployeeBasicDetails, Integer> {

}
