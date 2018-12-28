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

public class Rv4Adapter extends RecyclerView.Adapter<Rv4Adapter.ViewHolder> {

    private List<OppPojo> oppList;

    public Rv4Adapter(List<OppPojo> oppList) {
        this.oppList = oppList;
    }

    @NonNull
    @Override
    public Rv4Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_swipe_opp, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Rv4Adapter.ViewHolder holder, int position) {
        holder.updateui(position);
    }

    @Override
    public int getItemCount() {
        return oppList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView oppLogo;

        private TextView oppTitle;

        private TextView oppDes;

        private OppPojo oppPojo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            oppLogo = itemView.findViewById(R.id.ivOppLogo);
            oppTitle = itemView.findViewById(R.id.tvOppTitle);
            oppDes = itemView.findViewById(R.id.tvOppDes);
        }

        public void updateui(int position) {
            oppPojo = oppList.get(position);
            Glide.with(itemView.getContext()).load(oppPojo.getOppLogo()).into(oppLogo);
            oppTitle.setText(oppPojo.getOppName());
            oppDes.setText(oppPojo.getOppDes());
        }
    }
}
