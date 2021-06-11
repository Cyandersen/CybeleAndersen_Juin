import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
*Author: cy.andersen
*Date : Jun. 11, 2021
*Description: 
*/

public class Exercise1 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
	
	BufferedReader enter;
	String ligne;
		enter = new BufferedReader((new FileReader("/Users/cy.andersen/Desktop/MonFichier.txt")));
while(enter.ready())
{
	ligne=enter.readLine();
	System.out.println(ligne);
		
		}
enter.close();
	
	}

}
