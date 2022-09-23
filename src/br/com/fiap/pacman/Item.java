package br.com.fiap.pacman;

public class Item extends GameObject{
    
    private Boolean vizible;

    public Item() {

    }

    public Item(Integer x, Integer y) {
        super(x, y);
    }

    public Boolean getVizible() {
        return vizible;
    }

    public void setVizible(Boolean vizible) {
        this.vizible = vizible;
    }

    
    
}
