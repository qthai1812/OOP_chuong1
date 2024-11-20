package Moi;

public class HinhVuong extends Hinh {
	private int canh;

	public HinhVuong(int x, int y, int canh) {
		super(x, y);
		this.canh = canh;
	}

	public int getCanh() {
		return canh;
	}

	public void setCanh(int canh) {
		this.canh = canh;
	}

	@Override
	public int dientTich() {

		return this.canh * this.canh;
	}

}
