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

public class Rv3Adapter extends RecyclerView.Adapter<Rv3Adapter.ViewHolder> {

    private List<NewsPojo> newsList;

    Rv3Adapter(List<NewsPojo> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public Rv3Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_swipe_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Rv3Adapter.ViewHolder holder, int position) {
        holder.updateui(position);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView newsTitle,newsDes;

        private ImageView newsLogo;

        private NewsPojo newsPojo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            newsTitle = itemView.findViewById(R.id.tvNewsTitle);
            newsDes = itemView.findViewById(R.id.tvNewsDes);
            newsLogo = itemView.findViewById(R.id.ivNewsLogo);
        }

        public void updateui(int position) {
            newsPojo = newsList.get(position);

            newsTitle.setText(newsPojo.getNewsTitle());
            newsDes.setText(newsPojo.getNewsDes());
            Glide.with(itemView.getContext()).load(newsPojo.getNewsLogo()).into(newsLogo);
        }
    }
}
