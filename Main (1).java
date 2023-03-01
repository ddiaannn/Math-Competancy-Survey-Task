/******************************************************************************

In order to be included in a national ranking exercise, secondary schools may choose to participate in a math competency evaluation survey. 
The MoE maintains the list of the schools (there may new addition, and some schools may opt-out).  
Each school is identified by its name, the address (this is usually split into multiple parts), and the principal's name (first name, last name). 
A dataset of marks collected for each school. Each marks entry consists of a score, the ID, and name and class name of the participating student. 
The survey is carried out on a yearly basis.

The MoE would like to be able to do the following calculation over the years :
- get the score for a particular school in a particular year
- list out the average score for each school
- list out the standard deviation for each school
- sort the list

*******************************************************************************/
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of data: ");
		int numdata = scanner.nextInt();
		
		Marks marks = new Marks(numdata);
		marks.createData();
		PrincipalName principalName = new PrincipalName("Muhammad", "Khairul");
		Address address = new Address("No 444, Jalan Sudirman", "31620", "Kuala Terengganu", "Terengganu");
		School school = new School("Sk Raudah",address,principalName,marks);
	
		school.setNumberParticipants();
		System.out.println(school.toString());
		System.out.printf("Average Score     : %.2f",marks.average());
		System.out.printf("\nStandard Deviation: %.2f",marks.stanDev(marks.average()));
	}
}
