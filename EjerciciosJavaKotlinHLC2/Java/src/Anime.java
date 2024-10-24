public class Anime {
    String nombre;
    int episodios ;
    String género;

    public Anime(String nombre, int episodios, String género) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.género = género;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nombre='" + nombre + '\'' +
                ", episodios=" + episodios +
                ", género='" + género + '\'' +
                '}';
    }
}
