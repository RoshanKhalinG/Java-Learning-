public class NestedForLoop {
    public static void main(String[] args) {
        String days []={"Sunday", "Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};

        for(String day : days){
            System.out.println(day);

            for(int i=1; i<24; i++){
                System.out.println(i);
            }
        }
    }
}
