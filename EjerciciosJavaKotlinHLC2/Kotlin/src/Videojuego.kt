class Videojuego(var titulo: String, var plataforma: String, var horasJugadas: Int) {
    override fun toString(): String {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", horasJugadas=" + horasJugadas +
                '}'
    }
}