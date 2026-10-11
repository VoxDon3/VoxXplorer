/*
 * Decompiled with CFR 0.152.
 */
package ax.Oc;

import ax.Lc.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class a<T extends a<T>>
extends OutputStream
implements AutoCloseable {
    protected int c0;
    private byte[] d0;
    private int e0 = -1;
    private int f0;
    private boolean g0 = true;
    private final List<byte[]> q = new ArrayList<byte[]>();

    protected void a(int n8) {
        if (this.e0 < this.q.size() - 1) {
            this.f0 += this.d0.length;
            this.e0 = n8 = this.e0 + 1;
            this.d0 = this.q.get(n8);
            return;
        }
        byte[] byArray = this.d0;
        if (byArray == null) {
            if (n8 <= 0) {
                n8 = 1024;
            }
            this.f0 = 0;
        } else {
            n8 = Math.max(byArray.length << 1, n8 - this.f0);
            this.f0 += this.d0.length;
        }
        ++this.e0;
        this.d0 = byArray = d.a(n8);
        this.q.add(byArray);
    }

    public abstract byte[] b();

    protected byte[] c() {
        int n8 = this.c0;
        if (n8 == 0) {
            return d.b;
        }
        byte[] byArray = d.a(n8);
        Iterator<byte[]> iterator = this.q.iterator();
        int n9 = 0;
        while (iterator.hasNext()) {
            byte[] byArray2 = iterator.next();
            int n10 = Math.min(byArray2.length, n8);
            System.arraycopy(byArray2, 0, byArray, n9, n10);
            n9 += n10;
            n8 = n10 = n8 - n10;
            if (n10 != 0) continue;
        }
        return byArray;
    }

    @Override
    public void close() throws IOException {
    }

    protected void d(int n8) {
        int n9;
        int n10 = this.c0;
        int n11 = n9 = n10 - this.f0;
        if (n9 == this.d0.length) {
            this.a(n10 + 1);
            n11 = 0;
        }
        this.d0[n11] = (byte)n8;
        ++this.c0;
    }

    protected void e(byte[] byArray, int n8, int n9) {
        int n10 = this.c0;
        int n11 = n10 + n9;
        int n12 = n10 - this.f0;
        n10 = n9;
        while (n10 > 0) {
            int n13 = Math.min(n10, this.d0.length - n12);
            System.arraycopy(byArray, n8 + n9 - n10, this.d0, n12, n13);
            n10 = n13 = n10 - n13;
            if (n13 <= 0) continue;
            this.a(n11);
            n12 = 0;
            n10 = n13;
        }
        this.c0 = n11;
    }

    @Deprecated
    public String toString() {
        return new String(this.b(), Charset.defaultCharset());
    }

    @Override
    public void write(byte[] byArray) {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public abstract void write(byte[] var1, int var2, int var3);
}

