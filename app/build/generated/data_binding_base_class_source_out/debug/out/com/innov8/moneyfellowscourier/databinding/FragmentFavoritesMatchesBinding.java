// Generated by view binder compiler. Do not edit!
package com.innov8.moneyfellowscourier.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.innov8.moneyfellowscourier.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFavoritesMatchesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ViewActionBarBinding include;

  @NonNull
  public final RecyclerView rvFavMatches;

  @NonNull
  public final TextView textEmpty;

  private FragmentFavoritesMatchesBinding(@NonNull LinearLayout rootView,
      @NonNull ViewActionBarBinding include, @NonNull RecyclerView rvFavMatches,
      @NonNull TextView textEmpty) {
    this.rootView = rootView;
    this.include = include;
    this.rvFavMatches = rvFavMatches;
    this.textEmpty = textEmpty;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFavoritesMatchesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFavoritesMatchesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_favorites_matches, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFavoritesMatchesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.include;
      View include = ViewBindings.findChildViewById(rootView, id);
      if (include == null) {
        break missingId;
      }
      ViewActionBarBinding binding_include = ViewActionBarBinding.bind(include);

      id = R.id.rv_fav_matches;
      RecyclerView rvFavMatches = ViewBindings.findChildViewById(rootView, id);
      if (rvFavMatches == null) {
        break missingId;
      }

      id = R.id.text_empty;
      TextView textEmpty = ViewBindings.findChildViewById(rootView, id);
      if (textEmpty == null) {
        break missingId;
      }

      return new FragmentFavoritesMatchesBinding((LinearLayout) rootView, binding_include,
          rvFavMatches, textEmpty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
