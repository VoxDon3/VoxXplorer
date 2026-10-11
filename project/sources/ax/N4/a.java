package ax.N4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.f;
import java.io.IOException;

/* loaded from: classes.dex */
public enum a {
    BASIC,
    PRO,
    BUSINESS;

    /* renamed from: ax.N4.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0154a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            a = iArr;
            try {
                iArr[a.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.PRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b extends f<a> {
        public static final b b = new b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a a(j jVar) throws IOException, i {
            String q;
            boolean z;
            a aVar;
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
            if ("basic".equals(q)) {
                aVar = a.BASIC;
            } else if ("pro".equals(q)) {
                aVar = a.PRO;
            } else {
                if (!"business".equals(q)) {
                    throw new i(jVar, "Unknown tag: " + q);
                }
                aVar = a.BUSINESS;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return aVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(a aVar, g gVar) throws IOException, ax.T4.f {
            int i = C0154a.a[aVar.ordinal()];
            if (i == 1) {
                gVar.s0("basic");
                return;
            }
            if (i == 2) {
                gVar.s0("pro");
            } else {
                if (i == 3) {
                    gVar.s0("business");
                    return;
                }
                throw new IllegalArgumentException("Unrecognized tag: " + aVar);
            }
        }
    }
}
