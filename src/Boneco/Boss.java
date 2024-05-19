package Boneco;

public class Boss extends Inimigo{

    private Integer conjurar;

    public void habilidade(){
        this.conjurar = conjurar;
    }

    public void status (){
        this.setVida(super.getVida() * 10);
        this.setDano(super.getDano() * 3);
    }

    public Integer getConjurar() {
        return conjurar;
    }

    public void setConjurar(Integer conjurar) {
        this.conjurar = conjurar;
    }
}
