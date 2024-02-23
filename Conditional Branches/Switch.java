public class Switch {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Really Good");
                break;
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("You Passed");
                break; 
             case 'F':
                System.out.println("Better Next Time");
                break;           
            default:
            System.out.println("Invalid Grade");     
        }
    }
}
