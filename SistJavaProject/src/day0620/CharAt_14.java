package day0620;

public class CharAt_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String juminNum="971234-13213458";
		//index순서 01234567.....
		char seventh=juminNum.charAt(7);
		
		//System.out.println(seventh);
		//남자입니다 or 여자입니다 or 2000년 이후 남자입니다 or 2000년 이후 여자입니다
		
		    if(seventh =='1') 
			System.out.println("남자입니다");
			else if(seventh =='2')
				System.out.println("여자입니다");
			else if(seventh =='3')
				System.out.println("2000년이후 남자입니다");
			else if(seventh =='4')
				System.out.println("2000년이후 여자입니다");
			else
				System.out.println("오류입니다");


		                     
		/*switch(seventh)
		{
		case '1':
			System.out.println("남자입니다");
			break;
		case '2':
			System.out.println("여자입니다");
			break;
		case '3':
			System.out.println("2000년이후 남자입니다");
			break;
		case '4':
			System.out.println("2000년이후 여자입니다");
			break;
		default:
			System.out.println("오류입니다");
			break;
		}*/
	             
		
		
	
	
	
	}
	}

