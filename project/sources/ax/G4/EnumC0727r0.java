package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* renamed from: ax.G4.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0727r0 {
    STRICT,
    BESTFIT,
    FITONE_BESTFIT;

    /* renamed from: ax.G4.r0$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0727r0.values().length];
            a = iArr;
            try {
                iArr[EnumC0727r0.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0727r0.BESTFIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC0727r0.FITONE_BESTFIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: ax.G4.r0$b */
    static class b extends ax.v4.f<EnumC0727r0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public EnumC0727r0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            EnumC0727r0 enumC0727r0;
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
            if ("strict".equals(q)) {
                enumC0727r0 = EnumC0727r0.STRICT;
            } else if ("bestfit".equals(q)) {
                enumC0727r0 = EnumC0727r0.BESTFIT;
            } else {
                if (!"fitone_bestfit".equals(q)) {
                    throw new ax.T4.i(jVar, "Unknown tag: " + q);
                }
                enumC0727r0 = EnumC0727r0.FITONE_BESTFIT;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return enumC0727r0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(EnumC0727r0 enumC0727r0, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[enumC0727r0.ordinal()];
            if (i == 1) {
                gVar.s0("strict");
                return;
            }
            if (i == 2) {
                gVar.s0("bestfit");
            } else {
                if (i == 3) {
                    gVar.s0("fitone_bestfit");
                    return;
                }
                throw new IllegalArgumentException("Unrecognized tag: " + enumC0727r0);
            }
        }
    }
}
