/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.V0;
import java.io.InputStream;
import java.io.OutputStream;

abstract class Y0
extends InputStream
implements j.InputStreamRetargetInterface {
    private int c0;
    protected final InputStream q;

    Y0(InputStream inputStream, int n8) {
        this.q = inputStream;
        this.c0 = n8;
    }

    int a() {
        return this.c0;
    }

    protected void b(boolean bl) {
        InputStream inputStream = this.q;
        if (inputStream instanceof V0) {
            ((V0)inputStream).d(bl);
        }
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

