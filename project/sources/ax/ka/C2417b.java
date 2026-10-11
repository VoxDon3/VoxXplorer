package ax.ka;

import android.opengl.GLES10;
import ax.ca.h;
import ax.ha.InterfaceC2175a;

/* renamed from: ax.ka.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2417b {
    private static ax.ca.e a;

    /* renamed from: ax.ka.b$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.values().length];
            a = iArr;
            try {
                iArr[h.FIT_INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int max = Math.max(iArr[0], 2048);
        a = new ax.ca.e(max, max);
    }

    public static int a(ax.ca.e eVar, ax.ca.e eVar2, h hVar, boolean z) {
        int max;
        int b = eVar.b();
        int a2 = eVar.a();
        int b2 = eVar2.b();
        int a3 = eVar2.a();
        int i = a.a[hVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                max = 1;
            } else if (z) {
                int i2 = b / 2;
                int i3 = a2 / 2;
                max = 1;
                while (i2 / max > b2 && i3 / max > a3) {
                    max *= 2;
                }
            } else {
                max = Math.min(b / b2, a2 / a3);
            }
        } else if (z) {
            int i4 = b / 2;
            int i5 = a2 / 2;
            max = 1;
            while (true) {
                if (i4 / max <= b2 && i5 / max <= a3) {
                    break;
                }
                max *= 2;
            }
        } else {
            max = Math.max(b / b2, a2 / a3);
        }
        return d(b, a2, max >= 1 ? max : 1, z);
    }

    public static float b(ax.ca.e eVar, ax.ca.e eVar2, h hVar, boolean z) {
        int b = eVar.b();
        int a2 = eVar.a();
        int b2 = eVar2.b();
        int a3 = eVar2.a();
        float f = b;
        float f2 = f / b2;
        float f3 = a2;
        float f4 = f3 / a3;
        if ((hVar != h.FIT_INSIDE || f2 < f4) && (hVar != h.CROP || f2 >= f4)) {
            b2 = (int) (f / f4);
        } else {
            a3 = (int) (f3 / f2);
        }
        if ((z || b2 >= b || a3 >= a2) && (!z || b2 == b || a3 == a2)) {
            return 1.0f;
        }
        return b2 / f;
    }

    public static int c(ax.ca.e eVar) {
        int b = eVar.b();
        int a2 = eVar.a();
        return Math.max((int) Math.ceil(b / a.b()), (int) Math.ceil(a2 / a.a()));
    }

    private static int d(int i, int i2, int i3, boolean z) {
        int b = a.b();
        int a2 = a.a();
        while (true) {
            if (i / i3 <= b && i2 / i3 <= a2) {
                return i3;
            }
            i3 = z ? i3 * 2 : i3 + 1;
        }
    }

    public static ax.ca.e e(InterfaceC2175a interfaceC2175a, ax.ca.e eVar) {
        int i = interfaceC2175a.i();
        int b = i <= 0 ? eVar.b() : Math.min(i, eVar.b());
        int f = interfaceC2175a.f();
        return new ax.ca.e(b, f <= 0 ? eVar.a() : Math.min(f, eVar.a()));
    }
}
