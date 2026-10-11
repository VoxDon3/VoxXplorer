package ax.q1;

import ax.S0.d0;
import java.nio.ByteBuffer;
import okhttp3.internal.ws.WebSocketProtocol;

/* renamed from: ax.q1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2843c {
    private static final int[] a = {2002, 2000, 1920, 1601, 1600, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: ax.q1.c$b */
    private static final class b {
        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public int e;
        public int f;
        public int g;

        private b() {
            this.a = true;
            this.b = -1;
            this.c = -1;
            this.d = true;
            this.e = 2;
            this.f = 1;
            this.g = 0;
        }
    }

    /* renamed from: ax.q1.c$c, reason: collision with other inner class name */
    public static final class C0425c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private C0425c(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.c = i2;
            this.b = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    private static String a(int i, int i2, int i3) {
        return d0.G("ac-4.%02d.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static void b(int i, ax.S0.G g) {
        g.X(7);
        byte[] f = g.f();
        f[0] = -84;
        f[1] = 64;
        f[2] = -1;
        f[3] = -1;
        f[4] = (byte) ((i >> 16) & 255);
        f[5] = (byte) ((i >> 8) & 255);
        f[6] = (byte) (i & 255);
    }

    private static int c(int i, boolean z, int i2) {
        int d = d(i);
        if (i != 11 && i != 12 && i != 13 && i != 14) {
            return d;
        }
        if (!z) {
            d -= 2;
        }
        return i2 != 0 ? i2 != 1 ? d : d - 2 : d - 4;
    }

    private static int d(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x011c, code lost:
    
        if (r5 == 2) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ax.P0.C0912v e(ax.S0.G r20, java.lang.String r21, java.lang.String r22, ax.P0.C0906o r23) throws ax.P0.E {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.q1.C2843c.e(ax.S0.G, java.lang.String, java.lang.String, ax.P0.o):ax.P0.v");
    }

    public static int f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return g(new ax.S0.F(bArr)).e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        if (r11 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ax.q1.C2843c.C0425c g(ax.S0.F r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = k(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.h(r1)
            boolean r4 = r11.g()
            if (r4 == 0) goto L45
            int r4 = r11.h(r2)
            if (r4 <= 0) goto L45
            r11.r(r0)
        L45:
            boolean r4 = r11.g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L55
        L51:
            r4 = 48000(0xbb80, float:6.7262E-41)
            goto L59
        L55:
            r7 = 44100(0xac44, float:6.1797E-41)
            goto L51
        L59:
            int r11 = r11.h(r3)
            if (r7 != r6) goto L69
            r6 = 13
            if (r11 != r6) goto L69
            int[] r0 = ax.q1.C2843c.a
            r11 = r0[r11]
        L67:
            r9 = r11
            goto L99
        L69:
            if (r7 != r4) goto L97
            int[] r4 = ax.q1.C2843c.a
            int r6 = r4.length
            if (r11 >= r6) goto L97
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r9 = 1
            if (r1 == r9) goto L90
            r9 = 11
            if (r1 == r0) goto L8b
            if (r1 == r2) goto L90
            if (r1 == r3) goto L82
            goto L95
        L82:
            if (r11 == r2) goto L88
            if (r11 == r6) goto L88
            if (r11 != r9) goto L95
        L88:
            int r11 = r4 + 1
            goto L67
        L8b:
            if (r11 == r6) goto L88
            if (r11 != r9) goto L95
            goto L88
        L90:
            if (r11 == r2) goto L88
            if (r11 != r6) goto L95
            goto L88
        L95:
            r9 = r4
            goto L99
        L97:
            r11 = 0
            r9 = 0
        L99:
            ax.q1.c$c r4 = new ax.q1.c$c
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.q1.C2843c.g(ax.S0.F):ax.q1.c$c");
    }

    public static int h(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    private static void i(ax.S0.F f, b bVar) throws ax.P0.E {
        int h = f.h(5);
        f.r(2);
        if (f.g()) {
            f.r(5);
        }
        if (h >= 7 && h <= 10) {
            f.q();
        }
        if (f.g()) {
            int h2 = f.h(3);
            if (bVar.b == -1 && h >= 0 && h <= 15 && (h2 == 0 || h2 == 1)) {
                bVar.b = h;
            }
            if (f.g()) {
                m(f);
            }
        }
    }

    private static void j(ax.S0.F f, b bVar) throws ax.P0.E {
        f.r(2);
        boolean g = f.g();
        int h = f.h(8);
        for (int i = 0; i < h; i++) {
            f.r(2);
            if (f.g()) {
                f.r(5);
            }
            if (g) {
                f.r(24);
            } else {
                if (f.g()) {
                    if (!f.g()) {
                        f.r(4);
                    }
                    bVar.c = f.h(6) + 1;
                }
                f.r(4);
            }
        }
        if (f.g()) {
            f.r(3);
            if (f.g()) {
                m(f);
            }
        }
    }

    private static int k(ax.S0.F f, int i) {
        int i2 = 0;
        while (true) {
            int h = i2 + f.h(i);
            if (!f.g()) {
                return h;
            }
            i2 = (h + 1) << i;
        }
    }

    private static boolean l(ax.S0.F f) {
        if (f.b() < 66) {
            return false;
        }
        f.r(66);
        return true;
    }

    private static void m(ax.S0.F f) throws ax.P0.E {
        int h = f.h(6);
        if (h < 2 || h > 42) {
            throw ax.P0.E.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(h)));
        }
        f.r(h * 8);
    }
}
