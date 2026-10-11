/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class k
extends FilterOutputStream {
    private long q;

    public k(OutputStream outputStream) {
        super(outputStream);
    }

    protected void a(long l8) {
        if (l8 != -1L) {
            this.q += l8;
        }
    }

    public long b() {
        return this.q;
    }

    @Override
    public void write(int n8) throws IOException {
        this.out.write(n8);
        this.a(1L);
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.out.write(byArray, n8, n9);
        this.a(n9);
    }
}

