package Arsenal;

public class Raridade extends Item{

    private Integer raridade;
    private Integer habilidade;
    private Integer danoBonus;


    public Integer danoBonusRaridade (){
        this.setDanoPadrao(super.getDanoPadrao() * raridade);
        return null;
    }

    public Integer getDanoBonus() {
        return danoBonusRaridade();
    }

    public void habilidadePassiva(){
        this.habilidade = habilidade * raridade;
    }

    public Integer getRaridade() {
        return raridade;
    }

    public void setRaridade(Integer raridade) {
        this.raridade = raridade;
    }

    public Integer getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Integer habilidade) {
        this.habilidade = habilidade;
    }
}
