package ktra;

import java.util.Objects;

public abstract class Shape implements Comparable<Shape> {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();

    @Override
    public int compareTo(Shape other) {
        // So sánh theo tên
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " with area: " + getArea();
    }

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		return Objects.equals(name, other.name);
	}
	

    
}



