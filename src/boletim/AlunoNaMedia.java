package boletim;

public class AlunoNaMedia implements Resultado {
   @Override
    public void lerMedia(double media) {


     if(media==7){
         System.out.println("Aprovado alcançou a média ! " +media);
     }


    }
}
