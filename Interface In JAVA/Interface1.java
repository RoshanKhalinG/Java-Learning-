import java.util.Scanner;

interface Client {
    void input();
    void output();
}

class Ram implements Client {
    private String name;
    private double salary;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Username:");
        name = scanner.nextLine();

        System.out.println("Enter the Salary:");
        salary = scanner.nextDouble();
    }

    public void output() {
        System.out.println("Username: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Client client = new Ram();
        client.input();
        client.output();
    }
}
