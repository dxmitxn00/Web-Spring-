package Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("samsung")
public class Samsung implements TV {
	
	@Autowired
	private Ai ai;
	
	public Samsung() {
		System.out.println("아리아 ~");
	}
	
	public Samsung(Ai ai) {
		System.out.println("아리아 ~");
		this.ai = ai;
		System.out.println(ai + " 네. 무엇을 도와드릴까요?");
	}
	
	public void onOff() {
		ai.onOff();
	}
	
	public void chUp() {
		System.out.println(ai + "채널을 +1 합니다.");
	}
	public void chDown() {
		System.out.println(ai + "채널을 -1 합니다.");
	}
	public void volUp() {
		System.out.println(ai + "볼륨을 +1 합니다.");
	}
	public void volDown() {
		System.out.println(ai + "볼륨을 -1 합니다.");
	}
}
