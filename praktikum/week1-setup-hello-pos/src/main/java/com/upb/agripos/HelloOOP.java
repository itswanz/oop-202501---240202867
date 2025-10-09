class Greeter {
    private String name;
    private String nim;
    private String kelas;

    public Greeter(String name, String nim, String kelas) {
        this.name = name;
        this.nim = nim;
        this.kelas = kelas;
    }

    public void sayHello() {
        System.out.println("Hello World, I am " + name + " - " + nim + " from " + kelas);
    }
}

public class HelloOOP {
    public static void main(String[] args) {
        Greeter greeter = new Greeter("Irwandi Isnugroho", "240202867", "3IKKA");
        greeter.sayHello();
    }
}
