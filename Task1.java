import java.util.Scanner;
class Task1{
	public static void main(String[]args){
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter TH salary: ");
	int sal=obj.nextInt();

	if(sal<=30000){
	System.out.println("no tax");
	}

	else if(sal>30000  && sal<=50000){
	int tax_amnt=sal*5/100;
	int take_home=sal-tax_amnt;
	System.out.println("salary is "+ sal +"\n"+"Tax Amount is " + tax_amnt +"\n"+ "take home is " + take_home);
	}

	else if(sal>50000  && sal<=60000){
	int tax_amnt=sal*8/100;
	int take_home=sal-tax_amnt;
	System.out.println("salary is "+ sal +"\n"+"Tax Amount is " + tax_amnt +"\n"+ "take home is " + take_home);
	}

	else if(sal>60000){
	int tax_amnt=sal*10/100;
	int take_home=sal-tax_amnt;
	System.out.println("salary is "+ sal +"\n"+"Tax Amount is " + tax_amnt +"\n"+ "take home is " + take_home);
	}
}
}