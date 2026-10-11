/*
 * Decompiled with CFR 0.152.
 */
package ax.i5;

import android.util.Log;
import ax.i5.b;
import ax.i5.c;
import java.io.IOException;
import java.nio.ByteBuffer;

public class a {
    private static final String f = "a";
    private ax.e5.a a;
    private b b;
    private Long[] c;
    private long d;
    private long e;

    a(long l8, ax.e5.a a8, b b8, c c8) throws IOException {
        long l9;
        String string = f;
        Log.d((String)string, (String)"Init a cluster chain, reading from FAT");
        this.b = b8;
        this.a = a8;
        this.d = l9 = (long)c8.a();
        this.c = b8.c(l8, l9);
        this.e = c8.c();
        Log.d((String)string, (String)"Finished init of a cluster chain");
    }

    private long b(long l8, int n8) {
        return this.e + (long)n8 + (l8 - 2L) * this.d;
    }

    int a() {
        return this.c.length;
    }

    long c() {
        return (long)this.c.length * this.d;
    }

    void d(long l8, ByteBuffer byteBuffer) throws IOException {
        int n8 = byteBuffer.remaining();
        long l9 = this.d;
        if (l9 != 0L) {
            int n9 = (int)(l8 / l9);
            int n10 = n8;
            int n11 = n9;
            if (l8 % l9 != 0L) {
                n11 = (int)(l8 % l9);
                n10 = Math.min(n8, (int)(l9 - (long)n11));
                byteBuffer.limit(byteBuffer.position() + n10);
                this.a.i(this.b(this.c[n9], n11), byteBuffer);
                n11 = n9 + 1;
                n10 = n8 - n10;
            }
            while (n10 > 0) {
                n8 = (int)Math.min(this.d, (long)n10);
                byteBuffer.limit(byteBuffer.position() + n8);
                try {
                    this.a.i(this.b(this.c[n11], 0), byteBuffer);
                    ++n11;
                    n10 -= n8;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("read index out of bounds :");
                    stringBuilder.append(n11);
                    stringBuilder.append(":");
                    stringBuilder.append(n10);
                    stringBuilder.append(":");
                    stringBuilder.append(this.c.length);
                    stringBuilder.append(":");
                    stringBuilder.append(l8);
                    stringBuilder.append(":");
                    stringBuilder.append(this.d);
                    throw new IOException(stringBuilder.toString());
                }
            }
            return;
        }
        throw new IOException("cluster size == 0");
    }

    void e(int n8) throws IOException {
        int n9 = this.a();
        if (n8 == n9) {
            return;
        }
        if (n8 > n9) {
            Log.d((String)f, (String)"grow chain");
            this.c = this.b.a(this.c, n8 - n9);
            return;
        }
        Log.d((String)f, (String)"shrink chain");
        this.c = this.b.b(this.c, n9 - n8);
    }

    void f(long l8) throws IOException {
        long l9 = this.d;
        this.e((int)((l8 + l9 - 1L) / l9));
    }

    void g(long l8, ByteBuffer byteBuffer) throws IOException {
        int n8 = byteBuffer.remaining();
        long l9 = this.d;
        int n9 = (int)(l8 / l9);
        int n10 = n8;
        int n11 = n9;
        if (l8 % l9 != 0L) {
            n11 = (int)(l8 % l9);
            n10 = Math.min(n8, (int)(l9 - (long)n11));
            byteBuffer.limit(byteBuffer.position() + n10);
            this.a.l(this.b(this.c[n9], n11), byteBuffer);
            n11 = n9 + 1;
            n10 = n8 - n10;
        }
        while (n10 > 0) {
            n8 = (int)Math.min(this.d, (long)n10);
            byteBuffer.limit(byteBuffer.position() + n8);
            try {
                this.a.l(this.b(this.c[n11], 0), byteBuffer);
                ++n11;
                n10 -= n8;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ChainIndexError:");
                stringBuilder.append(n11);
                stringBuilder.append(":");
                stringBuilder.append(l8);
                throw new IOException(stringBuilder.toString());
            }
        }
    }
}

