package ax.n0;

import ax.Qb.J;
import ax.o0.C2654a;
import ax.o0.C2655b;
import ax.tb.C3139o;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class g {
    public static final g a = new g();

    private g() {
    }

    public final <T> f<T> a(k<T> kVar, C2655b<T> c2655b, List<? extends d<T>> list, J j, ax.Fb.a<? extends File> aVar) {
        ax.Gb.l.f(kVar, "serializer");
        ax.Gb.l.f(list, "migrations");
        ax.Gb.l.f(j, "scope");
        ax.Gb.l.f(aVar, "produceFile");
        if (c2655b == null) {
            c2655b = (C2655b<T>) new C2654a();
        }
        return new m(aVar, kVar, C3139o.d(e.a.b(list)), c2655b, j);
    }
}
