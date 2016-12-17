package main;

public class pokemon {

	private String name; //stores name of pokemon
	private String type; //stores the type of pokemon
	private String ultimate; //stores the pokemon main ability
	private int hp; //stores the pokemon hitpoint
	private int cp; //stores the pokemon cp
	
	public pokemon(String name, String type, String ultimate, int hp, int cp){
		this.name = name;
		this.type = type;
		this.ultimate = ultimate;
		
		if(hp > 0) //if hp > 0 it will assign the user input to hp variable
			this.hp = hp;
		else
			System.out.println("HP void");
		
		if(cp > 0) //if cp > 0 it will assign the user input to hp variable
			this.cp = cp;
		else
			System.out.println("cp void");
		this.cp = cp;
	}
	
	/**
	 * The set and get methods are employed to obtain pokemon data 
	 */
	public void setName(String name){
		this.name = name;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public void setUltimate(String ultimate){
		this.ultimate = ultimate;
	}
	
	public void setHP(int hp){
		this.hp = hp;
	}
	
	public void setCP(int cp){
		this.cp = cp;
	}
	
	public String getName(){
		return name;
	}
	
	public String getType(){
		return type;
	}
	
	public String getUltimate(){
		return ultimate;
	}
	
	public int getHP(){
		return hp;
	}
	
	public int getCP(){
		return cp;
	}
}
