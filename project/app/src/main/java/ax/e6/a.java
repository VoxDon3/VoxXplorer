/*
 * Decompiled with CFR 0.152.
 */
package ax.e6;

import android.os.Bundle;
import ax.b6.W0;
import ax.f6.t;
import java.util.List;
import java.util.Map;

public class a {
    private final W0 a;

    public a(W0 w02) {
        this.a = w02;
    }

    public void a(String string, String string2, Bundle bundle) {
        this.a.t(string, string2, bundle);
    }

    public List<Bundle> b(String string, String string2) {
        return this.a.g(string, string2);
    }

    public int c(String string) {
        return this.a.a(string);
    }

    public Map<String, Object> d(String string, String string2, boolean bl) {
        return this.a.h(string, string2, bl);
    }

    public void e(String string, String string2, Bundle bundle) {
        this.a.C(string, string2, bundle);
    }

    public void f(a a8) {
        this.a.p(a8);
    }

    public void g(Bundle bundle) {
        this.a.k(bundle);
    }

    public final void h(boolean bl) {
        this.a.w(bl);
    }

    public static interface a
    extends t {
    }
}

