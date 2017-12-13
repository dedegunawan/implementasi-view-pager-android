package me.degunawan.viewpager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by tik on 12/13/17.
 */

public class ArtikelListAdapter extends RecyclerView.Adapter<ArtikelListAdapter.ArtikelViewHolder> {

    ArrayList<Artikel> data;
    Context context;

    @Override
    public ArtikelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.artikel, parent, false);
        return new ArtikelViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ArtikelViewHolder holder, int position) {
        Artikel artikel = data.get(position);

        holder.tvPenulis.setText(artikel.getAuthor_name());
        holder.tvJudul.setText(artikel.getTitle());

        Picasso.with(context).load(artikel.getThumbnail()).into(holder.ivSampul);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public  class ArtikelViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul, tvPenulis;
        ImageView ivSampul;
        public ArtikelViewHolder(View itemView) {
            super(itemView);

            tvJudul = itemView.findViewById(R.id.tvJudul);
            tvPenulis = itemView.findViewById(R.id.tvPenulis);
            ivSampul = itemView.findViewById(R.id.ivSampul);

        }
    }

    public ArtikelListAdapter(ArrayList<Artikel> data, Context context) {
        this.data = data;
        this.context = context;
    }

}
