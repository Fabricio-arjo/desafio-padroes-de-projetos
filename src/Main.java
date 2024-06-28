import boletim.*;

import javax.xml.transform.Result;

public class Main {
    public static void main(String[] args) {


    Resultado aprovado = new AlunoAprovado();
    Resultado naMedia = new AlunoNaMedia();
    Resultado reprovado = new AlunoReprovado();

    Validador validador = new Validador();

    validador.setMedia(9.5);

    validador.setResultado(aprovado);
    validador.lerMedia();

    validador.setResultado(naMedia);
    validador.lerMedia();

    validador.setResultado(reprovado);
    validador.lerMedia();











    }
}