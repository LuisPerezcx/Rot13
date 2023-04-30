import java.util.Scanner;

public class Rot13 {
    private final Scanner scanner = new Scanner(System.in);
    public void cifrar() {
        String mensaje = "";
        while (!mensaje.equals("0")){
            System.out.println("pulsa 0 para salir");
            mensaje = ingresarMensaje();
            String mensajeCifrado = "";
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                if (letra >= 'A' && letra <= 'Z') {
                    letra += 13;
                    if (letra > 'Z') {
                        letra -= 26;
                    }
                } else if (letra >= 'a' && letra <= 'z') {
                    letra += 13;
                    if (letra > 'z') {
                        letra -= 26;
                    }
                }
                mensajeCifrado += letra;
            }
            System.out.println("Mensaje cifrado: " + mensajeCifrado);
        }
    }

    private String ingresarMensaje() {
        System.out.println("Ingresa el mensaje a cifrar:");
        return scanner.nextLine();
    }
}
