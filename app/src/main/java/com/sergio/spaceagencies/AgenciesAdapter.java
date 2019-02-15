package com.sergio.spaceagencies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AgenciesAdapter extends RecyclerView.Adapter<AgenciesAdapter.AgenciesViewHolder> {
    private List<Agencies> agenciesList=new ArrayList<>();
    private LayoutInflater layoutInflater;

    private Context context;
    //CONSTRUCTOR
    public  AgenciesAdapter(Context context) {
        this.context=context;
        layoutInflater= LayoutInflater.from(context);
    }

    public class AgenciesViewHolder extends  RecyclerView.ViewHolder {
        public final TextView txtName;
        public final TextView txtCountry;
        public final TextView txtAbbrev;
        // CONSTRUCTOR

        public AgenciesViewHolder( View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);
            txtAbbrev=itemView.findViewById(R.id.txtAbbrev);
            txtCountry=itemView.findViewById(R.id.txtCountry);
        }
    }



    @NonNull
    @Override
    public AgenciesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView=layoutInflater.inflate(R.layout.agencie_item,viewGroup,false);

        return new AgenciesViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull final AgenciesViewHolder vh, int pos) {
        Agencies agencies=agenciesList.get(pos);

        vh.txtName.setText(agencies.getName());
        vh.txtCountry.setText(agencies.getCountryCode());
        vh.txtAbbrev.setText(agencies.getAbbrev());

        vh.txtAbbrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), vh.txtAbbrev.getText(), Toast.LENGTH_SHORT).show();

            }
        });



    }

    @Override
    public int getItemCount() {
        if (agenciesList==null)
            return 0;
        return agenciesList.size();
    }

    public void setData(List<Agencies> newList) {
        agenciesList=newList;
        notifyDataSetChanged();
    }


}
