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

    @Test
    void shouldGetRoleNameCorrectlyWithFrontendAndBackend() {
        IDeveloper fullstackDev = new DeveloperFrontend(new DeveloperBackend(new Developer(1000.0f)));
        assertEquals("Developer/Backend/Frontend", fullstackDev.getRole());
    }

    @Test
    void shouldGetSalaryCorrectlyWithFrontendAndBackend() {
        IDeveloper fullstackDev = new DeveloperFrontend(new DeveloperBackend(new Developer(1000.0f)));
        assertEquals(2100.0f, fullstackDev.getSalary());
    }

}