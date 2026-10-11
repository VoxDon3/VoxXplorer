package ax.q1;

import ax.S0.C0976i;
import ax.T0.h;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class G {
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
    public final int k;
    public final int l;
    public final int m;
    public final float n;
    public final int o;
    public final String p;
    public final h.k q;

    private G(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, int i13, String str, h.k kVar) {
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
        this.k = i10;
        this.l = i11;
        this.m = i12;
        this.n = f;
        this.o = i13;
        this.p = str;
        this.q = kVar;
    }

    public static G a(ax.S0.G g) throws ax.P0.E {
        return b(g, false, null);
    }

    private static G b(ax.S0.G g, boolean z, h.k kVar) throws ax.P0.E {
        int i;
        h.g t;
        int i2;
        try {
            if (z) {
                g.c0(4);
            } else {
                g.c0(21);
            }
            int M = g.M() & 3;
            int M2 = g.M();
            int g2 = g.g();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < M2; i5++) {
                g.c0(1);
                int U = g.U();
                for (int i6 = 0; i6 < U; i6++) {
                    int U2 = g.U();
                    i4 += U2 + 4;
                    g.c0(U2);
                }
            }
            g.b0(g2);
            byte[] bArr = new byte[i4];
            h.k kVar2 = kVar;
            String str = null;
            int i7 = 0;
            int i8 = 0;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            float f = 1.0f;
            int i20 = -1;
            while (i7 < M2) {
                int M3 = g.M() & 63;
                int U3 = g.U();
                h.k kVar3 = kVar2;
                int i21 = 0;
                while (i21 < U3) {
                    int U4 = g.U();
                    byte[] bArr2 = ax.T0.h.a;
                    int i22 = M;
                    System.arraycopy(bArr2, i3, bArr, i8, bArr2.length);
                    int length = i8 + bArr2.length;
                    System.arraycopy(g.f(), g.g(), bArr, length, U4);
                    if (M3 == 32 && i21 == 0) {
                        kVar3 = ax.T0.h.y(bArr, length, length + U4);
                        i = M2;
                    } else {
                        if (M3 == 33 && i21 == 0) {
                            h.C0193h u = ax.T0.h.u(bArr, length, length + U4, kVar3);
                            i9 = u.b + 1;
                            i10 = u.h;
                            int i23 = u.i;
                            int i24 = u.j;
                            i = M2;
                            int i25 = u.k;
                            i14 = u.e + 8;
                            i15 = u.f + 8;
                            int i26 = u.n;
                            int i27 = u.o;
                            int i28 = u.p;
                            float f2 = u.l;
                            int i29 = u.m;
                            h.c cVar = u.c;
                            if (cVar != null) {
                                i2 = i29;
                                str = C0976i.h(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f);
                            } else {
                                i2 = i29;
                            }
                            f = f2;
                            i20 = i2;
                            i17 = i27;
                            i18 = i28;
                            i13 = i25;
                            i16 = i26;
                            i12 = i24;
                            i11 = i23;
                        } else {
                            i = M2;
                            if (M3 == 39 && i21 == 0 && (t = ax.T0.h.t(bArr, length, length + U4)) != null && kVar3 != null) {
                                i3 = 0;
                                i19 = t.d == kVar3.b.get(0).b ? 4 : 5;
                            }
                        }
                        i3 = 0;
                    }
                    i8 = length + U4;
                    g.c0(U4);
                    i21++;
                    M = i22;
                    M2 = i;
                }
                i7++;
                kVar2 = kVar3;
            }
            return new G(i4 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), M + 1, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, f, i20, str, kVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing");
            sb.append(z ? "L-HEVC config" : "HEVC config");
            throw ax.P0.E.a(sb.toString(), e);
        }
    }

    public static G c(ax.S0.G g, h.k kVar) throws ax.P0.E {
        return b(g, true, kVar);
    }
}
