/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.b3.j;
import ax.c3.f;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class d
extends f {
    private byte[] a;

    public d(byte[] byArray) {
        this.a = byArray;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public InputStream c(long l8) throws j {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.a);
        byteArrayInputStream.skip(l8);
        return byteArrayInputStream;
    }

    @Override
    public long d() {
        return this.a.length;
    }

    @Override
    public void e() {
    }
}

