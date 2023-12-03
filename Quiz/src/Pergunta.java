public class Pergunta {
    public String pergunta;
    public String[] opcoes;
    public int respostaCorreta;

    public Pergunta(String pergunta, String[] opcoes, int respostaCorreta) {
        this.pergunta = pergunta;
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
    }

    public boolean verificarResposta(int resposta) {
        return resposta == respostaCorreta;
    }

    public void exibirPergunta() {
        System.out.println(pergunta);
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println(i + 1 + ". " + opcoes[i]);
        }
    }
}