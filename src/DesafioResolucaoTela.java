import java.awt.*;

public class DesafioResolucaoTela {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        System.out.println("A resolução Da tela é");
        System.out.println("Largura:"+width);
        System.out.println("Altura:"+height);

    }
}
