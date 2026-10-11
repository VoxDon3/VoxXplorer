package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* renamed from: ax.G4.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0706g0 {
    RELEVANCE,
    LAST_MODIFIED_TIME,
    OTHER;

    /* renamed from: ax.G4.g0$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0706g0.values().length];
            a = iArr;
            try {
                iArr[EnumC0706g0.RELEVANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0706g0.LAST_MODIFIED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: ax.G4.g0$b */
    static class b extends ax.v4.f<EnumC0706g0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public EnumC0706g0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
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
            EnumC0706g0 enumC0706g0 = "relevance".equals(q) ? EnumC0706g0.RELEVANCE : "last_modified_time".equals(q) ? EnumC0706g0.LAST_MODIFIED_TIME : EnumC0706g0.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return enumC0706g0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(EnumC0706g0 enumC0706g0, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[enumC0706g0.ordinal()];
            if (i == 1) {
                gVar.s0("relevance");
            } else if (i != 2) {
                gVar.s0("other");
            } else {
                gVar.s0("last_modified_time");
            }
        }
    }
}
