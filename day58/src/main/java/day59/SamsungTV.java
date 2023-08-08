package day59;

public class SamsungTV implements TV {

	private Remote remote;
	// 1. 의존관계 발생
	// 2. 의존 주입(DI)
	//  1) 생성자 주입
	//  2) setter 주입
	// 3. 설정(.xml)
	//  : POJO -> 스프링 컨테이너한테 설정을 해야하므로 applicationContext.xml
	//  만약에 not POJO(서블릿)였다면 서블릿 컨테이너(톰캣)한테 설정을 해야하므로 web.xml
	
	public SamsungTV() {
		System.out.println("삼성TV 기본생성자");
	}
	public SamsungTV(Remote remote) { // 생성자 DI(2-1)을 위한 생성자를 오버로딩
		this.remote=remote;
		System.out.println("삼성TV 생성자");
	}
	
	@Override
	public void funcA() {
		remote.funcA();
		System.out.println("SamsungTV 전원 ON/OFF");
	}

	@Override
	public void funcB() {
		remote.funcB();
		System.out.println("SamsungTV 채널변경");
	}

}
