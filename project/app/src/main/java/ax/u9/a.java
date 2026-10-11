/*
 * Decompiled with CFR 0.152.
 */
package ax.u9;

import ax.X8.b;
import ax.Z8.a;
import ax.c9.c;
import ax.c9.e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class a<D extends b<?>>
extends ax.t9.a<D> {
    private final ax.c9.a<D> g0;

    public a(String string, InputStream inputStream, ax.c9.a<D> a8, c<D> c8) {
        super(string, inputStream, c8);
        this.g0 = a8;
    }

    private void e(byte[] byArray) throws IOException {
        int n8 = byArray.length;
        int n9 = 0;
        while (n8 > 0) {
            int n10 = this.c0.read(byArray, n9, n8);
            if (n10 != -1) {
                n8 -= n10;
                n9 += n10;
                continue;
            }
            throw new e(new EOFException("EOF while reading packet"));
        }
    }

    private D f(int n8) throws IOException, a.b {
        byte[] byArray = new byte[n8];
        this.e(byArray);
        return this.g0.a(byArray);
    }

    private int g() throws IOException, a.b {
        Object object = new byte[4];
        this.e((byte[])object);
        object = new a.c((byte[])object, ax.Z8.b.c);
        ((ax.Z8.a)object).z();
        return ((ax.Z8.a)object).L();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected D a() throws e {
        e e82;
        block4: {
            Throwable var1_5;
            D d8;
            try {
                d8 = this.f(this.g());
            }
            catch (a.b b8) {
            }
            catch (IOException iOException) {
            }
            catch (e e82) {
                break block4;
            }
            return d8;
            throw new e((Throwable)var1_5);
        }
        throw e82;
    }
}

