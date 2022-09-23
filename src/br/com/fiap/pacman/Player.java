package br.com.fiap.pacman;

import javax.swing.plaf.TextUI;

public class Player extends GameObject {

    private Integer direction;
    private Integer life;
    private boolean invincible;

    public Player() {
    }

    public Player(Integer x, Integer y, Integer direction) {
        super(x, y);
        this.direction = direction;
    }

    private boolean podeMover(Integer direcao, Integer tela) {

        if(direcao.equals(0) && direcao.equals(270)){
            if((this.getX() - 10) < tela || (this.getY() - 10) < tela) {
                return true;
            }
        } else if ((this.getX() + 10) < tela && (this.getY() + 10) < tela) {
            return true;
        }
        
        return false;

    }

    public void mover() {
        

        switch (this.direction) {

            case 0:
                if(podeMover(this.getDirection(), this.getScreenSize())){
                    this.setY((getPosicaoNegativa(this.getY())));
                }
                break;

            case 90:
                if (podeMover(this.getDirection(), this.getScreenSize()))
                    this.setX(getPosicaoPositiva(this.getX()));
                break;

            case 180:
                this.setY((getPosicaoPositiva(this.getY())));
                break;

            case 270:
                this.setX(getPosicaoNegativa(this.getX()));
                break;

            default:
                break;
        }

    }

    private Integer getPosicaoPositiva(Integer posicao) {

        return posicao + 10;
    }

    private Integer getPosicaoNegativa(Integer posicao) {

        return posicao - 10;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public boolean isInvincible() {
        return invincible;
    }

    public void setInvincible(boolean invincible) {
        this.invincible = invincible;
    }

}
