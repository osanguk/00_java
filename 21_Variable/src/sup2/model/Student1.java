package sup2.model;

public class Student1 {
	String 이름;
	int 학년;
	int 반;
	int 번호;
	char 성별;
	double 성적;
	
	
	public Student1(String 이름, int 학년, int 반, int 번호, char 성별, double 성적) {
		super();
		this.이름 = 이름;
		this.학년 = 학년;
		this.반 = 반;
		this.번호 = 번호;
		this.성별 = 성별;
		this.성적 = 성적;
	}
	private void 결과() {
		String 성별1 = (성별 == 'M') ? "남":"녀";
		System.out.println("이름 : " +이름);
		System.out.println("학년 : " +학년 );
		System.out.println("반" + 반);
		System.out.println("번호 " + 번호);
		System.out.println("성별" + 성별);
		System.out.println("성적" + 성적);

	}
	
	
	

}
