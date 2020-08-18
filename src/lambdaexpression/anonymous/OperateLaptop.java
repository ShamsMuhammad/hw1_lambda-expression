package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
        Laptop laptop = new Laptop() {
            @Override
            public void ramSize(int memorySize) {
                System.out.println("System memory size is: " + memorySize + " GB");

            }

            @Override
            public void monitorSize(int screenSize) {
                System.out.println("System screen size is: " + screenSize + "''");

            }
        };




        laptop.monitorSize(16);
        laptop.ramSize(32);

        //please implement anonymous function for Phone FunctionalInterface

        Phone smartPhone = (network)-> System.out.println("Cell phone carrier network speed is: " + network);
        smartPhone.cellularNetwork("5G");


    }
}
