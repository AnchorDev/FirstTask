package org.example;

public class Camera {
    private int megapixels;
    private boolean hasFlash;

    public Camera(int megapixels, boolean hasFlash) {
        this.megapixels = megapixels;
        this.hasFlash = hasFlash;
    }

    public int getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    public boolean isHasFlash() {
        return hasFlash;
    }

    public void setHasFlash(boolean hasFlash) {
        this.hasFlash = hasFlash;
    }
}
