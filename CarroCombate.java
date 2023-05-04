public class CarroCombate extends Carro{
    private int municao;
    private boolean triple_tap;
    private final int MAX_MUNICAO=100;
    private final int MIN_MUNICAO=0;


    protected CarroCombate(String marca, String modelo){
        super(marca, modelo);
        this.municao=100;
        this.triple_tap=false;
        setBlindado(true);
        setArmadura(100);
        setMotor(3.0f);
        
    }

    public int getMunicao(){
        return this.municao;
    }
    public void setMunicao(int municao){
        this.municao=municao;
        if(this.municao > MAX_MUNICAO){
            this.municao = MAX_MUNICAO;
        } if (this.municao < MIN_MUNICAO){
            this.municao = MIN_MUNICAO;
        }

    }

    public void atirar(){
        if(this.municao > MIN_MUNICAO){
            setMunicao(-1);

        } else{
                System.out.println("Sem munição!");
        }

    }
    public void tripleTap(){
        if(this.triple_tap=true){
            this.triple_tap=false;
        }else {
            this.triple_tap=true;
        }
    }



    public void info(){
        super.info();
        System.out.println("Armadura: "+ getArmadura());
        System.out.println("Motor: " + getMotor());
        System.out.println("Munição: " +getMunicao());

        
    }
    

}










