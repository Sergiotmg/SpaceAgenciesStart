package com.sergio.spaceagencies;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ResponseApi {
    // metodos para hacer las peticiones a las paginas web
    @GET("agency")
    // siempre buscamos en Madrid pero podria cambiarse el 766273
    Call<ResponseModel> loadAgencies();

}
