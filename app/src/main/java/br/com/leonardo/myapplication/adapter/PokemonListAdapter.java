package br.com.leonardo.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import br.com.leonardo.myapplication.R;
import br.com.leonardo.myapplication.common.Common;
import br.com.leonardo.myapplication.interfac.InterfaceItemClickListener;
import br.com.leonardo.myapplication.model.Pokemon;

public class PokemonListAdapter extends RecyclerView.Adapter<PokemonListAdapter.MyViewHolder> {

    Context context;
    List<Pokemon> pokemonList;

    public PokemonListAdapter(Context context, List<Pokemon> pokemonList) {
        this.context = context;
        this.pokemonList = pokemonList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(context).inflate(R.layout.pokemon_list_item, parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //carrega a imagem
        Glide.with(context).load(pokemonList.get(position).getImg()).into(holder.pokemonImage);
        //set o nome
        holder.pokemonName.setText(pokemonList.get(position).getName());

       // Event
        holder.setItemClickListener((view, positionUm) -> //Toast.makeText(context, "Clique no Pokemon " + pokemonList.get(positionUm).getName(), Toast.LENGTH_SHORT).show());

        LocalBroadcastManager.getInstance(context)
                .sendBroadcast(new Intent(Common.KEY_ENABLE_HOME).putExtra("position", position)));

    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView pokemonImage;
        TextView pokemonName;

        InterfaceItemClickListener itemClickListener;

        public void setItemClickListener(InterfaceItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            pokemonImage = itemView.findViewById(R.id.pokemon_image);
            pokemonName = itemView.findViewById(R.id.txt_pokemon_name);

            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            itemClickListener.onClick(view, getAdapterPosition());
        }
    }
}
