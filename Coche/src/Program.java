import java.util.Scanner;

public class Program {
    final static int OPCION_ENCENDER = 2, OPCION_APAGAR = 1, OPCION_SALIR = 3;

    public static void main(String[] args) {
        Car carSaab = new Car("Saab", "saab diesel 99", 1999);
        int op = -1;

        while(op != 3){
            op = getUserInput();
            if(op == OPCION_APAGAR){
                carSaab.stopEngine();
            }
            if(op == OPCION_ENCENDER){
                carSaab.startEngine();
            }
            if(op == OPCION_SALIR){
                System.out.println("Adios");
            }
        }

    }

    public static int getUserInput(){
        System.out.println("1. Apagar\n2. Encender\n3. Salir");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        return op;
    }
}
