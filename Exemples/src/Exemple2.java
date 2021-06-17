import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
*Author: cy.andersen
*Date : Jun. 17, 2021
*Description: 
*/

public class Exemple2 {

	public static void main(String[] args) throws IOException {
		FileReader ficALire; 
		BufferedReader entree; 
		char c; 
		ficALire=new FileReader("monFichier.txt"); 
		entree = new BufferedReader(ficALire); 
		c=(char) entree.read ();
		System.out.print(c); 
		c=(char) entree.read(); 
		System.out.print(c); 
		c=(char) entree.read(); 
		System.out.print(c); 
		entree.close(); 
		ficALire.close();
	}

}
