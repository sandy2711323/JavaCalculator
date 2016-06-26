package com.calculator.main;

import java.awt.EventQueue;
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
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private static Main instance = null;
	private static final Font BIGGER_FONT = new Font("monspaced", Font.PLAIN, 20);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
					// UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		Image frameicon = new ImageIcon(this.getClass().getResource("/Apps-accessories-calculator-icon.png"))
				.getImage();
		frame = new JFrame();
		frame.setBounds(100, 100, 314, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(frameicon);
		frame.setTitle("Calculator");

		textField = new JTextField();
		textField.setBounds(0, 21, 305, 116);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(0, 214, 53, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBounds(63, 214, 53, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setBounds(126, 214, 53, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBounds(0, 248, 53, 23);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBounds(63, 248, 53, 23);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(126, 248, 53, 23);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.setBounds(0, 282, 53, 23);
		frame.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.setBounds(63, 282, 53, 23);
		frame.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.setBounds(126, 282, 53, 23);
		frame.getContentPane().add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("+");
		btnNewButton_9.setBounds(189, 312, 53, 23);
		frame.getContentPane().add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("-");
		btnNewButton_10.setBounds(189, 282, 53, 23);
		frame.getContentPane().add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.setBounds(252, 281, 53, 54);
		frame.getContentPane().add(btnNewButton_11);

		JButton button = new JButton("0");
		button.setBounds(0, 312, 116, 23);
		frame.getContentPane().add(button);

		JButton btnNewButton_12 = new JButton("*");
		btnNewButton_12.setBounds(189, 248, 53, 23);
		frame.getContentPane().add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.setBounds(189, 214, 53, 23);
		frame.getContentPane().add(btnNewButton_13);

		JButton button_1 = new JButton("%");
		button_1.setBounds(252, 214, 53, 23);
		frame.getContentPane().add(button_1);

		JLabel lblAnswer = new JLabel("Answer :");
		lblAnswer.setBounds(10, 148, 93, 14);
		frame.getContentPane().add(lblAnswer);

		textField_1 = new JTextField();
		textField_1.setBounds(113, 148, 192, 36);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField.setFont(BIGGER_FONT);
		textField.setHorizontalAlignment(JTextField.RIGHT);

		JButton btnNewButton_14 = new JButton(".");
		btnNewButton_14.setBounds(126, 312, 53, 23);
		frame.getContentPane().add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("1/x");
		btnNewButton_15.setBounds(252, 248, 53, 23);
		frame.getContentPane().add(btnNewButton_15);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 305, 21);
		frame.getContentPane().add(menuBar);

		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);

		Image select = new ImageIcon(this.getClass().getResource("/Actions-arrow-right-icon.png")).getImage();

		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmStandard.setIcon(new ImageIcon(select));
		mnView.add(mntmStandard);

		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ScientificCalculator SC = ScientificCalculator.getInstance();

				SC.setIconImage(frameicon);
				SC.setVisible(true);

			}
		});
		mnView.add(mntmScientific);

		JMenu mnTheme = new JMenu("Theme");
		menuBar.add(mnTheme);

		JMenuItem mntmTest = new JMenuItem("Aluminium Look And Feel");
		mntmTest.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmTest);

		JMenuItem mntmSmartLookAnd = new JMenuItem("Smart look and feel");
		mntmSmartLookAnd.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmSmartLookAnd);

		JMenuItem mntmAcryllookandfeel = new JMenuItem("AcrylLookAndFeel");
		mntmAcryllookandfeel.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmAcryllookandfeel);

		JMenuItem mntmNoirelookandfeel = new JMenuItem("NoireLookAndFeel");
		mntmNoirelookandfeel.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmNoirelookandfeel);

		JMenuItem mntmMintlookandfeel = new JMenuItem("MintLookAndFeel");
		mntmMintlookandfeel.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmMintlookandfeel);

		JMenuItem mntmMcwinlookandfeel = new JMenuItem("McWinLookAndFeel");
		mntmMcwinlookandfeel.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmMcwinlookandfeel);

		JMenuItem mntmLunalookandfeel = new JMenuItem("LunaLookAndFeel");
		mntmLunalookandfeel.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmLunalookandfeel);

		JMenuItem mntmHifilookandfeel = new JMenuItem("HiFiLookAndFeel");
		mntmHifilookandfeel.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmHifilookandfeel);

		JMenuItem mntmGraphitelookandfeel = new JMenuItem("GraphiteLookAndFeel");
		mntmGraphitelookandfeel.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmGraphitelookandfeel);

		JMenuItem mntmFastlookandfeel = new JMenuItem("FastLookAndFeel");
		mntmFastlookandfeel.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmFastlookandfeel);

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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmBernsteinlookandfeel);

		JMenuItem mntmAluminiumlookandfeel = new JMenuItem("AluminiumLookAndFeel");
		mntmAluminiumlookandfeel.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmAluminiumlookandfeel);

		JMenuItem mntmAerolookandfeel = new JMenuItem("AeroLookAndFeel");
		mntmAerolookandfeel.addActionListener(new ActionListener() {
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
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		mnTheme.add(mntmAerolookandfeel);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About a = About.getInstance();
				a.setIconImage(frameicon);
				a.setVisible(true);
			}
		});
		mnHelp.add(mntmAbout);
	}

	public static Main getInstance() {
		if (instance == null) {
			instance = new Main();
		}
		return instance;
	}
}
