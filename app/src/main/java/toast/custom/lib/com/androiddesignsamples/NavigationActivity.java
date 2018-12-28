package toast.custom.lib.com.androiddesignsamples;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class NavigationActivity extends AppCompatActivity {

    public static FragmentManager manager;
    public static Fragment mFragment;
    public ActionBarDrawerToggle toggle;
    private ListView listViewMenu;
    private ImageView ivUserProfile;
    private DrawerLayout drawerLayout;
    private View notificationBadge;
     private TextView tvUnreadCount;
    private BottomNavigationView bottom_navigation;

    public static void replaceFragment(Fragment fragment) {

        FragmentTransaction transaction = manager.beginTransaction();//create an instance of Fragment-transaction
        transaction.replace(R.id.frameWelcomeSwipe, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

        mFragment = fragment;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);
        listViewMenu = findViewById(R.id.lvSideMenu);
        ivUserProfile = findViewById(R.id.ivUserProfile);
        bottom_navigation = findViewById(R.id.bottom_navigation);
        //add items to static side menu.
        List<String> menuMainList = new ArrayList<>();
        menuMainList.add("networks");
        menuMainList.add("about collude");
        menuMainList.add("write_to_us");

        manager = getSupportFragmentManager();


        List<Integer> menuIconsList = new ArrayList<>();
        menuIconsList.add(R.drawable.ic_launcher_background);
        menuIconsList.add(R.drawable.ic_launcher_background);
        menuIconsList.add(R.drawable.ic_launcher_background);

        drawerLayout = findViewById(R.id.drawerLayout);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        drawerLayout.setDrawerElevation(20);
        toggle.syncState();

        SlideMenuListAdapter menuListAdapter = new SlideMenuListAdapter(NavigationActivity.this, menuMainList, menuIconsList);
        listViewMenu.setAdapter(menuListAdapter);
        listViewMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                drawerLayout.closeDrawers();

                switch (i) {
                    case 0:
                        Toast.makeText(NavigationActivity.this, "0", Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Toast.makeText(NavigationActivity.this, "1", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(NavigationActivity.this, "2", Toast.LENGTH_SHORT).show();
                        break;


                    default:
                        Toast.makeText(NavigationActivity.this, "0", Toast.LENGTH_SHORT).show();
                        break;

                }

            }
        });

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_1:
                        replaceFragment(new Fragment1());
                        break;

                    case R.id.action_2:
                        replaceFragment(new Fragment2());
                        break;

                    case R.id.action_3:
                         tvUnreadCount = notificationBadge.findViewById(R.id.tvUnreadCount);
                        tvUnreadCount.setText("234");
                        //replaceFragment(new Fragment3());
                        break;

                    case R.id.action_4:

                         tvUnreadCount = notificationBadge.findViewById(R.id.tvUnreadCount);
                        tvUnreadCount.setText("35");
                       // replaceFragment(new Fragment4());
                        break;

                    case R.id.action_5:
                        tvUnreadCount = notificationBadge.findViewById(R.id.tvUnreadCount);
                        tvUnreadCount.setText("39");
                        //replaceFragment(new Fragment5());
                        break;
                }
                return true;
            }
        });
        bottom_navigation.setSelectedItemId(R.id.action_1);
        addBadgeView();


    }

    private void addBadgeView() {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) bottom_navigation.getChildAt(0);
        BottomNavigationItemView itemView = (BottomNavigationItemView) menuView.getChildAt(0);

        notificationBadge = LayoutInflater.from(this).inflate(R.layout.layout_unreadcount, menuView, false);

        itemView.addView(notificationBadge);

         tvUnreadCount = notificationBadge.findViewById(R.id.tvUnreadCount);
        tvUnreadCount.setText("14");
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        if (bottom_navigation.getSelectedItemId() != R.id.action_1) {
            Toast.makeText(this, "Press back to quit application", Toast.LENGTH_SHORT).show();
            bottom_navigation.setSelectedItemId(R.id.action_1);
        } else {
            finish();
        }
    }

    /*Inner class adapter*/
    private class SlideMenuListAdapter extends BaseAdapter {

        private final List<String> menuList;

        private final List<Integer> menuIconsList;

        private LayoutInflater inflater = null;

        SlideMenuListAdapter(Context context, List<String> menuList, List<Integer> menuIconsList) {
            super();
            this.menuList = menuList;
            this.menuIconsList = menuIconsList;

            inflater = (LayoutInflater) context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return menuList.size();
        }

        @Override
        public Object getItem(int position) {

            return position;
        }

        @Override
        public long getItemId(int position) {

            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            final ViewHolder holder = new SlideMenuListAdapter.ViewHolder();
            View rowView;
            //ToDo:solve this
            rowView = inflater.inflate(R.layout.side_menu_row_item, null);

            holder.tvMenuName = rowView.findViewById(R.id.tvMenuName);
            holder.ivMenu = rowView.findViewById(R.id.ivMenu);

            holder.tvMenuName.setText(menuList.get(position));

            holder.ivMenu.setImageResource(menuIconsList.get(position));


            return rowView;
        }

        class ViewHolder {

            TextView tvMenuName;
            ImageView ivMenu;

        }
    }
}
