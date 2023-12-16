package day0628;

import java.util.Scanner;

public class SawonMain {

	public static void getSawon(Sawon[]sawon)
	{
		//제목 for each
		Sawon.getTitle();

		for(Sawon s1:sawon)
		{
			System.out.println(s1.getSawonName()+"\t"+s1.getPay()+"\t"
				+s1.getFamsu()+"\t"+s1.getTimesu()+"\t"+s1.getFamilySudang()
				+"\t"+s1.getTimeSudang()+"\t"+s1.getTotalPay());	

		}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int inwon; //몇명인지 입력

		Sawon[]sawon;

		System.out.println("입력할 직원수는?");
		inwon=Integer.parseInt(sc.nextLine()); //버퍼걸려서 형변환

		//배열할당
		sawon=new Sawon[inwon];

		//인원수만큼 데이타 입력
		for(int i=0;i<inwon;i++)//length할필요x
		{
			//sawon생성
			sawon[i]=new Sawon();

			System.out.println("사원명?");
			String name=sc.nextLine();
			System.out.println("급여는?");
			int pay=Integer.parseInt(sc.nextLine());
			System.out.println("가족수는?");
			int fs=Integer.parseInt(sc.nextLine());
			System.out.println("초과시간?");
			int ts=Integer.parseInt(sc.nextLine());

			//setter로 sawon클래스에 데이타를 넣기
			sawon[i].setSawonName(name);
			sawon[i].setPay(pay);
			sawon[i].setFamsu(fs);
			sawon[i].setTimesu(ts);


           //출력
		
			getSawon(sawon);
		}
		
	}

}
