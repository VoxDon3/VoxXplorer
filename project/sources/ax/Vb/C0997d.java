package ax.Vb;

/* renamed from: ax.Vb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0997d {
    private static final F a = new F("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ax.Vb.e] */
    public static final <N extends AbstractC0998e<N>> N b(N n) {
        while (true) {
            Object f = n.f();
            if (f == a) {
                return n;
            }
            ?? r0 = (AbstractC0998e) f;
            if (r0 != 0) {
                n = r0;
            } else if (n.j()) {
                return n;
            }
        }
    }

    public static final <S extends C<S>> Object c(S s, long j, ax.Fb.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s.d0 >= j && !s.h()) {
                return D.a(s);
            }
            Object f = s.f();
            if (f == a) {
                return D.a(a);
            }
            S s2 = (S) ((AbstractC0998e) f);
            if (s2 == null) {
                s2 = pVar.j(Long.valueOf(s.d0 + 1), s);
                if (s.l(s2)) {
                    if (s.h()) {
                        s.k();
                    }
                }
            }
            s = s2;
        }
    }
}
