import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class fMain extends JFrame {

	private JPanel contentPane;
	private JTextField text_00;
	private JTextField text_01;
	private JTextField text_02;
	private JTextField text_03;
	private JTextField text_04;
	private JTextField text_14;
	private JTextField text_13;
	private JTextField text_12;
	private JTextField text_11;
	private JTextField text_10;
	private JTextField text_24;
	private JTextField text_23;
	private JTextField text_22;
	private JTextField text_21;
	private JTextField text_20;
	private JTextField text_34;
	private JTextField text_33;
	private JTextField text_32;
	private JTextField text_31;
	private JTextField text_30;
	private JTextField text_44;
	private JTextField text_43;
	private JTextField text_42;
	private JTextField text_41;
	private JTextField text_40;
	private JTextField text_input;
	public String word = "";
	public int tryCount = 0;
	private JLabel lblKelimeBulmaca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// change system looks
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {

				}
		EventQueue.invokeLater(new Runnable() {
			public void run() {		
				try {
					fMain frame = new fMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public fMain() {
		setTitle("Kelime bulmaca");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 270, 403);
		contentPane.add(panel);
		panel.setLayout(null);
		
		text_00 = new JTextField();
		text_00.setForeground(new Color(255, 255, 255));
		text_00.setBackground(new Color(0, 0, 0));
		text_00.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_00.setHorizontalAlignment(SwingConstants.CENTER);
		text_00.setEnabled(false);
		text_00.setEditable(false);
		text_00.setBounds(10, 46, 50, 50);
		panel.add(text_00);
		text_00.setColumns(10);
		
		text_01 = new JTextField();
		text_01.setBackground(new Color(0, 0, 0));
		text_01.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_01.setHorizontalAlignment(SwingConstants.CENTER);
		text_01.setEnabled(false);
		text_01.setEditable(false);
		text_01.setColumns(10);
		text_01.setBounds(60, 46, 50, 50);
		panel.add(text_01);
		
		text_02 = new JTextField();
		text_02.setBackground(new Color(0, 0, 0));
		text_02.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_02.setHorizontalAlignment(SwingConstants.CENTER);
		text_02.setEnabled(false);
		text_02.setEditable(false);
		text_02.setColumns(10);
		text_02.setBounds(110, 46, 50, 50);
		panel.add(text_02);
		
		text_03 = new JTextField();
		text_03.setBackground(new Color(0, 0, 0));
		text_03.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_03.setHorizontalAlignment(SwingConstants.CENTER);
		text_03.setEnabled(false);
		text_03.setEditable(false);
		text_03.setColumns(10);
		text_03.setBounds(160, 46, 50, 50);
		panel.add(text_03);
		
		text_04 = new JTextField();
		text_04.setBackground(new Color(0, 0, 0));
		text_04.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_04.setHorizontalAlignment(SwingConstants.CENTER);
		text_04.setEnabled(false);
		text_04.setEditable(false);
		text_04.setColumns(10);
		text_04.setBounds(210, 46, 50, 50);
		panel.add(text_04);
		
		text_14 = new JTextField();
		text_14.setBackground(new Color(0, 0, 0));
		text_14.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_14.setHorizontalAlignment(SwingConstants.CENTER);
		text_14.setEnabled(false);
		text_14.setEditable(false);
		text_14.setColumns(10);
		text_14.setBounds(210, 96, 50, 50);
		panel.add(text_14);
		
		text_13 = new JTextField();
		text_13.setBackground(new Color(0, 0, 0));
		text_13.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_13.setHorizontalAlignment(SwingConstants.CENTER);
		text_13.setEnabled(false);
		text_13.setEditable(false);
		text_13.setColumns(10);
		text_13.setBounds(160, 96, 50, 50);
		panel.add(text_13);
		
		text_12 = new JTextField();
		text_12.setBackground(new Color(0, 0, 0));
		text_12.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_12.setHorizontalAlignment(SwingConstants.CENTER);
		text_12.setEnabled(false);
		text_12.setEditable(false);
		text_12.setColumns(10);
		text_12.setBounds(110, 96, 50, 50);
		panel.add(text_12);
		
		text_11 = new JTextField();
		text_11.setBackground(new Color(0, 0, 0));
		text_11.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_11.setHorizontalAlignment(SwingConstants.CENTER);
		text_11.setEnabled(false);
		text_11.setEditable(false);
		text_11.setColumns(10);
		text_11.setBounds(60, 96, 50, 50);
		panel.add(text_11);
		
		text_10 = new JTextField();
		text_10.setBackground(new Color(0, 0, 0));
		text_10.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_10.setHorizontalAlignment(SwingConstants.CENTER);
		text_10.setEnabled(false);
		text_10.setEditable(false);
		text_10.setColumns(10);
		text_10.setBounds(10, 96, 50, 50);
		panel.add(text_10);
		
		text_24 = new JTextField();
		text_24.setBackground(new Color(0, 0, 0));
		text_24.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_24.setHorizontalAlignment(SwingConstants.CENTER);
		text_24.setEnabled(false);
		text_24.setEditable(false);
		text_24.setColumns(10);
		text_24.setBounds(210, 146, 50, 50);
		panel.add(text_24);
		
		text_23 = new JTextField();
		text_23.setBackground(new Color(0, 0, 0));
		text_23.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_23.setHorizontalAlignment(SwingConstants.CENTER);
		text_23.setEnabled(false);
		text_23.setEditable(false);
		text_23.setColumns(10);
		text_23.setBounds(160, 146, 50, 50);
		panel.add(text_23);
		
		text_22 = new JTextField();
		text_22.setBackground(new Color(0, 0, 0));
		text_22.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_22.setHorizontalAlignment(SwingConstants.CENTER);
		text_22.setEnabled(false);
		text_22.setEditable(false);
		text_22.setColumns(10);
		text_22.setBounds(110, 146, 50, 50);
		panel.add(text_22);
		
		text_21 = new JTextField();
		text_21.setBackground(new Color(0, 0, 0));
		text_21.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_21.setHorizontalAlignment(SwingConstants.CENTER);
		text_21.setEnabled(false);
		text_21.setEditable(false);
		text_21.setColumns(10);
		text_21.setBounds(60, 146, 50, 50);
		panel.add(text_21);
		
		text_20 = new JTextField();
		text_20.setBackground(new Color(0, 0, 0));
		text_20.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_20.setHorizontalAlignment(SwingConstants.CENTER);
		text_20.setEnabled(false);
		text_20.setEditable(false);
		text_20.setColumns(10);
		text_20.setBounds(10, 146, 50, 50);
		panel.add(text_20);
		
		text_34 = new JTextField();
		text_34.setBackground(new Color(0, 0, 0));
		text_34.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_34.setHorizontalAlignment(SwingConstants.CENTER);
		text_34.setEnabled(false);
		text_34.setEditable(false);
		text_34.setColumns(10);
		text_34.setBounds(210, 196, 50, 50);
		panel.add(text_34);
		
		text_33 = new JTextField();
		text_33.setBackground(new Color(0, 0, 0));
		text_33.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_33.setHorizontalAlignment(SwingConstants.CENTER);
		text_33.setEnabled(false);
		text_33.setEditable(false);
		text_33.setColumns(10);
		text_33.setBounds(160, 196, 50, 50);
		panel.add(text_33);
		
		text_32 = new JTextField();
		text_32.setBackground(new Color(0, 0, 0));
		text_32.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_32.setHorizontalAlignment(SwingConstants.CENTER);
		text_32.setEnabled(false);
		text_32.setEditable(false);
		text_32.setColumns(10);
		text_32.setBounds(110, 196, 50, 50);
		panel.add(text_32);
		
		text_31 = new JTextField();
		text_31.setBackground(new Color(0, 0, 0));
		text_31.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_31.setHorizontalAlignment(SwingConstants.CENTER);
		text_31.setEnabled(false);
		text_31.setEditable(false);
		text_31.setColumns(10);
		text_31.setBounds(60, 196, 50, 50);
		panel.add(text_31);
		
		text_30 = new JTextField();
		text_30.setBackground(new Color(0, 0, 0));
		text_30.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_30.setHorizontalAlignment(SwingConstants.CENTER);
		text_30.setEnabled(false);
		text_30.setEditable(false);
		text_30.setColumns(10);
		text_30.setBounds(10, 196, 50, 50);
		panel.add(text_30);
		
		text_44 = new JTextField();
		text_44.setBackground(new Color(0, 0, 0));
		text_44.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_44.setHorizontalAlignment(SwingConstants.CENTER);
		text_44.setEnabled(false);
		text_44.setEditable(false);
		text_44.setColumns(10);
		text_44.setBounds(210, 246, 50, 50);
		panel.add(text_44);
		
		text_43 = new JTextField();
		text_43.setBackground(new Color(0, 0, 0));
		text_43.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_43.setHorizontalAlignment(SwingConstants.CENTER);
		text_43.setEnabled(false);
		text_43.setEditable(false);
		text_43.setColumns(10);
		text_43.setBounds(160, 246, 50, 50);
		panel.add(text_43);
		
		text_42 = new JTextField();
		text_42.setBackground(new Color(0, 0, 0));
		text_42.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_42.setHorizontalAlignment(SwingConstants.CENTER);
		text_42.setEnabled(false);
		text_42.setEditable(false);
		text_42.setColumns(10);
		text_42.setBounds(110, 246, 50, 50);
		panel.add(text_42);
		
		text_41 = new JTextField();
		text_41.setBackground(new Color(0, 0, 0));
		text_41.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_41.setHorizontalAlignment(SwingConstants.CENTER);
		text_41.setEnabled(false);
		text_41.setEditable(false);
		text_41.setColumns(10);
		text_41.setBounds(60, 246, 50, 50);
		panel.add(text_41);
		
		text_40 = new JTextField();
		text_40.setBackground(new Color(0, 0, 0));
		text_40.setFont(new Font("Times New Roman", Font.BOLD, 32));
		text_40.setHorizontalAlignment(SwingConstants.CENTER);
		text_40.setEnabled(false);
		text_40.setEditable(false);
		text_40.setColumns(10);
		text_40.setBounds(10, 246, 50, 50);
		panel.add(text_40);
		
		text_input = new JTextField();		
		text_input.setFont(new Font("Tahoma", Font.BOLD, 20));
		text_input.setHorizontalAlignment(SwingConstants.LEFT);
		text_input.setBounds(35, 310, 200, 50);
		panel.add(text_input);
		text_input.setColumns(10);
		
		JButton btn_basla = new JButton("Başla");		
		btn_basla.setBounds(60, 370, 150, 20);
		panel.add(btn_basla);
		
		lblKelimeBulmaca = new JLabel("Kelime Bulmaca");
		lblKelimeBulmaca.setHorizontalAlignment(SwingConstants.CENTER);
		lblKelimeBulmaca.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKelimeBulmaca.setBounds(10, 11, 250, 24);
		panel.add(lblKelimeBulmaca);
		
		//Events
		
		//text box key event
		text_input.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					String input = text_input.getText(); //get the input word
					
					if(input.length() != 5) { // check word length
						JOptionPane.showMessageDialog(new JFrame(), "Kelime 5 harfli olmalıdır", "Dialog",
						        JOptionPane.ERROR_MESSAGE);
					}else {
						if(tryCount == 5) { //check if we have any try left
							JOptionPane.showMessageDialog(new JFrame(), "Hakkınız Kalmadı", "Dialog",
							        JOptionPane.ERROR_MESSAGE);
							lblKelimeBulmaca.setText(word);
						}else {
							tryCount++;
							if(isCorrect(word, input)) {//check if we guess right
								switch(tryCount) {
								case 1://set rows as right
									text_00.setText(Character.toString(input.charAt(0)).toUpperCase());
									text_00.setBackground(Color.GREEN);
									text_00.setForeground(Color.BLACK);
									
									text_01.setText(Character.toString(input.charAt(1)).toUpperCase());
									text_01.setBackground(Color.GREEN);
									text_01.setForeground(Color.BLACK);
									
									text_02.setText(Character.toString(input.charAt(2)).toUpperCase());
									text_02.setBackground(Color.GREEN);
									text_02.setForeground(Color.BLACK);
									
									text_03.setText(Character.toString(input.charAt(3)).toUpperCase());
									text_03.setBackground(Color.GREEN);
									text_03.setForeground(Color.BLACK);
									
									text_04.setText(Character.toString(input.charAt(4)).toUpperCase());
									text_04.setBackground(Color.GREEN);
									text_04.setForeground(Color.BLACK);
									break;
								case 2://set rows as right
									text_10.setText(Character.toString(input.charAt(0)).toUpperCase());
									text_10.setBackground(Color.GREEN);
									text_10.setForeground(Color.BLACK);
									
									text_11.setText(Character.toString(input.charAt(1)).toUpperCase());
									text_11.setBackground(Color.GREEN);
									text_11.setForeground(Color.BLACK);
									
									text_12.setText(Character.toString(input.charAt(2)).toUpperCase());
									text_12.setBackground(Color.GREEN);
									text_12.setForeground(Color.BLACK);
									
									text_13.setText(Character.toString(input.charAt(3)).toUpperCase());
									text_13.setBackground(Color.GREEN);
									text_13.setForeground(Color.BLACK);
									
									text_14.setText(Character.toString(input.charAt(4)).toUpperCase());
									text_14.setBackground(Color.GREEN);
									text_14.setForeground(Color.BLACK);
									break;
								case 3://set rows as right
									text_20.setText(Character.toString(input.charAt(0)).toUpperCase());
									text_20.setBackground(Color.GREEN);
									text_20.setForeground(Color.BLACK);
									
									text_21.setText(Character.toString(input.charAt(1)).toUpperCase());
									text_21.setBackground(Color.GREEN);
									text_21.setForeground(Color.BLACK);
									
									text_22.setText(Character.toString(input.charAt(2)).toUpperCase());
									text_22.setBackground(Color.GREEN);
									text_22.setForeground(Color.BLACK);
									
									text_23.setText(Character.toString(input.charAt(3)).toUpperCase());
									text_23.setBackground(Color.GREEN);
									text_23.setForeground(Color.BLACK);
									
									text_24.setText(Character.toString(input.charAt(4)).toUpperCase());
									text_24.setBackground(Color.GREEN);
									text_24.setForeground(Color.BLACK);
									break;
								case 4://set rows as right
									text_30.setText(Character.toString(input.charAt(0)).toUpperCase());
									text_30.setBackground(Color.GREEN);
									text_30.setForeground(Color.BLACK);
									
									text_31.setText(Character.toString(input.charAt(1)).toUpperCase());
									text_31.setBackground(Color.GREEN);
									text_31.setForeground(Color.BLACK);
									
									text_32.setText(Character.toString(input.charAt(2)).toUpperCase());
									text_32.setBackground(Color.GREEN);
									text_32.setForeground(Color.BLACK);
									
									text_33.setText(Character.toString(input.charAt(3)).toUpperCase());
									text_33.setBackground(Color.GREEN);
									text_33.setForeground(Color.BLACK);
									
									text_34.setText(Character.toString(input.charAt(4)).toUpperCase());
									text_34.setBackground(Color.GREEN);
									text_34.setForeground(Color.BLACK);
									break;
								case 5://set rows as right
									text_40.setText(Character.toString(input.charAt(0)).toUpperCase());
									text_40.setBackground(Color.GREEN);
									text_40.setForeground(Color.BLACK);
									
									text_41.setText(Character.toString(input.charAt(1)).toUpperCase());
									text_41.setBackground(Color.GREEN);
									text_41.setForeground(Color.BLACK);
									
									text_42.setText(Character.toString(input.charAt(2)).toUpperCase());
									text_42.setBackground(Color.GREEN);
									text_42.setForeground(Color.BLACK);
									
									text_43.setText(Character.toString(input.charAt(3)).toUpperCase());
									text_43.setBackground(Color.GREEN);
									text_43.setForeground(Color.BLACK);
									
									text_44.setText(Character.toString(input.charAt(4)).toUpperCase());
									text_44.setBackground(Color.GREEN);
									text_44.setForeground(Color.BLACK);
									break;
								}
								tryCount = 5;
							}else {// if we guess wrong
								
								int[] arr = result(word, input); //get the result as an array
								
								switch(tryCount) {
								case 1://set rows as right									
									text_00.setText(Character.toString(input.charAt(0)).toUpperCase());
									text_00.setBackground(bgColor(arr[0]));
									text_00.setForeground(fgColor(arr[0]));
									
									
									text_01.setText(Character.toString(input.charAt(1)).toUpperCase());
									text_01.setBackground(bgColor(arr[1]));
									text_01.setForeground(fgColor(arr[1]));
									
									
									text_02.setText(Character.toString(input.charAt(2)).toUpperCase());
									text_02.setBackground(bgColor(arr[2]));
									text_02.setForeground(fgColor(arr[2]));
									
									text_03.setText(Character.toString(input.charAt(3)).toUpperCase());
									text_03.setBackground(bgColor(arr[3]));
									text_03.setForeground(fgColor(arr[3]));
									
									text_04.setText(Character.toString(input.charAt(4)).toUpperCase());
									text_04.setBackground(bgColor(arr[4]));
									text_04.setForeground(fgColor(arr[4]));
									break;
								case 2://set rows as right
									text_10.setText(Character.toString(input.charAt(0)).toUpperCase());
									text_10.setBackground(bgColor(arr[0]));
									text_10.setForeground(fgColor(arr[0]));
									
									text_11.setText(Character.toString(input.charAt(1)).toUpperCase());
									text_11.setBackground(bgColor(arr[1]));
									text_11.setForeground(fgColor(arr[1]));
									
									text_12.setText(Character.toString(input.charAt(2)).toUpperCase());
									text_12.setBackground(bgColor(arr[2]));
									text_12.setForeground(fgColor(arr[2]));
									
									text_13.setText(Character.toString(input.charAt(3)).toUpperCase());
									text_13.setBackground(bgColor(arr[3]));
									text_13.setForeground(fgColor(arr[3]));
									
									text_14.setText(Character.toString(input.charAt(4)).toUpperCase());
									text_14.setBackground(bgColor(arr[4]));
									text_14.setForeground(fgColor(arr[4]));
									break;
								case 3://set rows as right
									text_20.setText(Character.toString(input.charAt(0)).toUpperCase());
									text_20.setBackground(bgColor(arr[0]));
									text_20.setForeground(fgColor(arr[0]));
									
									text_21.setText(Character.toString(input.charAt(1)).toUpperCase());
									text_21.setBackground(bgColor(arr[1]));
									text_21.setForeground(fgColor(arr[1]));
									
									text_22.setText(Character.toString(input.charAt(2)).toUpperCase());
									text_22.setBackground(bgColor(arr[2]));
									text_22.setForeground(fgColor(arr[2]));
									
									text_23.setText(Character.toString(input.charAt(3)).toUpperCase());
									text_23.setBackground(bgColor(arr[3]));
									text_23.setForeground(fgColor(arr[3]));
									
									text_24.setText(Character.toString(input.charAt(4)).toUpperCase());
									text_24.setBackground(bgColor(arr[4]));
									text_24.setForeground(fgColor(arr[4]));
									break;
								case 4://set rows as right
									text_30.setText(Character.toString(input.charAt(0)).toUpperCase());
									text_30.setBackground(bgColor(arr[0]));
									text_30.setForeground(fgColor(arr[0]));
									
									text_31.setText(Character.toString(input.charAt(1)).toUpperCase());
									text_31.setBackground(bgColor(arr[1]));
									text_31.setForeground(fgColor(arr[1]));
									
									text_32.setText(Character.toString(input.charAt(2)).toUpperCase());
									text_32.setBackground(bgColor(arr[2]));
									text_32.setForeground(fgColor(arr[2]));
									
									text_33.setText(Character.toString(input.charAt(3)).toUpperCase());
									text_33.setBackground(bgColor(arr[3]));
									text_33.setForeground(fgColor(arr[3]));
									
									text_34.setText(Character.toString(input.charAt(4)).toUpperCase());
									text_34.setBackground(bgColor(arr[4]));
									text_34.setForeground(fgColor(arr[4]));
									break;
								case 5://set rows as right
									text_40.setText(Character.toString(input.charAt(0)).toUpperCase());
									text_40.setBackground(bgColor(arr[0]));
									text_40.setForeground(fgColor(arr[0]));
									
									text_41.setText(Character.toString(input.charAt(1)).toUpperCase());
									text_41.setBackground(bgColor(arr[1]));
									text_41.setForeground(fgColor(arr[1]));
									
									text_42.setText(Character.toString(input.charAt(2)).toUpperCase());
									text_42.setBackground(bgColor(arr[2]));
									text_42.setForeground(fgColor(arr[2]));
									
									text_43.setText(Character.toString(input.charAt(3)).toUpperCase());
									text_43.setBackground(bgColor(arr[3]));
									text_43.setForeground(fgColor(arr[3]));
									
									text_44.setText(Character.toString(input.charAt(4)).toUpperCase());
									text_44.setBackground(bgColor(arr[4]));
									text_44.setForeground(fgColor(arr[4]));
									break;
								}
							}
						}
					}
				}				
			}
		});
		
		//Yeni oyun event
		btn_basla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Clear boxes
				text_input.setText("");
				
				text_00.setText("");
				text_00.setBackground(Color.BLACK);
				
				text_01.setText("");
				text_01.setBackground(Color.BLACK);
				
				text_02.setText("");
				text_02.setBackground(Color.BLACK);
				
				text_03.setText("");
				text_03.setBackground(Color.BLACK);
				
				text_04.setText("");
				text_04.setBackground(Color.BLACK);
				
				text_10.setText("");
				text_10.setBackground(Color.BLACK);
				
				text_11.setText("");
				text_11.setBackground(Color.BLACK);
				
				text_12.setText("");
				text_12.setBackground(Color.BLACK);
				
				text_13.setText("");
				text_13.setBackground(Color.BLACK);
				
				text_14.setText("");
				text_14.setBackground(Color.BLACK);
				
				text_20.setText("");
				text_20.setBackground(Color.BLACK);
				
				text_21.setText("");
				text_21.setBackground(Color.BLACK);
				
				text_22.setText("");
				text_22.setBackground(Color.BLACK);
				
				text_23.setText("");		
				text_23.setBackground(Color.BLACK);
				
				text_24.setText("");
				text_24.setBackground(Color.BLACK);
				
				text_30.setText("");
				text_30.setBackground(Color.BLACK);
				
				text_31.setText("");
				text_31.setBackground(Color.BLACK);
				
				text_32.setText("");
				text_32.setBackground(Color.BLACK);
				
				text_33.setText("");		
				text_33.setBackground(Color.BLACK);
				
				text_34.setText("");
				text_34.setBackground(Color.BLACK);
				
				text_40.setText("");
				text_40.setBackground(Color.BLACK);
				
				text_41.setText("");
				text_41.setBackground(Color.BLACK);
				
				text_42.setText("");
				text_42.setBackground(Color.BLACK);
				
				text_43.setText("");		
				text_43.setBackground(Color.BLACK);
				
				text_44.setText("");
				text_44.setBackground(Color.BLACK);
				
				//get random word
				try {
					word = getWord();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				System.out.println(word);
				tryCount = 0;
			}
		});
	}
	
	
	//function to find random word
	String getWord() throws IOException {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 5555); //pick a random line number
		String line = "";
		try {
			FileInputStream fs= new FileInputStream("words_TR.txt"); //open the file
			BufferedReader br = new BufferedReader(new InputStreamReader(fs));			
			for(int i = 0; i < randomNum - 1; ++i)  br.readLine(); //read lines until get to the random line number
			line = br.readLine(); //get random word
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}
	
	//function to return result
	int[] result(String word, String input) {		
		int[] arr = new int[word.length()];//create an array to return
		for(int x=0; x<input.length(); x++) {
			arr[x] = 0; //set 0 as default
			for(int y=0; y<word.length(); y++) {
				if(input.charAt(x) == word.charAt(y)) {
					arr[x] = 1; //check if this char is in word					
					break;
				}
			}
			if(input.charAt(x) == word.charAt(x)) arr[x] = 2;
		}
		return arr;
	}
	
	//try is correct or not
	boolean isCorrect(String word, String input){
		if(word.length() != input.length()) return false; // check the size of word and input
		for(int x=0; x<word.length(); x++) {
			if(word.charAt(x) != input.charAt(x)) return false; //if any char is different return false
		}
		return true;
	}
	
	//return bg color
	Color bgColor (int x) {
		switch(x) {
		case 0:										
			return Color.BLACK;
		case 1:
			return Color.YELLOW;
		case 2:
			return Color.GREEN;
		default:
			return Color.BLACK;
		}
	}
	
	//return fg color
	Color fgColor (int x) {
		switch(x) {
		case 0:										
			return Color.WHITE;
		case 1:
			return Color.BLACK;
		case 2:
			return Color.BLACK;
		default:
			return Color.BLACK;
		}
	}
}
