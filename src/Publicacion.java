public class Publicacion {

    private String titulo;
    private  String mensaje;
    private int contLikes;

    public Publicacion(String titulo, String mensaje) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        contLikes=0;
    }

    public void aumentarLikes(){
        contLikes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {

        return "Título: " + titulo + ", Mensaje: " +
                mensaje + " likes: "+contLikes+"\n";
    }
}
