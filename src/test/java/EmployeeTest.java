import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void punchIn() {
        Employee topEmployee = new Employee("Firdavs", "12345", "software", 60.0, 40);

        topEmployee.punchIn(9);

        assertEquals(9, topEmployee.getTime());
    }

    @org.junit.jupiter.api.Test
    void punchOut() {
        Employee topEmployee = new Employee("Firdavs", "12345", "software", 60.0, 0);

        topEmployee.punchIn(9);
        topEmployee.punchOut(17);

        assertEquals(8, topEmployee.getRegularHours());
    }
}