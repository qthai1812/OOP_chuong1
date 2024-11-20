import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[3];
		for(int i=0;i<3;++i)
		{
			System.out.println("nhap so canh thu i "+i);
			arr[i]=sc.nextInt();
		}
		
		TamGiac tg = new TamGiac(3, arr);
		tg.inHinh();
		tg.chuVi();
		tg.kiemTra();
		tg.dienTich();
	}
}

