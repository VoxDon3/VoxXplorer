/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.N;
import ax.Dc.U;
import ax.Dc.W;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

public class b
implements N,
Cloneable {
    private static final W h0 = new W(30062);
    private int c0;
    private int d0;
    private String e0 = "";
    private boolean f0;
    private CRC32 g0 = new CRC32();
    private int q;

    @Override
    public W b() {
        return h0;
    }

    @Override
    public W c() {
        return new W(this.l().getBytes().length + 14);
    }

    public Object clone() {
        try {
            CRC32 cRC32;
            b b8 = (b)super.clone();
            b8.g0 = cRC32 = new CRC32();
            return b8;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    @Override
    public void d(byte[] object, int n8, int n9) throws ZipException {
        if (n9 >= 14) {
            long l8 = U.i(object, n8);
            int n10 = n9 - 4;
            byte[] byArray = new byte[n10];
            boolean bl = false;
            System.arraycopy(object, n8 + 4, byArray, 0, n10);
            this.g0.reset();
            this.g0.update(byArray);
            long l9 = this.g0.getValue();
            if (l8 == l9) {
                n10 = W.h(byArray, 0);
                n8 = (int)U.i(byArray, 2);
                if (n8 >= 0 && n8 <= n9 - 14) {
                    this.c0 = W.h(byArray, 6);
                    this.d0 = W.h(byArray, 8);
                    if (n8 == 0) {
                        this.e0 = "";
                    } else {
                        object = new byte[n8];
                        System.arraycopy(byArray, 10, object, 0, n8);
                        this.e0 = new String((byte[])object);
                    }
                    if ((n10 & 0x4000) != 0) {
                        bl = true;
                    }
                    this.t(bl);
                    this.v(n10);
                    return;
                }
                object = new StringBuilder();
                object.append("Bad symbolic link name length ");
                object.append(n8);
                object.append(" in ASI extra field");
                throw new ZipException(object.toString());
            }
            object = new StringBuilder();
            object.append("Bad CRC checksum, expected ");
            object.append(Long.toHexString(l8));
            object.append(" instead of ");
            object.append(Long.toHexString(l9));
            throw new ZipException(object.toString());
        }
        object = new StringBuilder();
        object.append("The length is too short, only ");
        object.append(n9);
        object.append(" bytes, expected at least ");
        object.append(14);
        throw new ZipException(object.toString());
    }

    @Override
    public byte[] f() {
        int n8 = this.c().d();
        int n9 = n8 - 4;
        byte[] byArray = new byte[n9];
        System.arraycopy(W.c(this.m()), 0, byArray, 0, 2);
        byte[] byArray2 = this.l().getBytes();
        System.arraycopy(U.c(byArray2.length), 0, byArray, 2, 4);
        System.arraycopy(W.c(this.o()), 0, byArray, 6, 2);
        System.arraycopy(W.c(this.k()), 0, byArray, 8, 2);
        System.arraycopy(byArray2, 0, byArray, 10, byArray2.length);
        this.g0.reset();
        this.g0.update(byArray);
        long l8 = this.g0.getValue();
        byArray2 = new byte[n8];
        System.arraycopy(U.c(l8), 0, byArray2, 0, 4);
        System.arraycopy(byArray, 0, byArray2, 4, n9);
        return byArray2;
    }

    @Override
    public byte[] h() {
        return this.f();
    }

    @Override
    public W i() {
        return this.c();
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) throws ZipException {
        this.d(byArray, n8, n9);
    }

    public int k() {
        return this.d0;
    }

    public String l() {
        return this.e0;
    }

    public int m() {
        return this.q;
    }

    protected int n(int n8) {
        int n9 = this.s() ? 40960 : (this.r() ? 16384 : 32768);
        return n8 & 0xFFF | n9;
    }

    public int o() {
        return this.c0;
    }

    public boolean r() {
        return this.f0 && !this.s();
    }

    public boolean s() {
        return this.l().isEmpty() ^ true;
    }

    public void t(boolean bl) {
        this.f0 = bl;
        this.q = this.n(this.q);
    }

    public void v(int n8) {
        this.q = this.n(n8);
    }
}

