package boletim;

public class AlunoReprovado implements Resultado {


    @Override
    public void lerMedia(double media) {

          if(media < 7.0){
              System.out.println("Reprovado ! Sua média foi: " +media );
          }

        }
    }

