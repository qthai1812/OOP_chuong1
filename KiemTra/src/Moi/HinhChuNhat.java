package Moi;

public class HinhChuNhat extends Hinh {
	private int chieuDai;
	private int chieuRong;

	public HinhChuNhat(int x, int y, int chieuDai, int chieuRong) {
		super(x, y);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	@Override
	public int dientTich() {
		return this.chieuDai * this.chieuRong;
	}

}
