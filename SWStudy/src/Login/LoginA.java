package Login;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginA extends JFrame {

   private JPanel contentPane;
   private JTextField txtID; //전역
   private JTextField txtPW;
   private JButton btnNewButton;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
            	LoginA frame = new LoginA();
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
   public LoginA() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("ID");
      lblNewLabel.setBounds(73, 155, 62, 18);
      contentPane.add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("Password");
      lblNewLabel_1.setBounds(73, 195, 62, 18);
      contentPane.add(lblNewLabel_1);
      
      txtID = new JTextField();
      txtID.setBounds(149, 152, 116, 24);
      contentPane.add(txtID);
      txtID.setColumns(10);
      
      txtPW = new JTextField();
      txtPW.setBounds(149, 192, 116, 24);
      contentPane.add(txtPW);
      txtPW.setColumns(10);
      
      btnNewButton = new JButton("버튼");
      btnNewButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            //----------------------------------
            dispose(); //지금창 해제//프레임을 닫는 것
            setVisible(false);//지금창 안보이게
            String id=txtID.getText(); ////////////////
            String pw=txtPW.getText(); 
            new LoginB(id,pw).setVisible(true); 
            //-----------------------------------
         }
         
      });
      btnNewButton.setBounds(91, 71, 105, 27);
      contentPane.add(btnNewButton);
   }
}