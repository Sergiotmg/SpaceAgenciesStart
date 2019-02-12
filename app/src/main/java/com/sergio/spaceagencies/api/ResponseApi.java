package com.sergio.spaceagencies.api;

import com.sergio.spaceagencies.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ResponseApi {
    // metodos para hacer las peticiones a las paginas web
    @GET("agency")
    // siempre buscamos en Madrid pero podria cambiarse el 766273
    Call<ResponseModel> loadAgencies();

}
