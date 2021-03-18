package br.com.leonardo.myapplication.adapter;

import android.os.IInterface;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.robertlevonyan.views.chip.Chip;

import java.util.ArrayList;
import java.util.List;

import br.com.leonardo.myapplication.R;
import br.com.leonardo.myapplication.interfac.InterfaceItemClickListener;

public class PokemonTypeAdapter extends RecyclerView.Adapter<PokemonTypeAdapter.MyViewHolder> {

    public class MyViewHolder extends RecyclerView.ViewHolder{

        List<Chip> chipList = new ArrayList<>();
        InterfaceItemClickListener itemClickListener;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            chipList = itemView.findViewById(R.id.chip);


        }
    }

}
