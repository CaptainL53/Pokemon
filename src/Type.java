import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Type {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		String question = "Y";
		while(question.equals("Y") || question.equals("y")){
			System.out.print("Enter the Pokemon you want to know the type of: ");
			String pokemon = sc.next();
			question = Checker(pokemon, sc);
			System.out.println();
		}		
		sc.close();
		
	}
	
	public static String Checker(String pokemon, Scanner sc) throws FileNotFoundException{
		Scanner input = new Scanner(new File("type.txt"));
		String pokemonname = "";
		String type1 = "";
		String type2 = "";
		while(input.hasNextLine()){	
			String line = input.nextLine();
			Scanner lineanalysis = new Scanner(line);		
				while(lineanalysis.hasNext() && !pokemonname.equals(pokemon)){
					type1 = "";
					type2 = "";
					lineanalysis.next();				
					lineanalysis.next();
					lineanalysis.next();
					pokemonname = lineanalysis.next();						
					type1 = lineanalysis.next();
					if(lineanalysis.hasNext()){
						type2 = lineanalysis.next();
					}					
				}			
		}
		if(type2.equals("")){
			System.out.println(pokemon + " is " + type1 + " type.");
		}
		else{
			System.out.println(pokemon + " is " + type1 + " and " + type2 + " type.");
		}
		System.out.println();
		System.out.println("Here's a list of " + pokemon + "'s weaknesses with the damage multiplier:");
		Matchup MU = new Matchup(type1, type2);
		MU.MainCalc();
		System.out.println();
		System.out.print("Would you like to test another Pokemon? Press Y for yes or N for no: " );
		String question = sc.next();
		return question;				
	}
	
}


