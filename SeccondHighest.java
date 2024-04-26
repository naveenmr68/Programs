package Logics;

public class SeccondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {10,25,30,35,40};
		
		int H = arr[0];
		int SH = arr[0];
		
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>H)
			{
				SH=H;
				H=arr[i];
			}
			else if(arr[i]>SH)
			{
				SH=arr[i];
			}
		}
		System.out.println("Highest Number is :"+H);
		System.out.println("Second Highest Number is :"+SH);
		

	}

	dhfgfh
	fdfhghj
}
