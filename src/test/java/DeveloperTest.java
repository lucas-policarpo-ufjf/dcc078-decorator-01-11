import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    void shouldGetSalaryBonusCorrectly() {
        IDeveloper dev = new Developer(1000.0f);
        assertEquals(1000.0f, dev.getSalary());
    }

    @Test
    void shouldGetRoleNameCorrectly() {
        IDeveloper dev = new Developer(1000.0f);
        assertEquals("Developer", dev.getRole());
    }
}