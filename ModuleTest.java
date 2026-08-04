public class ModuleTest {
    public static void main(String[] args) {
        Module[] modules = new Module[2];

        modules[0] = new ProgrammingModule("Programming Fundamentals", "CS101", 15, "Java", 20);
        modules[1] = new NetworkingModule("Computer Networks", "CS202", 15, "TCP/IP", 15);

        for (Module module : modules) {
            // Polymorphism in action
            module.displayModuleDetails();

            // Implicit call to toString()
            System.out.println(module);

            // Explicit call to toString()
            System.out.println(module.toString());

            System.out.println("___________________________________________________________"); // spacer
        }
    }
}
