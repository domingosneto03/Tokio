package tokio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Bem-vindo à selva! Encontra o tesouro para conseguires sair daqui vivo!");
        //ciclo que acaba quando o utilizador vence ou perde o jogo
        while(flag){
            System.out.println("Encontras-te perdido numa selva misteriosa e apenas tens contigo uma faca e uma tocha acesa");
            System.out.println("Deparas-te com dois caminhos. \n" +
                    "À tua esquerda um caminho escuro e suspeito. \n" +
                    "Enquanto que à tua direita um caminho com vista para o rio. Talvez tenha uma saída? \n " +
                    "(1) Esqueda \n " +
                    "(2) Direita"); //duas opções distintas que podem definir o curso do jogo
            int option = in.nextInt();
            if(option==1) {
                cobra(); //método que se desenvolve em mais escolhas e acontecimentos
                flag = false; //assim que o método chega ao fim ojogo acaba
            }
            else {
                System.out.println("Viraste à direita e continuaste a andar por uns kilometros. \n" +
                        "Exausto, deparaste com uma ponte à tua frente num estado duvidoso. Mas à tua direita tens um caminho com o que parece ser... pegadas? humanas? \n " +
                        "(1) Atravessar a ponte \n " +
                        "(2) Direita");
                option = in.nextInt();
                if(option==1) {
                    System.out.println("Decidiste atravessar a ponte, mas com o teu peso ela não aguentou e caíste no rio. Sem forças nenhumas, afundaste, acabando por morrer!");
                    System.out.println("Game over!"); //perdeste o jogo
                    flag = false;
                }
                else {
                    bruxa();
                    flag = false;
                }
            }
        }

    }

    private static void bruxa() {
        Scanner in = new Scanner(System.in);
        System.out.println("Continuaste pela direita e poucos momentos depois, aparecendo do nada, deparas-te com uma mulher feia e assustadora. Uma bruxa!");
        System.out.println("A bruxa, com uma voz arrepiante, revela que para ela não te matar, terás de responder corretamente à charada dela. \n" +
                "Ela disse: Responde-me com apenas uma palavra certa. \n" +
                "O que é feito de água, mas se for colocado dentro de água morrerá?");
        String answer = in.nextLine();
        if(answer.equals("gelo"))
            sobrevive(); //vais ganhar o jogo
        else {
            System.out.println("A resposta está errada e por isso a bruxa matou-te sem dó!");
            System.out.println("Game over");
        }
    }

    private static void cobra() {
        Scanner in = new Scanner(System.in);
        System.out.println("Continuaste pela esquerda e quase que gritas de susto pelo que te aparece mesmo à tua frente uma cobra gigante a impedir o caminho. \n" +
                "Neste momento, a tua cabeça, viciada em animes e filmes de ação, só pensa em 3 opcões para saíres vivo desta situação. \n" +
                "(1) Atacar com a tocha, na esperança que pereça com o fogo \n" +
                "(2) Tentar cortar-lhe com a faca \n" +
                "(3) Fugir como um bom descendente da família Joestar" );
        int option = in.nextInt();
        if(option==1)
            sobrevive();
        else {
            System.out.println("Foi uma má escolha. Arrependido viste que não terias como escapar à grandiosa cobra e morreste!");
            System.out.println("Game over");
        }
    }

    private static void sobrevive() {
        System.out.println("Após um desafio desesperante, conseguiste sair daquela situação intacto. \n" +
                "Nem consegues imaginar como sobreviveste a tal atrocidade! Mas prevaleceste forte e com um objetivo em mente.. sair dali. \n" +
                "Caminhando mais uns km, viste um trono à tua frente. \n" +
                "Nele sentado estava uma pessoa loira com o que pareciam ser uns riscos em cada lado da sua face.. 3 riscos para ser exato. \n" +
                "Um homem extremamente familiar.. será que? .. Naruto? .. espera isto é um sonh... \n" +
                "e acordaste!");
    }
}