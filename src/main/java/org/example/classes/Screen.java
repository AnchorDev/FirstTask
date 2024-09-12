package org.example.classes;

public class Screen {
    protected String resolution;
    protected double size;

    private String panelType;

    public Screen(String resolution, double size, String panelType) {
        this.resolution = resolution;
        this.size = size;
        this.panelType = panelType;
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

    public String getPanelType() {
        return panelType;
    }

    public void setPanelType(String panelType) {
        this.panelType = panelType;
    }

    @Override
    public String toString() {
        return "Screen{" + "resolution='" + resolution + '\'' + ", size=" + size + ", panelType='" + panelType + '\'' + '}';
    }

    @Override
    public int hashCode() {
        int result = resolution.hashCode();
        long temp = Double.doubleToLongBits(size);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + panelType.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Screen screen = (Screen) obj;
        return Double.compare(screen.size, size) == 0 && resolution.equals(screen.resolution) && panelType.equals(screen.panelType);
    }
}
