import java.util.Arrays;
public class s3a2{
	public static void main(String[] args) {
	        // write your code here
	        int[] anArray = {13,47,21,9,60,23,55,97,33,81};
	        int count=0;
	        s3a2 obj=new s3a2();
	        int i,j,temp;
	        for (i=0;i<9;i++)
	        {
	        	for (j=0;j<9-i;j++)
	        	{
	        		if(anArray[j]>anArray[j+1])
	        		{
	        			temp=anArray[j];
	        			anArray[j]=anArray[j+1];
	        			anArray[j+1]=temp;
	        			count++;
	        		}
	        	}

	        }
	        System.out.println("The ascending order arrary is "+Arrays.toString(anArray));
	        System.out.println("Counter is "+count);


	    }
}