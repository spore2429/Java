package day0630;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingNullLay_10 extends JFrame implements ActionListener{

	Container cp;
	JButton btn1,btn2;

	public SwingNullLay_10(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 100, 300, 400);
		//cp.setBackground(new Color(255,255,100));
		cp.setBackground(Color.CYAN);
		setDesign();
		setVisible(true);
	}

	//디자인
	private void setDesign() {

		//기존레이아웃 없애기
		this.setLayout(null);

		btn1=new JButton("◀");
		btn2=new JButton("▶");

		//위치 직접 지정
		btn1.setBounds(50, 100, 80, 30);
		btn2.setBounds(150, 100, 80, 30);

		//프레임추가
		this.add(btn1);
		this.add(btn2);

		//색상
		btn1.setBackground(Color.blue);
		btn2.setBackground(Color.green);
		btn1.setForeground(Color.green);
		btn2.setForeground(Color.blue);

		//버튼에 이벤트 발생
		btn1.addActionListener(this);
		btn2.addActionListener(this);

	}

	//액션//메서드 안에만 안들어가면됨
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();

		if(ob==btn1)
			JOptionPane.showMessageDialog(this, "뒤로가기 버튼클릭");

		else if(ob==btn2)
			JOptionPane.showMessageDialog(this, "앞으로가기 버튼클릭");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingNullLay_10("레이아웃 없이 만들기");


	}
}
