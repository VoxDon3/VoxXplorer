package ax.L4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* loaded from: classes.dex */
public enum a {
    ADMINS_AND_MEMBERS,
    ADMINS_ONLY;

    /* renamed from: ax.L4.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0119a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            a = iArr;
            try {
                iArr[a.ADMINS_AND_MEMBERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.ADMINS_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b extends ax.v4.f<a> {
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
            if ("admins_and_members".equals(q)) {
                aVar = a.ADMINS_AND_MEMBERS;
            } else {
                if (!"admins_only".equals(q)) {
                    throw new i(jVar, "Unknown tag: " + q);
                }
                aVar = a.ADMINS_ONLY;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return aVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(a aVar, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = C0119a.a[aVar.ordinal()];
            if (i == 1) {
                gVar.s0("admins_and_members");
            } else {
                if (i == 2) {
                    gVar.s0("admins_only");
                    return;
                }
                throw new IllegalArgumentException("Unrecognized tag: " + aVar);
            }
        }
    }
}
