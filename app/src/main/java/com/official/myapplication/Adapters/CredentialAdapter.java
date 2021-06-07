package com.official.myapplication.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.official.myapplication.MainActivity;
import com.official.myapplication.Models.CredentialModel;
import com.official.myapplication.R;
import com.official.myapplication.UpdateDeleteActivity;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CredentialAdapter extends  RecyclerView.Adapter<CredentialAdapter.viewHolder>{

    ArrayList<CredentialModel> list;
    Context context;

    public CredentialAdapter(ArrayList<CredentialModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_credential, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull viewHolder holder, int position) {
        CredentialModel model = list.get(position);
        holder.websiteTV.setText(model.getWebsite());
        holder.usernameTV.setText(model.getUsername());
        holder.copyClipboardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "copied to clipboard !", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).setDuration(500).show();
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(context, UpdateDeleteActivity.class);
                context.startActivity(intent);
                return false;

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class  viewHolder extends RecyclerView.ViewHolder {

        TextView websiteTV, usernameTV;
        Button copyClipboardBtn;
        public viewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            websiteTV = itemView.findViewById(R.id.websiteTV);
            usernameTV = itemView.findViewById(R.id.usernameTV);
            copyClipboardBtn = itemView.findViewById(R.id.copyclipboardBtn);
        }
    }
}
