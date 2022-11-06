public class Developer implements IDeveloper {
    private float salary;

    public Developer() {
    }

    public Developer(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public String getRole() {
        return "Developer";
    }
}
