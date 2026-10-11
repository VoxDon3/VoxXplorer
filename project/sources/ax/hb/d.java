package ax.hb;

import ax.Za.b;
import ax.db.j;
import ax.db.q;

@Deprecated
/* loaded from: classes3.dex */
public final class d {
    private static final b.d<q> a = ax.Za.b.m("opencensus-trace-span-key");

    public static q a(ax.Za.b bVar) {
        q a2 = a.a((ax.Za.b) ax.cb.b.b(bVar, "context"));
        return a2 == null ? j.e : a2;
    }

    public static ax.Za.b b(ax.Za.b bVar, q qVar) {
        return ((ax.Za.b) ax.cb.b.b(bVar, "context")).A(a, qVar);
    }
}
