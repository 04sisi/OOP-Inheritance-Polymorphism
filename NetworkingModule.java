public class NetworkingModule extends Module {
    private String networkType;
    private int labHours;

    public NetworkingModule(String moduleName, String moduleCode, int credits, String networkType, int labHours) {
        super(moduleName, moduleCode, credits);
        this.networkType = networkType;
        this.labHours = labHours;
    }

    public String getNetworkType() {
        return networkType;
    }

    public int getLabHours() {
        return labHours;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public void setLabHours(int labHours) {
        this.labHours = labHours;
    }

    @Override
    public void displayModuleDetails() {
        System.out.println("Networking Module Details:");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Network Type: " + networkType + ", Lab Hours: " + labHours;
    }
}
