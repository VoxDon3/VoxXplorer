/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.F;
import ax.Wc.g;
import ax.Wc.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class h0
extends InputStream
implements j.InputStreamRetargetInterface {
    private boolean c0 = true;
    private InputStream d0;
    private final F q;

    h0(F f8) {
        this.q = f8;
    }

    private x a() throws IOException {
        g g8 = this.q.g();
        if (g8 == null) {
            return null;
        }
        if (g8 instanceof x) {
            return (x)g8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unknown object encountered: ");
        stringBuilder.append(g8.getClass());
        throw new IOException(stringBuilder.toString());
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public int read() throws IOException {
        x x8;
        boolean bl = true;
        do {
            int n8;
            x x9;
            block6: {
                block5: {
                    if (!bl || (bl = false)) break block5;
                    if (this.d0 != null) break block6;
                    if (!this.c0) {
                        return -1;
                    }
                    x9 = this.a();
                    if (x9 == null) {
                        return -1;
                    }
                    this.c0 = false;
                }
                this.d0 = x9.e();
            }
            if ((n8 = this.d0.read()) >= 0) {
                return n8;
            }
            x9 = x8 = this.a();
        } while (x8 != null);
        this.d0 = null;
        return -1;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        x x8;
        Object object = this.d0;
        int n10 = 0;
        int n11 = 0;
        boolean bl = true;
        do {
            block7: {
                block6: {
                    if (!bl || (bl = false)) break block6;
                    if (object != null) break block7;
                    if (!this.c0) {
                        return -1;
                    }
                    object = this.a();
                    if (object == null) {
                        return -1;
                    }
                    this.c0 = false;
                }
                this.d0 = object.e();
                n10 = n11;
            }
            while ((n11 = this.d0.read(byArray, n8 + n10, n9 - n10)) >= 0) {
                n10 = n11 = n10 + n11;
                if (n11 != n9) continue;
                return n11;
            }
            x8 = this.a();
            object = x8;
            n11 = n10;
        } while (x8 != null);
        this.d0 = null;
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

