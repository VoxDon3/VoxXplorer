package ax.B7;

import ax.A7.a;
import ax.e6.C1982a;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a {
    Set<String> a;
    private a.b b;
    private C1982a c;
    private d d;

    public a(C1982a c1982a, a.b bVar) {
        this.b = bVar;
        this.c = c1982a;
        d dVar = new d(this);
        this.d = dVar;
        this.c.f(dVar);
        this.a = new HashSet();
    }
}
