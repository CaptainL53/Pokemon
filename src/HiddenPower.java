import java.util.Scanner;

public class HiddenPower {
	public static void main(String[] args){
		Questions();
	}
	
	public static void Questions(){
		Scanner sc = new Scanner(System.in);
		System.out.println("This program will calculate your Pokemon's Hidden Power Type and Power.");
		System.out.println("Enter your Pokemon's Health IV: ");		
		int health = Bit(sc.nextInt());
		System.out.println("Enter your Pokemon's Attack IV: ");
		int attack = Bit(sc.nextInt());
		System.out.println("Enter your Pokemon's Defense IV: ");
		int defense = Bit(sc.nextInt());
		System.out.println("Enter your Pokemon's Speed IV: ");
		int speed = Bit(sc.nextInt());
		System.out.println("Enter your Pokemon's Special Attack IV: ");
		int specialattack = Bit(sc.nextInt());
		System.out.println("Enter your Pokemon's Special Defense IV: ");
		int specialdefense = Bit(sc.nextInt());	
		int type = (int) Math.floor((((health + (2 * attack) + (4 * defense) + (8 * speed) + (16 * specialattack) + (32 * specialdefense)) * 15) / 63));
		System.out.println(type);
	}
	
	public static int Bit(int x){
		if(x % 2 == 1){
			return 1;
		}
		else{
			return 0;
		}
	}
}
