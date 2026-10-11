package ax.L4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* loaded from: classes.dex */
public enum f {
    DEFAULT_PUBLIC,
    DEFAULT_TEAM_ONLY,
    TEAM_ONLY,
    DEFAULT_NO_ONE,
    OTHER;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.values().length];
            a = iArr;
            try {
                iArr[f.DEFAULT_PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.DEFAULT_TEAM_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.TEAM_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[f.DEFAULT_NO_ONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static class b extends ax.v4.f<f> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public f a(j jVar) throws IOException, i {
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
            f fVar = "default_public".equals(q) ? f.DEFAULT_PUBLIC : "default_team_only".equals(q) ? f.DEFAULT_TEAM_ONLY : "team_only".equals(q) ? f.TEAM_ONLY : "default_no_one".equals(q) ? f.DEFAULT_NO_ONE : f.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return fVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(f fVar, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[fVar.ordinal()];
            if (i == 1) {
                gVar.s0("default_public");
                return;
            }
            if (i == 2) {
                gVar.s0("default_team_only");
                return;
            }
            if (i == 3) {
                gVar.s0("team_only");
            } else if (i != 4) {
                gVar.s0("other");
            } else {
                gVar.s0("default_no_one");
            }
        }
    }
}
