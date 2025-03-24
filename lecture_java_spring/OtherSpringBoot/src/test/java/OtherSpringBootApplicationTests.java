import com.furkantokgoz.data.entity.EmployeeEntity;
import com.furkantokgoz.data.repository.EmployeeRepository;
import com.furkantokgoz.otherspringboot.OtherSpringBootApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import test.TestCrud;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = OtherSpringBootApplication.class)
class OtherSpringBootApplicationTests implements TestCrud {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }

    @Override
    public void testDelete() {
        EmployeeEntity employee = employeeRepository.findById(1L).get();
        employeeRepository.delete(employee);
        assertNotNull(employeeRepository.findById(1L).get());
    }
    @Test
    @Override
    public void testCreate() {
        EmployeeEntity employeeEntity = EmployeeEntity.builder().firstName("John").lastName("Doe").age(25).build();
        employeeRepository.save(employeeEntity);
        //null ise assertion error gönderir.
        assertNotNull(employeeRepository.findById(1L).get());
    }
    @Test
    @Override
    public void testList() {
        List<EmployeeEntity> employeeEntityList = employeeRepository.findAll();
        assertThat(employeeEntityList);

    }
    @Test
    @Override
    public void testUpdate() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();
        employeeEntity.setFirstName("Jane");
        assertEquals("Jane", employeeEntity.getFirstName());
    }

    @Test
    @Override
    public void findById() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();
        assertEquals("John", employeeEntity.getFirstName());
        employeeRepository.save(employeeEntity);
        assertNotEquals("John", employeeRepository.findById(1L).get().getFirstName());
    }
}
