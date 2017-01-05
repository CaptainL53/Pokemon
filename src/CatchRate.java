import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CatchRate {

	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Pokémon you wish to catch: ");
		String pokemon = sc.next();
		System.out.print("Enter the max health of the Pokémon: ");
		int maxhealth = sc.nextInt();
		System.out.print("Enter the current health of Pokémon: ");
		int currenthealth = sc.nextInt();
		System.out.print("Enter type of Poke Ball: (Poke, Great, Ultra): ");
		String ball = sc.next();
		System.out.print("Enter status: (None, Poison, Asleep, Burn, Frozen, Paralysis): ");
		String status = sc.next();
		//System.out.println(pokemon);
		Calculation(pokemon, maxhealth, currenthealth, ball, status);
		sc.close();
	}
	
	public static void Calculation(String pokemon, int maxhealth, int currenthealth, String ball, String status) throws FileNotFoundException{
		double ballmultiplier = 1;
		double statusmultiplier = 1;
		int rate = 1;
		if(ball.equals("Poke")){
			ballmultiplier = 1;
		}
		if(ball.equals("Great")){
			ballmultiplier = 1.5;			
		}
		if(ball.equals("Ultra")){
			ballmultiplier = 2;
		}
		if(status.equals("None")){
			statusmultiplier = 1;
		}
				
		if(status.equals("Poison") || status.equals("Paralysis") || status.equals("Burn")){
			statusmultiplier = 1.5;
		}
		if(status.equals("Asleep") || status.equals("Frozen")){
			statusmultiplier = 2;
		}
		
		Scanner input = new Scanner(new File("catch.txt"));
		rate = 1;
		String pokemonname = "";
		while(input.hasNextLine()){	
			String line = input.nextLine();
			Scanner lineanalysis = new Scanner(line);		
				while(lineanalysis.hasNext() && !pokemonname.equals(pokemon)){
					lineanalysis.next();				
					lineanalysis.next();
					pokemonname = lineanalysis.next();
					//System.out.println(pokemonname);						
					rate = lineanalysis.nextInt();
					//System.out.println(rate);
				}			
		}
		//System.out.println("Real rate = " + rate);		
		double a = (((3 * maxhealth - 2 * currenthealth) * rate * ballmultiplier)/(3 * maxhealth)) * statusmultiplier;
		//System.out.println("A = " + a);
		int CatchValue = (int) Math.abs(a);
		if(CatchValue >= 255){
			System.out.println("Guaranteed Catch.");
		}
		else{
			Catch(CatchValue);
		}
		
	}
	
	public static void Catch(int CatchValue){
		int shakes = 0;
		boolean caught = false;
		int catch2 = (int) (1048560 / Math.sqrt(Math.sqrt(16711680 / CatchValue)));
		double chance = (Math.pow((double)catch2/65536, 4)) * 100;
		System.out.print("The probability of catching this Pokémon is about ");
		System.out.printf("%.2f", chance);
		System.out.println("%");
		System.out.print("Let's try a simulation: ");
		for(int i = 0; i < 4; i++){
			int random = (int) (Math.random() * 65536);
			//System.out.println(random);
			if(random >= catch2){
				caught = false;			
				break;
			}
			else{
				shakes++;
				caught = true;				
			}
		}
		if(caught == true){
			System.out.println("Caught.");
		}
		else{
			System.out.println("Ball shook " + shakes + " time(s). Failed. ");
		}
	}
	
}
