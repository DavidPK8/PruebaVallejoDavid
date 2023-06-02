//Se crea la clase menu principal en la cual se crearan las instancias
public class MenuPrincipal {
    public static void main(String[] args) {
        //Se declaran las instancias de los videojuegos
        Videojuegos videojuego1 = new Videojuegos("Outlast", "Red Barrel", "Terror", "EEUU", 2014);
        Videojuegos videojuego2 = new Videojuegos("Megaman X", "Capcom", "Plataformero", "Japon", 2001);
        Videojuegos videojuego3 = new Videojuegos("Hollow Knight", "Team Cherry", "Metroidvania", "EEUU", 2019);
        Videojuegos videojuego4 = new Videojuegos("Mario 64", "Nintendo", "Aventura", "Japon", 1998);
        Videojuegos videojuego5= new Videojuegos("GTA San Andreas", "Rockstar", "Accion", "EEUU", 2004);

        //Se imprimen los valores declarados para los videojuegos
        System.out.println("\nVideojuego 1: ");
        videojuego1.imprimirDatos();
        System.out.println("\nVideojuego 2: ");
        videojuego2.imprimirDatos();
        System.out.println("\nVideojuego 3: ");
        videojuego3.imprimirDatos();
        System.out.println("\nVideojuego 4: ");
        videojuego4.imprimirDatos();
        System.out.println("\nVideojuego 5: ");
        videojuego5.imprimirDatos();
    }
}