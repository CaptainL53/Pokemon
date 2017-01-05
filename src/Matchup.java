public class Matchup {
	private String type1;
	private String type2;
	private double[] typenum = new double[18];
	private String[] typename = new String[18];
	
	public Matchup(String type1, String type2){
		this.type1 = type1;
		this.type2 = type2;
	}
	
	public String getType1(){
		return type1;
	}
	
	public String getType2(){
		return type2;
	}
	
	public void MainCalc(){
		for(int i = 0; i < typenum.length; i++){
			typenum[i] = 1;
		}
		typename[0] = "Normal";
		typename[1] = "Fighting";
		typename[2] = "Flying";
		typename[3] = "Poison";
		typename[4] = "Ground";
		typename[5] = "Rock";
		typename[6] = "Bug";
		typename[7] = "Ghost";
		typename[8] = "Steel";
		typename[9] = "Fire";
		typename[10] = "Water";
		typename[11] = "Grass";
		typename[12] = "Electric";
		typename[13] = "Psychic";
		typename[14] = "Ice";
		typename[15] = "Dragon";
		typename[16] = "Dark";
		typename[17] = "Fairy";
		
		Weakness(type1, typenum);
		if(!type2.equals("")){
			Weakness(type2, typenum);
		}
		for(int i = 0; i < typenum.length; i++){
			System.out.println(typename[i] + ": " + typenum[i]);
		}
	}
	
	public void Weakness(String type, double[] typenum){
		if(type.equals("Fairy")){
			typenum[15] *=0;
			typenum[1] *=0.5;
			typenum[6] *=0.5;
			typenum[16] *=0.5;
			typenum[3] *=2;
			typenum[8] *=2;
		}
		if(type.equals("Steel")){
			typenum[0] *=0.5;
			typenum[1] *=2;
			typenum[2] *= 0.5;
			typenum[3] *=0;
			typenum[4] *=2;
			typenum[5] *=0.5;
			typenum[6] *=0.5;
			typenum[8] *=0.5;
			typenum[9] *=2;
			typenum[11] *=0.5;
			typenum[13] *=0.5;
			typenum[14] *=0.5;
			typenum[15] *=0.5;
			typenum[17] *=0.5;
		}
		if(type.equals("Dark")){
			typenum[13] *=0;
			typenum[7] *=0.5;
			typenum[16] *=0.5;
			typenum[1] *=2;
			typenum[6] *=2;
			typenum[17] *=2;
		}
		if(type.equals("Dragon")){
			typenum[9] *=0.5;
			typenum[10] *=0.5;
			typenum[11] *=0.5;
			typenum[12] *=0.5;
			typenum[14] *=2;
			typenum[15] *=2;
			typenum[17] *=2;
		}
		if(type.equals("Ghost")){
			typenum[0] *=0;
			typenum[1] *=0;
			typenum[3] *=0.5;
			typenum[6] *=0.5;
			typenum[7] *=2;
			typenum[16] *=2;
		}
		if(type.equals("Rock")){
			typenum[0] *=0.5;
			typenum[9] *=0.5;
			typenum[3] *=0.5;
			typenum[2] *=0.5;
			typenum[10] *=2;
			typenum[11] *=2;
			typenum[1] *=2;
			typenum[4] *=2;
			typenum[8] *=2;
		}	
		if(type.equals("Bug")){
			typenum[11] *=0.5;
			typenum[1] *=0.5;
			typenum[4] *=0.5;
			typenum[9] *=2;
			typenum[2] *=2;
			typenum[5] *=2;
		}
		if(type.equals("Psychic")){
			typenum[1] *= 0.5;
			typenum[13] *= 0.5;
			typenum[6] *= 2;
			typenum[7] *=2;
			typenum[16] *=2;
		}
		if(type.equals("Flying")){
			typenum[4] *= 0;
			typenum[11] *=0.5;
			typenum[1] *=0.5;
			typenum[6] *=0.5;
			typenum[12] *=2;
			typenum[14] *= 2;
			typenum[5] *= 2;			
		}
		if(type.equals("Ground")){
			typenum[4] *= 0;
			typenum[3] *= 0.5;
			typenum[5] *= 0.5;
			typenum[10] *= 2;
			typenum[11] *= 2;
			typenum[14] *= 2;
		}
		if(type.equals("Poison")){
			typenum[11] *= 0.5;
			typenum[1] *= 0.5;
			typenum[3] *= 0.5;
			typenum[6] *= 0.5;
			typenum[17] *= 0.5;
			typenum[4] *= 2;
			typenum[13] *= 2;
		}
		if(type.equals("Fighting")){
			typenum[6] *= 0.5;
			typenum[5] *= 0.5;
			typenum[16] *= 0.5;
			typenum[2] *= 2;
			typenum[13] *= 2;
			typenum[17] *= 2;			
		}
		if(type.equals("Ice")){
			typenum[14] *= 0.5;
			typenum[9] *= 2;
			typenum[1] *= 2;
			typenum[5] *= 2; 
			typenum[8] *= 2;			
		}
		if(type.equals("Grass")){
			typenum[10] *= 0.5;
			typenum[12] *= 0.5;
			typenum[11] *= 0.5;
			typenum[4] *= 0.5;
			typenum[9] *= 2;
			typenum[14] *= 2;
			typenum[3] *= 2;
			typenum[2] *= 2;
			typenum[6] *= 2;
		}
		if(type.equals("Electric")){
			typenum[12] *= 0.5;
			typenum[4] *= 2;
			typenum[2] *= 0.5;
		}						
		if(type.equals("Water")){
			typenum[9] *= 0.5;
			typenum[10] *= 0.5;
			typenum[12] *= 2;
			typenum[11] *= 2;
			typenum[14] *= 0.5;
			typenum[8] *= 0.5;
			
		}
		if(type.equals("Normal")){
			typenum[1] *= 2;
			typenum[7] *= 0;
		}
		if(type.equals("Fire")){
			typenum[9] *= 0.5;
			typenum[10] *= 2;
			typenum[11] *= 0.5;
			typenum[14] *= 0.5;
			typenum[4] *= 2;
			typenum[6] *= 0.5;
			typenum[5] *= 2;
			typenum[8] *= 0.5;
			typenum[17] *= 0.5;
		}
	}
	
	
}
