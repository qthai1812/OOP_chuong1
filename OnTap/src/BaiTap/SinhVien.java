package BaiTap;

public class SinhVien {
	private String maSinhVien;
	private String hoTen;
	private double diemLyThuyet;
	private double diemThucHanh;

	// Constructor không đối- khởi gán các giá trị mặc định cho thuộc tính
	public SinhVien() {
		this.maSinhVien = "";
		this.hoTen = "";
		this.diemLyThuyet = 0;
		this.diemThucHanh = 0;
	}

	// Constructor có đầy đủ các đối- khởi gán giá trị như truyền vào
	public SinhVien(String maSinhVien, String hoTen, double diemLyThuyet, double diemThucHanh) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
	}

	// Phương thức nhap() - nhập thông tin Sinh viên và tính luôn điểm trung bình
	public void nhap(String maSinhVien, String hoTen, double diemLyThuyet, double diemThucHanh) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
	}

	// Phương thức tính điểm trung bình
	public double diemTrungBinh() {
		return (this.diemLyThuyet + this.diemThucHanh) / 2;
	}

	// Phương thức toString() - kết xuất xâu mô tả Sinh Viên
	@Override
	public String toString() {
		return "SinhVien{" + "maSinhVien='" + maSinhVien + '\'' + ", hoTen='" + hoTen + '\'' + ", diemLyThuyet="
				+ diemLyThuyet + ", diemThucHanh=" + diemThucHanh + ", diemTrungBinh=" + diemTrungBinh() + '}';
	}
}
