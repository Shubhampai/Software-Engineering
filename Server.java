import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField msg_text;
	private static JTextPane msg_area1;

	/**
	 * Launch the application.
	 */
	
	static ServerSocket ss;
	static Socket s;
	static DataInputStream din;
	static DataOutputStream dout;
	private JTextPane msg_area;
	private JLabel label;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		String msgin = "";
		
			try {
				
			ss = new ServerSocket(1201);//server starts at 1201 port no.
			s = ss.accept(); // now server will accept the connections
			
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			
			while(!msgin.equals("exit")) {
				msgin = din.readUTF();
				msg_area1.setText(msg_area1.getText().trim()+"\n\nShubham: "+msgin); // display message
				System.out.println("\n");
				
				
				
			}//while
		
		
		}catch(Exception e) {
			
			
			
		}//trycatch
		
		
	}
	public void clearFields() {
		msg_text.setText(null);
	}
	/**
	 * Create the frame.
	 */
	public Server() {
		setTitle("Hey Chat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		msg_text = new JTextField();
		msg_text.setBounds(10, 306, 252, 29);
		contentPane.add(msg_text);
		msg_text.setColumns(10);
		
		JButton msg_send = new JButton("Send");
		msg_send.setBackground(SystemColor.activeCaption);
		msg_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			try {
				String msgout = "";
				msgout = msg_text.getText().trim();//sending the message from server to client
				dout.writeUTF(msgout);
				
			
			clearFields();
			}catch(Exception e) {
				
				
			}
			
			
			
			}
		});
		msg_send.setBounds(276, 306, 67, 29);
		contentPane.add(msg_send);
		
		JLabel lblServer = new JLabel("Josline Johnson");
		lblServer.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 17));
		lblServer.setBounds(10, 11, 149, 17);
		contentPane.add(lblServer);
		
		msg_area1 = new JTextPane();
		msg_area1.setEditable(false);
		msg_area1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		msg_area1.setBounds(10, 63, 329, 232);
		contentPane.add(msg_area1);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Shubham\\Downloads\\girl (2).png"));
		label.setBounds(276, 0, 67, 64);
		contentPane.add(label);
	}
}
