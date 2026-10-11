package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* renamed from: ax.G4.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0726q0 {
    JPEG,
    PNG;

    /* renamed from: ax.G4.q0$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0726q0.values().length];
            a = iArr;
            try {
                iArr[EnumC0726q0.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0726q0.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: ax.G4.q0$b */
    static class b extends ax.v4.f<EnumC0726q0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public EnumC0726q0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            EnumC0726q0 enumC0726q0;
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
            if ("jpeg".equals(q)) {
                enumC0726q0 = EnumC0726q0.JPEG;
            } else {
                if (!"png".equals(q)) {
                    throw new ax.T4.i(jVar, "Unknown tag: " + q);
                }
                enumC0726q0 = EnumC0726q0.PNG;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return enumC0726q0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(EnumC0726q0 enumC0726q0, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[enumC0726q0.ordinal()];
            if (i == 1) {
                gVar.s0("jpeg");
            } else {
                if (i == 2) {
                    gVar.s0("png");
                    return;
                }
                throw new IllegalArgumentException("Unrecognized tag: " + enumC0726q0);
            }
        }
    }
}
