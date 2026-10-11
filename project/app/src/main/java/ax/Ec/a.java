/*
 * Decompiled with CFR 0.152.
 */
package ax.Ec;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class a
extends InputStream
implements j.InputStreamRetargetInterface {
    private long q;

    protected void b(int n8) {
        this.c(n8);
    }

    protected void c(long l8) {
        if (l8 != -1L) {
            this.q += l8;
        }
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

