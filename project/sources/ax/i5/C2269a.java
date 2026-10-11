package ax.i5;

import android.util.Log;
import ax.e5.InterfaceC1979a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ax.i5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2269a {
    private static final String f = "a";
    private InterfaceC1979a a;
    private C2270b b;
    private Long[] c;
    private long d;
    private long e;

    C2269a(long j, InterfaceC1979a interfaceC1979a, C2270b c2270b, c cVar) throws IOException {
        String str = f;
        Log.d(str, "Init a cluster chain, reading from FAT");
        this.b = c2270b;
        this.a = interfaceC1979a;
        long a = cVar.a();
        this.d = a;
        this.c = c2270b.c(j, a);
        this.e = cVar.c();
        Log.d(str, "Finished init of a cluster chain");
    }

    private long b(long j, int i) {
        return this.e + i + ((j - 2) * this.d);
    }

    int a() {
        return this.c.length;
    }

    long c() {
        return this.c.length * this.d;
    }

    void d(long j, ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        long j2 = this.d;
        if (j2 == 0) {
            throw new IOException("cluster size == 0");
        }
        int i = (int) (j / j2);
        if (j % j2 != 0) {
            int i2 = (int) (j % j2);
            int min = Math.min(remaining, (int) (j2 - i2));
            byteBuffer.limit(byteBuffer.position() + min);
            this.a.i(b(this.c[i].longValue(), i2), byteBuffer);
            i++;
            remaining -= min;
        }
        while (remaining > 0) {
            int min2 = (int) Math.min(this.d, remaining);
            byteBuffer.limit(byteBuffer.position() + min2);
            try {
                this.a.i(b(this.c[i].longValue(), 0), byteBuffer);
                i++;
                remaining -= min2;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("read index out of bounds :" + i + ":" + remaining + ":" + this.c.length + ":" + j + ":" + this.d);
            }
        }
    }

    void e(int i) throws IOException {
        int a = a();
        if (i == a) {
            return;
        }
        if (i > a) {
            Log.d(f, "grow chain");
            this.c = this.b.a(this.c, i - a);
        } else {
            Log.d(f, "shrink chain");
            this.c = this.b.b(this.c, a - i);
        }
    }

    void f(long j) throws IOException {
        long j2 = this.d;
        e((int) (((j + j2) - 1) / j2));
    }

    void g(long j, ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        long j2 = this.d;
        int i = (int) (j / j2);
        if (j % j2 != 0) {
            int i2 = (int) (j % j2);
            int min = Math.min(remaining, (int) (j2 - i2));
            byteBuffer.limit(byteBuffer.position() + min);
            this.a.l(b(this.c[i].longValue(), i2), byteBuffer);
            i++;
            remaining -= min;
        }
        while (remaining > 0) {
            int min2 = (int) Math.min(this.d, remaining);
            byteBuffer.limit(byteBuffer.position() + min2);
            try {
                this.a.l(b(this.c[i].longValue(), 0), byteBuffer);
                i++;
                remaining -= min2;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("ChainIndexError:" + i + ":" + j);
            }
        }
    }
}
