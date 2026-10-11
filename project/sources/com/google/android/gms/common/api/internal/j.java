package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C3607a;

/* loaded from: classes3.dex */
final class j implements ComponentCallbacks2C3607a.InterfaceC0545a {
    final /* synthetic */ C3609c a;

    j(C3609c c3609c) {
        this.a = c3609c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3607a.InterfaceC0545a
    public final void a(boolean z) {
        C3609c c3609c = this.a;
        c3609c.o0.sendMessage(c3609c.o0.obtainMessage(1, Boolean.valueOf(z)));
    }
}
