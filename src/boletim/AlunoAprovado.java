package boletim;

public class AlunoAprovado implements Resultado{



    @Override
    public void lerMedia(double media) {

        if(media > 7) {
            System.out.println("Aprovado !! Resultado acima da média: " +media);
        }
    }
}
