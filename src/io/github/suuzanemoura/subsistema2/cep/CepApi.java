package io.github.suuzanemoura.subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recoverCity(String cep) {
        return "Rio de Janeiro";
    }

    public String recoverState(String cep) {
        return "RJ";
    }

}
