package Labs.Lab9;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MyWindow extends JFrame implements MouseListener {
    public MyWindow() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addMouseListener(this); // Register the JFrame as a MouseListener
    }

    public static void main(String[] args) {
        MyWindow window = new MyWindow();
    }

    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Student s1 = new Student("Some Student", y);
        System.out.println("Student " + s1.getName() + " has grade " + s1.getGPA());
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered the component");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited the component");
    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse pressed at (" + x + ", " + y + ")");
    }

    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse released at (" + x + ", " + y + ")");
    }
}
