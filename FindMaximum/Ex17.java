
class coin{
	int name;
	int weight;
	coin(int i, int j){
		this.name= i;
		this.weight=j;
	}
}

public class Ex17 {

	public static void main(String[] args) {
		coin c[]=new coin[7];
		for(int i=0;i<c.length;i++)
			c[i]=new coin(i+1, 10);
		c[5].weight=9;
//		for(int i=0;i<c.length;i++)
//		{
//			c[i]=new coin(i+2,10);
//		}

		int result=searchCoin(c);
		System.out.println("��¥ ������ "+c[result].name);
		
	}
	public static int searchCoin(coin[] c) {
		String l="�������� ������.";	//����>������
		String r="���������� ������.";
		String a="���� ���� ��� ";
		for(int i=0;i<5;i+=2)
		{
			if(c[i].weight<c[i+1].weight)
			{
				System.out.println(a+r);
				return i;
			}
			else if(c[i].weight>c[i+1].weight)
			{
				System.out.println(a+l);
				return i+1;
			}
			else 
				System.out.println(a+"�� �� ����.");
		}
		return c.length;
	}

}
