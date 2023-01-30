package com.example.trymyself;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GarageRecViewAdapter extends RecyclerView.Adapter<GarageRecViewAdapter.ViewHolder> {

    private ArrayList<Garage> garage = new ArrayList<>();

    private Context context;

    public GarageRecViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.garage_list_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txtName.setText(garage.get(position).getName());
        holder.txtPlaque.setText(garage.get(position).getPlaque());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, garage.get(position).getName() + " Selected", Toast.LENGTH_SHORT).show();
            }
        });
       Glide.with(context)
               .asBitmap()
               .load(garage.get(position).getImageUrl())
               .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return garage.size();
    }

    public void setGarage(ArrayList<Garage> garage) {
        this.garage = garage;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView txtName, txtPlaque;

        private RelativeLayout parent;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtPlaque = itemView.findViewById(R.id.txtPlaque);
            parent = itemView.findViewById(R.id.parent);
            image = itemView.findViewById(R.id.imageView);
        }
    }

}
