import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperFrontendTest {
    @Test
    void shouldGetSalaryBonusCorrectly() {
        IDeveloper dev = new DeveloperFrontend(new Developer(1000));
        assertEquals(1500.0f, dev.getSalary());
    }

    @Test
    void shouldGetRoleNameCorrectly() {
        IDeveloper dev = new DeveloperFrontend(new Developer(1000));
        assertEquals("Developer/Frontend", dev.getRole());
    }
}