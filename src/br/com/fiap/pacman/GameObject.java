package br.com.fiap.pacman;

public class GameObject {
    private Integer x;
    private Integer y;
    private Integer screenSize;

    public GameObject() {
    }

    public GameObject(Integer x, Integer y) {
        if (x >= 0 && y >= 0) {
            this.x = x;
            this.y = y;
        }

    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        if (x >= 0) {
            this.x = x;
        }

    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        if (y >= 0) {
            this.y = y;
        }
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

}
