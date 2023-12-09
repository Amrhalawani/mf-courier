package com.amrh.challenge.matches.matchesAdaptors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/amrh/challenge/matches/matchesAdaptors/MatchViewType;", "", "viewTypeId", "", "(Ljava/lang/String;II)V", "getViewTypeId", "()I", "NORMAL_UNSELECTED_MATCH_VIEW_TYPE", "FAVORITE_MATCH_VIEW_TYPE", "app_debug"})
public enum MatchViewType {
    /*public static final*/ NORMAL_UNSELECTED_MATCH_VIEW_TYPE /* = new NORMAL_UNSELECTED_MATCH_VIEW_TYPE(0) */,
    /*public static final*/ FAVORITE_MATCH_VIEW_TYPE /* = new FAVORITE_MATCH_VIEW_TYPE(0) */;
    private final int viewTypeId = 0;
    
    MatchViewType(int viewTypeId) {
    }
    
    public final int getViewTypeId() {
        return 0;
    }
}