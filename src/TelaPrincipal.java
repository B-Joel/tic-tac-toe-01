import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal {
    private JPanel pnlPrincipal;
    private JButton btn11;
    private JButton btn12;
    private JButton btn13;
    private JButton btn21;
    private JButton btn31;
    private JButton btn22;
    private JButton btn23;
    private JButton btn32;
    private JButton btn33;
    private JLabel lblInfoPrincipal;
    private JLabel lblInfo1;
    private JLabel lblInfo2;
    private JLabel lblInfo3;

    //  var globaldo tabuleiro
    public static int[][] tabuleiro = new int[3][3];

    public TelaPrincipal() {
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaPrincipal");
        frame.setContentPane(new TelaPrincipal().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        teste();

        System.out.println(analisarVitoria());


    }


    public static void teste(){
  //      int k = 1;
//        Inicializando o tabuleiro
//        for (int i=0; i<3;i++){
//            for (int j=0; j<3;j++){
//               tabuleiro[i][j] = 0;
//            }
//        }
//        tabuleiro[0][0] = 1;
//        tabuleiro[1][1] = 1;
//        tabuleiro[2][2] = 1;


    }


    public static int analisarVitoria(){
        for (int i=0; i<3;i++){
            int j = 0;

            if (tabuleiro[i][j] != 0) {
                if ((tabuleiro[i][j++] == tabuleiro[i][j]) && (tabuleiro[i][j++] == tabuleiro[i][j])) {
                    return tabuleiro[i][j];
                }
            }
        };

        for (int j=0; j<3;j++){
            int i = 0;

            if (tabuleiro[i][j] != 0) {
                if ((tabuleiro[i++][j] == tabuleiro[i][j]) && (tabuleiro[i++][j] == tabuleiro[i][j])) {
                    return tabuleiro[i][j];
                }
            }
        };

        if ((tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[1][1] ==tabuleiro[2][2])){
            return tabuleiro[1][1];
        }

        if ((tabuleiro[0][2] == tabuleiro[1][1]) && (tabuleiro[1][1] ==tabuleiro[2][0])){
            return tabuleiro[1][1];
        }

        return 9;
    }

    public void atualizarTela(String ganhador){
        if ((ganhador == "")) {
            lblInfoPrincipal.setText("Jogando");
        } else {
            lblInfoPrincipal.setText("Ganhador é o :" + ganhador);
        }

    }

    public void escolherSimbolo(){

    }

    public void escolherVez(){

    }

    public void ganhar(){
        String ganhador = "";
        switch (analisarVitoria()) {
            case 1:
                ganhador = "jogador1";
                break;
            case 2:
                ganhador = "jogador2";
                break;
            case 9:
                break;
            default:
                ganhador = "quebrou";
        }
        atualizarTela(ganhador);
    }





}
