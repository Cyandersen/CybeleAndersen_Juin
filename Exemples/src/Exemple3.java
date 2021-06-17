import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
*Author: cy.andersen
*Date : Jun. 17, 2021
*Description: 
*/

public class Exemple3 {

	public static void main(String[] args) throws IOException {
		FileReader ficALire; 
		BufferedReader entree; 
		int c; 
		ficALire=new FileReader("monFichier.txt"); 
		entree = new BufferedReader(ficALire); 
		c=entree.read ();
		while(c != -1 && c != '\n') 
		{ 
			System.out.print((char) c); 
			c=entree.read (); 
			}
		entree.close();
		ficALire.close();
	}
	

}
