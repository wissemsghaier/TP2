package service;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;

@WebService
public class CalculatriceWS {
    @WebMethod
    public int somme(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a + b;
    }

    @WebMethod
    public int multiplication(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a * b;
    }
}
