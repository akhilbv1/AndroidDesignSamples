package toast.custom.lib.com.androiddesignsamples;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import static androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_DRAGGING;
import static androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_IDLE;
import static androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_SETTLING;

public class Fragment1 extends Fragment {

    //private RecyclerView rv1, rv2, rv3, rv4;

    private List<FeedPojo> feedList = new ArrayList<>();

    private List<EventsPojo> eventsList = new ArrayList<>();

    private List<NewsPojo> newsList = new ArrayList<>();

    private List<OppPojo> oppList = new ArrayList<>();

    private RecyclerView rvVerticalList;

    private BottomNavigationView bottomNavigationView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nested_listview_2, container, false);
        initialiseViews(view);
        /*prepareFeedData();
        prepareEventsData();
        prepareNewsData();
        prepareOppData();*/
        return view;
    }

    private void initialiseViews(View view) {
        rvVerticalList = view.findViewById(R.id.rvVerticalList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvVerticalList.setLayoutManager(layoutManager);
        VerticalListAdapter verticalListAdapter = new VerticalListAdapter();
        rvVerticalList.setAdapter(verticalListAdapter);

    }

/*

    private void initialiseViews(View view) {
        rv1 = view.findViewById(R.id.rcv1);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
        ((LinearLayoutManager) layoutManager1).setOrientation(RecyclerView.HORIZONTAL);
        rv1.setLayoutManager(layoutManager1);

        rv2 = view.findViewById(R.id.rcv2);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getActivity());
        ((LinearLayoutManager) layoutManager2).setOrientation(RecyclerView.HORIZONTAL);
        rv2.setLayoutManager(layoutManager2);

        rv3 = view.findViewById(R.id.rcv3);
        RecyclerView.LayoutManager layoutManager3 = new LinearLayoutManager(getActivity());
        ((LinearLayoutManager) layoutManager3).setOrientation(RecyclerView.HORIZONTAL);
        rv3.setLayoutManager(layoutManager3);

        rv4 = view.findViewById(R.id.rcv4);
        RecyclerView.LayoutManager layoutManager4 = new LinearLayoutManager(getActivity());
        ((LinearLayoutManager) layoutManager4).setOrientation(RecyclerView.HORIZONTAL);
        rv4.setLayoutManager(layoutManager4);
    }
*/

 /*   private void prepareFeedData() {

        FeedPojo feedPojo1 = new FeedPojo("http://keenthemes.com/preview/metronic/theme/assets/pages/media/profile/people19.png", "John", "https://homepages.cae.wisc.edu/~ece533/images/airplane.png");
        feedList.add(feedPojo1);

        FeedPojo feedPojo2 = new FeedPojo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwlniXkZfGMR6VBaAW_Z2N9TKy6JlQtg9zhzVjDcoYl0JgQO6n", "John", "https://homepages.cae.wisc.edu/~ece533/images/airplane.png");
        feedList.add(feedPojo2);

        FeedPojo feedPojo3 = new FeedPojo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4eMZiPfDsWfZtTjC11UzzO3vhOZIJekRErTzEOoC-id09rWdn", "watson", "https://homepages.cae.wisc.edu/~ece533/images/boat.png");
        feedList.add(feedPojo3);

        FeedPojo feedPojo4 = new FeedPojo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfEkNQPbMMjn-2XShYleGxBWAHKa9oEcO2hpnw57qkn_8e4Yhu", "shane", "https://homepages.cae.wisc.edu/~ece533/images/arctichare.png");
        feedList.add(feedPojo4);

        FeedPojo feedPojo5 = new FeedPojo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBguV1ZN6y22VVZNLOAUrbVYhKo5f9A0EKn2SL2eU6bFiFVxjZ", "warne", "https://homepages.cae.wisc.edu/~ece533/images/airplane.png");
        feedList.add(feedPojo5);


        Rv1Adapter feedAdapter = new Rv1Adapter(feedList);
        rv1.setAdapter(feedAdapter);


    }

    private void prepareEventsData() {

        EventsPojo eventsPojo1 = new EventsPojo("https://homepages.cae.wisc.edu/~ece533/images/airplane.png", "Free Airplanes", "Get Free Airplanes for just 2 rs");
        eventsList.add(eventsPojo1);
        EventsPojo eventsPojo2 = new EventsPojo("https://homepages.cae.wisc.edu/~ece533/images/boat.png", "Free Boats", "Get Free boat tickets");
        eventsList.add(eventsPojo2);
        EventsPojo eventsPojo3 = new EventsPojo("https://homepages.cae.wisc.edu/~ece533/images/arctichare.png", "Architect Your House", "Architect your House");
        eventsList.add(eventsPojo3);
        EventsPojo eventsPojo4 = new EventsPojo("https://homepages.cae.wisc.edu/~ece533/images/airplane.png", "Free Airplanes", "Get Free Airplanes for just 2 rs");
        eventsList.add(eventsPojo4);
        EventsPojo eventsPojo5 = new EventsPojo("https://homepages.cae.wisc.edu/~ece533/images/airplane.png", "Free Airplanes", "Get Free Airplanes for just 2 rs");
        eventsList.add(eventsPojo5);

        Rv2Adapter eventsAdapter = new Rv2Adapter(eventsList);
        rv2.setAdapter(eventsAdapter);
    }

    private void prepareNewsData() {

        NewsPojo newsPojo1 = new NewsPojo("https://homepages.cae.wisc.edu/~ece533/images/airplane.png", "First Airplane", "Learn About First Airplane");
        newsList.add(newsPojo1);
        NewsPojo newsPojo2 = new NewsPojo("https://homepages.cae.wisc.edu/~ece533/images/boat.png", "Boats", "How Boats Are Made");
        newsList.add(newsPojo2);
        NewsPojo newsPojo3 = new NewsPojo("https://homepages.cae.wisc.edu/~ece533/images/arctichare.png", "Architecture", "How Houses are made");
        newsList.add(newsPojo3);
        NewsPojo newsPojo4 = new NewsPojo("https://homepages.cae.wisc.edu/~ece533/images/airplane.png", "First Airplane", "Learn About First Airplane");
        newsList.add(newsPojo4);
        NewsPojo newsPojo5 = new NewsPojo("https://homepages.cae.wisc.edu/~ece533/images/airplane.png", "First Airplane", "Learn About First Airplane");
        newsList.add(newsPojo5);

        Rv3Adapter newsAdapter = new Rv3Adapter(newsList);
        rv3.setAdapter(newsAdapter);
    }

    private void prepareOppData() {

        OppPojo oppPojo1 = new OppPojo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBguV1ZN6y22VVZNLOAUrbVYhKo5f9A0EKn2SL2eU6bFiFVxjZ", "Recruitment", "required .net Dev");
        oppList.add(oppPojo1);
        OppPojo oppPojo2 = new OppPojo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfEkNQPbMMjn-2XShYleGxBWAHKa9oEcO2hpnw57qkn_8e4Yhu", "Recruitment", "Required andorid Dev");
        oppList.add(oppPojo2);
        OppPojo oppPojo3 = new OppPojo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4eMZiPfDsWfZtTjC11UzzO3vhOZIJekRErTzEOoC-id09rWdn", "Recruitment", "Required Ios Dev");
        oppList.add(oppPojo3);
        OppPojo oppPojo4 = new OppPojo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwlniXkZfGMR6VBaAW_Z2N9TKy6JlQtg9zhzVjDcoYl0JgQO6n", "Recruitment", "Required Angular Dev");
        oppList.add(oppPojo4);
        OppPojo oppPojo5 = new OppPojo("http://keenthemes.com/preview/metronic/theme/assets/pages/media/profile/people19.png", "Recruitment", "Required Data manager Dev");
        oppList.add(oppPojo5);

        Rv4Adapter oppAdapter = new Rv4Adapter(oppList);
        rv4.setAdapter(oppAdapter);
    }*/
}
