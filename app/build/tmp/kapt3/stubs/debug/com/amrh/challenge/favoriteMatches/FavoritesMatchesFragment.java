package com.amrh.challenge.favoriteMatches;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.innov8.moneyfellowscourier.databinding.FragmentFavoritesMatchesBinding;
import com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter;
import com.amrh.challenge.utils.gone;
import com.amrh.challenge.utils.visible;
import com.amrh.data.matches.pojo.Match;
import com.innov8.moneyfellowscourier.R;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016\u00a2\u0006\u0002\u0010\u001eJ&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u0016H\u0016J\u001a\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010*\u001a\u00020\u0016H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006+"}, d2 = {"Lcom/amrh/challenge/favoriteMatches/FavoritesMatchesFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter$MatchesSectionedByDateListener;", "()V", "_binding", "Lcom/innov8/moneyfellowscourier/databinding/FragmentFavoritesMatchesBinding;", "adapter", "Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter;", "getAdapter", "()Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter;", "setAdapter", "(Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter;)V", "binding", "getBinding", "()Lcom/innov8/moneyfellowscourier/databinding/FragmentFavoritesMatchesBinding;", "viewModel", "Lcom/amrh/challenge/favoriteMatches/AuthViewModel;", "getViewModel", "()Lcom/amrh/challenge/favoriteMatches/AuthViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fillUi", "", "listeners", "observeFavoriteMatches", "onClicked", "match", "error/NonExistentClass", "isFavorite", "", "(Lerror/NonExistentClass;Z)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setupFavoriteAdapter", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class FavoritesMatchesFragment extends androidx.fragment.app.Fragment implements com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter.MatchesSectionedByDateListener {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter adapter;
    private com.innov8.moneyfellowscourier.databinding.FragmentFavoritesMatchesBinding _binding;
    
    public FavoritesMatchesFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amrh.challenge.favoriteMatches.AuthViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter p0) {
    }
    
    private final com.innov8.moneyfellowscourier.databinding.FragmentFavoritesMatchesBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupFavoriteAdapter() {
    }
    
    private final void observeFavoriteMatches() {
    }
    
    private final void listeners() {
    }
    
    private final void fillUi() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onClicked(@org.jetbrains.annotations.NotNull
    Match match, boolean isFavorite) {
    }
}