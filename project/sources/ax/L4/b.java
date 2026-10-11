package ax.L4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* loaded from: classes.dex */
public enum b {
    DISABLED,
    ENABLED,
    OTHER;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: ax.L4.b$b, reason: collision with other inner class name */
    public static class C0120b extends ax.v4.f<b> {
        public static final C0120b b = new C0120b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public b a(j jVar) throws IOException, i {
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
            b bVar = "disabled".equals(q) ? b.DISABLED : "enabled".equals(q) ? b.ENABLED : b.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return bVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(b bVar, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[bVar.ordinal()];
            if (i == 1) {
                gVar.s0("disabled");
            } else if (i != 2) {
                gVar.s0("other");
            } else {
                gVar.s0("enabled");
            }
        }
    }
}
