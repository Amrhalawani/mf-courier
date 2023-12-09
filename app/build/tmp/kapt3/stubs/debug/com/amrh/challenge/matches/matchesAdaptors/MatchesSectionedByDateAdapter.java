package com.amrh.challenge.matches.matchesAdaptors;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amrh.challenge.databinding.ItemMatchesSectionedByDayBinding;
import com.amrh.data.matches.pojo.Match;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001f B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J \u0010\u001d\u001a\u00020\u00162\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter$DateViewHolder;", "()V", "listener", "Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter$MatchesSectionedByDateListener;", "getListener", "()Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter$MatchesSectionedByDateListener;", "setListener", "(Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter$MatchesSectionedByDateListener;)V", "sectionedByDateMap", "", "", "", "error/NonExistentClass", "getSectionedByDateMap", "()Ljava/util/Map;", "setSectionedByDateMap", "(Ljava/util/Map;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateMatchesMap", "map", "DateViewHolder", "MatchesSectionedByDateListener", "app_debug"})
public final class MatchesSectionedByDateAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter.DateViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, java.util.List<Match>> sectionedByDateMap;
    public com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter.MatchesSectionedByDateListener listener;
    
    @javax.inject.Inject
    public MatchesSectionedByDateAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.util.List<Match>> getSectionedByDateMap() {
        return null;
    }
    
    public final void setSectionedByDateMap(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.util.List<? extends Match>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter.MatchesSectionedByDateListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull
    com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter.MatchesSectionedByDateListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter.DateViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void updateMatchesMap(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.util.List<? extends Match>> map) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter.DateViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter$MatchesSectionedByDateListener;", "", "onClicked", "", "match", "error/NonExistentClass", "isFavorite", "", "(Lerror/NonExistentClass;Z)V", "app_debug"})
    public static abstract interface MatchesSectionedByDateListener {
        
        public abstract void onClicked(@org.jetbrains.annotations.NotNull
        Match match, boolean isFavorite);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rR\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter$DateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lcom/amrh/challenge/matches/matchesAdaptors/MatchesSectionedByDateAdapter;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "bind", "", "matches", "", "date", "", "app_debug"})
    public final class DateViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final ItemMatchesSectionedByDayBinding binding = null;
        
        public DateViewHolder(@org.jetbrains.annotations.NotNull
        ItemMatchesSectionedByDayBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final ItemMatchesSectionedByDayBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable
        java.util.List<? extends Match> matches, @org.jetbrains.annotations.NotNull
        java.lang.String date) {
        }
    }
}