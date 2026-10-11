package ax.q1;

import ax.S0.C0976i;
import ax.T0.h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.q1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2844d {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    private C2844d(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    private static byte[] a(ax.S0.G g) {
        int U = g.U();
        int g2 = g.g();
        g.c0(U);
        return C0976i.j(g.f(), g2, U);
    }

    public static C2844d b(ax.S0.G g) throws ax.P0.E {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        try {
            g.c0(4);
            int M = (g.M() & 3) + 1;
            if (M == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int M2 = g.M() & 31;
            for (int i9 = 0; i9 < M2; i9++) {
                arrayList.add(a(g));
            }
            int M3 = g.M();
            for (int i10 = 0; i10 < M3; i10++) {
                arrayList.add(a(g));
            }
            if (M2 > 0) {
                h.m C = ax.T0.h.C((byte[]) arrayList.get(0), ax.T0.h.a.length, ((byte[]) arrayList.get(0)).length);
                int i11 = C.f;
                int i12 = C.g;
                int i13 = C.i + 8;
                int i14 = C.j + 8;
                int i15 = C.q;
                int i16 = C.r;
                int i17 = C.s;
                int i18 = C.t;
                float f2 = C.h;
                str = C0976i.f(C.a, C.b, C.c);
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                f = 1.0f;
            }
            return new C2844d(arrayList, M, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ax.P0.E.a("Error parsing AVC config", e);
        }
    }
}
