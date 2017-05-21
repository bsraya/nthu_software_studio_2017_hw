import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jerry on 2017/3/28.
 */
public class Menu {
    private JProgressBar progressBar;
    private JButton startBtn;
    private JButton pauseBtn;
    private JPanel root;
    private JLabel progressLabel;
    private HeavyComputationSimulator simulator;

    public Menu() {
        simulator = new HeavyComputationSimulator(progressBar,progressLabel);
        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: start the task
                simulator.startHeavyTask();
                startBtn.setEnabled(false);
            }
        });
        pauseBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * TODO:
                 * pause or resume the task
                 * you should use SwingUtilities.invokeLater() to modify GUI elements!
                 */
                if(simulator.isExecuting()){ //if the progress bar is running
                    simulator.pauseHeavyTask(); //pauses the progress bar
                    SwingUtilities.invokeLater(new Runnable(){
                        @Override
                        public void run() {
                            pauseBtn.setText("Resume");
                        } //change the pausebtn label to "Resume"
                    });
                }
                else
                {
                    simulator.resumeHeavyTask();
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            pauseBtn.setText("Pause");
                        }
                    });
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(new Menu().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
