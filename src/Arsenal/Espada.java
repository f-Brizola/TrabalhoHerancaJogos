package Arsenal;

public class Espada extends Atk{

    private Integer raridade;


    public void danoBonusEspadas (){
        this.setDanoPadrao( + super.getDanoPadrao() * raridade);
    }

}
