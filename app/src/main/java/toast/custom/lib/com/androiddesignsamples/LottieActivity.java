/*
package toast.custom.lib.com.androiddesignsamples;

import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment2.app.Fragment;
import androidx.fragment2.app.FragmentManager;
import androidx.fragment2.app.FragmentTransaction;
import com.wwdablu.soumya.lottiebottomnav.ILottieBottomNavCallback;
import com.wwdablu.soumya.lottiebottomnav.LottieBottomNav;
import com.wwdablu.soumya.lottiebottomnav.MenuItem;
import com.wwdablu.soumya.lottiebottomnav.MenuItemBuilder;

import java.util.ArrayList;
import java.util.List;

public class LottieActivity extends AppCompatActivity implements ILottieBottomNavCallback {

    public static FragmentManager manager;
    public static Fragment mFragment;
    private List<MenuItem> list;
    private LottieBottomNav bottom_nav;

    public static void replaceFragment(Fragment fragment2) {

        FragmentTransaction transaction = manager.beginTransaction();//create an instance of Fragment-transaction
        transaction.replace(R.id.frameWelcomeSwipe, fragment2);
        transaction.addToBackStack(null);
        transaction.commit();

        mFragment = fragment2;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lottie_animation_sample_intro);

        bottom_nav = findViewById(R.id.bottom_nav);

        MenuItem item1 = MenuItemBuilder.create("Dashboard", "home.json", MenuItem.Source.Assets, null)
                .selectedTextColor(Color.BLACK)
                .unSelectedTextColor(Color.GRAY)
                .pausedProgress(100)
                .autoPlay(false)
                .loop(false)
                .build();

        MenuItem item2 = MenuItemBuilder.createFrom(item1)
                .menuTitle("Gifts")
                .selectedLottieName("gift.json")
                .unSelectedLottieName("gift.json")
                .build();

        MenuItem item3 = MenuItemBuilder.createFrom(item1)
                .menuTitle("Mail")
                .selectedLottieName("message.json")
                .unSelectedLottieName("message.json")
                .build();

        MenuItem item4 = MenuItemBuilder.createFrom(item1)
                .menuTitle("Settings")
                .selectedLottieName("settings.json")
                .unSelectedLottieName("settings.json")
                .build();

        list = new ArrayList<>(4);
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);

        bottom_nav.setCallback(this);
        bottom_nav.setMenuItemList(list);
        bottom_nav.setSelectedIndex(1);
    }

    @Override
    public void onMenuSelected(int i, int i1, MenuItem menuItem) {
        switch (i) {
            case R.id.action_1:
                replaceFragment(new Fragment1());
                break;

            case R.id.action_2:
                replaceFragment(new Fragment2());
                break;

            case R.id.action_3:
                replaceFragment(new Fragment3());
                break;

            case R.id.action_4:
                replaceFragment(new Fragment4());
                break;

            case R.id.action_5:
                replaceFragment(new Fragment5());
                break;
        }
    }

    @Override
    public void onAnimationStart(int i, MenuItem menuItem) {

    }

    @Override
    public void onAnimationEnd(int i, MenuItem menuItem) {

    }

    @Override
    public void onAnimationCancel(int i, MenuItem menuItem) {

    }
}
*/
