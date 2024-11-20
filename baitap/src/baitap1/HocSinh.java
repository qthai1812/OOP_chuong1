package baitap1;

public class HocSinh extends ConNguoi {
	private String maSV;
	private double diem;

	public HocSinh(String hoTen, String namSinh, String maSV, double diem) {
		super(hoTen, namSinh);
		this.maSV = maSV;
		this.diem = diem;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public void lamBaiTap() {
		System.out.println("csdcsdsddddddddddd");
	}

}
