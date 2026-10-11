/*
 * Decompiled with CFR 0.152.
 */
package ax.k4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class b
extends FilterInputStream
implements j.InputStreamRetargetInterface {
    private int c0;
    private final long q;

    b(InputStream inputStream, long l8) {
        super(inputStream);
        this.q = l8;
    }

    private int a(int n8) throws IOException {
        if (n8 >= 0) {
            this.c0 += n8;
            return n8;
        }
        if (this.q - (long)this.c0 <= 0L) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to read all expected data, expected: ");
        stringBuilder.append(this.q);
        stringBuilder.append(", but read: ");
        stringBuilder.append(this.c0);
        throw new IOException(stringBuilder.toString());
    }

    public static InputStream b(InputStream inputStream, long l8) {
        return new b(inputStream, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int available() throws IOException {
        synchronized (this) {
            long l8 = Math.max(this.q - (long)this.c0, (long)this.in.available());
            return (int)l8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read() throws IOException {
        synchronized (this) {
            int n8 = super.read();
            int n9 = n8 >= 0 ? 1 : -1;
            this.a(n9);
            return n8;
        }
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        synchronized (this) {
            return this.a(super.read(byArray, n8, n9));
        }
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

