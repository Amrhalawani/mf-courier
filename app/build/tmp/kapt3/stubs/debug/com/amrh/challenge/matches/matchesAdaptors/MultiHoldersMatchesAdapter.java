package com.amrh.challenge.matches.matchesAdaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amrh.challenge.databinding.ItemMatchBinding;
import com.amrh.challenge.databinding.ItemMatchFavoriteBinding;
import com.amrh.data.matches.pojo.Match;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\\\b\u0007\u0012S\u0010\u0003\u001aO\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0019\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0016J\u0016\u0010!\u001a\u00020\u000e2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014J#\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010%Rg\u0010\u0003\u001aO\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Lcom/amrh/challenge/matches/matchesAdaptors/MultiHoldersMatchesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/amrh/challenge/matches/matchesAdaptors/MatchesRecyclerViewHolder;", "itemClickListener", "Lkotlin/Function4;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "error/NonExistentClass", "", "position", "", "isFavorite", "", "(Lkotlin/jvm/functions/Function4;)V", "getItemClickListener", "()Lkotlin/jvm/functions/Function4;", "setItemClickListener", "list", "", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getItemCount", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "updateMatchViewItem", "match", "(Lerror/NonExistentClass;ZI)V", "app_debug"})
public final class MultiHoldersMatchesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.amrh.challenge.matches.matchesAdaptors.MatchesRecyclerViewHolder> {
    @org.jetbrains.annotations.Nullable
    private Function4<android.view.View, Match, java.lang.Integer, java.lang.Boolean, kotlin.Unit> itemClickListener;
    @org.jetbrains.annotations.Nullable
    private java.util.List<Match> list;
    
    @javax.inject.Inject
    public MultiHoldersMatchesAdapter(@org.jetbrains.annotations.Nullable
    Function4<android.view.View, Match, java.lang.Integer, java.lang.Boolean, kotlin.Unit> itemClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final Function4<android.view.View, Match, java.lang.Integer, java.lang.Boolean, kotlin.Unit> getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable
    Function4<android.view.View, Match, java.lang.Integer, java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<Match> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable
    java.util.List<? extends Match> p0) {
    }
    
    public final void updateList(@org.jetbrains.annotations.Nullable
    java.util.List<? extends Match> newList) {
    }
    
    public final void updateMatchViewItem(@org.jetbrains.annotations.NotNull
    Match match, boolean isFavorite, int position) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.amrh.challenge.matches.matchesAdaptors.MatchesRecyclerViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.amrh.challenge.matches.matchesAdaptors.MatchesRecyclerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
}