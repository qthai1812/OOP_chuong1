package cau1;

public class Book {
    private String tensach;
    private String namXuatBan;
	public Book(String tensach, String namXuatBan) {
		this.tensach = tensach;
		this.namXuatBan = namXuatBan;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public String getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(String namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	@Override
	public String toString() {
		return "Book [tensach=" + tensach + ", namXuatBan=" + namXuatBan + "]";
	}
    
}
