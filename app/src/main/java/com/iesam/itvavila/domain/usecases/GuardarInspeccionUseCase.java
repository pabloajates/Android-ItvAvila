package com.iesam.itvavila.domain.usecases;

import com.iesam.itvavila.data.InspeccionDataStore;
import com.iesam.itvavila.data.PropietarioDataStore;
import com.iesam.itvavila.domain.models.Inspeccion;
import com.iesam.itvavila.domain.models.Propietario;

public class GuardarInspeccionUseCase {
    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public void execute(Inspeccion model) {
        dataStore.guardar(model);
    }
}