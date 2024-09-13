public class TesteLogico {
    public static void main (String[] args) {
        int valor = 10;

        if (valor % 2 == 0) {
            System.out.println("Par e dentro do range");
            if(valor >10 && valor <50){
                System.out.println("Dentro");
            }
            else{
                System.out.println("Fora");
            }
        }
        else{
            System.out.println("Impar");
            System.out.println("Par e dentro do range");
            if(valor >11 && valor <51){
                System.out.println("Dentro");
            }
            else{
                System.out.println("Fora");
            }
        }
    }
}