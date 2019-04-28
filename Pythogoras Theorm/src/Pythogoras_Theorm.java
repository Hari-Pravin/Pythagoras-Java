
import javax.swing.*;
import static java.lang.Math.*;

public class Pythogoras_Theorm {
	
	float hyp,adj,opp;
	
	
	
	public void compute(String hyp,String adj,String opp, JTextField jtf1,JTextField jtf2, JTextField jtf3)
	{
		
		
		
		this.hyp = Float.parseFloat(hyp);
		
		
		this.adj = Float.parseFloat(adj);
		
		
		this.opp =Float.parseFloat(opp);
		
		
		
	
	if(this.hyp == 0)
		jtf1.setText( Float.toString((float)(sqrt(pow(this.adj,2) + pow(this.opp,2)))));
	
	else if(this.adj == 0)
		jtf2.setText(Float.toString((float)(sqrt(pow(this.hyp,2) - pow(this.opp,2)))));
	
	
	else if(this.opp == 0)
		jtf3.setText(Float.toString((float)(sqrt(pow(this.hyp,2) - pow(this.adj,2)))));
	
	}

}
