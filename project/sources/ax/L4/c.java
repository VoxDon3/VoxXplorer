package ax.L4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* loaded from: classes.dex */
public enum c {
    MEMBERS,
    ANYONE,
    OTHER;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.MEMBERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.ANYONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class b extends ax.v4.f<c> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public c a(j jVar) throws IOException, i {
            String q;
            boolean z;
            if (jVar.j() == m.VALUE_STRING) {
                q = AbstractC3276c.i(jVar);
                jVar.H();
                z = true;
            } else {
                AbstractC3276c.h(jVar);
                q = AbstractC3274a.q(jVar);
                z = false;
            }
            if (q == null) {
                throw new i(jVar, "Required field missing: .tag");
            }
            c cVar = "members".equals(q) ? c.MEMBERS : "anyone".equals(q) ? c.ANYONE : c.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return cVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(c cVar, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[cVar.ordinal()];
            if (i == 1) {
                gVar.s0("members");
            } else if (i != 2) {
                gVar.s0("other");
            } else {
                gVar.s0("anyone");
            }
        }
    }
}
