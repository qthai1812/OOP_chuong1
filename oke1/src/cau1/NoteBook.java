package cau1;

public class NoteBook extends Book{
   private  String MonHoc;
   private  String SoTrang;
   private  Course khoaHoc;
public NoteBook(String tensach, String namXuatBan, String monHoc, String soTrang, Course khoaHoc) {
	super(tensach, namXuatBan);
	MonHoc = monHoc;
	SoTrang = soTrang;
	this.khoaHoc = khoaHoc;
}
public String getMonHoc() {
	return MonHoc;
}
public void setMonHoc(String monHoc) {
	MonHoc = monHoc;
}
public String getSoTrang() {
	return SoTrang;
}
public void setSoTrang(String soTrang) {
	SoTrang = soTrang;
}
public Course getKhoaHoc() {
	return khoaHoc;
}
public void setKhoaHoc(Course khoaHoc) {
	this.khoaHoc = khoaHoc;
}
@Override
public String toString() {
	return "NoteBook [MonHoc=" + MonHoc + ", SoTrang=" + SoTrang + ", khoaHoc=" + khoaHoc + "]";
}
   
}
