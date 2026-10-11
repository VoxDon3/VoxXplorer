/*
 * Decompiled with CFR 0.152.
 */
package ax.e5;

import ax.e5.a;
import java.io.IOException;
import java.nio.ByteBuffer;

public class c
implements a {
    private a a;
    private int b;
    private int c;

    public c(a a8) {
        this(a8, 0);
    }

    public c(a a8, int n8) {
        this.a = a8;
        this.c = a8.d();
        this.b = n8;
    }

    @Override
    public int d() {
        return this.a.d();
    }

    @Override
    public void e() throws IOException {
        this.a.e();
    }

    @Override
    public void i(long l8, ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2;
        long l9;
        int n8 = this.c;
        long l10 = l9 = l8 / (long)n8 + (long)this.b;
        if (l8 % (long)n8 != 0L) {
            byteBuffer2 = ByteBuffer.allocate(n8);
            this.a.i(l9, byteBuffer2);
            byteBuffer2.clear();
            byteBuffer2.position((int)(l8 % (long)this.c));
            n8 = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
            byteBuffer2.limit(byteBuffer2.position() + n8);
            byteBuffer.put(byteBuffer2);
            l10 = l9 + 1L;
        }
        if (byteBuffer.remaining() > 0) {
            int n9 = byteBuffer.remaining();
            if (n9 % (n8 = this.c) != 0) {
                n8 = n8 - byteBuffer.remaining() % this.c + byteBuffer.remaining();
                byteBuffer2 = ByteBuffer.allocate(n8);
                byteBuffer2.limit(n8);
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.a.i(l10, byteBuffer2);
            if (byteBuffer.remaining() % this.c != 0) {
                System.arraycopy(byteBuffer2.array(), 0, byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            }
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override
    public void l(long l8, ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2;
        long l9;
        int n8 = this.c;
        long l10 = l9 = l8 / (long)n8 + (long)this.b;
        if (l8 % (long)n8 != 0L) {
            byteBuffer2 = ByteBuffer.allocate(n8);
            this.a.i(l9, byteBuffer2);
            byteBuffer2.clear();
            byteBuffer2.position((int)(l8 % (long)this.c));
            n8 = Math.min(byteBuffer2.remaining(), byteBuffer.remaining());
            byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), n8);
            byteBuffer.position(byteBuffer.position() + n8);
            byteBuffer2.clear();
            this.a.l(l9, byteBuffer2);
            l10 = l9 + 1L;
        }
        if (byteBuffer.remaining() > 0) {
            n8 = byteBuffer.remaining();
            int n9 = this.c;
            byteBuffer2 = byteBuffer;
            if (n8 % n9 != 0) {
                n8 = n9 - byteBuffer.remaining() % this.c + byteBuffer.remaining();
                byteBuffer2 = ByteBuffer.allocate(n8);
                byteBuffer2.limit(n8);
                System.arraycopy(byteBuffer.array(), byteBuffer.position(), byteBuffer2.array(), 0, byteBuffer.remaining());
                byteBuffer.position(byteBuffer.limit());
            }
            this.a.l(l10, byteBuffer2);
        }
    }
}

