package org.example;

public class Screen {
    protected String resolution;
    protected double size;

    public Screen(String resolution, double size) {
        this.resolution = resolution;
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Screen{" + "resolution='" + resolution + '\'' + ", size=" + size + '}';
    }

    @Override
    public int hashCode() {
        int result = resolution.hashCode();
        long temp = Double.doubleToLongBits(size);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Screen screen = (Screen) obj;
        return Double.compare(screen.size, size) == 0 && resolution.equals(screen.resolution);
    }
}
