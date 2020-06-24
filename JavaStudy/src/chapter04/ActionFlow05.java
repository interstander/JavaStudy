package chapter04;

public class ActionFlow05 {

	public static void main(String[] args) {
		//02. switch
		String lang = "Java";
		switch(lang) {
		case "Python":
			System.out.println("파이썬 입니다.");
			break;
		case "Java":
			System.out.println("자바 입니다.");
			break;
		case "C#":
			System.out.println("씨샵 입니다.");
			break;
		case "C++":
			System.out.println("씨쁠쁠 입니다.");
			break;
		default :
			System.out.println("기타 언어입니다.");
		}

	}

}
