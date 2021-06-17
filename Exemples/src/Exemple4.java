import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
*Author: cy.andersen
*Date : Jun. 17, 2021
*Description: 
*/

public class Exemple4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader entree;
		int c; 
		entree = new BufferedReader (new FileReader("monFichier.txt"));
		while(entree.ready()) 
		{ 
			c=entree.read();
		System.out.print((char) c); 
		}
		entree.close();		

	}

}
