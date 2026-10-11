package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* renamed from: ax.G4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0734w {
    ACTIVE,
    DELETED,
    OTHER;

    /* renamed from: ax.G4.w$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0734w.values().length];
            a = iArr;
            try {
                iArr[EnumC0734w.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0734w.DELETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: ax.G4.w$b */
    static class b extends ax.v4.f<EnumC0734w> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public EnumC0734w a(ax.T4.j jVar) throws IOException, ax.T4.i {
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
            EnumC0734w enumC0734w = "active".equals(q) ? EnumC0734w.ACTIVE : "deleted".equals(q) ? EnumC0734w.DELETED : EnumC0734w.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return enumC0734w;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(EnumC0734w enumC0734w, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[enumC0734w.ordinal()];
            if (i == 1) {
                gVar.s0("active");
            } else if (i != 2) {
                gVar.s0("other");
            } else {
                gVar.s0("deleted");
            }
        }
    }
}
