public class Computer {
    private String CPU;
    private String RAM;
    private String ROM;
    private String Storage;

    private Computer(ComputerBuilder builder ){
         this.CPU=builder.CPU;
         this.RAM=builder.RAM;
         this.ROM=builder.ROM;
         this.Storage=builder.Storage;
    }
    
    //Builder class creation
    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String ROM;
        private String Storage;

        public ComputerBuilder setCPU(String CPU){
            this.CPU=CPU;
            return this;
        }

        public ComputerBuilder setRAM(String RAM){
            this.RAM=RAM;
            return this;
        }

        public ComputerBuilder setROM(String ROM){
            this.ROM=ROM;
            return this;
        }

        public ComputerBuilder setStorage(String Storage){
            this.Storage=Storage;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    public void display(){
        System.out.println("CPU: "+CPU);
        System.out.println("RAM: "+RAM);
        System.out.println("ROM: "+ROM);
        System.out.println("Storage: "+Storage);
        System.out.println("*******************************************");
    }

}
