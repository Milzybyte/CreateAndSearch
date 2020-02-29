import java.util.*;
import javax.swing.*;

public class MenuSearch
{
	public static void main(String[] args)
	{
		// vars and constants
		String[] menuChoices = new String[10];
	
		String entry = ""; 
		String menuString = "";
		int x = 0;
		int numEntered;
		int highestSub = menuChoices.length - 1;
		
		//fill the array with a defualt String value
		Arrays.fill(menuChoices, "zzzzzzz");
		
		//input phase
		menuChoices[x] = JOptionPane.showInputDialog(null, 
			"Enter and item todays menu or zzz to quit");
		while(x <= highestSub && !menuChoices[x].equals("zzz"))
		{
			// add the menu item to the menuString
			menuString = menuString + menuChoices[x] + "\n";
			++x;
			if(x <= highestSub)
			{	
				menuChoices[x] = JOptionPane.showInputDialog(null, 
				"Enter an item for todays menu,	or zzz to quit");
			}	
		}// end of loop
		
		// count up how many items were entered 
		numEntered = x;
		
		entry = JOptionPane.showInputDialog(null, "Todays nemu is:\n" + menuString + "Please make a selection");
		// sort the menuChoices array befor searching
		
		Arrays.sort(menuChoices, 0, numEntered);
		
		x = Arrays.binarySearch(menuChoices, entry);
		if(x>=0 && x < numEntered)
		{	
			JOptionPane.showMessageDialog(null, "Excellent choice");
		}	
		else 
		{	
			JOptionPane.showMessageDialog(null, "Sorry - that item is not on tonights menu");
		}
	}
}