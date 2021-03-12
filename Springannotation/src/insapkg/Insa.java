package insapkg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("insa10")
public class Insa {
//	@Autowired @Value("홍길동")
	@Value("홍길동")
	private String name;

	@Value("12")
	private int years;
	
	public String helloName(String str1) {
		return this.name + " 님\n" + str1 + this.years;
	}

}
