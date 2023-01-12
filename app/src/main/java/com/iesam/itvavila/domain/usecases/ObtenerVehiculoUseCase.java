package com.iesam.itvavila.domain.usecases;

import com.iesam.itvavila.data.VehiculoDataStore;
import com.iesam.itvavila.domain.models.Camion;
import com.iesam.itvavila.domain.models.Vehiculo;

public class ObtenerVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public Vehiculo execute(String matricula) {
        return dataStore.buscar(matricula);
    }
}