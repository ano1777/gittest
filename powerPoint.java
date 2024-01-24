
import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class powerPoint extends GraphicsProgram {
    private int size = 200;
    private int diff = 50;
    private ArrayList<GRect> rects = new ArrayList<>();
    private ArrayList<GLabel> labels = new ArrayList<>();
    private int currInd = 0;
    private JTextField field;

    public void init() {
        setSize(600, 800);
        addMouseListeners();
        add(new JButton("prev"), SOUTH);
        add(new JButton("next"), SOUTH);
        field = new JTextField(15);
        add(field, SOUTH);
        add(new JButton("print"), SOUTH);
        addActionListeners();
    }

    public void slides(int n) {
        for (int i = 0; i < n; i++) {
            int x = (getWidth() - size) / 2;
            int y = (getHeight() - size) / 2 + i * (size + diff);
            GRect r = new GRect(size, size);
            r.setFilled(true);
            r.setColor(Color.GRAY);
            add(r, x, y);
            rects.add(r);
            labels.add(new GLabel(""));
            labels.get(i).setFont(new Font("Arial", Font.PLAIN, 25));

        }
        rects.get(0).setFillColor(Color.GREEN);
    }

    public void run() {
        slides(5);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().startsWith("prev")) {
            if (currInd != 0) {
                moveSlides(1);
                currInd--;
                rects.get(currInd).setFillColor(Color.GREEN);
            }
        }
        if (e.getActionCommand().startsWith("next")) {
            if (currInd != rects.size() - 1) {
                moveSlides(-1);
                currInd++;
                rects.get(currInd).setFillColor(Color.GREEN);
            }
        }
        if (e.getActionCommand().startsWith("print")) {
            String txt = field.getText();
            field.setText("");
            labels.get(currInd).setLabel(txt);
            double x = (getWidth() - labels.get(currInd).getWidth()) / 2.0;
            double y = rects.get(currInd).getY() +
            (rects.get(currInd).getHeight() - labels.get(currInd).getAscent()) / 2.0;
            add(labels.get(currInd), x, y);
        }
    }

    private void moveSlides(int direction) {
        int deltaY = direction * (size + diff);

        for (int i = 0; i < rects.size() ;i++) {
            GRect rect = rects.get(i);
            rect.move(0, deltaY);
            rect.setFillColor(Color.GRAY);
            if(!labels.get(i).getLabel().isEmpty()){
                labels.get(i).move(0, deltaY);
            }
        }
    }
}


