import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Mainframe extends JFrame{
    private JPanel mainframe;
    private JLabel clockField;
    SimpleDateFormat timeFormat;
    Calendar calender;
    String time;
    public Mainframe(){
        constructorCode();
    }

    public void constructorCode(){
        setTitle("Clock");
        setSize(800, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(mainframe);
        setLocationRelativeTo(null);
        makeClock();
        clockField.setBackground(new Color(52, 155, 235));
        clockField.setOpaque(true);
    }
    public void makeClock(){
        timeFormat = new SimpleDateFormat("HH:mm:ss");
        time = timeFormat.format(Calendar.getInstance().getTime());
        clockField.setText(time);
        setTime();
    }
    public void setTime(){
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            clockField.setText(time);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
