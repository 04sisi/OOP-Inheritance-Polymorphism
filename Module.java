public abstract class Module {
    private String moduleName;
    private String moduleCode;
    private int credits;

    // Constructor
    public Module(String moduleName, String moduleCode, int credits) {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.credits = credits;
    }

    // Accessors
    public String getModuleName() {
        return moduleName;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public int getCredits() {
        return credits;
    }

    // Mutators
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // toString method
    @Override
    public String toString() {
        return "Module Name: " + moduleName + ", Module Code: " + moduleCode + ", Credits: " + credits;
    }

    // Abstract method
    public abstract void displayModuleDetails();
}
