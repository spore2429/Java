package day0630;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingLay_09 extends JFrame implements ActionListener{

	Container cp;
	JButton btn1,btn2,btn3;

	public SwingLay_09(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 100, 300, 400);
		cp.setBackground(new Color(255,255,100));
		setDesign();
		setVisible(true);
	}

	//디자인
	public void setDesign()
	{
		//기본레이아웃 변경
		this.setLayout(new FlowLayout());
		//버튼 생성
		btn1=new JButton("버튼 #1");
		btn2=new JButton("버튼 #2");
		btn3=new JButton("버튼 #3");

		//프레임에 추가
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);

		//버튼 속성
		btn1.setBackground(Color.cyan);
		btn2.setBackground(Color.PINK);
		btn3.setBackground(Color.ORANGE);

		//버튼에 이벤트 발생
		//이벤트 핸들러랑 이벤트 발생객체 연결
		btn1.addActionListener(this);//상속받았으니까 this
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}

	//액션
	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob=e.getSource();//어떤 메서드로 호출하는지 명확하게 주기위해서

		//메세지 다이얼로그 형태로 보여주기

		//JOptionPane.showMessageDialog(this, "버튼클릭"); //부모는 super 안씀

		if(ob==btn1)
			JOptionPane.showMessageDialog(this, "1번째 버튼클릭");

		else if(ob==btn2)
			JOptionPane.showMessageDialog(this, "2번째 버튼클릭");

		else if(ob==btn3) //명확하게 객체를 주기위하여 else if
			JOptionPane.showMessageDialog(this, "3번째 버튼클릭");	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingLay_09("레이아웃 이벤트");

	}


}
