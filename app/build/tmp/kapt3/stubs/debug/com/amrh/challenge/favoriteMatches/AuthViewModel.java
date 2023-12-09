package com.amrh.challenge.favoriteMatches;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.innov8.data.data.repo.AppUseCases;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002R&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/amrh/challenge/favoriteMatches/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "appUseCase", "Lcom/innov8/data/data/repo/AppUseCases;", "(Lcom/innov8/data/data/repo/AppUseCases;)V", "_stateFavoritesMatches", "Landroidx/lifecycle/MutableLiveData;", "", "", "", "error/NonExistentClass", "stateFavoritesMatches", "Landroidx/lifecycle/LiveData;", "getStateFavoritesMatches", "()Landroidx/lifecycle/LiveData;", "login", "", "country_code", "phone", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final com.innov8.data.data.repo.AppUseCases appUseCase = null;
    private final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.util.List<Match>>> _stateFavoritesMatches = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.util.List<Match>>> stateFavoritesMatches = null;
    
    @javax.inject.Inject
    public AuthViewModel(@org.jetbrains.annotations.NotNull
    com.innov8.data.data.repo.AppUseCases appUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.util.List<Match>>> getStateFavoritesMatches() {
        return null;
    }
    
    private final void login(java.lang.String country_code, java.lang.String phone) {
    }
}