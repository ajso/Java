package ClockGUI;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String day;
    String time;
    String date;

    ClockFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock Program");
        this.setSize(450, 200);
        this.setLayout(new FlowLayout());
//        this.setResizable(false);
        this.getContentPane().setBackground(Color.white); //sets the color of the frame to white


        timeFormat = new SimpleDateFormat("hh:mm:ss a"); //sets the time format.
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        //instantiate the Time Label
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00ff00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalTextPosition(JLabel.CENTER); //set Text Left, center, right of the imageIcon.
        timeLabel.setVerticalTextPosition(JLabel.TOP); //Set text Top of the imageIcon

        //Instantiate the Day label
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

        //the date label
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));




        this.add(timeLabel); //adding the timeLabel to the frame.
        this.add(dayLabel);
        this.add(dateLabel);

        this.setVisible(true);

        //creating a new method setTime()
        setTime();

    }

    public void setTime() {

        //Update the time every Second
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime()); //this will get the current time.
            timeLabel.setText(time);

            //setting up the day Label
            day = dayFormat.format(Calendar.getInstance().getTime()); //this will get the current time.
            dayLabel.setText(day);

            //setting up the date label
            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
