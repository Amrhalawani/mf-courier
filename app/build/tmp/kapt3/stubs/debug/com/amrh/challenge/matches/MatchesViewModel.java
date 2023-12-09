package com.amrh.challenge.matches;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.innov8.data.data.repo.AppUseCases;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/amrh/challenge/matches/MatchesViewModel;", "Landroidx/lifecycle/ViewModel;", "matchesUseCase", "Lcom/innov8/data/data/repo/AppUseCases;", "(Lcom/innov8/data/data/repo/AppUseCases;)V", "app_debug"})
public final class MatchesViewModel extends androidx.lifecycle.ViewModel {
    private final com.innov8.data.data.repo.AppUseCases matchesUseCase = null;
    
    @javax.inject.Inject
    public MatchesViewModel(@org.jetbrains.annotations.NotNull
    com.innov8.data.data.repo.AppUseCases matchesUseCase) {
        super();
    }
}