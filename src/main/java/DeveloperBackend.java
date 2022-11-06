public class DeveloperBackend extends DeveloperDecorator {
  public DeveloperBackend(IDeveloper IDeveloper) {
    super(IDeveloper);
  }

  public float getSalaryBonus() {
    return 600.0f;
  }

  public String getRoleName() {
    return "Backend";
  }
}
