import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/*
*Author: cy.andersen
*Date : Jun. 11, 2021
*Description: 
*/

public class Exercise2 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner scanner = null;
        double sumnum = 0;
        try {
        	scanner = new Scanner(
             (Readable) new BufferedReader(new FileReader("/Users/cy.andersen/Desktop/Calcul.txt")));
        while (scanner.hasNext()) {
          if (scanner.hasNextDouble()) {
        sumnum += scanner.nextDouble();
                    } else {
                    	scanner.next();
                    }   }
        } finally {
        	scanner.close();
        }
        
        System.out.println(sumnum);
    }
}
