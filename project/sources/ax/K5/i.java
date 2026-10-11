package ax.K5;

import ax.M5.C0821p;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class i {
    public static <R extends l> h<R> a(R r, g gVar) {
        C0821p.m(r, "Result must not be null");
        C0821p.b(!r.e().C(), "Status code must not be SUCCESS");
        q qVar = new q(gVar, r);
        qVar.f(r);
        return qVar;
    }

    public static h<Status> b(Status status, g gVar) {
        C0821p.m(status, "Result must not be null");
        ax.L5.m mVar = new ax.L5.m(gVar);
        mVar.f(status);
        return mVar;
    }
}
