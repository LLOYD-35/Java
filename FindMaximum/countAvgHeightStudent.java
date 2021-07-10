
public class countAvgHeightStudent {

	public static void main(String[] args) {
		int count=0;
		int avgheight;
		double[] StudentHeight;
		StudentHeight=new double[] {167.3, 170.1, 171.2, 168.5, 180.2, 178.5, 177.9, 158.8, 155.3, 183.4};
		
		count=countAvgHeightStudent(StudentHeight, count);
		System.out.println("평균 키보다 큰 학생의 수: "+count);
	}
	public static int countAvgHeightStudent(double[] Height, int count) {
		double avg=0;
		for(int i=0;i<Height.length;i++)
			avg+=Height[i];
		avg=avg/Height.length;
		for(int j=0;j<Height.length;j++)
			if(Height[j]>=avg)
				count++;
		return count;
	}

}
