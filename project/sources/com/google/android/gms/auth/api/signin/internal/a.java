package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import android.os.Bundle;
import ax.H5.g;
import ax.H5.x;
import ax.J0.a;
import ax.K0.c;

/* loaded from: classes3.dex */
final class a implements a.InterfaceC0095a {
    final /* synthetic */ SignInHubActivity a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, x xVar) {
        this.a = signInHubActivity;
    }

    @Override // ax.J0.a.InterfaceC0095a
    public final /* bridge */ /* synthetic */ void v(c cVar, Object obj) {
        int i;
        Intent intent;
        SignInHubActivity signInHubActivity = this.a;
        i = signInHubActivity.d;
        intent = signInHubActivity.e;
        signInHubActivity.setResult(i, intent);
        this.a.finish();
    }

    @Override // ax.J0.a.InterfaceC0095a
    public final c w(int i, Bundle bundle) {
        return new g(this.a, ax.K5.g.b());
    }

    @Override // ax.J0.a.InterfaceC0095a
    public final void p(c cVar) {
    }
}
