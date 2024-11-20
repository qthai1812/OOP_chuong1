package cau1;

public class Test {
public static void main(String[] args) {
	Course c1 = new Course("ki thuat lap trinh", "c++", 3);
	NoteBook b1 = new NoteBook("giao trinh", "2022", "OOP", "99", c1);
	System.out.println(b1.toString());
	
}
}
