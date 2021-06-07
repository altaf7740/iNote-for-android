package com.official.myapplication.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.official.myapplication.Adapters.CredentialAdapter;
import com.official.myapplication.Models.CredentialModel;
import com.official.myapplication.R;
import com.official.myapplication.databinding.FragmentDashboardBinding;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private @NonNull FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });


        RecyclerView credentials = root.findViewById(R.id.credentialsRecycleView);
        ArrayList <CredentialModel> list = new ArrayList<>();

        list.add(new CredentialModel("Altaf7740", "www.gmail.com"));
        list.add(new CredentialModel("iamaltaf", "www.facebook.com"));
        list.add(new CredentialModel("altafbarhi", "www.twitter.com"));
        list.add(new CredentialModel("altaf83013", "www.instagram.com"));
        list.add(new CredentialModel("altaf@nsu", "www.tiktok.com"));
        list.add(new CredentialModel("hussainAltaf", "www.nsu.com"));
        list.add(new CredentialModel("barhi@altaf", "www.inote.com"));
        list.add(new CredentialModel("kingo", "www.ymail.com"));
        list.add(new CredentialModel("danish", "www.htb.com"));

        CredentialAdapter adapter = new CredentialAdapter(list,getActivity());
        credentials.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        credentials.setLayoutManager(linearLayoutManager);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}