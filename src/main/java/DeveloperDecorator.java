public abstract class DeveloperDecorator implements IDeveloper {
    private IDeveloper developer;
    public String role;

    public DeveloperDecorator(IDeveloper IDeveloper){
        this.developer = IDeveloper;
    }

    public IDeveloper getDeveloper() {
        return developer;
    }

    public void setDeveloper(IDeveloper IDeveloper){
        this.developer = IDeveloper;
    }

    public String getRole(){
        return this.developer.getRole() + "/" + this.getRoleName();
    }

    public void setRole(String role){
        this.role=role;
    }

    public float getSalary(){
        return this.developer.getSalary() + this.getSalaryBonus();
    }

    public abstract float getSalaryBonus();

    public abstract String getRoleName();
}
