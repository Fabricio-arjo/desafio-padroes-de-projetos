package boletim;

public class Validador {

     private Resultado resultado;
     double media;

    public void setMedia(double media) {
        this.media = media;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public void lerMedia(){
         resultado.lerMedia(media);
    }
}
