package Practice_Programme;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class get_Char_of_CapitalizedString {

	public static void main(String[] args) {
		String string = "NaveenAutomationLabsYoutubeSundar";

		int count = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);

//		Approach 2 
		int count1 = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
				count1++;
			}
		}
		System.out.println(count);

//approach 3

		int count2 = 0;
		for (int i = 0; i < string.length(); i++)
		{
			if (Character.isUpperCase(string.charAt(i))) 
			{
		    	count2++;
			}
		 }
		System.out.println(count);

		}
}
