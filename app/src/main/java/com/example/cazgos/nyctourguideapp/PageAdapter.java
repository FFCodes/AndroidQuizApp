package com.example.cazgos.nyctourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public PageAdapter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NYCHomeFragment();
            case 1:
                return new NYCLibraries();
            case 2:
                return new NYCTech();
            case 3:
                return new NYCUniversities();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return mContext.getString(R.string.nycWelcome);
            case 1:
                return mContext.getString(R.string.nycLibraries);
            case 2:
                return mContext.getString(R.string.nycTech);
            case 3:
                return mContext.getString(R.string.nycU);
        }
        return super.getPageTitle(position);
    }

}
