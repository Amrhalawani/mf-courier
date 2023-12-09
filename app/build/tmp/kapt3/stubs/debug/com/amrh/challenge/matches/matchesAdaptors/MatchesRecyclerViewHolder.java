package com.amrh.challenge.matches.matchesAdaptors;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.innov8.moneyfellowscourier.R;
import com.innov8.moneyfellowscourier.databinding.ItemMatchBinding;
import com.innov8.moneyfellowscourier.databinding.ItemMatchFavoriteBinding;
import com.amrh.challenge.utils.formatDate;
import com.amrh.challenge.utils.formatTimeHHMM;
import com.amrh.challenge.utils.visible;
import com.amrh.data.matches.pojo.Match;
import com.amrh.data.matches.pojo.isMatchFinished;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Rg\u0010\u0005\u001aO\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0001\u0002\u0017\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/amrh/challenge/matches/matchesAdaptors/MatchesRecyclerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/viewbinding/ViewBinding;", "(Landroidx/viewbinding/ViewBinding;)V", "itemClickListener", "Lkotlin/Function4;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "error/NonExistentClass", "", "position", "", "isFavorite", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function4;", "setItemClickListener", "(Lkotlin/jvm/functions/Function4;)V", "FavoriteMatchVH", "NormalMatchVH", "Lcom/amrh/challenge/matches/matchesAdaptors/MatchesRecyclerViewHolder$FavoriteMatchVH;", "Lcom/amrh/challenge/matches/matchesAdaptors/MatchesRecyclerViewHolder$NormalMatchVH;", "app_debug"})
public abstract class MatchesRecyclerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.Nullable
    private Function4<android.view.View, Match, java.lang.Integer, java.lang.Boolean, kotlin.Unit> itemClickListener;
    
    private MatchesRecyclerViewHolder(androidx.viewbinding.ViewBinding binding) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final Function4<android.view.View, Match, java.lang.Integer, java.lang.Boolean, kotlin.Unit> getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable
    Function4<android.view.View, Match, java.lang.Integer, java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/amrh/challenge/matches/matchesAdaptors/MatchesRecyclerViewHolder$FavoriteMatchVH;", "Lcom/amrh/challenge/matches/matchesAdaptors/MatchesRecyclerViewHolder;", "binding", "Lcom/innov8/moneyfellowscourier/databinding/ItemMatchFavoriteBinding;", "multiHoldersMatchesAdapter", "Lcom/amrh/challenge/matches/matchesAdaptors/MultiHoldersMatchesAdapter;", "(Lcom/innov8/moneyfellowscourier/databinding/ItemMatchFavoriteBinding;Lcom/amrh/challenge/matches/matchesAdaptors/MultiHoldersMatchesAdapter;)V", "getMultiHoldersMatchesAdapter", "()Lcom/amrh/challenge/matches/matchesAdaptors/MultiHoldersMatchesAdapter;", "bind", "", "item", "error/NonExistentClass", "(Lerror/NonExistentClass;)V", "app_debug"})
    public static final class FavoriteMatchVH extends com.amrh.challenge.matches.matchesAdaptors.MatchesRecyclerViewHolder {
        private final com.innov8.moneyfellowscourier.databinding.ItemMatchFavoriteBinding binding = null;
        @org.jetbrains.annotations.NotNull
        private final com.amrh.challenge.matches.matchesAdaptors.MultiHoldersMatchesAdapter multiHoldersMatchesAdapter = null;
        
        public FavoriteMatchVH(@org.jetbrains.annotations.NotNull
        com.innov8.moneyfellowscourier.databinding.ItemMatchFavoriteBinding binding, @org.jetbrains.annotations.NotNull
        com.amrh.challenge.matches.matchesAdaptors.MultiHoldersMatchesAdapter multiHoldersMatchesAdapter) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.amrh.challenge.matches.matchesAdaptors.MultiHoldersMatchesAdapter getMultiHoldersMatchesAdapter() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        Match item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/amrh/challenge/matches/matchesAdaptors/MatchesRecyclerViewHolder$NormalMatchVH;", "Lcom/amrh/challenge/matches/matchesAdaptors/MatchesRecyclerViewHolder;", "binding", "Lcom/innov8/moneyfellowscourier/databinding/ItemMatchBinding;", "multiHoldersMatchesAdapter", "Lcom/amrh/challenge/matches/matchesAdaptors/MultiHoldersMatchesAdapter;", "(Lcom/innov8/moneyfellowscourier/databinding/ItemMatchBinding;Lcom/amrh/challenge/matches/matchesAdaptors/MultiHoldersMatchesAdapter;)V", "getMultiHoldersMatchesAdapter", "()Lcom/amrh/challenge/matches/matchesAdaptors/MultiHoldersMatchesAdapter;", "bind", "", "item", "error/NonExistentClass", "(Lerror/NonExistentClass;)V", "app_debug"})
    public static final class NormalMatchVH extends com.amrh.challenge.matches.matchesAdaptors.MatchesRecyclerViewHolder {
        private final com.innov8.moneyfellowscourier.databinding.ItemMatchBinding binding = null;
        @org.jetbrains.annotations.NotNull
        private final com.amrh.challenge.matches.matchesAdaptors.MultiHoldersMatchesAdapter multiHoldersMatchesAdapter = null;
        
        public NormalMatchVH(@org.jetbrains.annotations.NotNull
        com.innov8.moneyfellowscourier.databinding.ItemMatchBinding binding, @org.jetbrains.annotations.NotNull
        com.amrh.challenge.matches.matchesAdaptors.MultiHoldersMatchesAdapter multiHoldersMatchesAdapter) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.amrh.challenge.matches.matchesAdaptors.MultiHoldersMatchesAdapter getMultiHoldersMatchesAdapter() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        Match item) {
        }
    }
}