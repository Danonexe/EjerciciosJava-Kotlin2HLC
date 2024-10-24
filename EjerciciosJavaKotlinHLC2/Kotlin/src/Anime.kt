class Anime(var nombre: String, var episodios: Int, var género: String) {
    override fun toString(): String {
        return "Anime{" +
                "nombre='" + nombre + '\'' +
                ", episodios=" + episodios +
                ", género='" + género + '\'' +
                '}'
    }
}