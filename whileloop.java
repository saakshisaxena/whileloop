//Program to implement the use of while in an interactive way
import java.util.Scanner;
class whileloop
{
//main method
public static void main(String[] p)
{
int busnumber=100;
int late;
int c=0;
int mostlate=0;
int mostlatebus=100;



while (busnumber>0)
{


busnumber=Integer.parseInt(input("Which bus passed?"));
if(busnumber==0)
{
break;
}

late=Integer.parseInt(input("How many minutes late was it?"));
if(mostlate<late)
{
mostlate=late;
mostlatebus=busnumber;
}//end of if

c++;
}//end of while

print(c+" buses passed. The most delayed bus was "+mostlate+" minutes late on route "+mostlatebus);
}//end of main



//method to print
public static void print(String message)
{
System.out.println(message);
}

//method to accept user input
public static String input(String s)
{
String p;
Scanner scanner= new Scanner(System.in);
print(s);
p= scanner.nextLine();
return p;
}

}//end of class 

