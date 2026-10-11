/*
 * Decompiled with CFR 0.152.
 */
package ax.H2;

import android.os.Build;
import ax.B2.i;
import ax.B2.j;
import ax.G2.b;
import ax.Gb.g;
import ax.Gb.l;
import ax.H2.c;
import ax.I2.h;
import ax.K2.v;

public final class f
extends c<b> {
    public static final a f = new a(null);
    private static final String g;

    static {
        String string = i.i("NetworkNotRoamingCtrlr");
        l.e(string, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        g = string;
    }

    public f(h<b> h8) {
        l.f(h8, "tracker");
        super(h8);
    }

    @Override
    public boolean b(v v8) {
        l.f(v8, "workSpec");
        return v8.j.d() == j.e0;
    }

    public boolean i(b b8) {
        l.f(b8, "value");
        if (Build.VERSION.SDK_INT < 24) {
            i.e().a(g, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            return !b8.a();
        }
        return !b8.a() || !b8.c();
        {
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

