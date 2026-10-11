package ax.K1;

import ax.S0.G;
import ax.q1.InterfaceC2858s;
import ax.q1.S;
import java.io.IOException;

/* loaded from: classes.dex */
public final class s {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static S b(InterfaceC2858s interfaceC2858s) throws IOException {
        return c(interfaceC2858s, true, false);
    }

    private static S c(InterfaceC2858s interfaceC2858s, boolean z, boolean z2) throws IOException {
        S s;
        boolean z3;
        long j;
        int i;
        long j2;
        int i2;
        int[] iArr;
        long length = interfaceC2858s.getLength();
        long j3 = 4096;
        long j4 = -1;
        if (length != -1 && length <= 4096) {
            j3 = length;
        }
        int i3 = (int) j3;
        G g = new G(64);
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i3) {
            g.X(8);
            boolean z5 = true;
            if (!interfaceC2858s.h(g.f(), i4, 8, true)) {
                break;
            }
            long O = g.O();
            int v = g.v();
            if (O == 1) {
                j = j4;
                interfaceC2858s.p(g.f(), 8, 8);
                i2 = 16;
                g.a0(16);
                i = i5;
                j2 = g.F();
            } else {
                j = j4;
                if (O == 0) {
                    long length2 = interfaceC2858s.getLength();
                    if (length2 != j) {
                        i = i5;
                        O = (length2 - interfaceC2858s.i()) + 8;
                        j2 = O;
                        i2 = 8;
                    }
                }
                i = i5;
                j2 = O;
                i2 = 8;
            }
            long j5 = i2;
            if (j2 < j5) {
                return new a(v, j2, i2);
            }
            int i6 = i + i2;
            s = null;
            if (v == 1836019574) {
                i3 += (int) j2;
                if (length != -1 && i3 > length) {
                    i3 = (int) length;
                }
                i5 = i6;
                j4 = j;
            } else {
                if (v == 1836019558 || v == 1836475768) {
                    z3 = true;
                    break;
                }
                if (v == 1835295092) {
                    z4 = true;
                }
                long j6 = length;
                if ((i6 + j2) - j5 >= i3) {
                    break;
                }
                int i7 = (int) (j2 - j5);
                i5 = i6 + i7;
                if (v == 1718909296) {
                    if (i7 < 8) {
                        return new a(v, i7, 8);
                    }
                    g.X(i7);
                    interfaceC2858s.p(g.f(), 0, i7);
                    int v2 = g.v();
                    if (a(v2, z2)) {
                        z4 = true;
                    }
                    g.c0(4);
                    int a2 = g.a() / 4;
                    if (!z4 && a2 > 0) {
                        iArr = new int[a2];
                        int i8 = 0;
                        while (true) {
                            if (i8 >= a2) {
                                z5 = z4;
                                break;
                            }
                            int v3 = g.v();
                            iArr[i8] = v3;
                            if (a(v3, z2)) {
                                break;
                            }
                            i8++;
                        }
                    } else {
                        z5 = z4;
                        iArr = null;
                    }
                    if (!z5) {
                        return new x(v2, iArr);
                    }
                    z4 = z5;
                } else if (i7 != 0) {
                    interfaceC2858s.j(i7);
                }
                j4 = j;
                length = j6;
            }
            i4 = 0;
        }
        s = null;
        z3 = false;
        return !z4 ? o.a : z != z3 ? z3 ? i.b : i.c : s;
    }

    public static S d(InterfaceC2858s interfaceC2858s, boolean z) throws IOException {
        return c(interfaceC2858s, false, z);
    }
}
