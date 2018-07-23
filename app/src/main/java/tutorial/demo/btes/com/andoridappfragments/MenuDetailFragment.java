package tutorial.demo.btes.com.andoridappfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuDetailFragment extends Fragment {
    private long menuId;

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }


    public MenuDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (savedInstanceState != null) {
            menuId = savedInstanceState.getLong("menuId");
        }
        return inflater.inflate(R.layout.fragment_menu_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.name);
            TextView desc = (TextView) view.findViewById(R.id.desc);
            Menu menu = Menu.menus[(int) menuId];
            title.setText(menu.getName());
            desc.setText(menu.getDescription());

        }
    }
}
