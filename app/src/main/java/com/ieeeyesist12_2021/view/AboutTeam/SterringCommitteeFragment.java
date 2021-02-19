package com.ieeeyesist12_2021.view.AboutTeam;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ieeeyesist12_2021.R;
import com.ieeeyesist12_2021.adapters.AboutTeamRecyclerAdapter;
import com.ieeeyesist12_2021.databinding.FragmentSterringCommitteeBinding;
import com.ieeeyesist12_2021.model.Professional;

import java.util.ArrayList;
import java.util.List;

public class SterringCommitteeFragment extends Fragment implements AboutTeamRecyclerAdapter.OnProfessionalListener {

    public SterringCommitteeFragment() {
        // Required empty public constructor
    }

    private FragmentSterringCommitteeBinding binding;
    private List<Professional> professionalList;
    private AboutTeamRecyclerAdapter adapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        populateList();
        adapter = new AboutTeamRecyclerAdapter(requireContext(), professionalList, this);
        binding.sterringRv.setAdapter(adapter);
    }

    private void populateList() {
        professionalList = new ArrayList<>();
        professionalList.add(new Professional(getString(R.string.gal_gadot), R.drawable.gal, getString(R.string.volunteer),
                getString(R.string.random_text), "linkedin"));
        professionalList.add(new Professional(getString(R.string.nolan), R.drawable.profile_img, getString(R.string.volunteer),
                getString(R.string.random_text), "linkedin"));
        professionalList.add(new Professional(getString(R.string.gal_gadot), R.drawable.gal, getString(R.string.volunteer),
                getString(R.string.random_text), "linkedin"));
        professionalList.add(new Professional(getString(R.string.nolan), R.drawable.profile_img, getString(R.string.volunteer),
                getString(R.string.random_text), "linkedin"));
        professionalList.add(new Professional(getString(R.string.gal_gadot), R.drawable.gal, getString(R.string.volunteer),
                getString(R.string.random_text), "linkedin"));
        professionalList.add(new Professional(getString(R.string.nolan), R.drawable.profile_img, getString(R.string.volunteer),
                getString(R.string.random_text), "linkedin"));
        professionalList.add(new Professional(getString(R.string.gal_gadot), R.drawable.gal, getString(R.string.volunteer),
                getString(R.string.random_text), "linkedin"));
        professionalList.add(new Professional(getString(R.string.nolan), R.drawable.profile_img, getString(R.string.volunteer),
                getString(R.string.random_text), "linkedin"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSterringCommitteeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onProfessionalClick(Professional pro) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("selectedProfessional", pro);
        Navigation.findNavController(requireView()).navigate(R.id.action_aboutTeamFragment_to_professionalInfoFragment, bundle);
    }
}