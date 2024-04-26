package Practice_Programme;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Missing_number_inAaray {
	public static void main(String[] args) {

		int a[] = {2,3, 4,5,6,7,8,9,10};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		
		{
		sum=sum+a[i];	
						
		}
		System.out.println(sum);
	
    int sum1=0;
	for(int j=0;j<=10;j++)
		
	{
		sum1+=j;
	}
	System.out.println(sum1);
	
	//int missig_numb=sum1-sum;
	
	System.out.println((sum1-sum)  +"  is missing number from array ");
	}
  }
