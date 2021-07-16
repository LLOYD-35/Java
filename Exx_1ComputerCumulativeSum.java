public class Exx_1ComputerCumulativeSum {

	public static void main(String[] args) {
		int[] FREQ = {1,0,7,5,4};
		int[] CUME;
		
		CUME=ComputerCumulativeSum2(FREQ);
		System.out.println("¹è¿­ CUME: ");
		for(int i=0;i<CUME.length;i++)
			System.out.print(CUME[i] + "\t");
	}
	public static int[]	ComputerCumulativeSum2(int[] FREQ) {
		int n= FREQ.length;
		int[] CUME = new int[n];
		
		CUME[0]=FREQ[0];
		for(int i=1;i<n;i++)
		{
			CUME[i]=CUME[i-1]+FREQ[i];
		}
		return CUME;
	}
}
