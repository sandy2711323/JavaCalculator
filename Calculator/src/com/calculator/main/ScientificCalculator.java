package com.calculator.main;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class ScientificCalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static ScientificCalculator instance = null;
	private JTextField textField;
	private JTextField textField_1;
	private static final Font BIGGER_FONT = new Font("monspaced", Font.PLAIN, 20);

	/**
	 * Create the frame.
	 */
	public ScientificCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 513, 21);
		contentPane.add(menuBar);

		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);

		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Main m = Main.getInstance();
				Main.main(null);
				setVisible(false);
			}
		});
		mnView.add(mntmStandard);
		Image frameicon = new ImageIcon(this.getClass().getResource("/Apps-accessories-calculator-icon.png"))
				.getImage();

		Image select = new ImageIcon(this.getClass().getResource("/Actions-arrow-right-icon.png")).getImage();
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.setIcon(new ImageIcon(select));
		mnView.add(mntmScientific);

		JMenu mnTheme = new JMenu("Theme");
		menuBar.add(mnTheme);

		JMenuItem AluminiumLookAndFeel = new JMenuItem("AluminiumLookAndFeel");
		AluminiumLookAndFeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(AluminiumLookAndFeel);

		JMenuItem AeroLookAndFeel = new JMenuItem("AeroLookAndFeel");
		AeroLookAndFeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(AeroLookAndFeel);

		JMenuItem mntmBernsteinlookandfeel = new JMenuItem("BernsteinLookAndFeel");
		mntmBernsteinlookandfeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(mntmBernsteinlookandfeel);
		JMenuItem FastLookAndFeel = new JMenuItem("FastLookAndFeel");
		FastLookAndFeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(FastLookAndFeel);

		JMenuItem GraphiteLookAndFeel = new JMenuItem("GraphiteLookAndFeel");
		GraphiteLookAndFeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(GraphiteLookAndFeel);

		JMenuItem HiFiLookAndFeel = new JMenuItem("HiFiLookAndFeel");
		HiFiLookAndFeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(HiFiLookAndFeel);

		JMenuItem LunaLookAndFeel = new JMenuItem("LunaLookAndFeel");
		LunaLookAndFeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(LunaLookAndFeel);

		JMenuItem McWinLookAndFeel = new JMenuItem("McWinLookAndFeel");
		McWinLookAndFeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(McWinLookAndFeel);

		JMenuItem MintLookAndFeel = new JMenuItem("MintLookAndFeel");
		MintLookAndFeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(MintLookAndFeel);

		JMenuItem NoireLookAndFeel = new JMenuItem("NoireLookAndFeel");
		NoireLookAndFeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(NoireLookAndFeel);

		JMenuItem AcrylLookAndFeel = new JMenuItem("AcrylLookAndFeel");
		AcrylLookAndFeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(AcrylLookAndFeel);

		JMenuItem SmartLookAndFeel = new JMenuItem("Smartlookandfeel");
		SmartLookAndFeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(ScientificCalculator.getInstance());
			}
		});
		mnTheme.add(SmartLookAndFeel);

		JMenu mnAbout = new JMenu("Help");
		menuBar.add(mnAbout);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About about = About.getInstance();
				about.setVisible(true);
				about.setIconImage(frameicon);
			}
		});
		mnAbout.add(mntmAbout);

		textField = new JTextField();
		textField.requestFocus();
		textField.setText("0.0");
		textField.setBounds(10, 32, 503, 161);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setFont(BIGGER_FONT);
		textField.setHorizontalAlignment(JTextField.RIGHT);

		JButton button = new JButton("7");
		button.setBounds(10, 259, 53, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("8");
		button_1.setBounds(73, 259, 53, 23);
		contentPane.add(button_1);

		JButton button_2 = new JButton("9");
		button_2.setBounds(136, 259, 53, 23);
		contentPane.add(button_2);

		JButton button_3 = new JButton("4");
		button_3.setBounds(10, 293, 53, 23);
		contentPane.add(button_3);

		JButton button_4 = new JButton("5");
		button_4.setBounds(73, 293, 53, 23);
		contentPane.add(button_4);

		JButton button_5 = new JButton("6");
		button_5.setBounds(136, 293, 53, 23);
		contentPane.add(button_5);

		JButton button_6 = new JButton("1");
		button_6.setBounds(10, 327, 53, 23);
		contentPane.add(button_6);

		JButton button_7 = new JButton("2");
		button_7.setBounds(73, 327, 53, 23);
		contentPane.add(button_7);

		JButton button_8 = new JButton("3");
		button_8.setBounds(136, 327, 53, 23);
		contentPane.add(button_8);

		JButton button_9 = new JButton("+");
		button_9.setBounds(199, 357, 53, 23);
		contentPane.add(button_9);

		JButton button_10 = new JButton("-");
		button_10.setBounds(199, 327, 53, 23);
		contentPane.add(button_10);

		JButton button_11 = new JButton("=");
		button_11.setBounds(262, 326, 53, 54);
		contentPane.add(button_11);

		JButton button_12 = new JButton("0");
		button_12.setBounds(10, 357, 116, 23);
		contentPane.add(button_12);

		JButton button_13 = new JButton("*");
		button_13.setBounds(199, 293, 53, 23);
		contentPane.add(button_13);

		JButton button_14 = new JButton("/");
		button_14.setBounds(199, 259, 53, 23);
		contentPane.add(button_14);

		JButton button_15 = new JButton("%");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_15.setBounds(262, 259, 53, 23);
		contentPane.add(button_15);

		JButton button_16 = new JButton(".");
		button_16.setBounds(136, 357, 53, 23);
		contentPane.add(button_16);

		JButton button_17 = new JButton("1/x");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String value = textField.getText();
					double doubleVal = Double.parseDouble(value);
					double reciprocal = 1 / doubleVal;
					textField.setText(reciprocal + "");
				} catch (NumberFormatException e1) {
					textField.setText("Enter in the proper number or double");
					e1.printStackTrace();
				}
			}
		});
		button_17.setBounds(262, 293, 53, 23);
		contentPane.add(button_17);

		JButton btnNewButton = new JButton("\u221A(x)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double value = Double.parseDouble(textField.getText());
					double sqrt = Math.sqrt(value);
					textField_1.setText(Double.toString(sqrt));
				} catch (NumberFormatException e1) {
					textField.setText("Enter in the \u221A(x)format");
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(317, 259, 61, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u00B3\u221A(x)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double value = Double.parseDouble(textField.getText());
					double cuberoot = Math.cbrt(value);
					textField_1.setText(Double.toString(cuberoot));
				} catch (NumberFormatException e1) {
					textField.setText("Enter in the \u00B3\u221A(x) format");
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(317, 293, 61, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("<html><sup>y</sup>\u221A(x)</html>");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String[] value = textField.getText().split("[\\^]");
					double powerans = Math.pow(Double.parseDouble(value[1]), 1 / Double.parseDouble(value[0]));
					textField_1.setText(value[0] + "\u221A" + value[1] + " is " + Double.toString(powerans));
				} catch (NumberFormatException e1) {
					textField.setText("Enter in the y \u221A x format");
					e1.printStackTrace();
				} catch (ArrayIndexOutOfBoundsException e1) {
					textField.setText("Enter in the y \u221A x format");
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(317, 327, 61, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("<html>x<sup>2</sup></html>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double value = Double.parseDouble(textField.getText());
					double xsquare = value * value;
					textField_1.setText(Double.toString(xsquare));
				} catch (NumberFormatException e1) {
					textField.setText("Enter in the x^2 format");
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(388, 257, 53, 23);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("<html>x<sup>3</sup></html>");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double value = Double.parseDouble(textField.getText());
					double xcube = value * value * value;
					textField_1.setText(Double.toString(xcube));
				} catch (NumberFormatException e1) {
					textField.setText("Enter in the x^3 format");
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(388, 291, 53, 23);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("<html>x<sup>y</sup></html>");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String[] value = textField.getText().split("[\\^]");
					double powerans = Math.pow(Double.parseDouble(value[0]), Double.parseDouble(value[1]));
					textField_1.setText(value[0] + " pow(" + value[1] + ") is " + Double.toString(powerans));
				} catch (NumberFormatException e1) {
					textField.setText("Enter in the x^y format");
					e1.printStackTrace();
				} catch (ArrayIndexOutOfBoundsException e1) {
					textField.setText("Enter in the x^y format");
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_5.setBounds(388, 325, 53, 23);
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("<html>10<sup>x</sup></html>");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double value = Double.parseDouble(textField.getText());
					double tenpowerx = Math.pow(10.0, value);
					textField_1.setText(Double.toString(tenpowerx));
				} catch (NumberFormatException e1) {
					textField.setText("Enter in 10^x format");
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_6.setBounds(451, 259, 74, 23);
		contentPane.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("<html>log<sub>10</sub>(x)</html>");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double value = Double.parseDouble(textField.getText());
					double logx = Math.log10(value);
					textField_1.setText(Double.toString(logx));
				} catch (NumberFormatException e1) {
					textField.setText("Enter in log10(x)format");
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_7.setBounds(451, 293, 74, 23);
		contentPane.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("n!");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input = textField.getText();
					int integerInput = Integer.parseInt(input);
					int factorialValue = factorial(integerInput);
					textField_1.setText(factorialValue + "");
				} catch (NumberFormatException e1) {
					textField.setText("Enter proper positive number ");
					e1.printStackTrace();
				}
			}

			public int factorial(int integerInput) {
				int fact = 1, c = 1;
				int n = integerInput;
				if (n < 0) {
					textField.setText("Please enter positive number");
					return 0;
				} else {
					for (c = 1; c <= n; c++)
						fact = fact * c;
					return fact;
				}
			}
		});
		btnNewButton_8.setBounds(451, 327, 74, 23);
		contentPane.add(btnNewButton_8);

		JLabel lblNewLabel = new JLabel("Answer :");
		lblNewLabel.setBounds(73, 219, 82, 14);
		contentPane.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(162, 204, 351, 44);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton sin = new JButton("Sin");
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input = textField.getText();
					double  doubleVal = Double.parseDouble(input);
					double sinvalue = Math.sin(doubleVal);
					textField_1.setText(sinvalue + "");
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		sin.setBounds(317, 357, 59, 23);
		contentPane.add(sin);

		JButton Cos = new JButton("Cos");
		Cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input = textField.getText();
					double  doubleVal = Double.parseDouble(input);
					double cosin = Math.cos(doubleVal);
					textField_1.setText(cosin + "");
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				}
			}
		});
		Cos.setBounds(388, 357, 53, 23);
		contentPane.add(Cos);

		JButton Tan = new JButton("Tan");
		Tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input = textField.getText();
					double  doubleVal = Double.parseDouble(input);
					double tan = Math.tan(doubleVal);
					textField_1.setText(tan + "");
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				}
			}
		});
		Tan.setBounds(451, 357, 74, 23);
		contentPane.add(Tan);

		JButton powerButton = new JButton("^");
		powerButton.setBounds(10, 225, 53, 23);
		contentPane.add(powerButton);
		setTitle("Scientific Calculator");
	}

	public static ScientificCalculator getInstance() {

		if (instance == null) {
			instance = new ScientificCalculator();
		}
		return instance;
	}
}
