package cau1;

public class Course {
	private String tenKhoaHoc;
	private String moTa;
	private int soTinChi;

	public Course(String tenKhoaHoc, String moTa, int soTinChi) {
		this.tenKhoaHoc = tenKhoaHoc;
		this.moTa = moTa;
		this.soTinChi = soTinChi;
	}

	public String getTenKhoaHoc() {
		return tenKhoaHoc;
	}

	public void setTenKhoaHoc(String tenKhoaHoc) {
		this.tenKhoaHoc = tenKhoaHoc;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}

	@Override
	public String toString() {
		return "Course [tenKhoaHoc=" + tenKhoaHoc + ", moTa=" + moTa + ", soTinChi=" + soTinChi + "]";
	}

}
