package ktra;
public class Test {
	public static void main(String[] args) {
		try {
			Shape[] shapes = { new Rectangle("Rectangle1", 5, 10), new Triangle("Triangle1", 4, 6),
					new Rectangle("Rectangle2", 7, 3), new Triangle("Triangle2", 8, 2) };

			System.out.println("Before sorting:");
			for (Shape shape : shapes) {
				System.out.println(shape);
			}

			// Sắp xếp mảng
			bubbleSort(shapes);

			System.out.println("After sorting:");
			for (Shape shape : shapes) {
				System.out.println(shape);
			}

			// Tìm kiếm một đối tượng
			String nameToSearch = "Triangle1";
			int index = linearSearch(shapes, nameToSearch);
			if (index != -1) {
				System.out.println("Found " + nameToSearch + " at index " + index);
			} else {
				System.out.println(nameToSearch + " not found");
			}
		} catch (Exception e) {
			System.err.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}
	public static int linearSearch(Shape[] array, String name) {
	    for (int i = 0; i < array.length; i++) {
	        if (array[i].getName().equals(name)) {
	            return i;
	        }
	    }
	    return -1; // Trả về -1 nếu không tìm thấy
	}
	public static void bubbleSort(Shape[] array) {
	    int n = array.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - 1 - i; j++) {
	            if (array[j].compareTo(array[j + 1]) > 0) {
	                // Hoán đổi vị trí
	                Shape temp = array[j];
	                array[j] = array[j + 1];
	                array[j + 1] = temp;
	            }
	        }
	    }
	}
}
