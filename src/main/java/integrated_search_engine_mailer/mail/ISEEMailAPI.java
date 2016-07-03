package integrated_search_engine_mailer.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service("ISEEMail")
public class ISEEMailAPI {

	@Autowired
	private MailSender iseemail;
	
	public void readyToSendEmail(String toAddress, String fromAddress, String subject, String msgBody) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(fromAddress);
		message.setTo(toAddress);
		message.setSubject(subject);
		message.setText(msgBody);
		iseemail.send(message);
	}
}
