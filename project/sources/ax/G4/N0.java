package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* loaded from: classes.dex */
public enum N0 {
    SEQUENTIAL,
    CONCURRENT,
    OTHER;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[N0.values().length];
            a = iArr;
            try {
                iArr[N0.SEQUENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[N0.CONCURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class b extends ax.v4.f<N0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public N0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            if (jVar.j() == ax.T4.m.VALUE_STRING) {
                q = AbstractC3276c.i(jVar);
                jVar.H();
                z = true;
            } else {
                AbstractC3276c.h(jVar);
                q = AbstractC3274a.q(jVar);
                z = false;
            }
            if (q == null) {
                throw new ax.T4.i(jVar, "Required field missing: .tag");
            }
            N0 n0 = "sequential".equals(q) ? N0.SEQUENTIAL : "concurrent".equals(q) ? N0.CONCURRENT : N0.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return n0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(N0 n0, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[n0.ordinal()];
            if (i == 1) {
                gVar.s0("sequential");
            } else if (i != 2) {
                gVar.s0("other");
            } else {
                gVar.s0("concurrent");
            }
        }
    }
}
