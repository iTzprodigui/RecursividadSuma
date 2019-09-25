
//TODO: Se suma el resultado nuevo con el anterior, dando cantidad muy grandes

public class Raton {
    static int sum = 0;

    public static void main(String[] args){
        for (int i = 0; i < 3; i++) {
            
        // Variables globales
        sum = 0;
        int numero=0;
        int resultado=0;
        // Fin de VG
        System.out.println("El recorrido fue:");
        while(numero != 3){
            numero = (int) (Math.random()*3)+1;
            System.out.print(numero+ " ");
            resultado = moverse(numero);
            
        }
        System.out.println("\n\nEl tiempo total del recorrido fue: \n" + resultado);    
    }
    }

    //Metodos

    public static int moverse(int n){
        if (n == 1) {
            return sum = 3 + sum;
        }else if (n == 2){
            return sum = 5 + sum;
        }else{
            return sum = 7+ sum;
        }
    }
} // fin de la clase