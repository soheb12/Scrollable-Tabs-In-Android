package com.example.skyscraper.scrollabletabs;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {


    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.pager);

        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
    }


}

class MyAdapter extends FragmentStatePagerAdapter
{

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if(position == 0)
        {
            fragment = new Fragment1();
        }else if(position == 1)
        {
            fragment = new Fragment2();
        }else{
            fragment = new Fragment3();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
        {
            return "Facebook CEO";
        }
        if(position == 1)
        {
            return "Microsoft CEO";
        }
        if(position == 2)
        {
            return "Google CEO";
        }
        return null;
    }
}
