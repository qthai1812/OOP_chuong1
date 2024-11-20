package Bai1;

public class Main {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("huyndai","japan");
        PhuongTienDiChuyen p1 = new MayBay("dsdsc",h1,"hidro");
        System.out.println(p1.layTenHangSanXuat());
        p1.tangToc();
	}
}
