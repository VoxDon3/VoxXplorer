package ax.L5;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes3.dex */
final class I implements Runnable {
    final /* synthetic */ String c0;
    final /* synthetic */ J d0;
    final /* synthetic */ LifecycleCallback q;

    I(J j, LifecycleCallback lifecycleCallback, String str) {
        this.d0 = j;
        this.q = lifecycleCallback;
        this.c0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        J j = this.d0;
        i = j.e0;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.q;
            bundle = j.f0;
            if (bundle != null) {
                String str = this.c0;
                bundle3 = j.f0;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i2 = this.d0.e0;
        if (i2 >= 2) {
            this.q.j();
        }
        i3 = this.d0.e0;
        if (i3 >= 3) {
            this.q.h();
        }
        i4 = this.d0.e0;
        if (i4 >= 4) {
            this.q.k();
        }
        i5 = this.d0.e0;
        if (i5 >= 5) {
            this.q.g();
        }
    }
}
