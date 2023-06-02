//Se crea la clase videojuegos donde se declararan los constructores, getters, setters y la funcion para imprimir los datos
public class Videojuegos {
    //Crear las variables que se van a usar
    String nombre, compania, genero, pais_origen;
    int anio;
    //Se declaran los constructores de cada variable

    public Videojuegos(String nombre, String compania, String genero, String pais_origen, int anio) {
        this.nombre = nombre;
        this.compania = compania;
        this.genero = genero;
        this.pais_origen = pais_origen;
        this.anio = anio;
    }
    //Se declaran los getters y setters de cada variable

    public String getNombre() {
        return nombre;
    } //metodo get

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } //metodo set

    public String getCompania() {
        return compania;
    } //metodo get

    public void setCompania(String compania) {
        this.compania = compania;
    } //metodo set

    public String getGenero() {
        return genero;
    } //metodo get

    public void setGenero(String genero) {
        this.genero = genero;
    } //metodo set

    public String getPais_origen() {
        return pais_origen;
    } //metodo get

    public void setPais_origen(String pais_origen) { //metodo set
        this.pais_origen = pais_origen;
    }

    public int getAnio() {
        return anio;
    } //metodo get

    public void setAnio(int anio) {
        this.anio = anio;
    } //metodo set

    public void imprimirDatos(){ //Función para imprimir los datos
        System.out.println(this.nombre);
        System.out.println(this.compania);
        System.out.println(this.genero);
        System.out.println(this.pais_origen);
        System.out.println(this.anio);
    }
}
