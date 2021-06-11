import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/*
*Author: cy.andersen
*Date : Jun. 11, 2021
*Description: 
*/

public class Exercise2 {

	public static void main(String[] args) throws IOException {
	
	BufferedReader enter;
	int sum = 0;
enter = new BufferedReader (new FileReader("/Users/cy.andersen/Desktop/Calcul.txt"));
	while(enter.ready())
	{sum+=Integer.parseInt(enter.readLine());}
	enter.close();
	 PrintWriter exit;
	 FileWriter fichier;
	 fichier = new FileWriter("/Users/cy.andersen/Desktop/Resultat.txt");
	 exit=new PrintWriter(fichier);
	 exit.print(sum);
	 exit.close();

	}
}
	