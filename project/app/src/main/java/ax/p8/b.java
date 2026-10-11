/*
 * Decompiled with CFR 0.152.
 */
package ax.p8;

import android.content.Context;
import android.os.Bundle;
import ax.Gb.g;
import ax.Gb.l;
import ax.Pb.c;
import ax.Pb.d;
import ax.p8.h;
import ax.sb.t;
import ax.wb.e;

public final class b
implements h {
    private static final a b = new a(null);
    private final Bundle a;

    public b(Context context) {
        l.f(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo((String)context.getPackageName(), (int)128).metaData;
        context = bundle;
        if (bundle == null) {
            context = Bundle.EMPTY;
        }
        this.a = context;
    }

    @Override
    public Boolean a() {
        if (this.a.containsKey("firebase_sessions_enabled")) {
            return this.a.getBoolean("firebase_sessions_enabled");
        }
        return null;
    }

    @Override
    public ax.Pb.a b() {
        if (this.a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return ax.Pb.a.h(c.h(this.a.getInt("firebase_sessions_sessions_restart_timeout"), d.f0));
        }
        return null;
    }

    @Override
    public Object c(e<? super t> e8) {
        return h.a.a(this, e8);
    }

    @Override
    public Double d() {
        if (this.a.containsKey("firebase_sessions_sampling_rate")) {
            return this.a.getDouble("firebase_sessions_sampling_rate");
        }
        return null;
    }

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

