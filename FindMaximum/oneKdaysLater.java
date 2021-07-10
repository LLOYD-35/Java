
public class oneKdaysLater {

	public static void main(String[] args) {
		String[] week=new String[]{"Mon","Tue","Wed","Thur","Fri","Sat","Sun"};
		int day=1,time=7,result=0;
//		Mon:0, Tue:1, Wed:2, Thur:3, Fri:4, Sat:5, Sun:6
		 result = calculateWeek(week, day, time);
		 System.out.println("시작 요일 : "+week[day]);
		 System.out.printf("%d일 후는 %s",time,week[result]);
	}
	public static int calculateWeek(String[] week, int day, int time) {
		int countWeek=0;
		int i=0,j=day;
		while(true)
		{
			// 요일을 반복함		
				for(j=day;j<week.length;j++)
				{	
					if(i==time)
						break;
					if(j==6) 
					{
						j=0;
						i++;
//						i+=week.length-day;
						countWeek++;
					}
					else
						i++;
				}
				
				
			
			break;
		}
		return j;
	}
}
