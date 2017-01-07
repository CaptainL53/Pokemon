import java.util.Scanner;

public class HiddenPower {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String retry = "Y";
		while(retry.equals("Y")){
			retry = Questions(sc);
			System.out.println();
		}
		sc.close();
	}
	
	public static String Questions(Scanner sc){		
		System.out.println("This program will calculate your Pokemon's Hidden Power Type and Power.");
		System.out.print("Enter your Pokemon's Health IV: ");		
		int health = sc.nextInt();
		int health1 = TypeBit(health);
		int health2 = DamageBit(health);
		System.out.print("Enter your Pokemon's Attack IV: ");
		int attack = sc.nextInt();
		int attack1 = TypeBit(attack);
		int attack2 = DamageBit(health);
		System.out.print("Enter your Pokemon's Defense IV: ");
		int defense = sc.nextInt();
		int defense1 = TypeBit(defense);
		int defense2 = DamageBit(defense);
		System.out.print("Enter your Pokemon's Speed IV: ");
		int speed = sc.nextInt();
		int speed1 = TypeBit(speed);
		int speed2 = DamageBit(speed);
		System.out.print("Enter your Pokemon's Special Attack IV: ");
		int specialattack = sc.nextInt();
		int specialattack1 = TypeBit(specialattack);
		int specialattack2 = DamageBit(specialattack);
		System.out.print("Enter your Pokemon's Special Defense IV: ");
		int specialdefense = sc.nextInt();
		int specialdefense1 = TypeBit(specialdefense);
		int specialdefense2 = DamageBit(specialdefense);
		int typenum = (int) Math.floor((((health1 + (2 * attack1) + (4 * defense1) + (8 * speed1) + (16 * specialattack1) + (32 * specialdefense1)) * 15) / 63));
		//System.out.println(typenum);
		String type = Type(typenum);
		int damagenum = (int) Math.floor((((health2 + (2 * attack2) + (4 * defense2) + (8 * speed2) + (16 * specialattack2) + (32 * specialdefense2)) * 40) / 63) + 30);
		System.out.println("Hidden Power is " + type + " type and has a base power of " + damagenum + ".");
		System.out.print("Would you like to try again? Press Y for yes or N for no: ");		
		return sc.next();
	}
	
	public static int TypeBit(int x){
		if(x % 2 == 1){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public static String Type(int typenum){
		String type = "";
		if(typenum == 0){
			type = "Fighting";
		}
		else if(typenum == 1){
			type = "Flying";
		}
		else if(typenum == 2){
			type = "Poison";
		}
		else if(typenum == 3){
			type = "Ground";
		}
		else if(typenum == 4){
			type = "Rock";
		}
		else if(typenum == 5){
			type = "Bug";
		}
		else if(typenum == 6){
			type = "Ghost";
		}
		else if(typenum == 7){
			type = "Steel";
		}
		else if(typenum == 8){
			type = "Fire";
		}
		else if(typenum == 9){
			type = "Water";
		}
		else if(typenum == 10){
			type = "Grass";
		}
		else if(typenum == 11){
			type = "Electric";
		}
		else if(typenum == 12){
			type = "Psychic";
		}
		else if(typenum == 13){
			type = "Ice";
		}
		else if(typenum == 14){
			type = "Dragon";
		}
		else if(typenum == 15){
			type = "Dark";
		}
		else{
			type = "ERROR";
		}
		return type;
	}
	
	public static int DamageBit(int y){
		if (y % 4 == 2 || y % 4 == 3){
			return 1;
		}
		else{
			return 0;
		}
	}
}
