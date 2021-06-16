import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
*Author: cy.andersen
*Date : Jun. 16, 2021
*Description: 
*/

public class RegExp1 {

	public static void main(String[] args) {

		Scanner crayon=new Scanner(System.in);
		System.out.println("Inscrire le texte pour la recherche"); 
		String input = crayon.nextLine(); 
		System.out.println("Inscrire le texte recherché"); 
		String regEx = crayon.nextLine(); 
		Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE); 
		Matcher matcher = pattern.matcher(input); 
		
		/*while (matcher.find()) 
			{
			System.out.println("Le(s) mot(s) \"" + matcher.group() 
			+ "\" débute l'indice" + matcher.start() 
				+	" et finit l'indice " + matcher.end () );
			}*/
		
		
		/*if (matcher.matches())
		{
			System.out.println("Les deux textes sont les memes");
			} else {
				System.out.println("les deux textes sont differents");
			}*/
		
		if (matcher.lookingAt())
		{
			System.out.println("On a trouve \"" +
		matcher.group() + "\" commencant a l'indice" + matcher.start() +
		" et finit a l'indice" + matcher.end());}
		else {
			System.out.println("Le texte ne se trouve pas au debut");
		
		}
	
	
	
	
	
	}

}
