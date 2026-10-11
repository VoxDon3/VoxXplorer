package com.jcraft.jsch.jzlib;

import java.io.ByteArrayOutputStream;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
final class Inflate {
    private static byte[] o = {0, 0, -1, -1};
    int a;
    int b;
    long d;
    int e;
    int f;
    int g;
    InfBlocks h;
    private final ZStream i;
    private int j;
    long c = -1;
    private int k = -1;
    private byte[] l = new byte[4];
    GZIPHeader m = null;
    private ByteArrayOutputStream n = null;

    static class Return extends Exception {
        int q;

        Return(int i) {
            this.q = i;
        }
    }

    Inflate(ZStream zStream) {
        this.i = zStream;
    }

    private void a(int i, long j) {
        for (int i2 = 0; i2 < i; i2++) {
            this.l[i2] = (byte) (255 & j);
            j >>= 8;
        }
        this.i.m.b(this.l, 0, i);
    }

    private int f(int i, int i2) throws Return {
        if (this.n == null) {
            this.n = new ByteArrayOutputStream();
        }
        while (this.d > 0) {
            ZStream zStream = this.i;
            int i3 = zStream.c;
            if (i3 == 0) {
                throw new Return(i);
            }
            zStream.c = i3 - 1;
            zStream.d++;
            byte[] bArr = zStream.a;
            int i4 = zStream.b;
            byte b = bArr[i4];
            this.n.write(bArr, i4, 1);
            ZStream zStream2 = this.i;
            zStream2.m.b(zStream2.a, zStream2.b, 1);
            this.i.b++;
            this.d--;
            i = i2;
        }
        return i;
    }

    private int g(int i, int i2, int i3) throws Return {
        if (this.k == -1) {
            this.k = i;
            this.d = 0L;
        }
        while (true) {
            int i4 = this.k;
            if (i4 <= 0) {
                if (i == 2) {
                    this.d &= WebSocketProtocol.PAYLOAD_SHORT_MAX;
                } else if (i == 4) {
                    this.d &= 4294967295L;
                }
                this.k = -1;
                return i2;
            }
            ZStream zStream = this.i;
            int i5 = zStream.c;
            if (i5 == 0) {
                throw new Return(i2);
            }
            zStream.c = i5 - 1;
            zStream.d++;
            long j = this.d;
            byte[] bArr = zStream.a;
            zStream.b = zStream.b + 1;
            this.d = j | ((bArr[r5] & 255) << ((i - i4) * 8));
            this.k = i4 - 1;
            i2 = i3;
        }
    }

    private int h(int i, int i2) throws Return {
        if (this.n == null) {
            this.n = new ByteArrayOutputStream();
        }
        while (true) {
            ZStream zStream = this.i;
            int i3 = zStream.c;
            if (i3 == 0) {
                throw new Return(i);
            }
            zStream.c = i3 - 1;
            zStream.d++;
            byte[] bArr = zStream.a;
            int i4 = zStream.b;
            byte b = bArr[i4];
            if (b != 0) {
                this.n.write(bArr, i4, 1);
            }
            ZStream zStream2 = this.i;
            zStream2.m.b(zStream2.a, zStream2.b, 1);
            this.i.b++;
            if (b == 0) {
                return i2;
            }
            i = i2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0286, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0423, code lost:
    
        r3 = r28.i;
        r4 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0427, code lost:
    
        if (r4 != 0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0429, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x042a, code lost:
    
        r3.c = r4 - 1;
        r3.d++;
        r2 = r3.a;
        r3.b = r3.b + 1;
        r28.d = ((r2[r4] & 255) << 24) & 4278190080L;
        r28.a = 3;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x044e, code lost:
    
        r3 = r28.i;
        r4 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0452, code lost:
    
        if (r4 != 0) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0454, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0455, code lost:
    
        r3.c = r4 - r6;
        r3.d++;
        r8 = r28.d;
        r2 = r3.a;
        r3.b = r3.b + 1;
        r28.d = r8 + (((r2[r4] & 255) << 16) & 16711680);
        r28.a = 4;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0477, code lost:
    
        r3 = r28.i;
        r4 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x047b, code lost:
    
        if (r4 != 0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x047d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x047e, code lost:
    
        r3.c = r4 - r6;
        r3.d++;
        r4 = r28.d;
        r2 = r3.a;
        r3.b = r3.b + 1;
        r28.d = r4 + (((r2[r8] & 255) << 8) & 65280);
        r28.a = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x049e, code lost:
    
        r2 = r28.i;
        r3 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04a2, code lost:
    
        if (r3 != 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04a4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04a5, code lost:
    
        r2.c = r3 - r6;
        r2.d++;
        r3 = r28.d;
        r0 = r2.a;
        r2.b = r2.b + 1;
        r3 = r3 + (r0[r5] & 255);
        r28.d = r3;
        r2.m.c(r3);
        r28.a = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04c9, code lost:
    
        return 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x032b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int b(int r29) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.jzlib.Inflate.b(int):int");
    }

    int c() {
        InfBlocks infBlocks = this.h;
        if (infBlocks == null) {
            return 0;
        }
        infBlocks.a();
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r6 < 48) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int d(int r6) {
        /*
            r5 = this;
            com.jcraft.jsch.jzlib.ZStream r0 = r5.i
            r1 = 0
            r0.i = r1
            r5.h = r1
            r0 = 0
            r5.f = r0
            r1 = 1
            if (r6 >= 0) goto Lf
            int r6 = -r6
            goto L33
        Lf:
            r2 = 1073741824(0x40000000, float:2.0)
            r2 = r2 & r6
            r3 = 48
            r4 = 4
            if (r2 == 0) goto L24
            r5.f = r4
            r2 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r2 = r2 & r6
            if (r2 >= r3) goto L22
        L1f:
            r6 = r6 & 15
            goto L33
        L22:
            r6 = r2
            goto L33
        L24:
            r2 = r6 & (-32)
            if (r2 == 0) goto L2b
            r5.f = r4
            goto L1f
        L2b:
            int r2 = r6 >> 4
            int r2 = r2 + r1
            r5.f = r2
            if (r6 >= r3) goto L33
            goto L1f
        L33:
            r2 = 8
            if (r6 < r2) goto L4d
            r2 = 15
            if (r6 <= r2) goto L3c
            goto L4d
        L3c:
            r5.g = r6
            com.jcraft.jsch.jzlib.InfBlocks r2 = new com.jcraft.jsch.jzlib.InfBlocks
            com.jcraft.jsch.jzlib.ZStream r3 = r5.i
            int r6 = r1 << r6
            r2.<init>(r3, r6)
            r5.h = r2
            r5.e()
            return r0
        L4d:
            r5.c()
            r6 = -2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.jzlib.Inflate.d(int):int");
    }

    int e() {
        ZStream zStream = this.i;
        if (zStream == null) {
            return -2;
        }
        zStream.h = 0L;
        zStream.d = 0L;
        zStream.i = null;
        this.a = 14;
        this.k = -1;
        this.h.d();
        return 0;
    }
}
