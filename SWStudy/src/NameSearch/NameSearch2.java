package NameSearch;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;

public class NameSearch2 extends JFrame {

	private JPanel contentPane;
	private JTextField  textField;
	private JTextField textField_1;
	private JTextArea textArea1;
	private  JButton btnNewButton;// 전역 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameSearch2 frame = new NameSearch2();
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
	public NameSearch2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC80\uC0C9\uD560\uC774\uB984");
		lblNewLabel.setBounds(12, 10, 97, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if( e.getKeyCode() == KeyEvent.VK_ENTER ) { ///enter 이면
		      		try {
						kaja();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    	}
			}
		});
		textField.setBounds(121, 7, 116, 21);
		textField.setBackground(Color.GREEN);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//JButton 
		btnNewButton = new JButton("\uAC80\uC0C9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				if(e.getSource() == btnNewButton){ //버튼이 눌러졌으면(이벤트) 
		     		try {
						kaja();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}///////
		    	}//if-end
		    }//actionPerformed-end
			
			
			
			
			
			
			
 public void kaja() throws ClassNotFoundException, SQLException{////////
	textArea1.setText("");
	textField_1.setText("");
	Connection con = null;
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection
	       ("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
	textField_1.setText("db에 접속되었습니다");

	
	
	
	
	
	
	
	String sql = 
			  "select first_name, last_name,phone_number from employees"
			      + " where first_name = ?";

			        PreparedStatement st =  con.prepareStatement(sql);

			        st.setString(1, textField.getText());///////////

			        ResultSet rs = st.executeQuery();
			       // String str1="";
		            String str1=String.format("%20s\t%25s\n\n","[이   름]","[전 화 번 호]");                
		            if(rs.next()){/////////////////
			        	do{
			              String fname= rs.getString(1);//firstname
			   	          String lname = rs.getString(2);//lastname
			  	          String phone = rs.getString(3);//phone
			  	        
			  	          //str1 += fname+ " " + lname + "\t" +phone+"\n";
			  	          str1 += String.format("%-20s%-20s%-20s\n",fname,lname,phone);
		 	  	        }while(rs.next()); /////   	  	       
			        	textArea1.setText(str1);
			        } else 
			        	textArea1.setText("그런 이름은 없습니다");
			 	    con.close();
		 	 	    //tf2.setText("db접속해제");
				
			
		    }//kaja-end
		    public void keyPressed(KeyEvent e1) throws ClassNotFoundException, SQLException{//3개 추가(Key event)    	
		    	if( e1.getKeyCode() == KeyEvent.VK_ENTER ) { ///enter 이면
		      		kaja();
		    	}
		    }
		    public void keyReleased(KeyEvent e1) {//3개 추가(Key event)
		    	 
		    }
		    public void keyTyped(KeyEvent e1) {  //3개 추가(Key event)
		    	 
		    }
				
			//}
		});
		btnNewButton.setBounds(360, 6, 97, 23);
		btnNewButton.setBackground(Color.GREEN);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 35, 440, 330);
		contentPane.add(scrollPane);
		
		textArea1 = new JTextArea();
		textArea1.setBackground(Color.YELLOW);
		textArea1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(textArea1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.PINK);
		textField_1.setBounds(28, 402, 429, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

	protected void kaja() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		textArea1.setText("");
    	textField_1.setText("");
		Connection con = null;
	 	
	 		Class.forName("oracle.jdbc.driver.OracleDriver");
	 		con = DriverManager.getConnection
	 		        ("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
	 		textField_1.setText("db에 접속되었습니다");

	 		String sql = 
	  "select first_name, last_name,phone_number from employees"
	      + " where first_name = ?";

	        PreparedStatement st =  con.prepareStatement(sql);

	        st.setString(1, textField.getText());///////////

	        ResultSet rs = st.executeQuery();
	       // String str1="";
            String str1=String.format("%20s\t%25s\n\n","[이   름]","[전 화 번 호]");                
            if(rs.next()){/////////////////
	        	do{
	              String fname= rs.getString(1);//firstname
	   	          String lname = rs.getString(2);//lastname
	  	          String phone = rs.getString(3);//phone
	  	        
	  	          //str1 += fname+ " " + lname + "\t" +phone+"\n";
	  	          str1 += String.format("%-20s%-20s%-20s\n",fname,lname,phone);
 	  	        }while(rs.next()); /////   	  	       
	        	textArea1.setText(str1);
	        } else 
	        	textArea1.setText("그런 이름은 없습니다");
	 	    con.close();
 	 	    //tf2.setText("db접속해제");
		
	  
	}
}
