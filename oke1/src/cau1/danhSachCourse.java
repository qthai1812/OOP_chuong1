package cau1;

import java.util.ArrayList;

public class danhSachCourse {
    private ArrayList<Course> dsKhoaHoc;
    public danhSachCourse() {
    	this.dsKhoaHoc = new ArrayList<Course>();
	}
	public danhSachCourse(ArrayList<Course> dsKhoaHoc) {
		this.dsKhoaHoc = dsKhoaHoc;
	}
	public void addCourse(Course khoahoc)
	{
		this.dsKhoaHoc.add(khoahoc);
	}
	
    
}
