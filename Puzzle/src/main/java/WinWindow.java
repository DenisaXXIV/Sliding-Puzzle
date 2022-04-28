import javax.swing.*;
import java.awt.*;

public class WinWindow extends JFrame {
    WinWindow()
    {
        setLayout(null);
        setSize(300,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    WinWindow(Image iconBar)
    {
        super("Sliding Puzzle");
        setIconImage(iconBar);

        Icon chicken = new ImageIcon("src/main/resources/win/Chicken.png");
        JLabel img = new JLabel(chicken);
        img.setBounds(0,20,72,72);

        JLabel txt = new JLabel("You won this level of Sliding Puzzle!");
        txt.setBounds(72,50,200,20);
        txt.setForeground(Color.black);

        add(img);
        add(txt);

        setLayout(null);
        setSize(300,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    WinWindow(Image iconBar,int level)
    {
        super("You won Sliding Puzzle!");
        setIconImage(iconBar);

        Icon chicken = new ImageIcon("src/main/resources/win/recipe.png");
        JLabel img = new JLabel(chicken);
        img.setBounds(0,20,72,72);

        JLabel txt = new JLabel("You won all levels of Sliding Puzzle!");
        txt.setBounds(80,50,200,20);
        txt.setForeground(Color.black);

        add(img);
        add(txt);

        setLayout(null);
        setSize(300,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
