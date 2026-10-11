/*
 * Decompiled with CFR 0.152.
 */
package ax.G0;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.savedstate.a;
import ax.G0.r;
import ax.G0.v;
import ax.Gb.l;
import ax.sb.h;
import ax.sb.i;
import java.util.Map;

public final class q
implements a.c {
    private final a a;
    private boolean b;
    private Bundle c;
    private final h d;

    public q(a a8, v v8) {
        l.f(a8, "savedStateRegistry");
        l.f(v8, "viewModelStoreOwner");
        this.a = a8;
        this.d = i.a(new ax.Fb.a<r>(v8){
            final v q;
            {
                this.q = v8;
                super(0);
            }

            public final r a() {
                return m.e(this.q);
            }
        });
    }

    private final r c() {
        return (r)this.d.getValue();
    }

    @Override
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : this.c().f().entrySet()) {
            String string = (String)entry.getKey();
            Bundle entry2 = ((androidx.lifecycle.l)entry.getValue()).c().a();
            if (l.a(entry2, Bundle.EMPTY)) continue;
            bundle.putBundle(string, entry2);
        }
        this.b = false;
        return bundle;
    }

    public final Bundle b(String string) {
        l.f(string, "key");
        this.d();
        Object object = this.c;
        object = object != null ? object.getBundle(string) : null;
        Bundle bundle = this.c;
        if (bundle != null) {
            bundle.remove(string);
        }
        if ((string = this.c) != null && string.isEmpty()) {
            this.c = null;
        }
        return object;
    }

    public final void d() {
        if (!this.b) {
            Bundle bundle = this.a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                bundle2.putAll(bundle3);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            this.c = bundle2;
            this.b = true;
            this.c();
        }
    }
}

