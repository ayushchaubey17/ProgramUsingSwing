import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui2 extends JFrame {
JTextField t1,t2;
JLabel l4;

 public    void setCom(){
        JLabel l1 = new JLabel("Addition/Subtraction of two number");
        JLabel l2 = new JLabel("Enter First Number");
        t1 = new JTextField();
        JLabel l3 = new JLabel("Enter the second number");
        JButton b1 = new JButton("Add");
        JButton b2 = new JButton("Subtract");
        JButton b3 = new JButton("Mul");
        JButton b4 = new JButton("Div");
        t2 = new JTextField();
        l4 = new JLabel();
        setLayout(null);
     b1.addActionListener(new Handler());
     b2.addActionListener(new Subtractor());
     b3.addActionListener(new Multiply());
     b4.addActionListener(new Divide());

      l1.setBounds(50,50,200,15);
      l2.setBounds(20,80,200,15);
      t1.setBounds(180,80,50,15);
      l3.setBounds(20,110,200,15);
      t2.setBounds(180,110,50,15);

      b1.setBounds(60,150,70,20);
      b2.setBounds(150,150,70,20);
      l4.setBounds(50,230,200,20);
      b3.setBounds(60,180,70,20);
      b4.setBounds(150,180,70,20);


     add(l1);add(l2);add(t1);add(t2);add(b1);add(l3);add(l4);add(b2);add(b3);add(b4);

    }
    class Handler implements ActionListener{
   public void actionPerformed(ActionEvent e) {

       int a = Integer.parseInt(t1.getText());
       int b = Integer.parseInt(t2.getText());


       l4.setText("the sum is "+(a+b));





        }
    }

    class Subtractor implements  ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            int c = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
            l4.setText("the subtract is "+c);

        }
    }

    class Multiply implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(t1.getText()) ;
            int b = Integer.parseInt(t2.getText());

            l4.setText("the product is "+ (a*b));
        }
    }

    class  Divide implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            float a = Float.parseFloat(t1.getText());
            float b = Float.parseFloat(t2.getText());
            float c = a/b;
            l4.setText("the division is "+ c);
        }
    }

    public static void main(String[] args) {

        gui2 obj = new gui2("ayush");
        obj.setCom();
        obj.setVisible(true);
        obj.setSize(300,300);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





    }





    gui2(){

    }
    gui2(String a){
        super(a);
    }


}
