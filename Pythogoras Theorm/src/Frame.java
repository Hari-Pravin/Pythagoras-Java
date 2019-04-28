import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Frame {

Frame()
{
	Pythogoras_Theorm pt = new Pythogoras_Theorm();
	
	JFrame jf = new JFrame("Pythogoras Theorm");
	jf.setLayout(new FlowLayout(FlowLayout.CENTER));
	jf.setSize( 380,100);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JLabel jl1 = new JLabel("Hypotenuse");
	JLabel jl2 = new JLabel("Adjacent");
	JLabel jl3 = new JLabel("Opposite");
	
	
    JTextField jtf1 = new JTextField(5);
	JTextField jtf2 = new JTextField(5);
	JTextField jtf3 = new JTextField(5);
	
	jtf1.setText(null);
	jtf2.setText(null);
	jtf3.setText(null);
	
	JButton jb1 = new JButton("Alohomora");
	
jf.add(jl1);
jf.add(jtf1);
jf.add(jl2);
jf.add(jtf2);
jf.add(jl3);
jf.add(jtf3);
jf.add(jb1);

jb1.addActionListener(new ActionListener()
		
		{
	public void actionPerformed(ActionEvent ae)
	{
		
		if(jtf1.getText().isEmpty())
			jtf1.setText("0");
		if(jtf2.getText().isEmpty())
			jtf2.setText("0");
		if(jtf3.getText().isEmpty())
			jtf3.setText("0");
		
		pt.compute(jtf1.getText(),jtf2.getText(), jtf3.getText(),jtf1,jtf2,jtf3);
	}
		}
		
		);

jf.setVisible(true);


}

public static void main(String args[])
{
	SwingUtilities.invokeLater(new Runnable()
			{
		public void run()
		{
			new Frame();
		}
			}
			
			);
}


}
