public class DeveloperFrontend extends DeveloperDecorator {

    public DeveloperFrontend(IDeveloper IDeveloper){
        super(IDeveloper);
    }

    public float getSalaryBonus(){
        return 500.0f;
    }

    public String getRoleName(){
        return "Frontend";
    }
}
