/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Kc.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

class k
extends InflaterInputStream
implements o,
j.InputStreamRetargetInterface {
    private long c0;
    private long q;

    public k(InputStream inputStream, Inflater inflater) {
        super(inputStream, inflater);
    }

    @Override
    public long a() {
        return this.q;
    }

    @Override
    protected void fill() throws IOException {
        super.fill();
        this.q += (long)this.inf.getRemaining();
    }

    @Override
    public int read() throws IOException {
        int n8 = super.read();
        if (n8 > -1) {
            ++this.c0;
        }
        return n8;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if ((n8 = super.read(byArray, n8, n9)) > -1) {
            this.c0 += (long)n8;
        }
        return n8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

