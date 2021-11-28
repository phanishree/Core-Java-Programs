package javaMain;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class GUI1 extends Applet implements ActionListener {
	
	Label lbl;
	TextField txt;
	Button b;
	public void init() {
		lbl=new Label("System Clock");
		txt=new TextField(20);
		b=new Button("get");
		txt.setEditable(false);
		add(lbl);
		add(txt);
		add(b);
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Date d=new Date();
		txt.setText(d.toString());
	}

}
