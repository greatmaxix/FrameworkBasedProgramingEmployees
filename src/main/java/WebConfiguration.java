import FrameworkBasedPrograming.dao.EmployeeRepository;
import FrameworkBasedPrograming.service.EmployeeSearchService;
import FrameworkBasedPrograming.service.EmployeeSearchServiceImplementation;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class WebConfiguration {

    @Bean
    public EmployeeSearchService employeeSearchService(EmployeeRepository employeeRepository) {
        return new EmployeeSearchServiceImplementation(employeeRepository);
    }
}
