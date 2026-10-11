package ax.q1;

import ax.P0.C0906o;
import ax.P0.C0912v;
import ax.S0.d0;
import java.nio.ByteBuffer;

/* renamed from: ax.q1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2842b {
    private static final int[] a = {1, 2, 3, 6};
    private static final int[] b = {48000, 44100, 32000};
    private static final int[] c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: ax.q1.b$b, reason: collision with other inner class name */
    public static final class C0424b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        private C0424b(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = str;
            this.b = i;
            this.d = i2;
            this.c = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
        }
    }

    private static int a(int i, int i2, int i3) {
        return (i * i2) / (i3 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((d0.P(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    private static int c(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static C0912v d(ax.S0.G g, String str, String str2, C0906o c0906o) {
        ax.S0.F f2 = new ax.S0.F();
        f2.m(g);
        int i = b[f2.h(2)];
        f2.r(8);
        int i2 = d[f2.h(3)];
        if (f2.h(1) != 0) {
            i2++;
        }
        int i3 = e[f2.h(5)] * 1000;
        f2.c();
        g.b0(f2.d());
        return new C0912v.b().j0(str).y0("audio/ac3").T(i2).z0(i).c0(c0906o).n0(str2).S(i3).t0(i3).P();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0424b f(ax.S0.F f2) {
        int c2;
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int e2 = f2.e();
        f2.r(40);
        boolean z = f2.h(5) > 10;
        f2.p(e2);
        int i11 = -1;
        if (z) {
            f2.r(16);
            int h = f2.h(2);
            if (h == 0) {
                i11 = 0;
            } else if (h == 1) {
                i11 = 1;
            } else if (h == 2) {
                i11 = 2;
            }
            f2.r(3);
            c2 = (f2.h(11) + 1) * 2;
            int h2 = f2.h(2);
            if (h2 == 3) {
                i = c[f2.h(2)];
                i6 = 3;
                i7 = 6;
            } else {
                int h3 = f2.h(2);
                int i12 = a[h3];
                i6 = h3;
                i = b[h2];
                i7 = i12;
            }
            int i13 = i7 * 256;
            int a2 = a(c2, i, i7);
            int h4 = f2.h(3);
            boolean g = f2.g();
            i2 = d[h4] + (g ? 1 : 0);
            f2.r(10);
            if (f2.g()) {
                f2.r(8);
            }
            if (h4 == 0) {
                f2.r(5);
                if (f2.g()) {
                    f2.r(8);
                }
            }
            if (i11 == 1 && f2.g()) {
                f2.r(16);
            }
            if (f2.g()) {
                if (h4 > 2) {
                    f2.r(2);
                }
                if ((h4 & 1) == 0 || h4 <= 2) {
                    i9 = 6;
                } else {
                    i9 = 6;
                    f2.r(6);
                }
                if ((h4 & 4) != 0) {
                    f2.r(i9);
                }
                if (g && f2.g()) {
                    f2.r(5);
                }
                if (i11 == 0) {
                    if (f2.g()) {
                        i10 = 6;
                        f2.r(6);
                    } else {
                        i10 = 6;
                    }
                    if (h4 == 0 && f2.g()) {
                        f2.r(i10);
                    }
                    if (f2.g()) {
                        f2.r(i10);
                    }
                    int h5 = f2.h(2);
                    if (h5 == 1) {
                        f2.r(5);
                    } else if (h5 == 2) {
                        f2.r(12);
                    } else if (h5 == 3) {
                        int h6 = f2.h(5);
                        if (f2.g()) {
                            f2.r(5);
                            if (f2.g()) {
                                f2.r(4);
                            }
                            if (f2.g()) {
                                f2.r(4);
                            }
                            if (f2.g()) {
                                f2.r(4);
                            }
                            if (f2.g()) {
                                f2.r(4);
                            }
                            if (f2.g()) {
                                f2.r(4);
                            }
                            if (f2.g()) {
                                f2.r(4);
                            }
                            if (f2.g()) {
                                f2.r(4);
                            }
                            if (f2.g()) {
                                if (f2.g()) {
                                    f2.r(4);
                                }
                                if (f2.g()) {
                                    f2.r(4);
                                }
                            }
                        }
                        if (f2.g()) {
                            f2.r(5);
                            if (f2.g()) {
                                f2.r(7);
                                if (f2.g()) {
                                    f2.r(8);
                                }
                            }
                        }
                        f2.r((h6 + 2) * 8);
                        f2.c();
                    }
                    if (h4 < 2) {
                        if (f2.g()) {
                            f2.r(14);
                        }
                        if (h4 == 0 && f2.g()) {
                            f2.r(14);
                        }
                    }
                    if (f2.g()) {
                        if (i6 == 0) {
                            f2.r(5);
                        } else {
                            for (int i14 = 0; i14 < i7; i14++) {
                                if (f2.g()) {
                                    f2.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (f2.g()) {
                f2.r(5);
                if (h4 == 2) {
                    f2.r(4);
                }
                if (h4 >= 6) {
                    f2.r(2);
                }
                if (f2.g()) {
                    f2.r(8);
                }
                if (h4 == 0 && f2.g()) {
                    f2.r(8);
                }
                if (h2 < 3) {
                    f2.q();
                }
            }
            if (i11 == 0 && i6 != 3) {
                f2.q();
            }
            if (i11 == 2 && (i6 == 3 || f2.g())) {
                i8 = 6;
                f2.r(6);
            } else {
                i8 = 6;
            }
            str = (f2.g() && f2.h(i8) == 1 && f2.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i11;
            i5 = i13;
            i3 = a2;
        } else {
            f2.r(32);
            int h7 = f2.h(2);
            String str2 = h7 == 3 ? null : "audio/ac3";
            int h8 = f2.h(6);
            int i15 = e[h8 / 2] * 1000;
            c2 = c(h7, h8);
            f2.r(8);
            int h9 = f2.h(3);
            if ((h9 & 1) != 0 && h9 != 1) {
                f2.r(2);
            }
            if ((h9 & 4) != 0) {
                f2.r(2);
            }
            if (h9 == 2) {
                f2.r(2);
            }
            int[] iArr = b;
            i = h7 < iArr.length ? iArr[h7] : -1;
            i2 = d[h9] + (f2.g() ? 1 : 0);
            str = str2;
            i3 = i15;
            i4 = -1;
            i5 = 1536;
        }
        return new C0424b(str, i4, i2, i, c2, i5, i3);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return c((b2 & 192) >> 6, b2 & 63);
    }

    public static C0912v h(ax.S0.G g, String str, String str2, C0906o c0906o) {
        String str3;
        ax.S0.F f2 = new ax.S0.F();
        f2.m(g);
        int h = f2.h(13) * 1000;
        f2.r(3);
        int i = b[f2.h(2)];
        f2.r(10);
        int i2 = d[f2.h(3)];
        if (f2.h(1) != 0) {
            i2++;
        }
        f2.r(3);
        int h2 = f2.h(4);
        f2.r(1);
        if (h2 > 0) {
            f2.r(6);
            if (f2.h(1) != 0) {
                i2 += 2;
            }
            f2.r(1);
        }
        if (f2.b() > 7) {
            f2.r(7);
            if (f2.h(1) != 0) {
                str3 = "audio/eac3-joc";
                f2.c();
                g.b0(f2.d());
                return new C0912v.b().j0(str).y0(str3).T(i2).z0(i).c0(c0906o).n0(str2).t0(h).P();
            }
        }
        str3 = "audio/eac3";
        f2.c();
        g.b0(f2.d());
        return new C0912v.b().j0(str).y0(str3).T(i2).z0(i).c0(c0906o).n0(str2).t0(h).P();
    }

    public static int i(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
