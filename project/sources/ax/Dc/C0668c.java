package ax.Dc;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: ax.Dc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0668c {
    private final int[] a;

    public C0668c(int i) {
        if (i < 0 || i > 30) {
            throw new IllegalArgumentException("depth must be bigger than 0 and not bigger than 30 but is " + i);
        }
        int[] iArr = new int[(int) ((1 << (i + 1)) - 1)];
        this.a = iArr;
        Arrays.fill(iArr, -1);
    }

    static C0668c b(InputStream inputStream, int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("totalNumberOfValues must be bigger than 0, is " + i);
        }
        int read = inputStream.read() + 1;
        if (read == 0) {
            throw new IOException("Cannot read the size of the encoded tree, unexpected end of stream");
        }
        byte[] g = ax.Kc.n.g(inputStream, read);
        if (g.length != read) {
            throw new EOFException();
        }
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (byte b : g) {
            int i4 = ((b & 240) >> 4) + 1;
            if (i2 + i4 > i) {
                throw new IOException("Number of values exceeds given total number of values");
            }
            int i5 = (b & 15) + 1;
            int i6 = 0;
            while (i6 < i4) {
                iArr[i2] = i5;
                i6++;
                i2++;
            }
            i3 = Math.max(i3, i5);
        }
        int[] iArr2 = new int[i];
        for (int i7 = 0; i7 < i; i7++) {
            iArr2[i7] = i7;
        }
        int[] iArr3 = new int[i];
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            for (int i10 = 0; i10 < i; i10++) {
                if (iArr[i10] == i9) {
                    iArr3[i8] = i9;
                    iArr2[i8] = i10;
                    i8++;
                }
            }
        }
        int[] iArr4 = new int[i];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i - 1; i14 >= 0; i14--) {
            i11 += i12;
            int i15 = iArr3[i14];
            if (i15 != i13) {
                i12 = 1 << (16 - i15);
                i13 = i15;
            }
            iArr4[iArr2[i14]] = i11;
        }
        C0668c c0668c = new C0668c(i3);
        for (int i16 = 0; i16 < i; i16++) {
            int i17 = iArr[i16];
            if (i17 > 0) {
                c0668c.a(0, Integer.reverse(iArr4[i16] << 16), i17, i16);
            }
        }
        return c0668c;
    }

    public void a(int i, int i2, int i3, int i4) {
        if (i3 != 0) {
            this.a[i] = -2;
            a((i * 2) + 1 + (i2 & 1), i2 >>> 1, i3 - 1, i4);
            return;
        }
        int[] iArr = this.a;
        if (iArr[i] == -1) {
            iArr[i] = i4;
            return;
        }
        throw new IllegalArgumentException("Tree value at index " + i + " has already been assigned (" + this.a[i] + ")");
    }

    public int c(C0669d c0669d) throws IOException {
        int i = 0;
        while (true) {
            int o = c0669d.o();
            if (o == -1) {
                return -1;
            }
            int i2 = (i * 2) + 1 + o;
            int i3 = this.a[i2];
            if (i3 != -2) {
                if (i3 != -1) {
                    return i3;
                }
                throw new IOException("The child " + o + " of node at index " + i + " is not defined");
            }
            i = i2;
        }
    }
}
