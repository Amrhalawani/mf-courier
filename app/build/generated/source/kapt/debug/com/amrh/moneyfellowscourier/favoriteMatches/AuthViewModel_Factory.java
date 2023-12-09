// Generated by Dagger (https://dagger.dev).
package com.amrh.moneyfellowscourier.favoriteMatches;

import com.innov8.data.data.repo.AppUseCases;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  private final Provider<AppUseCases> appUseCaseProvider;

  public AuthViewModel_Factory(Provider<AppUseCases> appUseCaseProvider) {
    this.appUseCaseProvider = appUseCaseProvider;
  }

  @Override
  public AuthViewModel get() {
    return newInstance(appUseCaseProvider.get());
  }

  public static AuthViewModel_Factory create(Provider<AppUseCases> appUseCaseProvider) {
    return new AuthViewModel_Factory(appUseCaseProvider);
  }

  public static AuthViewModel newInstance(AppUseCases appUseCase) {
    return new AuthViewModel(appUseCase);
  }
}
