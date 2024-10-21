package main;
import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel{
    //Настройки экрана
    public final int ORIGINAL_CELL_SIZE = 16;//16x16 пикселей
    public final int SCALE = 3;//масштабирование

    public final int CELL_SIZE = ORIGINAL_CELL_SIZE * SCALE;//48x48 пикселей
    //Ширина и высота экрана(разрешение 4 на 3)
    public final int MAX_SCREEN_COL = 16;
    public final int MAX_SCREEN_ROW = 12;

    public final int SCREEN_WIDTH = MAX_SCREEN_COL * CELL_SIZE;//768 пикселей
    public final int SCREEN_HEIGHT = MAX_SCREEN_ROW * CELL_SIZE;//576 пикселей

    public GamePanel(){
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);//Для более хорошей производительности при отрисовке
    }
}
