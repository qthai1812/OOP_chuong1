package baitap1;

public class ConNguoi {
	private String hoTen;
	private String namSinh;

	public ConNguoi(String hoTen, String namSinh) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public void an() {
		System.out.println("mam mam");
	}
}
