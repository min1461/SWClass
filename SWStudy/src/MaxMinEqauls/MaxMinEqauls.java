package MaxMinEqauls;

public class MaxMinEqauls {
	public static void main(String[] args) {
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
//		System.out.println(Boolean.MAX_VALUE);
//		System.out.println(Boolean.MIN_VALUE);	// Boolean은 True,False
		
		String ppp = null;
		String qqq = "";	// 빈문자열, 길이가 0인 문자열
//		System.out.println(ppp.length()>0);	// Exception in thread "main" java.lang.NullPointerException
		System.out.println(qqq.length()>0);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		String aa = "ondal";
		String bb = "ondal";
		String cc = new String("ondal");
		String dd = new String("ondal");
			// '==' String 주소값 같은지 확인  
			// '.equals'String 내용이 같은지 확인
		System.out.println(aa==bb);				//	aa와 bb의 주소값 비교 
		System.out.println(aa==cc);				//	aa와 cc의 주소값 비교
		System.out.println(aa.equals(bb));		//	aa와 bb의 내용 비교
		System.out.println(aa.equals(cc));		//	aa와 cc의 내용 비교
		System.out.println(cc==dd);				//	cc와 dd의 주소값 비교
		System.out.println(cc.equals(dd));		//	cc와 dd의 내용 비교
	}
}
