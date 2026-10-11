/*
 * Decompiled with CFR 0.152.
 */
package ax.b5;

import ax.b5.a;
import java.io.OutputStream;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
extends OutputStream
implements AutoCloseable {
    public static final byte[] g0 = new byte[0];
    private final LinkedList<byte[]> c0 = new LinkedList();
    private int d0;
    private byte[] e0;
    private int f0;
    private final a q;

    public c() {
        this(null);
    }

    public c(a a8) {
        this(a8, 500);
    }

    public c(a object, int n8) {
        this.q = object;
        int n9 = n8;
        if (n8 > 131072) {
            n9 = 131072;
        }
        object = object == null ? (Object)new byte[n9] : (Object)((a)object).a(2);
        this.e0 = (byte[])object;
    }

    private c(a a8, byte[] byArray, int n8) {
        this.q = null;
        this.e0 = byArray;
        this.f0 = n8;
    }

    private void a() {
        int n8 = this.d0 + this.e0.length;
        if (n8 >= 0) {
            int n9;
            this.d0 = n8;
            n8 = n9 = Math.max(n8 >> 1, 1000);
            if (n9 > 131072) {
                n8 = 131072;
            }
            this.c0.add(this.e0);
            this.e0 = new byte[n8];
            this.f0 = 0;
            return;
        }
        throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    public static c g(byte[] byArray, int n8) {
        return new c(null, byArray, n8);
    }

    public void b(int n8) {
        if (this.f0 >= this.e0.length) {
            this.a();
        }
        byte[] byArray = this.e0;
        int n9 = this.f0;
        this.f0 = n9 + 1;
        byArray[n9] = (byte)n8;
    }

    public void c(int n8) {
        int n9 = this.f0;
        byte[] byArray = this.e0;
        if (n9 + 2 < byArray.length) {
            int n10;
            int n11;
            this.f0 = n11 = n9 + 1;
            byArray[n9] = (byte)(n8 >> 16);
            this.f0 = n10 = n9 + 2;
            byArray[n11] = (byte)(n8 >> 8);
            this.f0 = n9 + 3;
            byArray[n10] = (byte)n8;
            return;
        }
        this.b(n8 >> 16);
        this.b(n8 >> 8);
        this.b(n8);
    }

    @Override
    public void close() {
    }

    public void d(int n8) {
        int n9 = this.f0;
        byte[] byArray = this.e0;
        if (n9 + 1 < byArray.length) {
            int n10;
            this.f0 = n10 = n9 + 1;
            byArray[n9] = (byte)(n8 >> 8);
            this.f0 = n9 + 2;
            byArray[n10] = (byte)n8;
            return;
        }
        this.b(n8 >> 8);
        this.b(n8);
    }

    public byte[] e(int n8) {
        this.f0 = n8;
        return this.m();
    }

    public byte[] f() {
        this.a();
        return this.e0;
    }

    @Override
    public void flush() {
    }

    public void j() {
        this.d0 = 0;
        this.f0 = 0;
        if (!this.c0.isEmpty()) {
            this.c0.clear();
        }
    }

    public byte[] m() {
        Object object;
        int n8 = this.d0 + this.f0;
        if (n8 == 0) {
            return g0;
        }
        byte[] byArray = new byte[n8];
        Iterator iterator = ((AbstractCollection)this.c0).iterator();
        int n9 = 0;
        while (iterator.hasNext()) {
            object = (byte[])iterator.next();
            int n10 = ((byte[])object).length;
            System.arraycopy(object, 0, byArray, n9, n10);
            n9 += n10;
        }
        System.arraycopy(this.e0, 0, byArray, n9, this.f0);
        if ((n9 += this.f0) == n8) {
            if (!this.c0.isEmpty()) {
                this.j();
            }
            return byArray;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Internal error: total len assumed to be ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(", copied ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(" bytes");
        throw new RuntimeException(((StringBuilder)object).toString());
    }

    @Override
    public void write(int n8) {
        this.b(n8);
    }

    @Override
    public void write(byte[] byArray) {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) {
        int n10 = n8;
        while (true) {
            int n11 = Math.min(this.e0.length - this.f0, n9);
            int n12 = n10;
            n8 = n9;
            if (n11 > 0) {
                System.arraycopy(byArray, n10, this.e0, this.f0, n11);
                n12 = n10 + n11;
                this.f0 += n11;
                n8 = n9 - n11;
            }
            if (n8 <= 0) {
                return;
            }
            this.a();
            n10 = n12;
            n9 = n8;
        }
    }
}

