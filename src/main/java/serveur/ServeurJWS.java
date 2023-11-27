package serveur;
import javax.xml.ws.Endpoint;
import service.CalculatriceWS; // Importez votre classe CalculatriceWS

public class ServeurJWS {
    public static void main(String[] args) {
        // Spécifiez l'URL pour publier le service
        String url = "http://localhost:8080/calculatrice";

        // Créez une instance de votre service web
        CalculatriceWS calculatrice = new CalculatriceWS();

        // Publiez le service web à l'URL spécifiée
        Endpoint.publish(url, calculatrice);

        // Affichez un message pour indiquer que le service est publié
        System.out.println("Service web CalculatriceWS publié à : " + url);
    }
}
