import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  System.out.println("Welcome! when is your birthday?");
   int getDay = scan.nextInt();
    System.out.println("when is your birthday?");
    int getYear = scan.nextInt();
  }
 //start off your method here. this method is suppost to help you find what day your birthday is on
static int getYear(int year) {
    int Years = year;
    return Years;
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