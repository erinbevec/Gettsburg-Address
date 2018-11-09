/**
 * Erin Bevec
 * APCS - p6
 * Gettysburg Address
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class GAddress 
{
	public static void main(String[] args) throws FileNotFoundException
	{
	Scanner file = new Scanner(new File("GAddress.txt"));
	ArrayList<String> words = new ArrayList<String>();
	while (file.hasNext())
	{
		words.add(file.next());
	}
		String largest = words.get(0);
		double ave = 0.0;
		double sum = 0.0;
		for (int i=0; i < words.size(); i++) 
		{
			if (words.get(i).length() > largest.length())
			{
				largest = words.get(i);
			}
			sum = words.get(i).length() + sum;
			ave = sum/words.size();
		}
		System.out.println("The longest word is " + largest);
		System.out.println("The average word length is " + ave);
	}
	}

