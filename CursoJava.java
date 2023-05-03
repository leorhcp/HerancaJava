public class CursoJava{
    public static void main (String[]args){
        
        Carro c1 = new Carro("Fiat","Uno");
        Carro c2 = new Carro("VolksWagen","Gol");
        CarroCombate c3 = new CarroCombate("Dodge", "RAM");

        c1.info();
        c2.info();
        c3.info();


    }
}