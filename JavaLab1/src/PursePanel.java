// Class imports
import javax.swing.*;
import java.awt.*;

public class PursePanel extends JPanel {

    // Attributes
    Purse purse = new Purse();

    // This method will display the purse's contents.
    public void paintComponent(Graphics g) {

        // This variable will be used to set the y-coordinate of each unit of currency
        int y;

        // This ArrayList

        // Display each bill / coin.
        for (int i = 0; i < purse.cash.get(Register.oneHundredNote); i++) {

            y = 10;
            g.drawImage(new ImageIcon(Register.oneHundredNote.img()).getImage(), 10, y, null);
            y += 10;

        }

    }

}
