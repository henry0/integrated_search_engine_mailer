package integrated_search_engine_mailer.mail;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ISEEmailTest {

	public static void main(String[] args) {
		String configFile = "isem-bean.xml";
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		ISEEMailAPI iseeMailAPI = (ISEEMailAPI) context.getBean("ISEEMail");
		String toAddress = "henry.0th@gmail.com";
		String fromAddress = "henry8th@naver.com";
		
		String subject = "test isem mail";
		String body = " 문서제목: 2014-삼성화재 제안서.docx    작성자: 김개똥    프로젝트: 삼성화재    다운로드 승인: [허용<URL>] / [거부<URL>] ";
		
		iseeMailAPI.readyToSendEmail(toAddress, fromAddress, subject, body);
	}
}
