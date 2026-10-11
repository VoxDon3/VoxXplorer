package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* loaded from: classes.dex */
public enum S {
    IS_SHARED_FOLDER,
    OTHER;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[S.values().length];
            a = iArr;
            try {
                iArr[S.IS_SHARED_FOLDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static class b extends ax.v4.f<S> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public S a(ax.T4.j jVar) throws IOException, ax.T4.i {
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
            S s = "is_shared_folder".equals(q) ? S.IS_SHARED_FOLDER : S.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return s;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(S s, ax.T4.g gVar) throws IOException, ax.T4.f {
            if (a.a[s.ordinal()] != 1) {
                gVar.s0("other");
            } else {
                gVar.s0("is_shared_folder");
            }
        }
    }
}
