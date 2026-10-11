package com.jcraft.jsch.jzlib;

import ax.L.c;
import ax.m.j;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes3.dex */
final class InfTree {
    static final int[] g = {96, 7, 256, 0, 8, 80, 0, 8, 16, 84, 8, 115, 82, 7, 31, 0, 8, 112, 0, 8, 48, 0, 9, 192, 80, 7, 10, 0, 8, 96, 0, 8, 32, 0, 9, 160, 0, 8, 0, 0, 8, 128, 0, 8, 64, 0, 9, 224, 80, 7, 6, 0, 8, 88, 0, 8, 24, 0, 9, 144, 83, 7, 59, 0, 8, 120, 0, 8, 56, 0, 9, 208, 81, 7, 17, 0, 8, 104, 0, 8, 40, 0, 9, 176, 0, 8, 8, 0, 8, 136, 0, 8, 72, 0, 9, 240, 80, 7, 4, 0, 8, 84, 0, 8, 20, 85, 8, 227, 83, 7, 43, 0, 8, 116, 0, 8, 52, 0, 9, 200, 81, 7, 13, 0, 8, 100, 0, 8, 36, 0, 9, 168, 0, 8, 4, 0, 8, 132, 0, 8, 68, 0, 9, 232, 80, 7, 8, 0, 8, 92, 0, 8, 28, 0, 9, 152, 84, 7, 83, 0, 8, j.K0, 0, 8, 60, 0, 9, 216, 82, 7, 23, 0, 8, 108, 0, 8, 44, 0, 9, 184, 0, 8, 12, 0, 8, 140, 0, 8, 76, 0, 9, 248, 80, 7, 3, 0, 8, 82, 0, 8, 18, 85, 8, 163, 83, 7, 35, 0, 8, 114, 0, 8, 50, 0, 9, 196, 81, 7, 11, 0, 8, 98, 0, 8, 34, 0, 9, 164, 0, 8, 2, 0, 8, 130, 0, 8, 66, 0, 9, 228, 80, 7, 7, 0, 8, 90, 0, 8, 26, 0, 9, 148, 84, 7, 67, 0, 8, 122, 0, 8, 58, 0, 9, 212, 82, 7, 19, 0, 8, 106, 0, 8, 42, 0, 9, SubsamplingScaleImageView.ORIENTATION_180, 0, 8, 10, 0, 8, 138, 0, 8, 74, 0, 9, 244, 80, 7, 5, 0, 8, 86, 0, 8, 22, 192, 8, 0, 83, 7, 51, 0, 8, 118, 0, 8, 54, 0, 9, 204, 81, 7, 15, 0, 8, 102, 0, 8, 38, 0, 9, 172, 0, 8, 6, 0, 8, 134, 0, 8, 70, 0, 9, 236, 80, 7, 9, 0, 8, 94, 0, 8, 30, 0, 9, 156, 84, 7, 99, 0, 8, 126, 0, 8, 62, 0, 9, 220, 82, 7, 27, 0, 8, c.d3, 0, 8, 46, 0, 9, 188, 0, 8, 14, 0, 8, 142, 0, 8, 78, 0, 9, 252, 96, 7, 256, 0, 8, 81, 0, 8, 17, 85, 8, 131, 82, 7, 31, 0, 8, 113, 0, 8, 49, 0, 9, 194, 80, 7, 10, 0, 8, 97, 0, 8, 33, 0, 9, 162, 0, 8, 1, 0, 8, 129, 0, 8, 65, 0, 9, 226, 80, 7, 6, 0, 8, 89, 0, 8, 25, 0, 9, 146, 83, 7, 59, 0, 8, 121, 0, 8, 57, 0, 9, 210, 81, 7, 17, 0, 8, 105, 0, 8, 41, 0, 9, 178, 0, 8, 9, 0, 8, 137, 0, 8, 73, 0, 9, 242, 80, 7, 4, 0, 8, 85, 0, 8, 21, 80, 8, 258, 83, 7, 43, 0, 8, 117, 0, 8, 53, 0, 9, 202, 81, 7, 13, 0, 8, 101, 0, 8, 37, 0, 9, 170, 0, 8, 5, 0, 8, 133, 0, 8, 69, 0, 9, 234, 80, 7, 8, 0, 8, 93, 0, 8, 29, 0, 9, 154, 84, 7, 83, 0, 8, j.L0, 0, 8, 61, 0, 9, 218, 82, 7, 23, 0, 8, 109, 0, 8, 45, 0, 9, 186, 0, 8, 13, 0, 8, 141, 0, 8, 77, 0, 9, 250, 80, 7, 3, 0, 8, 83, 0, 8, 19, 85, 8, 195, 83, 7, 35, 0, 8, 115, 0, 8, 51, 0, 9, 198, 81, 7, 11, 0, 8, 99, 0, 8, 35, 0, 9, 166, 0, 8, 3, 0, 8, 131, 0, 8, 67, 0, 9, 230, 80, 7, 7, 0, 8, 91, 0, 8, 27, 0, 9, 150, 84, 7, 67, 0, 8, 123, 0, 8, 59, 0, 9, 214, 82, 7, 19, 0, 8, 107, 0, 8, 43, 0, 9, 182, 0, 8, 11, 0, 8, 139, 0, 8, 75, 0, 9, 246, 80, 7, 5, 0, 8, 87, 0, 8, 23, 192, 8, 0, 83, 7, 51, 0, 8, 119, 0, 8, 55, 0, 9, 206, 81, 7, 15, 0, 8, 103, 0, 8, 39, 0, 9, 174, 0, 8, 7, 0, 8, 135, 0, 8, 71, 0, 9, 238, 80, 7, 9, 0, 8, 95, 0, 8, 31, 0, 9, 158, 84, 7, 99, 0, 8, 127, 0, 8, 63, 0, 9, 222, 82, 7, 27, 0, 8, 111, 0, 8, 47, 0, 9, 190, 0, 8, 15, 0, 8, 143, 0, 8, 79, 0, 9, 254, 96, 7, 256, 0, 8, 80, 0, 8, 16, 84, 8, 115, 82, 7, 31, 0, 8, 112, 0, 8, 48, 0, 9, 193, 80, 7, 10, 0, 8, 96, 0, 8, 32, 0, 9, 161, 0, 8, 0, 0, 8, 128, 0, 8, 64, 0, 9, 225, 80, 7, 6, 0, 8, 88, 0, 8, 24, 0, 9, 145, 83, 7, 59, 0, 8, 120, 0, 8, 56, 0, 9, 209, 81, 7, 17, 0, 8, 104, 0, 8, 40, 0, 9, 177, 0, 8, 8, 0, 8, 136, 0, 8, 72, 0, 9, 241, 80, 7, 4, 0, 8, 84, 0, 8, 20, 85, 8, 227, 83, 7, 43, 0, 8, 116, 0, 8, 52, 0, 9, 201, 81, 7, 13, 0, 8, 100, 0, 8, 36, 0, 9, 169, 0, 8, 4, 0, 8, 132, 0, 8, 68, 0, 9, 233, 80, 7, 8, 0, 8, 92, 0, 8, 28, 0, 9, 153, 84, 7, 83, 0, 8, j.K0, 0, 8, 60, 0, 9, 217, 82, 7, 23, 0, 8, 108, 0, 8, 44, 0, 9, 185, 0, 8, 12, 0, 8, 140, 0, 8, 76, 0, 9, 249, 80, 7, 3, 0, 8, 82, 0, 8, 18, 85, 8, 163, 83, 7, 35, 0, 8, 114, 0, 8, 50, 0, 9, 197, 81, 7, 11, 0, 8, 98, 0, 8, 34, 0, 9, 165, 0, 8, 2, 0, 
    8, 130, 0, 8, 66, 0, 9, 229, 80, 7, 7, 0, 8, 90, 0, 8, 26, 0, 9, 149, 84, 7, 67, 0, 8, 122, 0, 8, 58, 0, 9, 213, 82, 7, 19, 0, 8, 106, 0, 8, 42, 0, 9, 181, 0, 8, 10, 0, 8, 138, 0, 8, 74, 0, 9, 245, 80, 7, 5, 0, 8, 86, 0, 8, 22, 192, 8, 0, 83, 7, 51, 0, 8, 118, 0, 8, 54, 0, 9, 205, 81, 7, 15, 0, 8, 102, 0, 8, 38, 0, 9, 173, 0, 8, 6, 0, 8, 134, 0, 8, 70, 0, 9, 237, 80, 7, 9, 0, 8, 94, 0, 8, 30, 0, 9, 157, 84, 7, 99, 0, 8, 126, 0, 8, 62, 0, 9, 221, 82, 7, 27, 0, 8, c.d3, 0, 8, 46, 0, 9, 189, 0, 8, 14, 0, 8, 142, 0, 8, 78, 0, 9, 253, 96, 7, 256, 0, 8, 81, 0, 8, 17, 85, 8, 131, 82, 7, 31, 0, 8, 113, 0, 8, 49, 0, 9, 195, 80, 7, 10, 0, 8, 97, 0, 8, 33, 0, 9, 163, 0, 8, 1, 0, 8, 129, 0, 8, 65, 0, 9, 227, 80, 7, 6, 0, 8, 89, 0, 8, 25, 0, 9, 147, 83, 7, 59, 0, 8, 121, 0, 8, 57, 0, 9, 211, 81, 7, 17, 0, 8, 105, 0, 8, 41, 0, 9, 179, 0, 8, 9, 0, 8, 137, 0, 8, 73, 0, 9, 243, 80, 7, 4, 0, 8, 85, 0, 8, 21, 80, 8, 258, 83, 7, 43, 0, 8, 117, 0, 8, 53, 0, 9, 203, 81, 7, 13, 0, 8, 101, 0, 8, 37, 0, 9, 171, 0, 8, 5, 0, 8, 133, 0, 8, 69, 0, 9, 235, 80, 7, 8, 0, 8, 93, 0, 8, 29, 0, 9, 155, 84, 7, 83, 0, 8, j.L0, 0, 8, 61, 0, 9, 219, 82, 7, 23, 0, 8, 109, 0, 8, 45, 0, 9, 187, 0, 8, 13, 0, 8, 141, 0, 8, 77, 0, 9, 251, 80, 7, 3, 0, 8, 83, 0, 8, 19, 85, 8, 195, 83, 7, 35, 0, 8, 115, 0, 8, 51, 0, 9, 199, 81, 7, 11, 0, 8, 99, 0, 8, 35, 0, 9, 167, 0, 8, 3, 0, 8, 131, 0, 8, 67, 0, 9, 231, 80, 7, 7, 0, 8, 91, 0, 8, 27, 0, 9, 151, 84, 7, 67, 0, 8, 123, 0, 8, 59, 0, 9, 215, 82, 7, 19, 0, 8, 107, 0, 8, 43, 0, 9, 183, 0, 8, 11, 0, 8, 139, 0, 8, 75, 0, 9, 247, 80, 7, 5, 0, 8, 87, 0, 8, 23, 192, 8, 0, 83, 7, 51, 0, 8, 119, 0, 8, 55, 0, 9, 207, 81, 7, 15, 0, 8, 103, 0, 8, 39, 0, 9, 175, 0, 8, 7, 0, 8, 135, 0, 8, 71, 0, 9, 239, 80, 7, 9, 0, 8, 95, 0, 8, 31, 0, 9, 159, 84, 7, 99, 0, 8, 127, 0, 8, 63, 0, 9, 223, 82, 7, 27, 0, 8, 111, 0, 8, 47, 0, 9, 191, 0, 8, 15, 0, 8, 143, 0, 8, 79, 0, 9, 255};
    static final int[] h = {80, 5, 1, 87, 5, 257, 83, 5, 17, 91, 5, 4097, 81, 5, 5, 89, 5, 1025, 85, 5, 65, 93, 5, 16385, 80, 5, 3, 88, 5, 513, 84, 5, 33, 92, 5, 8193, 82, 5, 9, 90, 5, 2049, 86, 5, 129, 192, 5, 24577, 80, 5, 2, 87, 5, 385, 83, 5, 25, 91, 5, 6145, 81, 5, 7, 89, 5, 1537, 85, 5, 97, 93, 5, 24577, 80, 5, 4, 88, 5, 769, 84, 5, 49, 92, 5, 12289, 82, 5, 13, 90, 5, 3073, 86, 5, 193, 192, 5, 24577};
    static final int[] i = {3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0};
    static final int[] j = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 112, 112};
    static final int[] k = {1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577};
    static final int[] l = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};
    int[] a = null;
    int[] b = null;
    int[] c = null;
    int[] d = null;
    int[] e = null;
    int[] f = null;

    InfTree() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a7, code lost:
    
        r6 = r6 ^ r1;
        r1 = r1 >>> 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ab, code lost:
    
        r6 = r6 ^ r1;
        r1 = (1 << r23) - 1;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b7, code lost:
    
        if ((r1 & r6) == r22.f[r8]) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b9, code lost:
    
        r8 = r8 - 1;
        r2 = r2 - r11;
        r1 = (1 << r2) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0156, code lost:
    
        r13 = r33[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0158, code lost:
    
        if (r13 >= r2) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x015e, code lost:
    
        if (r13 >= 256) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0160, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0164, code lost:
    
        r4[0] = (byte) r1;
        r1 = r12 + 1;
        r4[2] = r33[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x016d, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0162, code lost:
    
        r1 = 96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x016f, code lost:
    
        r4[0] = (byte) (r28[r13 - r2] + 80);
        r1 = r12 + 1;
        r4[2] = r27[r33[r12] - r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01cc, code lost:
    
        r7 = r7 + 1;
        r2 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0145, code lost:
    
        r30 = r6;
        r4 = r22.d;
        r6 = r7 - r23;
        r4[1] = (byte) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014f, code lost:
    
        if (r12 < r5) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0151, code lost:
    
        r4[0] = 192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0183, code lost:
    
        r1 = 1 << r6;
        r4 = r30 >>> r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0187, code lost:
    
        if (r4 >= r10) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0189, code lost:
    
        r25 = r1;
        java.lang.System.arraycopy(r22.d, 0, r31, (r15 + r4) * 3, 3);
        r4 = r4 + r25;
        r1 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x019d, code lost:
    
        r1 = 1 << (r7 - 1);
        r6 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a5, code lost:
    
        if ((r6 & r1) == 0) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(int[] r23, int r24, int r25, int r26, int[] r27, int[] r28, int[] r29, int[] r30, int[] r31, int[] r32, int[] r33) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.jzlib.InfTree.a(int[], int, int, int, int[], int[], int[], int[], int[], int[], int[]):int");
    }

    static int d(int[] iArr, int[] iArr2, int[][] iArr3, int[][] iArr4, ZStream zStream) {
        iArr[0] = 9;
        iArr2[0] = 5;
        iArr3[0] = g;
        iArr4[0] = h;
        return 0;
    }

    private void e(int i2) {
        if (this.a == null) {
            this.a = new int[1];
            this.b = new int[i2];
            this.c = new int[16];
            this.d = new int[3];
            this.e = new int[15];
            this.f = new int[16];
        }
        if (this.b.length < i2) {
            this.b = new int[i2];
        }
        for (int i3 = 0; i3 < i2; i3++) {
            this.b[i3] = 0;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.c[i4] = 0;
        }
        for (int i5 = 0; i5 < 3; i5++) {
            this.d[i5] = 0;
        }
        System.arraycopy(this.c, 0, this.e, 0, 15);
        System.arraycopy(this.c, 0, this.f, 0, 16);
    }

    int b(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, ZStream zStream) {
        e(19);
        int[] iArr5 = this.a;
        iArr5[0] = 0;
        int a = a(iArr, 0, 19, 19, null, null, iArr3, iArr2, iArr4, iArr5, this.b);
        if (a == -3) {
            zStream.i = "oversubscribed dynamic bit lengths tree";
            return a;
        }
        if (a != -5 && iArr2[0] != 0) {
            return a;
        }
        zStream.i = "incomplete dynamic bit lengths tree";
        return -3;
    }

    int c(int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, ZStream zStream) {
        e(288);
        int[] iArr7 = this.a;
        iArr7[0] = 0;
        int a = a(iArr, 0, i2, 257, i, j, iArr4, iArr2, iArr6, iArr7, this.b);
        if (a != 0 || iArr2[0] == 0) {
            if (a == -3) {
                zStream.i = "oversubscribed literal/length tree";
                return a;
            }
            if (a == -4) {
                return a;
            }
            zStream.i = "incomplete literal/length tree";
            return -3;
        }
        e(288);
        int a2 = a(iArr, i2, i3, 0, k, l, iArr5, iArr3, iArr6, this.a, this.b);
        if (a2 == 0 && (iArr3[0] != 0 || i2 <= 257)) {
            return 0;
        }
        if (a2 == -3) {
            zStream.i = "oversubscribed distance tree";
            return a2;
        }
        if (a2 == -5) {
            zStream.i = "incomplete distance tree";
            return -3;
        }
        if (a2 == -4) {
            return a2;
        }
        zStream.i = "empty distance tree with lengths";
        return -3;
    }
}
