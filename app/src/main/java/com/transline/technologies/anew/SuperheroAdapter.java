package com.transline.technologies.anew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SuperheroAdapter extends RecyclerView.Adapter<SuperheroAdapter.ViewHolder> {

    private List<Superhero> superheroList;
    private Context context;

    public SuperheroAdapter(List<Superhero> superheroList, Context context) {
        this.superheroList = superheroList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_superhero, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Superhero superhero = superheroList.get(position);
        holder.nameTextView.setText(superhero.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show popup with superhero details
                SuperheroPopupDialog dialog = new SuperheroPopupDialog(context, superhero);
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return superheroList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
        }
    }
}
