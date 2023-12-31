// Generated by view binder compiler. Do not edit!
package com.innov8.moneyfellowscourier.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.innov8.moneyfellowscourier.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewActionBarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageLogo;

  @NonNull
  public final ImageView imageShowFavorites;

  @NonNull
  public final LinearLayout llShowFav;

  @NonNull
  public final TextView textShowFav;

  private ViewActionBarBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageLogo,
      @NonNull ImageView imageShowFavorites, @NonNull LinearLayout llShowFav,
      @NonNull TextView textShowFav) {
    this.rootView = rootView;
    this.imageLogo = imageLogo;
    this.imageShowFavorites = imageShowFavorites;
    this.llShowFav = llShowFav;
    this.textShowFav = textShowFav;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewActionBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewActionBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_action_bar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewActionBarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_logo;
      ImageView imageLogo = ViewBindings.findChildViewById(rootView, id);
      if (imageLogo == null) {
        break missingId;
      }

      id = R.id.image_show_favorites;
      ImageView imageShowFavorites = ViewBindings.findChildViewById(rootView, id);
      if (imageShowFavorites == null) {
        break missingId;
      }

      id = R.id.ll_show_fav;
      LinearLayout llShowFav = ViewBindings.findChildViewById(rootView, id);
      if (llShowFav == null) {
        break missingId;
      }

      id = R.id.text_show_fav;
      TextView textShowFav = ViewBindings.findChildViewById(rootView, id);
      if (textShowFav == null) {
        break missingId;
      }

      return new ViewActionBarBinding((ConstraintLayout) rootView, imageLogo, imageShowFavorites,
          llShowFav, textShowFav);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
