/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.N;
import ax.Dc.U;
import ax.Dc.W;
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

public abstract class a
implements N {
    private byte[] c0;
    private byte[] d0;
    private long q;

    protected a() {
    }

    protected a(String string, byte[] byArray, int n8, int n9) {
        CRC32 cRC32 = new CRC32();
        cRC32.update(byArray, n8, n9);
        this.q = cRC32.getValue();
        this.c0 = string.getBytes(StandardCharsets.UTF_8);
    }

    private void a() {
        byte[] byArray = this.c0;
        if (byArray == null) {
            return;
        }
        byArray = new byte[byArray.length + 5];
        this.d0 = byArray;
        byArray[0] = 1;
        System.arraycopy(U.c(this.q), 0, this.d0, 1, 4);
        byArray = this.c0;
        System.arraycopy(byArray, 0, this.d0, 5, byArray.length);
    }

    @Override
    public W c() {
        return this.i();
    }

    @Override
    public void d(byte[] object, int n8, int n9) throws ZipException {
        if (n9 >= 5) {
            byte by = object[n8];
            if (by == 1) {
                this.q = U.i((byte[])object, n8 + 1);
                byte[] byArray = new byte[n9 -= 5];
                this.c0 = byArray;
                System.arraycopy(object, n8 + 5, byArray, 0, n9);
                this.d0 = null;
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unsupported version [");
            ((StringBuilder)object).append(by);
            ((StringBuilder)object).append("] for UniCode path extra data.");
            throw new ZipException(((StringBuilder)object).toString());
        }
        throw new ZipException("UniCode path extra data must have at least 5 bytes.");
    }

    public long e() {
        return this.q;
    }

    @Override
    public byte[] f() {
        return this.h();
    }

    public byte[] g() {
        byte[] byArray = this.c0;
        if (byArray != null) {
            int n8 = byArray.length;
            byte[] byArray2 = new byte[n8];
            System.arraycopy(byArray, 0, byArray2, 0, n8);
            return byArray2;
        }
        return null;
    }

    @Override
    public byte[] h() {
        byte[] byArray;
        if (this.d0 == null) {
            this.a();
        }
        if ((byArray = this.d0) != null) {
            int n8 = byArray.length;
            byte[] byArray2 = new byte[n8];
            System.arraycopy(byArray, 0, byArray2, 0, n8);
            return byArray2;
        }
        return null;
    }

    @Override
    public W i() {
        byte[] byArray;
        if (this.d0 == null) {
            this.a();
        }
        int n8 = (byArray = this.d0) != null ? byArray.length : 0;
        return new W(n8);
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) throws ZipException {
        this.d(byArray, n8, n9);
    }
}

