package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.h;

/* loaded from: classes.dex */
class FragmentStateAdapter$4 implements f {
    final /* synthetic */ Runnable c0;
    final /* synthetic */ Handler q;

    @Override // androidx.lifecycle.f
    public void b(h hVar, d.a aVar) {
        if (aVar == d.a.ON_DESTROY) {
            this.q.removeCallbacks(this.c0);
            hVar.getLifecycle().c(this);
        }
    }
}
