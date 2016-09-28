import java.util.Scanner;
public class quiz2TuititonProblem {
	//comment for stage change
	public quiz2TuititonProblem() {
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double initialTuition = 12342;
		double rateIncreaseYear2;
		double rateIncreaseYear3;
		double rateIncreaseYear4;
		
	System.out.println("What is your second year rate increase?");
	rateIncreaseYear2 = input.nextDouble();
	
	System.out.println("What is your third years rate increase?");
	rateIncreaseYear3 = input.nextDouble();
	
	System.out.println("What is your fourth years rate increase?");
	rateIncreaseYear4 = input.nextDouble();
	
	double year1 = initialTuition;
	double year2 = (initialTuition*rateIncreaseYear2)+initialTuition;
	double year3 = (year2*rateIncreaseYear3)+year2;
	double year4 = (year3*rateIncreaseYear4)+year3;
	double totalFee = (year1 + year2 + year3 +year4);
	
	System.out.printf("your total tuition is  $%4.2f",totalFee);
	

	input.close();
	}

}
