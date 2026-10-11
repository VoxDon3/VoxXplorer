package com.jcraft.jsch.jzlib;

import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
final class InfBlocks {
    int a;
    int b;
    int c;
    int d;
    int[] e;
    private final InfCodes n;
    int o;
    int p;
    int q;
    byte[] s;
    int t;
    int u;
    int v;
    private boolean w;
    private final ZStream y;
    private static final int[] z = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, Settings.DEFAULT_INITIAL_WINDOW_SIZE};
    static final int[] A = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    int[] f = new int[1];
    int[] g = new int[1];
    int[] h = new int[1];
    int[] i = new int[1];
    int[][] j = new int[1][];
    int[][] k = new int[1][];
    int[] l = new int[1];
    int[] m = new int[1];
    private final InfTree x = new InfTree();
    int[] r = new int[4320];

    InfBlocks(ZStream zStream, int i) {
        this.y = zStream;
        this.n = new InfCodes(zStream, this);
        this.s = new byte[i];
        this.t = i;
        this.w = zStream.k.f != 0;
        this.a = 0;
        d();
    }

    void a() {
        d();
        this.s = null;
        this.r = null;
    }

    int b(int i) {
        ZStream zStream = this.y;
        int i2 = zStream.f;
        int i3 = this.u;
        int i4 = this.v;
        if (i3 > i4) {
            i4 = this.t;
        }
        int i5 = i4 - i3;
        int i6 = zStream.g;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 != 0 && i == -5) {
            i = 0;
        }
        zStream.g = i6 - i5;
        zStream.h += i5;
        if (this.w && i5 > 0) {
            zStream.m.b(this.s, i3, i5);
        }
        System.arraycopy(this.s, i3, this.y.e, i2, i5);
        int i7 = i2 + i5;
        int i8 = i3 + i5;
        int i9 = this.t;
        if (i8 == i9) {
            if (this.v == i9) {
                this.v = 0;
            }
            int i10 = this.v;
            ZStream zStream2 = this.y;
            int i11 = zStream2.g;
            if (i10 > i11) {
                i10 = i11;
            }
            if (i10 != 0 && i == -5) {
                i = 0;
            }
            zStream2.g = i11 - i10;
            zStream2.h += i10;
            if (this.w && i10 > 0) {
                zStream2.m.b(this.s, 0, i10);
            }
            System.arraycopy(this.s, 0, this.y.e, i7, i10);
            i7 += i10;
            i8 = i10;
        }
        this.y.f = i7;
        this.u = i8;
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0269, code lost:
    
        r39.v = r6;
        r1 = b(r1);
        r6 = r39.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0273, code lost:
    
        if (r39.u == r6) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0275, code lost:
    
        r39.q = r4;
        r39.p = r5;
        r4 = r39.y;
        r4.c = r2;
        r4.d += r3 - r4.b;
        r4.b = r3;
        r39.v = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x028f, code lost:
    
        return b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0290, code lost:
    
        r39.a = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0294, code lost:
    
        r39.q = r4;
        r39.p = r5;
        r1 = r39.y;
        r1.c = r2;
        r1.d += r3 - r1.b;
        r1.b = r3;
        r39.v = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02af, code lost:
    
        return b(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x03a8, code lost:
    
        r39.e = null;
        r39.a = 9;
        r1 = r39.y;
        r1.i = "invalid bit length repeat";
        r39.q = r4;
        r39.p = r5;
        r1.c = r2;
        r1.d += r3 - r1.b;
        r1.b = r3;
        r39.v = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03cd, code lost:
    
        return b(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03ce, code lost:
    
        r39.a = 9;
        r1 = r39.y;
        r1.i = "too many length or distance symbols";
        r39.q = r4;
        r39.p = r5;
        r1.c = r2;
        r1.d += r3 - r1.b;
        r1.b = r3;
        r39.v = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03ef, code lost:
    
        return b(-3);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00e2 A[ADDED_TO_REGION, LOOP:10: B:224:0x00e2->B:226:0x00e6, LOOP_START, PHI: r1 r2 r3 r4 r5
      0x00e2: PHI (r1v8 int) = (r1v5 int), (r1v15 int) binds: [B:223:0x00e0, B:226:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r2v7 int) = (r2v4 int), (r2v10 int) binds: [B:223:0x00e0, B:226:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r3v5 int) = (r3v4 int), (r3v6 int) binds: [B:223:0x00e0, B:226:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r4v7 int) = (r4v4 int), (r4v10 int) binds: [B:223:0x00e0, B:226:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r5v5 int) = (r5v4 int), (r5v7 int) binds: [B:223:0x00e0, B:226:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0130 A[LOOP:11: B:233:0x012a->B:235:0x0130, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x013d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0196 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int c(int r40) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.jzlib.InfBlocks.c(int):int");
    }

    void d() {
        if (this.a == 6) {
            this.n.a(this.y);
        }
        this.a = 0;
        this.p = 0;
        this.q = 0;
        this.v = 0;
        this.u = 0;
        if (this.w) {
            this.y.m.a();
        }
    }
}
