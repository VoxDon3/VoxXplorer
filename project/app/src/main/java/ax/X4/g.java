/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

class g {
    private final int a;
    private final int[] b;
    private int c;

    public g(long l8) {
        if (l8 > 0L && l8 < Integer.MAX_VALUE) {
            int n8;
            this.a = n8 = (int)(l8 + 63L >>> 6) + 1 << 1;
            this.b = new int[n8];
            this.c = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("numBits=");
        stringBuilder.append(l8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private int d(int n8) {
        return this.b[n8];
    }

    private void e(int n8, int n9) {
        this.b[n8] = n9;
    }

    public void a(int n8) {
        if (n8 == 0) {
            return;
        }
        long l8 = (long)n8 & 0xFFFFFFFFL;
        n8 = this.a - 1;
        while (l8 != 0L) {
            l8 = ((long)this.d(n8) & 0xFFFFFFFFL) + l8;
            this.e(n8, (int)l8);
            l8 >>>= 32;
            --n8;
        }
        this.c = Math.min(this.c, n8 + 1);
    }

    public void b(int n8, int n9) {
        long l8 = n8;
        long l9 = n9;
        for (n8 = this.a - 1; n8 >= this.c; --n8) {
            l9 = ((long)this.d(n8) & 0xFFFFFFFFL) * (l8 & 0xFFFFFFFFL) + l9;
            this.e(n8, (int)l9);
            l9 >>>= 32;
        }
        if (l9 != 0L) {
            this.e(n8, (int)l9);
            this.c = n8;
        }
    }

    public BigInteger c() {
        int[] nArray;
        byte[] byArray = new byte[this.b.length << 2];
        IntBuffer intBuffer = ByteBuffer.wrap(byArray).asIntBuffer();
        for (int i8 = 0; i8 < (nArray = this.b).length; ++i8) {
            intBuffer.put(i8, nArray[i8]);
        }
        return new BigInteger(byArray);
    }
}

