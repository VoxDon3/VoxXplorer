package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* renamed from: ax.G4.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0729s0 {
    W32H32,
    W64H64,
    W128H128,
    W256H256,
    W480H320,
    W640H480,
    W960H640,
    W1024H768,
    W2048H1536;

    /* renamed from: ax.G4.s0$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0729s0.values().length];
            a = iArr;
            try {
                iArr[EnumC0729s0.W32H32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0729s0.W64H64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC0729s0.W128H128.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC0729s0.W256H256.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC0729s0.W480H320.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC0729s0.W640H480.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC0729s0.W960H640.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[EnumC0729s0.W1024H768.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[EnumC0729s0.W2048H1536.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: ax.G4.s0$b */
    static class b extends ax.v4.f<EnumC0729s0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public EnumC0729s0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            EnumC0729s0 enumC0729s0;
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
            if ("w32h32".equals(q)) {
                enumC0729s0 = EnumC0729s0.W32H32;
            } else if ("w64h64".equals(q)) {
                enumC0729s0 = EnumC0729s0.W64H64;
            } else if ("w128h128".equals(q)) {
                enumC0729s0 = EnumC0729s0.W128H128;
            } else if ("w256h256".equals(q)) {
                enumC0729s0 = EnumC0729s0.W256H256;
            } else if ("w480h320".equals(q)) {
                enumC0729s0 = EnumC0729s0.W480H320;
            } else if ("w640h480".equals(q)) {
                enumC0729s0 = EnumC0729s0.W640H480;
            } else if ("w960h640".equals(q)) {
                enumC0729s0 = EnumC0729s0.W960H640;
            } else if ("w1024h768".equals(q)) {
                enumC0729s0 = EnumC0729s0.W1024H768;
            } else {
                if (!"w2048h1536".equals(q)) {
                    throw new ax.T4.i(jVar, "Unknown tag: " + q);
                }
                enumC0729s0 = EnumC0729s0.W2048H1536;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return enumC0729s0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(EnumC0729s0 enumC0729s0, ax.T4.g gVar) throws IOException, ax.T4.f {
            switch (a.a[enumC0729s0.ordinal()]) {
                case 1:
                    gVar.s0("w32h32");
                    return;
                case 2:
                    gVar.s0("w64h64");
                    return;
                case 3:
                    gVar.s0("w128h128");
                    return;
                case 4:
                    gVar.s0("w256h256");
                    return;
                case 5:
                    gVar.s0("w480h320");
                    return;
                case 6:
                    gVar.s0("w640h480");
                    return;
                case 7:
                    gVar.s0("w960h640");
                    return;
                case 8:
                    gVar.s0("w1024h768");
                    return;
                case 9:
                    gVar.s0("w2048h1536");
                    return;
                default:
                    throw new IllegalArgumentException("Unrecognized tag: " + enumC0729s0);
            }
        }
    }
}
