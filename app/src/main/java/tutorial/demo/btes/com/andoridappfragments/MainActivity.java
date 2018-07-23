package tutorial.demo.btes.com.andoridappfragments;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements FoodListFragment.FoodListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MenuDetailFragment frag = (MenuDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        //frag.setMenuId(1);
    }


    @Override
    public void itemClicked(long id) {
        MenuDetailFragment details = new MenuDetailFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        details.setMenuId(id);
        ft.replace(R.id.fragment_container,details);
        ft.addToBackStack(null);
        ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

}
