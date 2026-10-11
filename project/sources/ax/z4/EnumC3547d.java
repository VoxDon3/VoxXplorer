package ax.z4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* renamed from: ax.z4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3547d {
    ENDPOINT,
    FEATURE,
    OTHER;

    /* renamed from: ax.z4.d$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC3547d.values().length];
            a = iArr;
            try {
                iArr[EnumC3547d.ENDPOINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC3547d.FEATURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: ax.z4.d$b */
    public static class b extends ax.v4.f<EnumC3547d> {
        public static final b b = new b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public EnumC3547d a(j jVar) throws IOException, i {
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
            EnumC3547d enumC3547d = "endpoint".equals(q) ? EnumC3547d.ENDPOINT : "feature".equals(q) ? EnumC3547d.FEATURE : EnumC3547d.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return enumC3547d;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(EnumC3547d enumC3547d, g gVar) throws IOException, ax.T4.f {
            int i = a.a[enumC3547d.ordinal()];
            if (i == 1) {
                gVar.s0("endpoint");
            } else if (i != 2) {
                gVar.s0("other");
            } else {
                gVar.s0("feature");
            }
        }
    }
}
