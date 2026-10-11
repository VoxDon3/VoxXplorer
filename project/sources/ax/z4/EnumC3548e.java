package ax.z4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* renamed from: ax.z4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3548e {
    PAPER_DISABLED,
    NOT_PAPER_USER,
    OTHER;

    /* renamed from: ax.z4.e$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC3548e.values().length];
            a = iArr;
            try {
                iArr[EnumC3548e.PAPER_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC3548e.NOT_PAPER_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: ax.z4.e$b */
    public static class b extends ax.v4.f<EnumC3548e> {
        public static final b b = new b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public EnumC3548e a(j jVar) throws IOException, i {
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
            EnumC3548e enumC3548e = "paper_disabled".equals(q) ? EnumC3548e.PAPER_DISABLED : "not_paper_user".equals(q) ? EnumC3548e.NOT_PAPER_USER : EnumC3548e.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return enumC3548e;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(EnumC3548e enumC3548e, g gVar) throws IOException, ax.T4.f {
            int i = a.a[enumC3548e.ordinal()];
            if (i == 1) {
                gVar.s0("paper_disabled");
            } else if (i != 2) {
                gVar.s0("other");
            } else {
                gVar.s0("not_paper_user");
            }
        }
    }
}
