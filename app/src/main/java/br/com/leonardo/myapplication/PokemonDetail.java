 package br.com.leonardo.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import br.com.leonardo.myapplication.common.Common;
import br.com.leonardo.myapplication.model.Pokemon;


public class PokemonDetail extends Fragment {

    ImageView pokemomImage;
    TextView pokemonName, pokemonHeight, pokemonWeight;
    RecyclerView recyclerType, recyclerWekness, recyclerNextEvolution, recyclerPreEvolution;

    static PokemonDetail instance;

    public static PokemonDetail getInstance() {
        if (instance == null)
            instance = new PokemonDetail();
        return instance;
    }



    public PokemonDetail() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_pkemon_detail, container, false);

        Pokemon pokemon;
        //Get position from argument
        if (getArguments().get("num") == null)
            pokemon = Common.commonPokemonist.get(getArguments().getInt("position"));
        else

            pokemon = null;

        pokemomImage = itemView.findViewById(R.id.pokemon_image);
        pokemonName = itemView.findViewById(R.id.name);
        pokemonHeight = itemView.findViewById(R.id.height);
        pokemonWeight = itemView.findViewById(R.id.weight);

        recyclerType = itemView.findViewById(R.id.recyclerType);
        recyclerType.setHasFixedSize(true);
        recyclerType.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        recyclerWekness = itemView.findViewById(R.id.recyclerWeakness);
        recyclerWekness.setHasFixedSize(true);
        recyclerWekness.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        recyclerPreEvolution = itemView.findViewById(R.id.recyclerPreEvolution);
        recyclerPreEvolution.setHasFixedSize(true);
        recyclerPreEvolution.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        recyclerNextEvolution = itemView.findViewById(R.id.recyclerEvolution);
        recyclerNextEvolution.setHasFixedSize(true);
        recyclerNextEvolution.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));


        setDetailPokemon(pokemon);

        return itemView;
    }



    private void setDetailPokemon(Pokemon pokemon) {
        //Load image
        Glide.with(getActivity()).load(pokemon.getImg()).into(pokemomImage);
        pokemonName.setText(pokemon.getName());
        pokemonWeight.setText("Weight: " + pokemon.getWeight());
        pokemonHeight.setText("Heigth: " + pokemon.getHeight());

    }
}