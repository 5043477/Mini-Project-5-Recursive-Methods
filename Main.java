import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  System.out.println("Welcome! when is your birthday?");
System.out.println("what is the total amount of months in a year?");
    int totalMonths = scan.nextInt();
    System.out.println("what is your brith month number");
    int birthMonth = scan.nextInt();
    System.out.println("when is your birthday");
    int birthday = scan.nextInt();
    System.out.println("how many days are there in a month");
    int totalDays = scan.nextInt();
    //message for the 
    int Month = getMonth(birthMonth, totalMonths);    
    System.out.println("there will be this many months until your birthday: " + Month);
    int day = getDay(birthday, totalDays);
    System.out.println("your birth day is " + day);
    int result = sum(5);
    System.out.println(result);
  }
 //start off your method here. this method is suppost to help you find what day your birthday is on
static int getMonth(int birthMonth, int totalMonths) {
    int Month = birthMonth - totalMonths;
    return Month;
}  
static int getDay(int birthday, int totalDays) {
    int getDay = birthday - totalDays;
    return getDay;
 }
  //recursion is calling a method within itself
 {
    int result = sum(5);
    System.out.println(result);
  }
    public static int sum(int num1)
  {
    if(num1 > 0)
    {
   return num1 + sum(num1 - 1);
   //5 + 10 = 15
   //4 + 6 = 10
   //3 + 3 = 6
   //2 + 1 = 3
   //1 + 0 = 1
    }else{
      return 0;
    }
  }
}