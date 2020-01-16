import FrameworkBasedPrograming.dao.DepartmentsRepository;
import FrameworkBasedPrograming.dao.EmployeeRepository;
import FrameworkBasedPrograming.dao.SalariesRepository;
import FrameworkBasedPrograming.service.*;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class WebConfiguration {

    @Bean
    public EmployeeSearchService employeeSearchService(EmployeeRepository employeeRepository) {
        return new EmployeeSearchServiceImplementation(employeeRepository);
    }

    @Bean
    public DepartmentSearchService departmentSearchService(DepartmentsRepository departmentsRepository) {
        return new DepartmentSearchServiceImplementation(departmentsRepository);
    }

    @Bean
    public SalariesSearchService salariesSearchService(SalariesRepository salariesRepository) {
        return new SalariesSearchServiceImplementation(salariesRepository);
    }
}
