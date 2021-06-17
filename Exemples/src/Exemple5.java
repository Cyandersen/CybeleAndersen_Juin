import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
*Author: cy.andersen
*Date : Jun. 17, 2021
*Description: 
*/

public class Exemple5 {

	public static void main(String[] args) throws IOException {
		BufferedReader entree; 
		String ligne; 
		entree = new BufferedReader(new FileReader("monFichier.txt")); 
		while(entree. ready())
		{
			ligne=entree.readLine();
			System.out.println(ligne);
		}
	entree.close();
	}

}
