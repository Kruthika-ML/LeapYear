public class isLeapYear {
    public static void main(String[] args) {
        Leapyear(1600);
        Leapyear(2100);
        Leapyear(2400);
        Leapyear(2300);
    }

    public static void Leapyear(int year){
        if(year > 1 && year < 9999){
            if(year % 4 ==0){
                if(year % 100 ==0){
                    if(year % 400 ==0){
                        System.out.println("The year is leap year");
                    }else {
                        System.out.println("Not a leap year");
                    }
                }else{
                        System.out.println("Not a leap year");
                    }
            } else{
                System.out.println("Not a leap year");
            }
        }
    }
}
