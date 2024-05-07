package sup1.controller;

public class Score {
	private int 국어;
	private int 영어;
	private int 수학;
	private int 총점;
	private double 평균;
	
	public void set국어(int 국어) {
		this.국어 = 국어;
	}
	public void set영어(int 영어) {
		this.영어 = 영어;
	}
	public void set수학(int 수학) {
		this.수학 = 수학;
	}
	public void set총점(int 총점) {
		this.총점 = 총점;
	}
	public void set평균(double 평균) {
		this.평균 = 평균;
	}
	public int get국어() {
		return 국어;
	}
	public int get영어() {
		return 영어;
	}
	public int get수학() {
		return 수학;
	}
	public int get총점() {
		return 총점;
	}
	public double get평균() {
		return 평균;
	}
	public void 결과() {
		총점 = 국어+영어+수학;
		평균 = 총점 / 3.0;
		
		String 결과 = (국어 >= 50 && 수학 >=50 && 영어>=50 && 평균>50);
	}
	
	
}
