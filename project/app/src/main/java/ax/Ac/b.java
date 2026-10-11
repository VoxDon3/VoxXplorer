/*
 * Decompiled with CFR 0.152.
 */
package ax.Ac;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class b
extends InputStream
implements j.InputStreamRetargetInterface {
    private long c0;
    private final byte[] q = new byte[1];

    protected void a(int n8) {
        this.b(n8);
    }

    protected void b(long l8) {
        if (l8 != -1L) {
            this.c0 += l8;
        }
    }

    public long c() {
        return this.c0;
    }

    protected void d(long l8) {
        this.c0 -= l8;
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.q, 0, 1) == -1) {
            return -1;
        }
        return this.q[0] & 0xFF;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

