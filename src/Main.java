import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		Scanner kb=new Scanner(System.in);
		do
		{
			System.out.println("Nhap vao so SP:");
			n=kb.nextInt();
		}while(n<=0 || n>100);
		SanPham arr[]=new SanPham[n];
		for(int i=0;i<arr.length;i++)
			arr[i]= new SanPham();
		System.out.println("Danh sach San pham co don gia giam dan:");
		SanPham temp= null;
		for(int i=0;i<arr.length-1;i++)
			for(int j=1;j<arr.length;j++)
		{
			if(arr[i].getDongia()<arr[j].getDongia())
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int i=0;i<arr.length;i++)
		{	arr[i].show();

	}
	}
}
