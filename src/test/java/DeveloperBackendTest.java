import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperBackendTest {
    @Test
    void shouldGetSalaryBonusCorrectly() {
        IDeveloper dev = new DeveloperBackend(new Developer(1000));
        assertEquals(1600.0f, dev.getSalary());
    }

    @Test
    void shouldGetRoleNameCorrectly() {
        IDeveloper dev = new DeveloperBackend(new Developer(1000));
        assertEquals("Developer/Backend", dev.getRole());
    }
}