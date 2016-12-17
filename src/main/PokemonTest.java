package main;

import java.util.*;

public class PokemonTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your pokemon name, type, ultimate ability, hp, cp. All must be separated by space: ");
		String name1 = input.next();
		String type1 = input.next();
		String ultimate1 = input.next();
		int hp1 = input.nextInt();
		int cp1 = input.nextInt();
		
		pokemon name = new pokemon(name1, type1, ultimate1, hp1, cp1);
		
		System.out.println("Name: "+name.getName()+"\nType: "+name.getType()+"\nUltimate: "+name.getUltimate()+"\nHP: "+name.getHP()+"\nCP: "+name.getCP());

	}

}
