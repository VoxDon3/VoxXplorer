/*
 * Decompiled with CFR 0.152.
 */
package ax.F7;

import android.os.Bundle;
import ax.A7.a;
import ax.G7.g;
import ax.H7.b;
import java.util.Locale;

class e
implements a.b {
    private b a;
    private b b;

    e() {
    }

    private static void b(b b8, String string, Bundle bundle) {
        if (b8 == null) {
            return;
        }
        b8.A(string, bundle);
    }

    private void c(String string, Bundle bundle) {
        b b8 = "clx".equals(bundle.getString("_o")) ? this.a : this.b;
        e.b(b8, string, bundle);
    }

    @Override
    public void a(int n8, Bundle bundle) {
        String string;
        g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", n8, bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2;
            bundle = bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle = new Bundle();
            }
            this.c(string, bundle);
        }
    }

    public void d(b b8) {
        this.b = b8;
    }

    public void e(b b8) {
        this.a = b8;
    }
}

