package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {

		EnvioEmail.enviar("ritiny@gmail.com", "Aula sobre uso de biblioteca de terceiros",
				"Se recebeu esse e-mail é porque funcionou o envio");
	}

}
