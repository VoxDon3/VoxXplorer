/*
 * Decompiled with CFR 0.152.
 */
package ax.i5;

import android.util.Log;
import ax.e5.a;
import com.github.mjdev.libaums.b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class j {
    static int d = -1;
    private static int e = 0;
    private static int f = 484;
    private static int g = 508;
    private static int h = 488;
    private static int i = 492;
    private static int j = 1096897106;
    private static int k = 1631679090;
    private static int l = -1437270016;
    private static final String m = "j";
    private int a;
    private a b;
    private ByteBuffer c;

    private j(a a8, int n8) throws IOException {
        ByteBuffer byteBuffer;
        this.b = a8;
        this.a = n8;
        this.c = byteBuffer = ByteBuffer.allocate(512);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        a8.i(n8, this.c);
        this.c.clear();
        if (this.c.getInt(e) == j && this.c.getInt(f) == k && this.c.getInt(g) == l) {
            return;
        }
        throw new b("invalid fs info structure!");
    }

    static j d(a a8, int n8) throws IOException {
        return new j(a8, n8);
    }

    void a(long l8) {
        long l9 = this.b();
        if (l9 != (long)d) {
            this.e(l9 - l8);
        }
    }

    long b() {
        return this.c.getInt(h);
    }

    long c() {
        return this.c.getInt(i);
    }

    void e(long l8) {
        this.c.putInt(h, (int)l8);
    }

    void f(long l8) {
        this.c.putInt(i, (int)l8);
    }

    void g() throws IOException {
        Log.d((String)m, (String)"writing to device");
        this.b.l(this.a, this.c);
        this.c.clear();
    }
}

