/*
 * Decompiled with CFR 0.152.
 */
package ax.f5;

import android.util.Log;
import ax.g5.a;
import ax.g5.b;
import ax.g5.c;
import ax.g5.d;
import ax.g5.e;
import ax.g5.f;
import ax.g5.g;
import ax.g5.h;
import ax.g5.i;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class a
implements ax.e5.a {
    private static final String i = "a";
    private ax.m5.b a;
    private ByteBuffer b;
    private ByteBuffer c;
    private int d;
    private int e;
    private i f = new i();
    private e g = new e();
    private b h = new b();

    public a(ax.m5.b b8) {
        this.a = b8;
        this.b = ByteBuffer.allocate(31);
        this.c = ByteBuffer.allocate(13);
    }

    private boolean a(ax.g5.a object, ByteBuffer comparable) throws IOException {
        byte[] byArray = this.b.array();
        Arrays.fill(byArray, (byte)0);
        this.b.clear();
        ((ax.g5.a)object).d(this.b);
        this.b.clear();
        if (this.a.b(this.b) == byArray.length) {
            int n8 = ((ax.g5.a)object).b();
            if (n8 > 0) {
                if (((ax.g5.a)object).a() == a.a.q) {
                    int n9;
                    int n10 = 0;
                    do {
                        n10 = n9 = n10 + this.a.a((ByteBuffer)comparable);
                    } while (n9 < n8);
                    if (n9 != n8) {
                        comparable = new StringBuilder();
                        ((StringBuilder)comparable).append("Unexpected command size (");
                        ((StringBuilder)comparable).append(n9);
                        ((StringBuilder)comparable).append(") on response to ");
                        ((StringBuilder)comparable).append(object);
                        throw new IOException(((StringBuilder)comparable).toString());
                    }
                } else {
                    int n11;
                    int n12 = 0;
                    do {
                        n12 = n11 = n12 + this.a.b((ByteBuffer)comparable);
                    } while (n11 < n8);
                    if (n11 != n8) {
                        comparable = new StringBuilder();
                        ((StringBuilder)comparable).append("Could not write all bytes: ");
                        ((StringBuilder)comparable).append(object);
                        throw new IOException(((StringBuilder)comparable).toString());
                    }
                }
            }
            this.c.clear();
            if (this.a.a(this.c) == 13) {
                this.c.clear();
                this.h.c(this.c);
                if (this.h.a() == 0) {
                    if (this.h.b() == ((ax.g5.a)object).c()) {
                        return this.h.a() == 0;
                    }
                    throw new IOException("wrong csw tag!");
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Unsuccessful Csw status: ");
                ((StringBuilder)object).append(this.h.a());
                throw new IOException(((StringBuilder)object).toString());
            }
            throw new IOException("Unexpected command size while expecting csw");
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("Writing all bytes on command ");
        ((StringBuilder)comparable).append(object);
        ((StringBuilder)comparable).append(" failed!");
        throw new IOException(((StringBuilder)comparable).toString());
    }

    @Override
    public int d() {
        return this.d;
    }

    @Override
    public void e() throws IOException {
        Object object = ByteBuffer.allocate(36);
        this.a(new c((byte)((ByteBuffer)object).array().length), (ByteBuffer)object);
        ((ByteBuffer)object).clear();
        d d8 = ax.g5.d.c((ByteBuffer)object);
        String string = i;
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("inquiry response: ");
        ((StringBuilder)object2).append(d8);
        Log.d((String)string, (String)((StringBuilder)object2).toString());
        if (d8.b() == 0 && d8.a() == 0) {
            if (!this.a(new h(), null)) {
                Log.w((String)string, (String)"unit not ready!");
            }
            object2 = new f();
            ((ByteBuffer)object).clear();
            this.a((ax.g5.a)object2, (ByteBuffer)object);
            ((ByteBuffer)object).clear();
            object = ax.g5.g.c((ByteBuffer)object);
            this.d = ((g)object).a();
            this.e = ((g)object).b();
            object = new StringBuilder();
            ((StringBuilder)object).append("Block size: ");
            ((StringBuilder)object).append(this.d);
            Log.i((String)string, (String)((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("Last block address: ");
            ((StringBuilder)object).append(this.e);
            Log.i((String)string, (String)((StringBuilder)object).toString());
            if (this.d != 0) {
                return;
            }
            throw new com.github.mjdev.libaums.b("Block size is zero");
        }
        throw new IOException("unsupported PeripheralQualifier or PeripheralDeviceType");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void i(long l8, ByteBuffer object) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (((Buffer)object).remaining() % this.d == 0) {
                        this.g.e((int)l8, ((Buffer)object).remaining(), this.d);
                        this.a(this.g, (ByteBuffer)object);
                        ((ByteBuffer)object).position(((Buffer)object).limit());
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = new IllegalArgumentException("dest.remaining() must be multiple of blockSize!");
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void l(long l8, ByteBuffer object) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (((Buffer)object).remaining() % this.d == 0) {
                        this.f.e((int)l8, ((Buffer)object).remaining(), this.d);
                        this.a(this.f, (ByteBuffer)object);
                        ((ByteBuffer)object).position(((Buffer)object).limit());
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = new IllegalArgumentException("src.remaining() must be multiple of blockSize!");
                throw object;
            }
            throw throwable2;
        }
    }
}

