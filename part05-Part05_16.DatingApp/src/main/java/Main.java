
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);
///////////////////////////////////////// part 1 //////////////////////////////////
//        date.advance();
//        date.advance();
//        date.advance();
//        System.out.println(date);
///////////////////////////////////////// part 2 //////////////////////////////////
//        date.advance(5);
//        System.out.println("After 5 days is " + date);
///////////////////////////////////////// part 3 //////////////////////////////////     
        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
            week = week + 1;
        }
        
        System.out.print("The date after 790 days from the examined Friday is ");
        System.out.println(date.afterNumberOfDays(790));
    }
}
