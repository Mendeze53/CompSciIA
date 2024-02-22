import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppDriver extends JFrame implements ActionListener {
    private JPanel labelsPanel;
    private JButton engButton, spaButton;

    public AppDriver() {
        setTitle("Better Plated Delivery");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth() * 0.8; // 80% of the screen width
        double height = screenSize.getHeight() * 0.6; // 60% of the screen height
        setSize((int) width, (int) height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelsPanel = new JPanel(new GridLayout(2, 1));

        JLabel askEng = new JLabel("Would you like to order in English or Spanish?: ");
        labelsPanel.add(askEng);
        JLabel askSpa = new JLabel("Le gustaría ordenar en Inglés o Español?: ");
        labelsPanel.add(askSpa);

        engButton = new JButton("English");
        engButton.addActionListener(this);
        spaButton = new JButton("Español");
        spaButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(engButton);
        buttonPanel.add(spaButton);

        JPanel centerPanel = new JPanel (new BorderLayout());
        centerPanel.add(labelsPanel, BorderLayout.CENTER);

        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        getContentPane().add(centerPanel);
        getContentPane().add(buttonPanel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == engButton) {
            clearFrame();
            System.out.println("English");  // Handle English click
            CustomerInfoEntry.displayEngInfo();
            clearFrame();
            System.out.println("FudEng");
            Ordering.displayEngFudMenu();

        }
        else if (e.getSource() == spaButton) {
            clearFrame();
            System.out.println("Spanish");  // Handle Spanish click
            CustomerInfoEntry.displaySpaInfo();
            clearFrame();
            System.out.println("FudSpa");
            Ordering.displaySpaFudMenu();
        }
    }

    private void clearFrame() {
        getContentPane().removeAll();
        revalidate();
        repaint();
    }

    public static void main (String[]args){
        SwingUtilities.invokeLater(AppDriver::new);
    }
}
