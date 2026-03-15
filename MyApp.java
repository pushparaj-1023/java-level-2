import java.awt.*;

public class MyApp
{
    public static void main(String args[])
    {
        Frame f = new Frame();

        f.setTitle("MyApp");
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        Label l1 = new Label("TARSITASILA UNIVERSITY");
        f.add(l1);
        l1.setBounds(150,20,250,30);

        Label l2 = new Label("TNJ");
        f.add(l2);
        l2.setBounds(40,80,250,30);

        Label l3 = new Label("Application form 2021");
        f.add(l3);
        l3.setBounds(150,120,250,30);

        Label l4 = new Label("Application No");
        f.add(l4);
        l4.setBounds(100,200,250,30);

        TextField t1 = new TextField(20);
        f.add(t1);
        t1.setBounds(200,200,250,30);

        Label l5 = new Label("Student Name");
        f.add(l5);
        l5.setBounds(100,250,250,30);

        TextField t2 = new TextField(20);
        f.add(t2);
        t2.setBounds(200,250,250,30);

        Label l6 = new Label("Programme");
        f.add(l6);
        l6.setBounds(100,300,250,30);

        TextField t3 = new TextField(20);
        f.add(t3);
        t3.setBounds(200,300,250,30);

        Button b1 = new Button("Save");
        f.add(b1);
        b1.setBounds(200,350,250,30);
    }
}