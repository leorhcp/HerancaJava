public class CursoJava{
    public static void main (String[]args){
        
        Carro c1 = new Carro("Fiat","Uno");
        Carro c2 = new Carro("VolksWagen","Gol");
        CarroCombate c3 = new CarroCombate("Dodge", "RAM",100);
        CarroCombate c4 = new CarroCombate("Toyota", "Hilux", 50);

        c3.atirar();
        c3.info();

    }
}