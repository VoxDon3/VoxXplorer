package ax.M5;

import ax.j6.AbstractC2327j;
import ax.j6.C2328k;

/* renamed from: ax.M5.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0820o {
    private static final M a = new J();

    /* renamed from: ax.M5.o$a */
    public interface a<R extends ax.K5.l, T> {
        T a(R r);
    }

    public static <R extends ax.K5.l, T> AbstractC2327j<T> a(ax.K5.h<R> hVar, a<R, T> aVar) {
        M m = a;
        C2328k c2328k = new C2328k();
        hVar.a(new K(hVar, c2328k, aVar, m));
        return c2328k.a();
    }

    public static <R extends ax.K5.l> AbstractC2327j<Void> b(ax.K5.h<R> hVar) {
        return a(hVar, new L());
    }
}
