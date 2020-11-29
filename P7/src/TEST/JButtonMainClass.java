package TEST;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class JButtonClass extends JFrame  implements ActionListener{
	    
	//label
	JLabel jl1 = new JLabel("KG방송주관");
	JLabel jl2 = new JLabel("비담선발대회");
	JLabel jl3 = new JLabel("잘한 코너들은");
	
	//button
	JButton jb1 = new JButton("노래 10점");
	JButton jb2 = new JButton("댄스 20점");
	JButton jb3 = new JButton("영어웅변  30점");
	JButton jb4 = new JButton("철인삼종경기100점");
	JButton jb5 = new JButton("미로탈출 90점");
	JButton jb6 = new JButton("개그  80점");
	JButton jb7 = new JButton("총점수는?");
	JButton jb8 = new JButton("취소");
	
	//combobox
	String[] age1={"나는 10대", "나는 20대", "나는 30대이상"};
	JComboBox jcb1=new  JComboBox(age1);
	
		
	String hangmok="";//빈문자열 
	int jum=0;
	
	public JButtonClass() {//생성자 
		setLayout(new GridLayout(0, 3, 30, 30));////////////////

		     //KG방송 주관 비담 선발대회  꾸미기 
		jl1.setFont(new Font("굴림",Font.BOLD,25));//라벨 글씨 꾸미기
    	add(jl1);
        jl2.setFont(new Font("굴림",Font.BOLD,25));
        add(jl2);
        jl3.setFont(new Font("굴림",Font.BOLD,25));
    	add(jl3); 
    	
    	
    	jb1.addActionListener(this); //버튼을 모두 이벤트로 등록////////////
    	add(jb1);                    //창에 버튼을 add  
    	jb2.addActionListener(this);
    	add(jb2);
        jb3.addActionListener(this);
    	add(jb3);
        jb4.addActionListener(this);
    	add(jb4);
        jb5.addActionListener(this);
    	add(jb5);
        jb6.addActionListener(this);  
    	add(jb6);    
    	
    	
    	
    	
    	
    	
    	
    	//총점수는 버튼 , 취소버튼 , 콤보박스 디자인및 이벤트등록 
    	 jcb1.addActionListener(this);//콤보박스
         add(jcb1);
    	
    	jb7.setFont(new Font("굴림",Font.BOLD,30)); // "총점수는" 버튼 
     	jb7.setForeground(Color.red);   //"총점수는" 버튼에 color넣기 
        jb7.setBackground(Color.cyan);
        jb7.addActionListener(this);
    	add(jb7);
    	
        jb8.setFont(new Font("굴림",Font.BOLD,30)); //"취소" 버튼 
        jb8.setForeground(Color.blue);  //"취소" 버튼에 color 넣기 
        jb8.setBackground(Color.yellow);
        jb8.addActionListener(this);
    	add(jb8);                       
         	
        setTitle("KG방송국");
		setSize(700, 700);
		setVisible(true);
	} //생성자-end 
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1) {  //노래          //(항목기억창고에) 
			hangmok+=jb1.getText()+"\n";     //노래 10점 
			jum=jum+10;                      //영어웅변  30점  
			}
		if(e.getSource()==jb2) {//댄스 
			hangmok+=jb2.getText()+"\n";
			jum=jum+20;
		}	
		if(e.getSource()==jb3) {//영어웅변 
			hangmok+=jb3.getText()+"\n";
			jum=jum+30;
		}	
		if(e.getSource()==jb4) {
			hangmok+=jb4.getText()+"\n";
			jum=jum+100;
		}	
		if(e.getSource()==jb5) {
			hangmok+=jb5.getText()+"\n";
			jum=jum+90;
		}	
		if(e.getSource()==jb6) {//점수를 획득하는 6개 종목 처리 완료 
			hangmok+=jb6.getText()+"\n";
			jum=jum+80;
		}	
		if(e.getSource()==jcb1) { //콤보박스 
     JOptionPane.showMessageDialog(jcb1, (String) jcb1.getSelectedItem()+"이시군요");
		   //누르면 나이대 메시지 출력으로 설문응대 나이대 조사 끝 
		    jum=jum+10;//설문 응대자에게는  10점줌
			}
		
		if(e.getSource()==jb7) {//"총점수는" 을 누른경우 
             String msg1=hangmok+"총점수는"+String.valueOf(jum)+ "점";
             JOptionPane.showMessageDialog(jb7,msg1); 
                                     
	           hangmok=""; //전 처리내용 초기화 
               jum=0;
 	   }
	   if(e.getSource()==jb8) { //"취소"버튼
		    hangmok="";
		    jum=0;
	         JOptionPane.showMessageDialog(jb8,"취소했습니다");
	}
	
	
  }//actionPerformed-end
}//JButtonClass-end 

public class JButtonMainClass {// JButtonMainClass .java
	public static void main(String args[]) {
		new JButtonClass();
	}
}//JButtonMainClass-end















