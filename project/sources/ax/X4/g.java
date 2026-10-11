package ax.X4;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* loaded from: classes.dex */
class g {
    private final int a;
    private final int[] b;
    private int c;

    public g(long j) {
        if (j <= 0 || j >= 2147483647L) {
            throw new IllegalArgumentException("numBits=" + j);
        }
        int i = (((int) ((j + 63) >>> 6)) + 1) << 1;
        this.a = i;
        this.b = new int[i];
        this.c = i;
    }

    private int d(int i) {
        return this.b[i];
    }

    private void e(int i, int i2) {
        this.b[i] = i2;
    }

    public void a(int i) {
        if (i == 0) {
            return;
        }
        long j = i & 4294967295L;
        int i2 = this.a;
        while (true) {
            i2--;
            if (j == 0) {
                this.c = Math.min(this.c, i2 + 1);
                return;
            } else {
                long d = (d(i2) & 4294967295L) + j;
                e(i2, (int) d);
                j = d >>> 32;
            }
        }
    }

    public void b(int i, int i2) {
        long j = i & 4294967295L;
        long j2 = i2;
        int i3 = this.a;
        while (true) {
            i3--;
            if (i3 < this.c) {
                break;
            }
            long d = ((d(i3) & 4294967295L) * j) + j2;
            e(i3, (int) d);
            j2 = d >>> 32;
        }
        if (j2 != 0) {
            e(i3, (int) j2);
            this.c = i3;
        }
    }

    public BigInteger c() {
        byte[] bArr = new byte[this.b.length << 2];
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).asIntBuffer();
        int i = 0;
        while (true) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return new BigInteger(bArr);
            }
            asIntBuffer.put(i, iArr[i]);
            i++;
        }
    }
}
