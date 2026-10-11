/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import ax.W4.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class h
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final InputStream c0;
    private byte[] d0;
    private int e0;
    private final int f0;
    private final e q;

    public h(e e8, InputStream inputStream, byte[] byArray, int n8, int n9) {
        this.q = e8;
        this.c0 = inputStream;
        this.d0 = byArray;
        this.e0 = n8;
        this.f0 = n9;
    }

    private void a() {
        byte[] byArray = this.d0;
        if (byArray != null) {
            this.d0 = null;
            e e8 = this.q;
            if (e8 != null) {
                e8.o(byArray);
            }
        }
    }

    @Override
    public int available() throws IOException {
        if (this.d0 != null) {
            return this.f0 - this.e0;
        }
        return this.c0.available();
    }

    @Override
    public void close() throws IOException {
        this.a();
        this.c0.close();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void mark(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (this.d0 != null) break block4;
                        this.c0.mark(n8);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public boolean markSupported() {
        return this.d0 == null && this.c0.markSupported();
    }

    @Override
    public int read() throws IOException {
        byte[] byArray = this.d0;
        if (byArray != null) {
            int n8;
            int n9 = this.e0;
            this.e0 = n8 = n9 + 1;
            n9 = byArray[n9];
            if (n8 >= this.f0) {
                this.a();
            }
            return n9 & 0xFF;
        }
        return this.c0.read();
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        byte[] byArray2 = this.d0;
        if (byArray2 != null) {
            int n10 = this.f0;
            int n11 = this.e0;
            int n12 = n10 - n11;
            n10 = n9;
            if (n9 > n12) {
                n10 = n12;
            }
            System.arraycopy(byArray2, n11, byArray, n8, n10);
            this.e0 = n8 = this.e0 + n10;
            if (n8 >= this.f0) {
                this.a();
            }
            return n10;
        }
        return this.c0.read(byArray, n8, n9);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void reset() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (this.d0 != null) break block4;
                        this.c0.reset();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public long skip(long l8) throws IOException {
        long l9;
        long l10;
        if (this.d0 != null) {
            int n8 = this.f0;
            int n9 = this.e0;
            l10 = n8 - n9;
            if (l10 > l8) {
                this.e0 = n9 + (int)l8;
                return l8;
            }
            this.a();
            l9 = l8 - l10;
            l8 = l10;
        } else {
            l10 = 0L;
            l9 = l8;
            l8 = l10;
        }
        l10 = l8;
        if (l9 > 0L) {
            l10 = l8 + this.c0.skip(l9);
        }
        return l10;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

