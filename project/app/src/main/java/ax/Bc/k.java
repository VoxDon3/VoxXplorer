/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Bc.e;
import ax.Bc.f;
import ax.Kc.m;
import ax.be.B;
import ax.be.C;
import ax.be.z;
import ax.zc.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class k
extends f {
    k() {
        super(z.class, Number.class);
    }

    private int g(e e8) throws IllegalArgumentException {
        return (int)ax.Kc.f.c(e8.d, 1, 4);
    }

    private z h(Object object) throws IOException {
        if (object instanceof z) {
            return (z)object;
        }
        z z8 = new z();
        z8.s(this.i(object));
        return z8;
    }

    private int i(Object object) {
        return f.f(object, 0x800000);
    }

    @Override
    InputStream b(String string, InputStream object, long l8, e e8, byte[] byArray, int n8) throws IOException {
        byArray = e8.d;
        if (byArray != null) {
            if (byArray.length >= 1) {
                byte by = byArray[0];
                int n9 = this.g(e8);
                if (n9 <= 0x7FFFFFF0) {
                    int n10 = B.b(n9, by);
                    if (n10 <= n8) {
                        return new B((InputStream)object, l8, by, n9);
                    }
                    throw new a(n10, n8);
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Dictionary larger than 4GiB maximum size used in ");
                ((StringBuilder)object).append(string);
                throw new IOException(((StringBuilder)object).toString());
            }
            throw new IOException("LZMA properties too short");
        }
        throw new IOException("Missing LZMA properties");
    }

    @Override
    OutputStream c(OutputStream outputStream, Object object) throws IOException {
        return new m(new C(outputStream, this.h(object), false));
    }

    @Override
    byte[] d(Object object) throws IOException {
        object = this.h(object);
        byte by = (byte)((((z)object).o() * 5 + ((z)object).k()) * 9 + ((z)object).j());
        int n8 = ((z)object).i();
        object = new byte[5];
        object[0] = by;
        ax.Kc.f.d((byte[])object, n8, 1, 4);
        return object;
    }

    @Override
    Object e(e e8, InputStream object) throws IOException {
        object = e8.d;
        if (object != null) {
            if (((Object)object).length >= 1) {
                int n8 = object[0] & 0xFF;
                int n9 = n8 / 45;
                int n10 = (n8 -= n9 * 45) / 9;
                object = new z();
                ((z)object).v(n9);
                ((z)object).t(n8 - n10 * 9, n10);
                ((z)object).s(this.g(e8));
                return object;
            }
            throw new IOException("LZMA properties too short");
        }
        throw new IOException("Missing LZMA properties");
    }
}

