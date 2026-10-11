package com.jcraft.jsch.jzlib;

import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
final class InfCodes {
    private static final int[] q = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, Settings.DEFAULT_INITIAL_WINDOW_SIZE};
    int a;
    int b;
    int[] c;
    int d = 0;
    int e;
    int f;
    int g;
    int h;
    byte i;
    byte j;
    int[] k;
    int l;
    int[] m;
    int n;
    private final ZStream o;
    private final InfBlocks p;

    InfCodes(ZStream zStream, InfBlocks infBlocks) {
        this.o = zStream;
        this.p = infBlocks;
    }

    void a(ZStream zStream) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01ac, code lost:
    
        r7 = r30.c - r3;
        r8 = r5 >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01b1, code lost:
    
        if (r8 >= r7) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01b3, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01b4, code lost:
    
        r29.q = r4;
        r29.p = r5 - (r7 << 3);
        r30.c = r3 + r7;
        r30.d += r2 - r30.b;
        r30.b = r2 - r7;
        r29.v = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01cd, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int b(int r23, int r24, int[] r25, int r26, int[] r27, int r28, com.jcraft.jsch.jzlib.InfBlocks r29, com.jcraft.jsch.jzlib.ZStream r30) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.jzlib.InfCodes.b(int, int, int[], int, int[], int, com.jcraft.jsch.jzlib.InfBlocks, com.jcraft.jsch.jzlib.ZStream):int");
    }

    void c(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        this.a = 0;
        this.i = (byte) i;
        this.j = (byte) i2;
        this.k = iArr;
        this.l = i3;
        this.m = iArr2;
        this.n = i4;
        this.c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        r1 = r17.p;
        r1.q = r4;
        r1.p = r5;
        r4 = r17.o;
        r4.c = r2;
        r4.d += r3 - r4.b;
        r4.b = r3;
        r1.v = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        return r1.b(1);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x039a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x038f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0174 A[LOOP:2: B:38:0x0172->B:39:0x0174, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int d(int r18) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.jzlib.InfCodes.d(int):int");
    }
}
