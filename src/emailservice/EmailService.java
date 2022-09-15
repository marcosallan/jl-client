package emailservice;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailService {
    private String companyEmail = "";
    private String passwordEmail = "";
    private SimpleEmail email = null;
    
    public EmailService() throws EmailException {
        companyEmail = "";
        passwordEmail = "";
    
        email = new SimpleEmail();
        
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(companyEmail, passwordEmail));
        email.setSSLOnConnect(true);
        
        email.setFrom(companyEmail);
        email.setSubject("Locação de veículo - JL Rent a Car");
    }
    
    public void sendStartRentMsg(String clientEmail, String[] datas) throws EmailException, IllegalStateException {
        String strToEmail = "";
        strToEmail = "Sua locação na JL Rent a Car foi realizada. Seguem os dados:\n\n";
        strToEmail += "Id da locação: " + datas[0] + "\n";
        strToEmail += "Veículo locado: " + datas[1] + "\n";
        strToEmail += "Momento da locação: " + datas[2] + "\n";
        strToEmail += "Devolução para: " + datas[3] + "\n";
        strToEmail += String.format("Valor previsto: R$ %.2f", Double.parseDouble(datas[4]));
        email.setMsg(strToEmail);
        email.addTo(clientEmail);
        email.send();
    }
    
    public void sendFinishRentMsg(String clientEmail, String[] datas) throws EmailException, IllegalStateException {
        String strToEmail = "";
        strToEmail = "Sua locação na JL Rent a Car foi finalizada. Seguem os dados:\n\n";
        strToEmail += "Id da locação: " + datas[0] + "\n";
        strToEmail += "Veículo locado: " + datas[1] + "\n";
        strToEmail += "Momento da locação: " + datas[2] + "\n";
        strToEmail += "Momento da devolução: " + datas[3] + "\n";
        strToEmail += String.format("Valor pago: R$ %.2f\n\n", Double.parseDouble(datas[4]));
        strToEmail += "Agradecemos a preferência !";
        email.setMsg(strToEmail);
        email.addTo(clientEmail);
        email.send();
    }
}
