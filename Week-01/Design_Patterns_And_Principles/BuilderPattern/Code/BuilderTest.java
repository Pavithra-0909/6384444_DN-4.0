public class BuilderTest {
    public static void main(String[] args) {

        Computer basic = new Computer.ComputerBuilder()
                .setCPU("Intel i3")
                .setRAM("16 GB")
                .setROM("256 GB")
                .setStorage("1TB SDD")
                .build();
   
        Computer office = new Computer.ComputerBuilder()
                .setCPU("Intel i5")
                .setRAM("32 GB")
                .setROM("500 GB")
                .setStorage("1TB None")
                .build();

        Computer gaming = new Computer.ComputerBuilder()
                .setCPU("Intel i9")
                .setRAM("256 GB")
                .setROM("1TB")
                .setStorage("2TB SSD")
                .build();

        
        System.out.println("Basic Computer:-");
        basic.display();

        System.out.println("Office Computer:-");
        office.display();

        System.out.println("Gaming Computer:-");
        gaming.display();
    }
}
