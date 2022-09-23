package br.com.fiap.pacman;

public class Booster extends Item {
    private Integer duration;

    public Booster() {
    }

    public Booster(Integer x, Integer y) {
        super(x, y);
    }

    public Booster(Integer x, Integer y, Integer duration) {
        super(x, y);
        this.duration = duration;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

}
