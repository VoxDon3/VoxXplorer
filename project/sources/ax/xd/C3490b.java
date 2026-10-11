package ax.xd;

import ax.Nd.h;

/* renamed from: ax.xd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3490b extends C3493e {
    public static void n(int i, int[] iArr, int[] iArr2) {
        int i2 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = iArr[4];
        int i8 = iArr[5];
        int i9 = iArr[6];
        int i10 = 7;
        int i11 = iArr[7];
        int i12 = 8;
        int i13 = iArr[8];
        int i14 = iArr[9];
        int i15 = iArr[10];
        int i16 = iArr[11];
        int i17 = 12;
        int i18 = iArr[12];
        int i19 = iArr[13];
        int i20 = iArr[14];
        int i21 = iArr[15];
        int i22 = i20;
        int i23 = i19;
        int i24 = i18;
        int i25 = i16;
        int i26 = i15;
        int i27 = i14;
        int i28 = i13;
        int i29 = i11;
        int i30 = i9;
        int i31 = i8;
        int i32 = i7;
        int i33 = i6;
        int i34 = i5;
        int i35 = i4;
        int i36 = i3;
        int i37 = i;
        while (i37 > 0) {
            int i38 = i36 + i32;
            int c = ax.Nd.d.c(i24 ^ i38, i2);
            int i39 = i28 + c;
            int c2 = ax.Nd.d.c(i32 ^ i39, i17);
            int i40 = i38 + c2;
            int c3 = ax.Nd.d.c(c ^ i40, i12);
            int i41 = i39 + c3;
            int c4 = ax.Nd.d.c(c2 ^ i41, i10);
            int i42 = i35 + i31;
            int c5 = ax.Nd.d.c(i23 ^ i42, i2);
            int i43 = i27 + c5;
            int c6 = ax.Nd.d.c(i31 ^ i43, i17);
            int i44 = i42 + c6;
            int c7 = ax.Nd.d.c(c5 ^ i44, i12);
            int i45 = i43 + c7;
            int c8 = ax.Nd.d.c(c6 ^ i45, i10);
            int i46 = i34 + i30;
            int c9 = ax.Nd.d.c(i22 ^ i46, i2);
            int i47 = i26 + c9;
            int c10 = ax.Nd.d.c(i30 ^ i47, i17);
            int i48 = i46 + c10;
            int c11 = ax.Nd.d.c(c9 ^ i48, i12);
            int i49 = i47 + c11;
            int c12 = ax.Nd.d.c(c10 ^ i49, i10);
            int i50 = i33 + i29;
            int c13 = ax.Nd.d.c(i21 ^ i50, 16);
            int i51 = i25 + c13;
            int c14 = ax.Nd.d.c(i29 ^ i51, i17);
            int i52 = i50 + c14;
            int c15 = ax.Nd.d.c(c13 ^ i52, 8);
            int i53 = i51 + c15;
            int c16 = ax.Nd.d.c(c14 ^ i53, 7);
            int i54 = i40 + c8;
            int c17 = ax.Nd.d.c(c15 ^ i54, 16);
            int i55 = i49 + c17;
            int c18 = ax.Nd.d.c(c8 ^ i55, 12);
            i36 = i54 + c18;
            i21 = ax.Nd.d.c(c17 ^ i36, 8);
            i26 = i55 + i21;
            i31 = ax.Nd.d.c(c18 ^ i26, 7);
            int i56 = i44 + c12;
            int c19 = ax.Nd.d.c(c3 ^ i56, 16);
            int i57 = i53 + c19;
            int c20 = ax.Nd.d.c(c12 ^ i57, 12);
            i35 = i56 + c20;
            i24 = ax.Nd.d.c(c19 ^ i35, 8);
            i25 = i57 + i24;
            i30 = ax.Nd.d.c(c20 ^ i25, 7);
            int i58 = i48 + c16;
            int c21 = ax.Nd.d.c(c7 ^ i58, 16);
            int i59 = i41 + c21;
            int c22 = ax.Nd.d.c(c16 ^ i59, 12);
            i34 = i58 + c22;
            i23 = ax.Nd.d.c(c21 ^ i34, 8);
            i28 = i59 + i23;
            i29 = ax.Nd.d.c(c22 ^ i28, 7);
            int i60 = i52 + c4;
            int c23 = ax.Nd.d.c(c11 ^ i60, 16);
            int i61 = i45 + c23;
            int c24 = ax.Nd.d.c(c4 ^ i61, 12);
            i33 = i60 + c24;
            i22 = ax.Nd.d.c(c23 ^ i33, 8);
            i27 = i61 + i22;
            i32 = ax.Nd.d.c(c24 ^ i27, 7);
            i37 -= 2;
            i10 = 7;
            i2 = 16;
            i12 = 8;
            i17 = 12;
        }
        iArr2[0] = i36 + iArr[0];
        iArr2[1] = i35 + iArr[1];
        iArr2[2] = i34 + iArr[2];
        iArr2[3] = i33 + iArr[3];
        iArr2[4] = i32 + iArr[4];
        iArr2[5] = i31 + iArr[5];
        iArr2[6] = i30 + iArr[6];
        iArr2[7] = i29 + iArr[7];
        iArr2[8] = i28 + iArr[8];
        iArr2[9] = i27 + iArr[9];
        iArr2[10] = i26 + iArr[10];
        iArr2[11] = i25 + iArr[11];
        iArr2[12] = i24 + iArr[12];
        iArr2[13] = i23 + iArr[13];
        iArr2[14] = i22 + iArr[14];
        iArr2[15] = i21 + iArr[15];
    }

    @Override // ax.xd.C3493e
    protected void b() {
        int[] iArr = this.c;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // ax.xd.C3493e
    protected void c(byte[] bArr) {
        n(this.a, this.c, this.d);
        h.g(this.d, bArr, 0);
    }

    @Override // ax.xd.C3493e
    public String d() {
        return "ChaCha" + this.a;
    }

    @Override // ax.xd.C3493e
    protected void j() {
        int[] iArr = this.c;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // ax.xd.C3493e
    protected void m(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(d() + " requires 128 bit or 256 bit key");
            }
            i(bArr.length, this.c, 0);
            h.j(bArr, 0, this.c, 4, 4);
            h.j(bArr, bArr.length - 16, this.c, 8, 4);
        }
        h.j(bArr2, 0, this.c, 14, 2);
    }
}
