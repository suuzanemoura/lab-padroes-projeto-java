package io.github.suuzanemoura.facade;

import io.github.suuzanemoura.subsistema1.crm.CrmService;
import io.github.suuzanemoura.subsistema2.cep.CepApi;

public class Facade {

    public void migrateCustomer(String nome, String cep) {
        String cidade = CepApi.getInstancia().recoverCity(cep);
        String estado = CepApi.getInstancia().recoverState(cep);

        CrmService.saveCustomer(nome, cep, cidade, estado);
    }
}