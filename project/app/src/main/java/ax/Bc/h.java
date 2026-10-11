/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Bc.e;
import ax.Bc.f;
import ax.be.L;
import ax.be.n;
import ax.be.s;
import ax.be.t;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class h
extends f {
    h() {
        super(Number.class);
    }

    private int g(e object) {
        object = ((e)object).d;
        if (object != null && ((Object)object).length != 0) {
            return (object[0] & 0xFF) + 1;
        }
        return 1;
    }

    @Override
    InputStream b(String string, InputStream inputStream, long l8, e e8, byte[] byArray, int n8) throws IOException {
        return new n(this.g(e8)).b(inputStream);
    }

    @Override
    OutputStream c(OutputStream outputStream, Object object) throws IOException {
        int n8 = f.f(object, 1);
        try {
            n n9 = new n(n8);
            object = new t(outputStream);
            outputStream = n9.d((s)object);
            return outputStream;
        }
        catch (L l8) {
            throw new IOException(l8.getMessage());
        }
    }

    @Override
    byte[] d(Object object) {
        return new byte[]{(byte)(f.f(object, 1) - 1)};
    }

    @Override
    Object e(e e8, InputStream inputStream) {
        return this.g(e8);
    }
}

