/*
 * Decompiled with CFR 0.152.
 */
package ax.r4;

import android.os.AsyncTask;
import android.util.Log;
import ax.Gb.g;
import ax.Gb.l;
import ax.p4.h;
import ax.p4.j;
import ax.p4.k;
import ax.p4.m;

public final class f
extends AsyncTask<Void, Void, h> {
    public static final a f = new a(null);
    private static final String g;
    private final String a;
    private final ax.p4.l b;
    private final m c;
    private final String d;
    private final k e;

    static {
        String string = f.class.getSimpleName();
        l.e(string, "getSimpleName(...)");
        g = string;
    }

    public f(String string, ax.p4.l l8, m m8, String string2, k k8) {
        l.f(string, "code");
        l.f(l8, "mPKCEManager");
        l.f(m8, "requestConfig");
        l.f(string2, "appKey");
        l.f(k8, "host");
        this.a = string;
        this.b = l8;
        this.c = m8;
        this.d = string2;
        this.e = k8;
    }

    protected h a(Void ... object) {
        l.f(object, "params");
        try {
            object = this.b.d(this.c, this.a, this.d, null, this.e);
            return object;
        }
        catch (j j8) {
            object = g;
            String string = j8.getMessage();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Token Request Failed: ");
            stringBuilder.append(string);
            Log.e((String)object, (String)stringBuilder.toString());
            return null;
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

