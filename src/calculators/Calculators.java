package calculators;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.Window.Type;

import javax.swing.JLabel;
import java.awt.Color;

public class Calculators {

	private JFrame frame;
	private JTextField txtDisplay;
	private JButton btn_del;
	private JButton btn_div;
	private JButton btn_mul;
	private JButton btn_pi;
	private JButton btn_exp;
	private JButton btn_root;
	private JButton btn_square;
	private JButton btn_cube;
	private JButton btn_0;
	private JButton btn_point;
	private JButton btn_minus;
	private JButton btn_plus;
	private JButton btn_equals;
	private JButton btn_log;
	private JButton btn_ln;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_4;
	private JButton btn_6;
	private JButton btn_5;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_1;

	public double num=0;
	public int calculation=1;
	public double numb;
	private boolean opearatorpress = false;
	private final JLabel lbl_show = new JLabel("");

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Calculators window = new Calculators();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}


	public Calculators() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.GREEN);
		frame.setBackground(new Color(135, 206, 250));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setResizable(false);
		frame.setType(Type.UTILITY);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.setBounds(100, 100, 423, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(12, 41, 392, 42);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);

		JButton btn_ac = new JButton("AC");
		btn_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(null);
				lbl_show.setText(null);
				num = 0;

			}
		});
		btn_ac.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_ac.setBounds(205, 96, 80, 50);
		frame.getContentPane().add(btn_ac);

		btn_del = new JButton("DEL");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String del = null;
				if(txtDisplay.getText().length() > 0)
				{
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					del = strB.toString();
					txtDisplay.setText(del);
				}
			}
		});
		btn_del.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_del.setBounds(297, 96, 90, 50);
		frame.getContentPane().add(btn_del);

		btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//PROBLEM
				//added code
				if(calculation==1)
                    num = Double.parseDouble(txtDisplay.getText())+ num;
                else
                if(calculation==2)
                    num =num-Double.parseDouble(txtDisplay.getText());
                else
                if(calculation==3)
                    num = num*Double.parseDouble(txtDisplay.getText());
                else
                if(calculation==4)
                    num = num/Double.parseDouble(txtDisplay.getText());
                else if(calculation==5)
                	num = ((num*Double.parseDouble(txtDisplay.getText()))/100);
                    //added code
                lbl_show.setText(String.valueOf(num) + " / ");
				txtDisplay.setText("");
				calculation = 4;
               // System.out.println("Hello:"+calculation);
                
                
			
			
		}

		});
		btn_div.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_div.setBounds(344, 168, 60, 60);
		frame.getContentPane().add(btn_div);

		btn_mul = new JButton("*");
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//PROBLEM
				//Added Code
				if(calculation==1)
                    num = Double.parseDouble(txtDisplay.getText())+ num;
                else
                if(calculation==2)
                    num =num-Double.parseDouble(txtDisplay.getText());
                else
                if(calculation==3)
                    num = num*Double.parseDouble(txtDisplay.getText());
                else
                if(calculation==4)
                    num = num/Double.parseDouble(txtDisplay.getText());
                else if(calculation==5)
                	num = ((num*Double.parseDouble(txtDisplay.getText()))/100);
                    //added code
                lbl_show.setText(String.valueOf(num) + " * ");
				txtDisplay.setText("");
				calculation = 3;
				
				

			}

		});
		btn_mul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_mul.setBounds(344, 253, 60, 60);
		frame.getContentPane().add(btn_mul);

		btn_pi = new JButton("\u03C0");
		btn_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + "3.14";
				txtDisplay.setText(EnterNumber);
			}
		});
		btn_pi.setFont(new Font("Calibri", Font.BOLD, 22));
		btn_pi.setBounds(21, 96, 80, 50);
		frame.getContentPane().add(btn_pi);

		btn_exp = new JButton("exp");
		btn_exp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(Double.toString(Math.exp(Double.parseDouble(txtDisplay.getText()))));

				
			}
		});
		btn_exp.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_exp.setBounds(113, 96, 80, 50);
		frame.getContentPane().add(btn_exp);

		btn_root = new JButton("\u221A");
		btn_root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(Double.toString(Math.sqrt(Double.parseDouble(txtDisplay.getText()))));
			}
		});
		btn_root.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_root.setBounds(12, 168, 60, 60);
		frame.getContentPane().add(btn_root);

		btn_square = new JButton("x^2");
		btn_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(Double.toString(Double.parseDouble(txtDisplay.getText())*Double.parseDouble(txtDisplay.getText())));
			}
		});
		btn_square.setHorizontalAlignment(SwingConstants.LEFT);
		btn_square.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btn_square.setBounds(12, 430, 60, 60);
		frame.getContentPane().add(btn_square);

		btn_cube = new JButton("X^3");
		btn_cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(Double.toString(Double.parseDouble(txtDisplay.getText())*Double.parseDouble(txtDisplay.getText())*Double.parseDouble(txtDisplay.getText())));

				
			}
		});
		btn_cube.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_cube.setBounds(12, 515, 60, 60);
		frame.getContentPane().add(btn_cube);

		btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn_0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_0.setBounds(102, 515, 60, 60);
		frame.getContentPane().add(btn_0);

		btn_point = new JButton(".");
		btn_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn_point.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn_point.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_point.setBounds(192, 515, 60, 60);
		frame.getContentPane().add(btn_point);

		btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//PROBLEM
                //added code
				if(calculation==1)
                    num = Double.parseDouble(txtDisplay.getText())+ num;
                else
                if(calculation==2)
                    num =num-Double.parseDouble(txtDisplay.getText());
                else
                if(calculation==3)
                    num = num*Double.parseDouble(txtDisplay.getText());
                else
                if(calculation==4)
                    num = num/Double.parseDouble(txtDisplay.getText());
                else if(calculation==5)
                	num = ((num*Double.parseDouble(txtDisplay.getText()))/100);
                    //added code
                lbl_show.setText(String.valueOf(num)+ " - ");
				txtDisplay.setText("");
				calculation = 2;
				
		

			}
		});
		btn_minus.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_minus.setBounds(344, 345, 60, 60);
		frame.getContentPane().add(btn_minus);

		btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//PROBLEM
				//added code
				if(calculation==1)
                    num = Double.parseDouble(txtDisplay.getText())+ num;
                else
                if(calculation==2)
                    num =num-Double.parseDouble(txtDisplay.getText());
                else
                if(calculation==3)
                    num = num*Double.parseDouble(txtDisplay.getText());
                else
                if(calculation==4)
                    num = num/Double.parseDouble(txtDisplay.getText());
                else if(calculation==5)
                	num = ((num*Double.parseDouble(txtDisplay.getText()))/100);
                    //added code
                lbl_show.setText(String.valueOf(num) + " + ");
				txtDisplay.setText("");
				calculation = 1;
				
				

			}


		});




		btn_plus.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_plus.setBounds(344, 430, 60, 60);
		frame.getContentPane().add(btn_plus);

		btn_equals = new JButton("=");
		btn_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

                if(calculation==1)
                    num = Double.parseDouble(txtDisplay.getText())+ num;
                else
                if(calculation==2)
                    num =num-Double.parseDouble(txtDisplay.getText());
                else
                if(calculation==3)
                    num = num*Double.parseDouble(txtDisplay.getText());
                else
                if(calculation==4)
                    num = num/Double.parseDouble(txtDisplay.getText());
                else if(calculation==5)
                	num = ((num*Double.parseDouble(txtDisplay.getText()))/100);
                txtDisplay.setText(Double.toString(num));
				/*switch(calculation)
				{
				case 1:
					calculation=1;
					break;
				case 2:
				    calculation=2;
					break;

				case 3:
				    calculation=3;
					break;
				case 4:
				    calculation=4;
					break;
				case 5:
					calculation =5;

				}*/
				lbl_show.setText("");
				num = 0;
			}

		});

		btn_equals.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_equals.setBounds(282, 515, 105, 60);
		frame.getContentPane().add(btn_equals);

		btn_log = new JButton("log");
		btn_log.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(Double.toString(Math.log10(Double.parseDouble(txtDisplay.getText()))));
       
			}
		});
		btn_log.setBounds(12, 345, 60, 60);
		frame.getContentPane().add(btn_log);

		btn_ln = new JButton("ln");
		btn_ln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(Double.toString(Math.log(Double.parseDouble(txtDisplay.getText()))));
			}
		});
		btn_ln.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_ln.setBounds(12, 253, 60, 60);
		frame.getContentPane().add(btn_ln);

		btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn_7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_7.setBounds(185, 185, 48, 48);
		frame.getContentPane().add(btn_7);

		btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn_8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_8.setBounds(144, 244, 48, 48);
		frame.getContentPane().add(btn_8);

		btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn_9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_9.setBounds(226, 244, 48, 48);
		frame.getContentPane().add(btn_9);

		btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn_4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_4.setBounds(103, 310, 48, 48);
		frame.getContentPane().add(btn_4);

		btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn_6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_6.setBounds(267, 310, 48, 48);
		frame.getContentPane().add(btn_6);

		btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn_5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_5.setBounds(185, 310, 48, 48);
		frame.getContentPane().add(btn_5);

		btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtDisplay.getText().equals("ERROR"))
				{
					if(txtDisplay.getText().equals("") || opearatorpress)
						txtDisplay.setText("2");
					else 
						txtDisplay.setText(txtDisplay.getText()+ "2 ");
				}
			opearatorpress = false;
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_2.setBounds(144, 371, 48, 48);
		frame.getContentPane().add(btn_2);

		btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtDisplay.getText().equals("ERROR"))
				{
					if(txtDisplay.getText().equals("0") || opearatorpress)
						txtDisplay.setText("3");
					else 
						txtDisplay.setText(txtDisplay.getText()+ "3");
				}
			opearatorpress = false;
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_3.setBounds(226, 371, 48, 48);
		frame.getContentPane().add(btn_3);

		btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtDisplay.getText().equals("ERROR"))
				{
					if(txtDisplay.getText().equals("") || opearatorpress)
						txtDisplay.setText("1");
					else 
						txtDisplay.setText(txtDisplay.getText()+ "1");
				}
			opearatorpress = false;
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_1.setBounds(185, 432, 48, 48);
		frame.getContentPane().add(btn_1);
		lbl_show.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_show.setBounds(297, 13, 107, 25);
		frame.getContentPane().add(lbl_show);
	}
}
