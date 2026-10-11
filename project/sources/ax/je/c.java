package ax.je;

/* loaded from: classes3.dex */
public final class c implements f {
    private static final int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};
    private final boolean a;
    private int b;

    public c(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // ax.je.f
    public int a(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = (i + i2) - 16;
        int i5 = i;
        while (i5 <= i4) {
            int i6 = c[bArr[i5] & 31];
            int i7 = 5;
            int i8 = 0;
            while (i8 < 3) {
                if (((i6 >>> i8) & 1) == 0) {
                    i3 = i7;
                } else {
                    int i9 = i7 >>> 3;
                    int i10 = i7 & 7;
                    long j = 0;
                    int i11 = 0;
                    while (i11 < 6) {
                        j |= (bArr[(i5 + i9) + i11] & 255) << (i11 * 8);
                        i11++;
                        i7 = i7;
                    }
                    i3 = i7;
                    long j2 = j >>> i10;
                    if (((j2 >>> 37) & 15) == 5 && ((j2 >>> 9) & 7) == 0) {
                        int i12 = (((((int) (j2 >>> 36)) & 1) << 20) | ((int) ((j2 >>> 13) & 1048575))) << 4;
                        long j3 = (this.a ? i12 + ((this.b + i5) - i) : i12 - ((this.b + i5) - i)) >>> 4;
                        long j4 = ((((j2 & (-77309403137L)) | ((j3 & 1048575) << 13)) | ((j3 & 1048576) << 16)) << i10) | (((1 << i10) - 1) & j);
                        for (int i13 = 0; i13 < 6; i13++) {
                            bArr[i5 + i9 + i13] = (byte) (j4 >>> (i13 * 8));
                        }
                    }
                }
                i8++;
                i7 = i3 + 41;
            }
            i5 += 16;
        }
        int i14 = i5 - i;
        this.b += i14;
        return i14;
    }
}
