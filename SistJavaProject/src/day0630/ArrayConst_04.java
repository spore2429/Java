package day0630;

//추상특화
abstract class Game{
	
	abstract void play();
	abstract void stop();
}
//////////////////////////////////////////
class SungHyeon extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("성현이가 게임을 합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("성현이가 게임을 종료합니다");
	}
	
}
//////////////////////////////////////////
class SunYeong extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("순영이가 게임을 합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("순영이가 게임을 종료합니다");
	}

}
//////////////////////////////////////////
class SunBum extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("선범이가 게임을 합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("선범이가 게임을 종료합니다");
	}

}
//////////////////////////////////////////
public class ArrayConst_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열선언
		 Game[]game=new Game[3];
		
		
		
		//각각의 sub로 생성
        game[0]=new SunBum();
        game[1]=new SunYeong();
        game[2]=new SungHyeon(); 
        
        
		//for ++
		for(int i=0;i<game.length;i++)
		{
			game[i].play();
		}

		System.out.println("==========================");
		
		//for --
		for(int i=game.length-1;i>=0;i--)//번지수는 0~2까지 
		{
			game[i].stop();
		}

	
	
	}

}
