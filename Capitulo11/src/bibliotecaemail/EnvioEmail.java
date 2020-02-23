package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnvioEmail {

	static void enviar(String destinatario, String assunto, String mensagem) throws EmailException {
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("estudosricardo2020@gmail.com", "ricardoestudos"));
		email.setSSLOnConnect(true);
		email.setFrom("estudosricardo2020@gmail.com");
		email.setSubject(assunto);
		email.setMsg(mensagem);
		email.addTo(destinatario);
		email.send();
	}
}


