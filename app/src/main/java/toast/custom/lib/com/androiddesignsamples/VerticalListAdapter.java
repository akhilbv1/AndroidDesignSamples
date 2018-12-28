package toast.custom.lib.com.androiddesignsamples;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VerticalListAdapter extends RecyclerView.Adapter<VerticalListAdapter.ViewHolder> {
    private List<FeedPojo> feedList = new ArrayList<>();

    private List<EventsPojo> eventsList = new ArrayList<>();

    private List<NewsPojo> newsList = new ArrayList<>();

    private List<OppPojo> oppList = new ArrayList<>();

    //private RecyclerView.RecycledViewPool viewPool;


    @NonNull
    @Override
    public VerticalListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizantal_list, parent, false);
        prepareFeedData();
        prepareEventsData();
        prepareNewsData();
        prepareOppData();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalListAdapter.ViewHolder holder, int position) {
        holder.updateUi(position);
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    private void prepareFeedData() {

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

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private RecyclerView rvHorizontalList;

        private TextView tvHeader;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rvHorizontalList = itemView.findViewById(R.id.rvHorizontalList);
            tvHeader = itemView.findViewById(R.id.tvHeader);

        }

         void updateUi(int position) {
            if (position == 0) {

                tvHeader.setText("Feeds");
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(itemView.getContext());
                ((LinearLayoutManager) layoutManager).setOrientation(RecyclerView.HORIZONTAL);
                rvHorizontalList.setLayoutManager(layoutManager);
                Rv1Adapter rv1Adapter = new Rv1Adapter(feedList);
                rvHorizontalList.setAdapter(rv1Adapter);

            } else if (position == 1) {

                tvHeader.setText("Events");
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(itemView.getContext());
                ((LinearLayoutManager) layoutManager).setOrientation(RecyclerView.HORIZONTAL);
                rvHorizontalList.setLayoutManager(layoutManager);
                Rv2Adapter rv2Adapter = new Rv2Adapter(eventsList);
                rvHorizontalList.setAdapter(rv2Adapter);

            } else if (position == 2) {

                tvHeader.setText("News");
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(itemView.getContext());
                ((LinearLayoutManager) layoutManager).setOrientation(RecyclerView.HORIZONTAL);
                rvHorizontalList.setLayoutManager(layoutManager);
                Rv3Adapter rv3Adapter = new Rv3Adapter(newsList);
                rvHorizontalList.setAdapter(rv3Adapter);

            } else if (position == 3) {

                tvHeader.setText("Opp");
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(itemView.getContext());
                ((LinearLayoutManager) layoutManager).setOrientation(RecyclerView.HORIZONTAL);
                rvHorizontalList.setLayoutManager(layoutManager);
                Rv4Adapter rv4Adapter = new Rv4Adapter(oppList);
                rvHorizontalList.setAdapter(rv4Adapter);

            }

        }
    }
}
