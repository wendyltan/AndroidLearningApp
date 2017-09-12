package com.example.wendy.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by Wendy on 2017/1/23.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
