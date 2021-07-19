
public class Ex2_22Convert_Dec_Bin {

	public static void main(String[] args) {
	int decimal=17;
	int result=1;
	int[] binary_data= new int[decimal];
	binary_data[0]=1;
	for(int i=1;i<decimal;i++)
	{
		result*=2;
		binary_data[i]=result;
	}
	int near=check(binary_data,decimal);
	System.out.println("필요한 비트 수: "+near);
	}
	public static int check(int[] a,int dec)
	{
		int near=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=dec)
			{
				if(min>(a[i]-dec))
				{
					min=(a[i]-dec);
					near=i;
				}
			}
		}
		return near+1;
	}
}
