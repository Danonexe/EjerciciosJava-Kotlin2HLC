import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Ejercicio=0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Escribe el número de ejercicio que quieres ver, escribe 0 si quieres salir");
            Ejercicio = scan.nextInt();
            scan.nextLine();
            //Ejercicio1
            if (Ejercicio==1) {
                System.out.println("Escribe tu nombre");
                String nombre = scan.nextLine();
                System.out.println("Hola " + nombre);
            }
            //Ejercicio2
            if (Ejercicio==2) {
                System.out.println("Escribe un número");
                int numero = scan.nextInt();
                if (numero%2==0) {
                    System.out.println("Es un número par");
                }else{
                    System.out.println("Es un número impar");
                }
            }
            //Ejercicio3
            if (Ejercicio==3) {
                System.out.println("Escribe el RADIO de un círculo");
                int radio = scan.nextInt();
                System.out.println("El area del circulo es " + (Math.PI*Math.pow(radio,2)));
            }
            //Ejercicio4
            if (Ejercicio==4) {
                int numeroAleatorio = (int) (Math.random()*100);
                int numeroIntento;
                int intento=0;
                do{
                    intento++;
                    System.out.println("Intenta adivinar el número");
                    numeroIntento = scan.nextInt();
                    if(numeroIntento<numeroAleatorio){
                        System.out.println("el número es mayor");
                    }else if (numeroIntento>numeroAleatorio){
                        System.out.println("el numero es menor");
                    }else System.out.println("Lo adivinaste solo te ha costado "+ intento+" intentos");
                }while(numeroAleatorio!=numeroIntento);
            }
            //Ejercicio5
            if (Ejercicio==5) {
                System.out.println("Escribe un número para ver su tabla de multiplicar");
                int numeroMultiplicar= scan.nextInt();
                for(int i=1;i<=10;i++){
                    System.out.println(numeroMultiplicar+" * "+i+" = "+numeroMultiplicar*i);
                }
            }
            //Ejercicio6
            if (Ejercicio==6) {
                System.out.println("Todos los números sumados del del 1 al 100");
                int resultado=0;
                for(int i=1;i<=100;i++){
                    resultado=resultado+i;
                }
                System.out.println("El resultado es "+resultado);
            }
            //Ejercicio7
            if (Ejercicio==7) {
                System.out.println("Escribe algo");
                String cadena=scan.nextLine();
                String invertida="";
                for (int i = cadena.length() - 1; i >= 0; i--) {
                    invertida += cadena.charAt(i);
                }
                System.out.println("Al revés es: "+invertida);
            }
            //Ejercicio8
            if (Ejercicio==8) {
                System.out.println("Escribe algo");
                String cadenaAEIOU=scan.nextLine();
                cadenaAEIOU=cadenaAEIOU.toLowerCase();
                int cuenta=0;
                for (int i = cadenaAEIOU.length() - 1; i >= 0; i--) {
                    if (cadenaAEIOU.charAt(i)=='a' || cadenaAEIOU.charAt(i)=='e' || cadenaAEIOU.charAt(i)=='i' || cadenaAEIOU.charAt(i)=='o'|| cadenaAEIOU.charAt(i)=='u') {
                        cuenta++;
                    };
                }
                System.out.println("Tiene "+ cuenta+" vocales");
            }
            //Ejercicio9
            if (Ejercicio==9) {
                System.out.println("Escribe un número");
                int numeroPrimo=scan.nextInt();
                int divisores=0;
                for(int i=1;i<numeroPrimo;i++){
                    if(numeroPrimo%i==0){
                        divisores++;
                    }
                }
                if(divisores==1){
                    System.out.println("Es primo");
                }else System.out.println("No es primo");
            }
            //Ejercicio10
            if (Ejercicio==10) {
                System.out.println("Escribe una temperatura");
                int numeroTemperatura=scan.nextInt();
                System.out.println("El temperatura si fuesen grados Celsius serian "+(numeroTemperatura * 9/5 + 32)+" Fahrenheit");
                System.out.println("El temperatura si fuesen grados Fahrenheit serian "+((numeroTemperatura - 32) * 5/9)+" Celsius");
            }
            //Ejercicio11
            if (Ejercicio==11) {
                System.out.println("Escribe los números que quieras ver de la secuencia de Fibonacci");
                int numeroFibonacci=scan.nextInt();
                int Fibonacci1=1;
                int Fibonacci2=1;
                System.out.println(1);
                System.out.println(1);
                for (int i = 3; i <= numeroFibonacci; i++) {
                    int siguienteFibonacci = Fibonacci1 + Fibonacci2;
                    System.out.println(siguienteFibonacci);
                    Fibonacci1 = Fibonacci2;
                    Fibonacci2 = siguienteFibonacci;
                }
            }
            //Ejercicio12
            if (Ejercicio==12) {
                System.out.println("Escribe un número");
                String cadena=scan.nextLine();
                String invertida="";
                for (int i = cadena.length() - 1; i >= 0; i--) {
                    invertida += cadena.charAt(i);
                }
                System.out.println("Al revés es: "+invertida);
            }
            //Ejercicio13
            if (Ejercicio==13) {
            Anime Anime =new Anime("Dragon Ball Z",120,"Peleas");
            System.out.println(Anime.toString());
            }
            //Ejercicio14
            if (Ejercicio==14){
                int MenuInventario=0;
                ArrayList<Videojuego> inventario = new ArrayList<>();
                do {
                    System.out.println("Escribe que quieres hacer en tu inventario");
                    System.out.println("1 Crear videojuego");
                    System.out.println("2 Borrar videojuego");
                    System.out.println("3 Ver inventario de videojuegos");
                    System.out.println("0 Salir del Menú");
                    MenuInventario=scan.nextInt();
                    if (MenuInventario==1) {
                        Videojuego videojuego= new Videojuego("","",0);
                        scan.nextLine();
                        System.out.println("Escribe el titulo");
                        videojuego.setTitulo(scan.nextLine());
                        System.out.println("Escribe la plataforma");
                        videojuego.setPlataforma(scan.nextLine());
                        System.out.println("Escribe las horas jugadas");
                        videojuego.setHorasJugadas(scan.nextInt());
                        scan.nextLine();
                        inventario.add(videojuego);
                    }
                    if (MenuInventario==2) {
                        if (inventario.isEmpty()) {
                            System.out.println("El inventario está vacío.");
                        } else {
                            System.out.println("Inventario de videojuegos:");
                            int indice=1;
                            for (Videojuego vj : inventario) {
                                System.out.println(indice+" "+vj.toString());
                                indice++;
                            }
                            System.out.println("Cual quieres borrar");
                            inventario.remove(scan.nextInt()-1);
                        }
                    }
                    if (MenuInventario==3) {
                        if (inventario.isEmpty()) {
                            System.out.println("El inventario está vacío.");
                        } else {
                            System.out.println("Inventario de videojuegos:");
                            int indice=1;
                            for (Videojuego vj : inventario) {
                                System.out.println(indice+" "+vj.toString());
                                indice++;
                            }
                        }
                    }
                }while(MenuInventario!=0);
            }
        }while(Ejercicio!=0);
        System.out.println("Ejercicio realizado por Daniel Hernández Gómez");
    }
}
