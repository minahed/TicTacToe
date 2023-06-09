import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;


class Start {

  boolean show = false;

  Start() {
    JFrame frame = new JFrame();
    JButton startButton = new JButton("start");
    JLabel label = new JLabel();
    JLabel start = new JLabel();
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();


    label.setText("Want to play Tic Tac Toe ?");
    label.setFont(new Font("MV Boli", Font.BOLD, 17));
    label.setForeground(Color.WHITE);
    label.setVerticalAlignment(JLabel.TOP);

    start.setText("Click start");
    start.setFont(new Font("MV Boli", Font.BOLD, 17));
    start.setForeground(Color.WHITE);
    start.setVerticalAlignment(JLabel.TOP);

    startButton.setFocusable(false);
    startButton.addActionListener(e -> {
      frame.dispose();
      new TicTacToe();
    });

    panel.add(label);
    panel.add(startButton, BorderLayout.SOUTH);
    panel.setBackground(Color.BLACK);

    panel2.add(start);
    panel2.setBackground(Color.BLACK);

    frame.add(panel);
    frame.add(panel2, BorderLayout.SOUTH);
    frame.setSize(300, 150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);


    Timer timer = new Timer();
    timer.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        if (show) {
          start.setText("Click start");
        } else {
          start.setText(" ");
        }
        show = !show;
      }
    }, 0, 900);


  }

}
