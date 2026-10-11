package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import ax.q5.h;
import ax.q5.m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements ax.q5.d {
    @Override // ax.q5.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
