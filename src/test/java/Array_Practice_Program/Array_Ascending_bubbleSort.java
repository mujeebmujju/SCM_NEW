 // SORT AN ARRAY IN ASCENDING ORDER USING BUBBLE SORT

package Array_Practice_Program;  
import org.testng.annotations.Test;

public class Array_Ascending_bubbleSort 
{
	@Test
	public void Ascending()
	{
		int[]a= {10,5,22,15,13};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
			System.out.print(a[i]+" ");
		}
		
	}


}
