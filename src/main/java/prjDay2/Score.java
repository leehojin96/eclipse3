package prjDay2;

public class Score {
	private String name ;
	private	int kor;
	private int eng;
	int total;
	double avg;

	
	//생성자
	public Score() {
		
	}
	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	//매서드
	
	//평균 매서드
	public void  avg() {
		total = kor + eng;
		avg = total /2.0;	
	}
	
	//출력매서드
	public String getPritInfo1() {		
		String a = name+" : 국어 "+kor+"점, 영어 "+eng+"점";	
		return a;
	}
	
	public String getPritInfo2() {		
		String b = "총 점수 : 합계 "+total+"점, 평균 "+avg+"점";		
		return  b;
	}
	public void pritInfo2() {
		//이것은 콘솔에서만 출력이됨
		//밖으로 가져나갈려면 return해서 값을 가지고 나가야함
		//투스트링타입 으로 출력 하면됨 
		System.out.println(name+" : 국어 "+kor+"점, 영어 "+eng+"점");
		System.out.println(name+" : 국어 "+kor+"점, 영어 "+eng+"점");
		System.out.println("\n"+"요고슨 어디서 출력이 될랑가?");
		
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", total=" + total + ", avg=" + avg + "]";
	}
	
	


}
