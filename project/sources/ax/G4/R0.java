package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* loaded from: classes.dex */
public enum R0 {
    FILE,
    FOLDER,
    FILE_ANCESTOR,
    OTHER;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[R0.values().length];
            a = iArr;
            try {
                iArr[R0.FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[R0.FOLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[R0.FILE_ANCESTOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b extends ax.v4.f<R0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public R0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
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
            R0 r0 = "file".equals(q) ? R0.FILE : "folder".equals(q) ? R0.FOLDER : "file_ancestor".equals(q) ? R0.FILE_ANCESTOR : R0.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return r0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(R0 r0, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[r0.ordinal()];
            if (i == 1) {
                gVar.s0("file");
                return;
            }
            if (i == 2) {
                gVar.s0("folder");
            } else if (i != 3) {
                gVar.s0("other");
            } else {
                gVar.s0("file_ancestor");
            }
        }
    }
}
