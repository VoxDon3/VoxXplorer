/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Bc.e;
import ax.Bc.f;
import ax.be.t;
import ax.be.y;
import ax.be.z;
import ax.zc.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class j
extends f {
    j() {
        super(z.class, Number.class);
    }

    private int g(Object object) {
        if (object instanceof z) {
            return ((z)object).i();
        }
        return this.j(object);
    }

    private int h(e object) throws IOException {
        object = ((e)object).d;
        if (object != null) {
            if (((Object)object).length >= 1) {
                Object object2 = object[0];
                int n8 = object2 & 0xFF;
                if ((object2 & 0xC0) == 0) {
                    if (n8 <= 40) {
                        if (n8 == 40) {
                            return -1;
                        }
                        return (object2 & 1 | 2) << n8 / 2 + 11;
                    }
                    throw new IOException("Dictionary larger than 4GiB maximum size");
                }
                throw new IOException("Unsupported LZMA2 property bits");
            }
            throw new IOException("LZMA2 properties too short");
        }
        throw new IOException("Missing LZMA2 properties");
    }

    private z i(Object object) throws IOException {
        if (object instanceof z) {
            return (z)object;
        }
        z z8 = new z();
        z8.s(this.j(object));
        return z8;
    }

    private int j(Object object) {
        return f.f(object, 0x800000);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    InputStream b(String object, InputStream inputStream, long l8, e e8, byte[] byArray, int n8) throws IOException {
        int n9;
        try {
            int n10 = this.h(e8);
            n9 = y.d(n10);
            if (n9 <= n8) {
                return new y(inputStream, n10);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException(illegalArgumentException.getMessage());
        }
        object = new a(n9, n8);
        throw object;
    }

    @Override
    OutputStream c(OutputStream outputStream, Object object) throws IOException {
        return this.i(object).d(new t(outputStream));
    }

    @Override
    byte[] d(Object object) {
        int n8 = this.g(object);
        int n9 = Integer.numberOfLeadingZeros(n8);
        return new byte[]{(byte)((19 - n9) * 2 + ((n8 >>> 30 - n9) - 2))};
    }

    @Override
    Object e(e e8, InputStream inputStream) throws IOException {
        return this.h(e8);
    }
}

