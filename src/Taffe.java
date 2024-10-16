public class Taffe {

    public int numeracao;
    public String versao;

    public int posicaoAtual = 0;

    public String dizerOi(){
        return "Oi pessoal";
    }

    public void falar(String oquefalar){

        System.out.println(oquefalar);

    }

    public void andar(int quantidadePassos, boolean paraFrente){

        for (int i = 1; i <= quantidadePassos; i++){
            System.out.println("Passo" + i);

        }
        if (paraFrente == true){
            posicaoAtual += quantidadePassos;
        }else {
            posicaoAtual -= quantidadePassos;
        }

        posicaoAtual += quantidadePassos;

    }

    public void retornarPosicao(){
        System.out.println("Minha posição é " + posicaoAtual);
    }



    //andar
    //falar
    //dizer oi
    //Mandar mensagem bravo
    // limpar a casa
    //cantar uma musica
    //


}
