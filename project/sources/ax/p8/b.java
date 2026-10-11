package ax.p8;

import android.content.Context;
import android.os.Bundle;
import ax.Gb.l;
import ax.p8.h;
import ax.sb.t;

/* loaded from: classes3.dex */
public final class b implements h {
    private static final a b = new a(null);
    private final Bundle a;

    private static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public b(Context context) {
        l.f(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // ax.p8.h
    public Boolean a() {
        if (this.a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // ax.p8.h
    public ax.Pb.a b() {
        if (this.a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return ax.Pb.a.h(ax.Pb.c.h(this.a.getInt("firebase_sessions_sessions_restart_timeout"), ax.Pb.d.f0));
        }
        return null;
    }

    @Override // ax.p8.h
    public Object c(ax.wb.e<? super t> eVar) {
        return h.a.a(this, eVar);
    }

    @Override // ax.p8.h
    public Double d() {
        if (this.a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
