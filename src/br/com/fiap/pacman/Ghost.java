package br.com.fiap.pacman;

import java.util.Random;

public class Ghost extends GameObject {

    private Integer direction;

    public Ghost() {
    }

    public Ghost(Integer x, Integer y, Integer direction) {
        super(x, y);
        this.direction = direction;
    }

    private boolean podeMover(Integer posicao, Integer tela) {

        if ((posicao + 20) < tela) {
            return true;
        }

        return false;

    }

    public void mover() {

        Random rand = new Random();
        int nextInt = rand.nextInt(4);

        switch (nextInt) {

            case 0:
                if(podeMover(this.getX(), this.getScreenSize())){
                    this.setY((getPosicaoNegativa(this.getY())));
                }
                break;

            case 1:
                if (podeMover(this.getDirection(), this.getScreenSize()))
                    this.setX(getPosicaoPositiva(this.getX()));
                break;

            case 2:
                this.setY((getPosicaoPositiva(this.getY())));
                break;

            case 3:
                this.setX(getPosicaoNegativa(this.getX()));
                break;

            default:
                break;
        }

    }

    private Integer getPosicaoPositiva(Integer posicao) {

        return posicao + 20;
    }

    private Integer getPosicaoNegativa(Integer posicao) {

        return posicao - 20;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

}
