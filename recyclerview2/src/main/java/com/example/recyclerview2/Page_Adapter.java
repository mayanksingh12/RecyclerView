package com.example.recyclerview2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Page_Adapter extends FragmentPagerAdapter {

    public int countTabs;

    public Page_Adapter(FragmentManager fm,int countTabs) {
        super(fm);
        this.countTabs=countTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new Fragmentname();

            case 1:
                return new Fragmentchat();

            case 2:
                return new Fragmentstatus();

                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return countTabs;
    }
}
