/**
 * Programmer name: Sanjay Lindsay
 * Program Details: This is just a simple program created to store a pokemon info 
 * 
 * 
 */

package main;
import javax.swing.JOptionPane;

public class PokemonTest {

	public static void main(String[] args) {
				
		
		String numofpokes = JOptionPane.showInputDialog("Please enter the number of pokemon."); //capture user input in the from of a string
		int numofpoke = Integer.parseInt(numofpokes); //convert the above input into an integer
		
		for(int i = 0; i < numofpoke; i++){
			
		String name1 = JOptionPane.showInputDialog("Please enter your pokemon name.");
		
		String type1 = JOptionPane.showInputDialog("Please enter your pokemon type.");
		
		String ultimate1 = JOptionPane.showInputDialog("Please enter your pokemon ultimate ability.");
		
		String hp01 = JOptionPane.showInputDialog("Please enter the pokemon hp."); //capture user input in the from of a string
		int hp1 = Integer.parseInt(hp01); //convert the above input into an integer
		
		String cp01 = JOptionPane.showInputDialog("Please enter the pokemon cp"); //capture user input in the from of a string
		int cp1 = Integer.parseInt(cp01); //convert the above input into an integer
		
		pokemon name = new pokemon(name1, type1, ultimate1, hp1, cp1); //create a new pokemon object
		
		String message = ("Name: "+name.getName()+"\nType: "+name.getType()+"\nUltimate: "+name.getUltimate()+"\nHP: "+name.getHP()+"\nCP: "+name.getCP());

		JOptionPane.showMessageDialog(null, message);
		}
	}

}
