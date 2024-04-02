import java.util.Random;
import java.util.Scanner;

public class joguinho {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner leitor = new Scanner(System.in);
        
        //variaveis player e inimigo
        int atkp, atki, vp, vi, curap, curai, danop, danoi;
        curai = 0;
        danop = 0;
        danoi = 0;
        vp = 100;
        vi = 100;
        curap = 0;

        //começo do jogo
        while(vp > 0 && vi > 0){

            atki = rand.nextInt(4); //ataque do inimigo
             
            //player
            System.out.println("\n1 Atacar, 2 esquivar, 3 curar");
            atkp = leitor.nextInt();

            if(atkp == 1){
                if (atki == 2){
                    danoi = rand.nextInt(6);
                    System.out.println("\nVocê atacou porém o inimigo tentou se esquivar, você causou " + danoi + " de dano no inimigo\n");
                }
                else {
                    danoi = rand.nextInt(21);
                    vi -= danoi;
                    System.out.println("\nVocê atacou e causou " + danoi + " de dano no inimigo\n");
                }
            }
                
            else if(atkp == 2)
                System.out.println("\nVoce esquivou\n");

            else if(atkp == 3){
                curap = rand.nextInt(21);
                vp += curap;
                System.out.println("\nVoce curou " + curap + " de vida\n");      
            }

            //inimigo
            if (atki == 1) {
                if (atkp != 2) { // O inimigo ataca apenas se o jogador não esquivar
                    danop = rand.nextInt(16);
                    vp -= danop;
                    System.out.println("O inimigo te atacou e causou " + danop + " de dano.\n");
                }
            } else if (atki == 3) {
                curai = rand.nextInt(16);
                vi += curai;
                System.out.println("O inimigo curou " + curai + " de vida.\n");
            }

            
                    
        System.out.println("Sua vida: " + vp);
        System.out.println("Vida do inimigo: " + vi);
        System.out.println("\n _________________________________________________");

        }

        //fim do jogo
        if (vi <= 0)
            System.out.println("\nVocê venceu!\n");
        else if (vp <=0 )
           System.out.println("\nVocê perdeu\n");
        
    }
}

