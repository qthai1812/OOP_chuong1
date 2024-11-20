import java.util.Iterator;

public class DaGiac {
	protected int soCanh;
	protected int[] arr;

	public DaGiac(int soCanh, int[] arr) {
		this.soCanh = soCanh;
		this.arr = arr;
	}

	public int getSoCanh() {
		return soCanh;
	}

	public void setSoCanh(int soCanh) {
		this.soCanh = soCanh;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public void chuVi() {
		System.out.println("chu vi cua hinh la");
	}

	public void inHinh() {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
