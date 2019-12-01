package com.example.pretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Dataservice {

    @GET("E14trR2lD")
    Call<Pokemon> getPokemons();

    @GET("NympVMn2P")
    Call<List<Pokemon_>> getPArray();

}
