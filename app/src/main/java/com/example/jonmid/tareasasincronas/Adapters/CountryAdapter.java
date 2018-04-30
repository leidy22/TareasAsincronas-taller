package com.example.jonmid.tareasasincronas.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.tareasasincronas.Models.Country;
import com.example.jonmid.tareasasincronas.R;

import java.util.ArrayList;
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    List<Country> countryList = new ArrayList<>();
    Context context;

    public CountryAdapter(List<Country> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
    }

    // ******************************************************************************

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        ViewHolder viewHolder = new ViewHolder(item);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textViewCountry.setText(countryList.get(position).getName());
        holder.textViewAlpha2.setText(countryList.get(position).getAlpha2_code());
        holder.textViewAlpha3.setText(countryList.get(position).getAlpha3_code());
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewCountry;
        TextView textViewAlpha2;
        TextView textViewAlpha3;

        public ViewHolder(View item) {
            super(item);

            textViewCountry = (TextView) item.findViewById(R.id.id_txv_country);
            textViewAlpha2 = (TextView) item.findViewById(R.id.id_txv_alpha2);
            textViewAlpha3 = (TextView) item.findViewById(R.id.id_txv_alpha3);
        }
    }
}
