package toast.custom.lib.com.androiddesignsamples;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class Rv1Adapter extends RecyclerView.Adapter<Rv1Adapter.ViewHolder> {

    private List<FeedPojo> feedsList;

    public Rv1Adapter(List<FeedPojo> feedsList) {
        this.feedsList = feedsList;
    }

    @NonNull
    @Override
    public Rv1Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_swipe_feed, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Rv1Adapter.ViewHolder holder, int position) {
        holder.updateUi(position);
    }

    @Override
    public int getItemCount() {
        return feedsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvUserName;
        private ImageView feedPhoto;
        private ImageView userLogo;
        private FeedPojo feedPojo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUserName = itemView.findViewById(R.id.tvProfileName);
            feedPhoto = itemView.findViewById(R.id.ivStatusImage);
            userLogo = itemView.findViewById(R.id.ivProfile);
        }

        public void updateUi(int position) {
            feedPojo = feedsList.get(position);

            tvUserName.setText(feedPojo.getUserName());

            Glide.with(itemView.getContext()).load(feedPojo.getUserLogo()).into(userLogo);

            Glide.with(itemView.getContext()).load(feedPojo.getFeedPhoto()).into(feedPhoto);


        }
    }
}
