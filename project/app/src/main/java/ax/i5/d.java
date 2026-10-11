/*
 * Decompiled with CFR 0.152.
 */
package ax.i5;

import android.util.Log;
import ax.e5.a;
import ax.h5.e;
import ax.i5.b;
import ax.i5.c;
import ax.i5.f;
import ax.i5.j;
import java.io.IOException;
import java.nio.ByteBuffer;

public class d
implements ax.h5.b {
    private static final String e = "d";
    private c a;
    private b b;
    private j c;
    private f d;

    private d(a a8, ByteBuffer object) throws IOException {
        this.a = object = ax.i5.c.m((ByteBuffer)object);
        this.c = j.d(a8, ((c)object).f() * this.a.b());
        this.b = object = new b(a8, this.a, this.c);
        this.d = f.m(a8, (b)object, this.a);
        Log.d((String)e, (String)this.a.toString());
    }

    public static d f(a a8) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        a8.i(0L, byteBuffer);
        byteBuffer.flip();
        if ((char)byteBuffer.get(82) == 'F' && (char)byteBuffer.get(83) == 'A' && (char)byteBuffer.get(84) == 'T' && (char)byteBuffer.get(85) == '3' && (char)byteBuffer.get(86) == '2' && (char)byteBuffer.get(87) == ' ' && (char)byteBuffer.get(88) == ' ' && (char)byteBuffer.get(89) == ' ') {
            return new d(a8, byteBuffer);
        }
        return null;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public long b() {
        return this.a.j() * (long)this.a.b();
    }

    @Override
    public long c() {
        return this.b() - this.e();
    }

    @Override
    public e d() {
        return this.d;
    }

    public long e() {
        return this.c.b() * (long)this.a.a();
    }
}

