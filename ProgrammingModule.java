public class ProgrammingModule extends Module {
    private String programmingLanguage;
    private int projectHours;

    public ProgrammingModule(String moduleName, String moduleCode, int credits, String programmingLanguage, int projectHours) {
        super(moduleName, moduleCode, credits);
        this.programmingLanguage = programmingLanguage;
        this.projectHours = projectHours;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public int getProjectHours() {
        return projectHours;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void setProjectHours(int projectHours) {
        this.projectHours = projectHours;
    }

    @Override
    public void displayModuleDetails() {
        System.out.println("Programming Module Details:");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Programming Language: " + programmingLanguage + ", Project Hours: " + projectHours;
    }
}
