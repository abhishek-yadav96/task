package com.transline.technologies.anew;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class SuperheroPopupDialog extends Dialog {

    private Superhero superhero;

    public SuperheroPopupDialog(Context context, Superhero superhero) {
        super(context);
        this.superhero = superhero;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_superhero_popup);

        ImageView imageImageView = findViewById(R.id.imageImageView);
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView realNameTextView = findViewById(R.id.realNameTextView);
        TextView teamTextView = findViewById(R.id.teamTextView);
        TextView firstAppearanceTextView = findViewById(R.id.firstAppearanceTextView);
        TextView createdByTextView = findViewById(R.id.createdByTextView);
        TextView publisherTextView = findViewById(R.id.publisherTextView);
        TextView bioTextView = findViewById(R.id.bioTextView);

        Glide.with(getContext())
                .load(superhero.getImageurl())
                .placeholder(R.drawable.ic_launcher_foreground) // Placeholder image if loading fails
                .into(imageImageView);

        nameTextView.setText(superhero.getName());
        realNameTextView.setText("Real Name: " + superhero.getRealname());
        teamTextView.setText("Team: " + superhero.getTeam());
        firstAppearanceTextView.setText("First Appearance: " + superhero.getFirstappearance());
        createdByTextView.setText("Created By: " + superhero.getCreatedby());
        publisherTextView.setText("Publisher: " + superhero.getPublisher());
        bioTextView.setText("Bio: " + superhero.getBio());
    }
}
