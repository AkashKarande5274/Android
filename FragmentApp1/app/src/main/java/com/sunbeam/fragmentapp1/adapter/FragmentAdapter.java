package com.sunbeam.fragmentapp1.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.sunbeam.fragmentapp1.fragment.Countriesfragment;
import com.sunbeam.fragmentapp1.fragment.EmployeeFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 :
                return  new Countriesfragment();

            case 1:
                return new EmployeeFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
