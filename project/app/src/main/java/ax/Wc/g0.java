/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.F;
import ax.Wc.d;
import ax.Wc.g;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class g0
extends InputStream
implements j.InputStreamRetargetInterface {
    private final boolean c0;
    private boolean d0 = true;
    private int e0 = 0;
    private d f0;
    private InputStream g0;
    private final F q;

    g0(F f8, boolean bl) {
        this.q = f8;
        this.c0 = bl;
    }

    private d a() throws IOException {
        g g8 = this.q.g();
        if (g8 == null) {
            if (this.c0 && this.e0 != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("expected octet-aligned bitstring, but found padBits: ");
                stringBuilder.append(this.e0);
                throw new IOException(stringBuilder.toString());
            }
            return null;
        }
        if (g8 instanceof d) {
            if (this.e0 == 0) {
                return (d)g8;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unknown object encountered: ");
        stringBuilder.append(g8.getClass());
        throw new IOException(stringBuilder.toString());
    }

    int b() {
        return this.e0;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public int read() throws IOException {
        d d8;
        boolean bl = true;
        do {
            int n8;
            d d9;
            block6: {
                block5: {
                    if (!bl || (bl = false)) break block5;
                    if (this.g0 != null) break block6;
                    if (!this.d0) {
                        return -1;
                    }
                    this.f0 = d9 = this.a();
                    if (d9 == null) {
                        return -1;
                    }
                    this.d0 = false;
                }
                this.g0 = d9.i();
            }
            if ((n8 = this.g0.read()) >= 0) {
                return n8;
            }
            this.e0 = this.f0.k();
            this.f0 = d8 = this.a();
            d9 = d8;
        } while (d8 != null);
        this.g0 = null;
        return -1;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        d d8;
        Object object = this.g0;
        int n10 = 0;
        int n11 = 0;
        boolean bl = true;
        do {
            block7: {
                block6: {
                    if (!bl || (bl = false)) break block6;
                    if (object != null) break block7;
                    if (!this.d0) {
                        return -1;
                    }
                    this.f0 = object = this.a();
                    if (object == null) {
                        return -1;
                    }
                    this.d0 = false;
                }
                this.g0 = object.i();
                n10 = n11;
            }
            while ((n11 = this.g0.read(byArray, n8 + n10, n9 - n10)) >= 0) {
                n10 = n11 = n10 + n11;
                if (n11 != n9) continue;
                return n11;
            }
            this.e0 = this.f0.k();
            this.f0 = d8 = this.a();
            object = d8;
            n11 = n10;
        } while (d8 != null);
        this.g0 = null;
        if (n10 < 1) {
            return -1;
        }
        return n10;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

