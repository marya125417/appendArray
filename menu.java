package array;
import java.util.Scanner;
public class menu {
	
	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		
		
			System.out.println("1. Pleas enter Length of first Array : ");
			int firstArraLen=in.nextInt();
			int[] array=new int[firstArraLen];
			for(int i=0;i<firstArraLen;i++)
			{
			System.out.println("pleas enter Array["+i+"]");
			 array[i]=in.nextInt();
			}
			System.out.println("2. Pleas enter Length of second Array : ");
			int secondArraLen=in.nextInt();
			int[] array2=new int[secondArraLen];
			for(int j=0;j<secondArraLen;j++)
			{
			System.out.println("pleas enter Array["+j+"]");
			 array2[j]=in.nextInt();
			}
			int thirdArrayLength=firstArraLen+secondArraLen;
			int[] array3=new int[thirdArrayLength];
			
		
				for(int l=0;l<firstArraLen;l++)
					array3[l]=array[l];
				int n=0;
				for(int m=firstArraLen;m<thirdArrayLength;m++)
				{
					array3[m]=array2[n];
					n++;
				}
		
			for(int o=0;o<thirdArrayLength;o++)
				System.out.print(array3[o]+",");
			
			
			
		}
	}


