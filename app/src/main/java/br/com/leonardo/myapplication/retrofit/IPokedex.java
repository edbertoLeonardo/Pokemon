package br.com.leonardo.myapplication.retrofit;

import br.com.leonardo.myapplication.model.Pokedex;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IPokedex {
    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();
}
