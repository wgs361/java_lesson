//: gui/TextArea.java
package gui.controls.text; /* Added by Eclipse.py */
// Using the JTextArea control.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import static net.mindview.util.SwingConsole.run;

public class TextArea extends JFrame {
    private JButton
            b = new JButton("Add Data"),
            c = new JButton("Clear Data");
    private JTextArea t = new JTextArea(20, 40);
    private Map<String, Integer> m =
            new HashMap<String, Integer>();

    public TextArea() {
        // Use up all the data:
        m.put("北京", 20000);
        m.put("上海", 21000);
        m.put("广州", 22000);
        m.put("深圳", 23000);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Map.Entry me : m.entrySet())
                    t.append(me.getKey() + ": " + me.getValue() + "\n");
            }
        });

        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText("");
            }
        });

        setLayout(new FlowLayout());
        add(new JScrollPane(t));
        add(b);
        add(c);
    }

    public static void main(String[] args) {

        run(new TextArea(), 475, 425);
    }
} ///:~
