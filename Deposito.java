package paquetePrincipal;

public class Deposito{

  private Map<Double, Integer> deposito = new TreeMap<>();

    public Practica2() { // el constructor sin parametros lo que hará será crear un deposito con 100 monedas de cada tipo.

        this.deposito.put(0.05,100);
        this.deposito.put(0.1, 100);
        this.deposito.put(0.2, 100);
        this.deposito.put(0.5, 100);
        this.deposito.put(1.0, 100);
        this.deposito.put(2.0, 100);

    }

    public Practica2(int c5, int c10, int c20, int c50, int c1, int c2) {   //cuando se llame a la clase al construcctor se ha de pasar la cantidad de cada moneda.

        this.deposito.put(0.05,c5);
        this.deposito.put(0.1, c10);
        this.deposito.put(0.2, c20);
        this.deposito.put(0.5, c50);
        this.deposito.put(1.0, c1);
        this.deposito.put(2.0, c2);

    }

    /*
     * se le pasa al metodo la cantidad de cada tipo de monedas. 
     */
    public void cobrar(int cinco, int diez, int veinte, int cincuenta, int uno, int dos) {

        //cojo la cantidad de cada moneda que da el usuario y lo sumo a las que ya hay en el deposito.
        
        this.deposito.put(0.05,this.deposito.get(0.05) + cinco);
        this.deposito.put(0.1, this.deposito.get(0.1) + diez);
        this.deposito.put(0.2, this.deposito.get(0.2) + veinte);
        this.deposito.put(0.5, this.deposito.get(0.5) + cincuenta);
        this.deposito.put(1.0, this.deposito.get(1.0) + uno);
        this.deposito.put(2.0, this.deposito.get(2.0) + dos);

        //FALTA CODIGO DE IMPLEMENTAR AQUÍ
        
    }
    
    public void devolver(){
    
    // NO IMPLEMENTADO AUN.
    
    }


}
