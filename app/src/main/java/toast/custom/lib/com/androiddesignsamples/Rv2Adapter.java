package toast.custom.lib.com.androiddesignsamples;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

import java.util.List;

public class Rv2Adapter extends RecyclerView.Adapter<Rv2Adapter.ViewHolder> {

    private List<EventsPojo> eventsList;

    public Rv2Adapter(List<EventsPojo> eventsList) {
        this.eventsList = eventsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_swipe_events, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Rv2Adapter.ViewHolder holder, int position) {
        holder.updateUi(position);
    }


    @Override
    public int getItemCount() {
        return eventsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView eventTitle, eventDes;

        private ImageView eventLogo;

        private EventsPojo eventsPojo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            eventTitle = itemView.findViewById(R.id.tvEventName);
            eventDes = itemView.findViewById(R.id.tvEventDes);
            eventLogo = itemView.findViewById(R.id.ivEventImageUrl);
        }

        public void updateUi(int position) {
            eventsPojo = eventsList.get(position);

            Glide.with(itemView.getContext()).load(eventsPojo.getEventLogo()).into(eventLogo);

            eventTitle.setText(eventsPojo.getEventTitle());
            eventDes.setText(eventsPojo.getEventDes());
        }
    }
}
