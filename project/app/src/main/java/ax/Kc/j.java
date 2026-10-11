/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class j
extends FilterInputStream
implements j.InputStreamRetargetInterface {
    private long q;

    public j(InputStream inputStream) {
        super(inputStream);
    }

    protected final void b(long l8) {
        if (l8 != -1L) {
            this.q += l8;
        }
    }

    public long c() {
        return this.q;
    }

    @Override
    public int read() throws IOException {
        int n8 = this.in.read();
        if (n8 >= 0) {
            this.b(1L);
        }
        return n8;
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 == 0) {
            return 0;
        }
        if ((n8 = this.in.read(byArray, n8, n9)) >= 0) {
            this.b(n8);
        }
        return n8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

