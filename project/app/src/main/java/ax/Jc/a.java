/*
 * Decompiled with CFR 0.152.
 */
package ax.Jc;

import ax.Kc.j;
import ax.Kc.n;
import ax.Kc.o;
import ax.be.D;
import ax.be.J;
import ax.be.N;
import ax.be.Q;
import java.io.IOException;
import java.io.InputStream;

public class a
extends ax.Ec.a
implements o {
    private final j c0;
    private final InputStream d0;

    public a(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public a(InputStream inputStream, boolean bl) throws IOException {
        this(inputStream, bl, -1);
    }

    public a(InputStream inputStream, boolean bl, int n8) throws IOException {
        inputStream = new j(inputStream);
        this.c0 = inputStream;
        if (bl) {
            this.d0 = new Q(inputStream, n8);
            return;
        }
        this.d0 = new J(inputStream, n8);
    }

    public static boolean d(byte[] byArray, int n8) {
        byte[] byArray2;
        if (n8 < N.a.length) {
            return false;
        }
        for (n8 = 0; n8 < (byArray2 = N.a).length; ++n8) {
            if (byArray[n8] == byArray2[n8]) continue;
            return false;
        }
        return true;
    }

    @Override
    public long a() {
        return this.c0.c();
    }

    @Override
    public int available() throws IOException {
        return this.d0.available();
    }

    @Override
    public void close() throws IOException {
        this.d0.close();
    }

    @Override
    public int read() throws IOException {
        int n8;
        int n9;
        block3: {
            try {
                n9 = this.d0.read();
                n8 = -1;
                if (n9 == -1) break block3;
                n8 = 1;
            }
            catch (D d8) {
                throw new ax.zc.a(d8.b(), d8.a(), d8);
            }
        }
        this.b(n8);
        return n9;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 == 0) {
            return 0;
        }
        try {
            n8 = this.d0.read(byArray, n8, n9);
            this.b(n8);
            return n8;
        }
        catch (D d8) {
            throw new ax.zc.a(d8.b(), d8.a(), d8);
        }
    }

    @Override
    public long skip(long l8) throws IOException {
        try {
            l8 = n.i(this.d0, l8);
            return l8;
        }
        catch (D d8) {
            throw new ax.zc.a(d8.b(), d8.a(), d8);
        }
    }
}

