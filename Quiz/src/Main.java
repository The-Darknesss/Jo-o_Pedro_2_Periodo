public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println(" UNIFAN - Engenharia de Software 2° Período");
        System.out.println("     João Pedro Azevedo do Prado Souza");
        System.out.println("      Quiz sobre bandas de New Metal");
        System.out.println("--------------------------------------------");
        Pergunta[] perguntas = {
                new Pergunta("1) Qual é a música mais famosa do KoЯn?",
                        new String[]{"Falling Away From Me", "Freak on a Leash", "Blind", "Coming Undone", "Right Now"}, 3),
                new Pergunta("2) Quando foi lançado KoЯn (Selftitled)?",
                        new String[]{"1992", "1987", "1999", "1994"}, 4),
                new Pergunta("3) Quantos albuns de estúdio o KoЯn já lançou até hoje (2023)?",
                        new String[]{"17", "14", "9", "12"}, 2),
                new Pergunta("4) Qual outra banda recebeu grande ajuda do KoЯn?",
                        new String[]{"Limp Bizkit", "Coal Chamber", "Linkin Park", "Slipknot", "System of a Down"}, 1),
                new Pergunta("5) Qual foi o Primeiro - Ultimo album do KoЯn?",
                        new String[]{"KoЯn (Selftitled) - Take A Look In The Mirror","Issues - The Serenety of Suffering","KoЯn (Selftitled) - Requiem","Untouchables - Requiem", "Follow The leader - See You On The Other Side"}, 3),
                new Pergunta("6) Qual a música mais famosa do Slipknot?",
                        new String[]{"Sulfur", "Unsaited", "Psychosocial", "Custer", "Wait And Bleed"}, 5),
                new Pergunta("7) Quando foi lançado Slipknot (Selftitled)?",
                        new String[]{"1987", "1999", "1994", "1992"}, 2),
                new Pergunta("8) Slipknot é formado por quantos integrantes?",
                        new String[]{"4", "5", "3", "9", "5"}, 4),
                new Pergunta("9) Qual foi o Primeiro - Ultimo albuns lançados pelo Slipknot?",
                        new String[]{"Slipknot (Selftitled) - The Grey Chapter", "Subliminal Verses - All Hope Is Gone", "Slipknot (Selftitled) - The End, So Far", "Iowa - We Are Not Your Kind", "All Hope Is Gone - The End, So Far"}, 3),
                new Pergunta("10) Quantos albuns de estúdio o Slipknot já lançou até hoje (2023)?",
                        new String[]{"7", "5", "3", "9", "4"}, 1),
                new Pergunta("11) Quantos albuns de estúdio o Coal Chamber já lançou até hoje (2023)?",
                        new String[]{"1", "2", "3", "4", "5"}, 5),
                new Pergunta("12) Quantos albuns de estúdio o Limp Bizkit já lançou até hoje (2023)?",
                        new String[]{"4", "5", "7", "3", "9"}, 3),
                new Pergunta("13) Quantos albuns de estúdio o Linkin Park já lançou até hoje (2023)?",
                        new String[]{"7", "5", "6", "9", "8"}, 1),
                new Pergunta("14) Quantos albuns de estúdio o Deftones já lançou até hoje (2023)?",
                        new String[]{"6", "9", "5", "7", "4"}, 2),
                new Pergunta("15) Quantos albuns de estúdio o System Of A Down já lançou até hoje (2023)?",
                        new String[]{"4", "7", "6", "5", "9"}, 3),
        };

        Quiz quiz = new Quiz(perguntas);

        quiz.executarQuiz();
    }
}