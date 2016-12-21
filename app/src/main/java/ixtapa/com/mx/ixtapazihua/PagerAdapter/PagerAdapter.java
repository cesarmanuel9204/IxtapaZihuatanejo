package ixtapa.com.mx.ixtapazihua.PagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ixtapa.com.mx.ixtapazihua.Fragments.TabBusiness;
import ixtapa.com.mx.ixtapazihua.Fragments.TabExtra;
import ixtapa.com.mx.ixtapazihua.Fragments.TabHome;
import ixtapa.com.mx.ixtapazihua.Fragments.TabHoteles;
import ixtapa.com.mx.ixtapazihua.Fragments.TabRestaurants;

/**
 * Created by HP-PC on 07/12/2016.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    int NumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.NumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position){

        switch (position){
            case 0:
                TabHome tab0 = new TabHome();
                return tab0;

            case 1:
                TabHoteles tab1 = new TabHoteles();
                return tab1;

            case 2:
                TabRestaurants tab2 =  new TabRestaurants();
                return tab2;

            case 3:
                TabBusiness tab3 = new TabBusiness();
                return tab3;

            case 4:
                TabExtra tab4 =  new TabExtra();
                return tab4;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return NumOfTabs;
    }
}
