package ax.yc;

import ax.Gb.l;
import ax.xc.C3484b;
import ax.xc.C3487e;
import ax.xc.F;
import ax.xc.s;
import ax.xc.x;

/* renamed from: ax.yc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3524a {
    private static final byte[] a = F.a("0123456789abcdef");

    public static final C3487e.a a(C3487e c3487e, C3487e.a aVar) {
        l.f(c3487e, "<this>");
        l.f(aVar, "unsafeCursor");
        C3487e.a g = C3484b.g(aVar);
        if (g.q != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        g.q = c3487e;
        g.c0 = true;
        return g;
    }

    public static final byte[] b() {
        return a;
    }

    public static final boolean c(x xVar, int i, byte[] bArr, int i2, int i3) {
        l.f(xVar, "segment");
        l.f(bArr, "bytes");
        int i4 = xVar.c;
        byte[] bArr2 = xVar.a;
        while (i2 < i3) {
            if (i == i4) {
                xVar = xVar.f;
                l.c(xVar);
                byte[] bArr3 = xVar.a;
                bArr2 = bArr3;
                i = xVar.b;
                i4 = xVar.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String d(C3487e c3487e, long j) {
        l.f(c3487e, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c3487e.v(j2) == 13) {
                String a1 = c3487e.a1(j2);
                c3487e.skip(2L);
                return a1;
            }
        }
        String a12 = c3487e.a1(j);
        c3487e.skip(1L);
        return a12;
    }

    public static final int e(C3487e c3487e, s sVar, boolean z) {
        int i;
        int i2;
        x xVar;
        int i3;
        int i4;
        l.f(c3487e, "<this>");
        l.f(sVar, "options");
        x xVar2 = c3487e.q;
        if (xVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = xVar2.a;
        int i5 = xVar2.b;
        int i6 = xVar2.c;
        int[] p = sVar.p();
        x xVar3 = xVar2;
        int i7 = 0;
        int i8 = -1;
        loop0: while (true) {
            int i9 = i7 + 1;
            int i10 = p[i7];
            int i11 = i7 + 2;
            int i12 = p[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (xVar3 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & 255;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == p[i11]) {
                        i2 = p[i11 + i10];
                        if (i == i6) {
                            xVar3 = xVar3.f;
                            l.c(xVar3);
                            i = xVar3.b;
                            bArr = xVar3.a;
                            i6 = xVar3.c;
                            if (xVar3 == xVar2) {
                                xVar3 = null;
                            }
                        }
                        if (i2 >= 0) {
                            return i2;
                        }
                        i7 = -i2;
                        i5 = i;
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
            int i15 = i11 + (i10 * (-1));
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & 255) != p[i11]) {
                    break loop0;
                }
                boolean z2 = i17 == i15;
                if (i16 == i6) {
                    l.c(xVar3);
                    x xVar4 = xVar3.f;
                    l.c(xVar4);
                    i4 = xVar4.b;
                    byte[] bArr2 = xVar4.a;
                    i3 = xVar4.c;
                    if (xVar4 != xVar2) {
                        xVar = xVar4;
                        bArr = bArr2;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr2;
                        xVar = null;
                    }
                } else {
                    xVar = xVar3;
                    i3 = i6;
                    i4 = i16;
                }
                if (z2) {
                    i2 = p[i17];
                    i = i4;
                    i6 = i3;
                    xVar3 = xVar;
                    break;
                }
                i5 = i4;
                i6 = i3;
                xVar3 = xVar;
                i11 = i17;
            }
        }
        if (z) {
            return -2;
        }
        return i8;
    }

    public static /* synthetic */ int f(C3487e c3487e, s sVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return e(c3487e, sVar, z);
    }
}
