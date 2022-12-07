package bunty;
import java.util.*;


public class CALCULATOR 
{ 
  

	public static void main(String[] args)
	{Scanner sc = new Scanner(System.in);
	  System.out.println("Enter num1:");
	  double num1 = sc.nextDouble();
	  
	  System.out.println("Enter num2:");
	  double num2 = sc.nextDouble();
	  
	  System.out.println("Enter operator (+,-,*,/)");
	  char operator = sc.next().charAt(0);
	   
	  double result;
	  switch(operator){
	  
	  
	  case '+' :
			  result = num1 + num2;
			  break;
	  case '-' :
		  result = num1 - num2;
	   break;     
	  case '*' :
		  result = num1 * num2;
		  break;
	  case '/' :
		  result = num1 / num2;
		  break;
		  default:
			  System.out.println("Sorry operator is incorrect");
			  return;
			  
	     
	  
			  
	  }
	
       System.out.println(num1 + " " + num2 + " = " + result);
	}

}
