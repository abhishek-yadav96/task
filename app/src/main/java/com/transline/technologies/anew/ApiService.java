package com.transline.technologies.anew;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("demos/marvel")
    Call<List<Superhero>> getSuperheroes(); // Define your endpoint here
}
