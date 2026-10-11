package ax.Dc;

import java.util.zip.ZipException;

/* renamed from: ax.Dc.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0680o implements N {
    public static final W e0 = new W(41246);
    private boolean c0;
    private int d0;
    private short q;

    public C0680o() {
    }

    public boolean a() {
        return this.c0;
    }

    @Override // ax.Dc.N
    public W b() {
        return e0;
    }

    @Override // ax.Dc.N
    public W c() {
        return new W(this.d0 + 2);
    }

    @Override // ax.Dc.N
    public void d(byte[] bArr, int i, int i2) throws ZipException {
        j(bArr, i, i2);
        this.d0 = i2 - 2;
    }

    public short e() {
        return this.q;
    }

    @Override // ax.Dc.N
    public byte[] f() {
        byte[] bArr = new byte[this.d0 + 2];
        W.i(this.q | (this.c0 ? (short) 32768 : (short) 0), bArr, 0);
        return bArr;
    }

    @Override // ax.Dc.N
    public byte[] h() {
        return W.c(this.q | (this.c0 ? (short) 32768 : (short) 0));
    }

    @Override // ax.Dc.N
    public W i() {
        return new W(2);
    }

    @Override // ax.Dc.N
    public void j(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 >= 2) {
            int h = W.h(bArr, i);
            this.q = (short) (h & 32767);
            this.c0 = (h & 32768) != 0;
        } else {
            throw new ZipException("Too short content for ResourceAlignmentExtraField (0xa11e): " + i2);
        }
    }

    public C0680o(int i, boolean z, int i2) {
        if (i < 0 || i > 32767) {
            throw new IllegalArgumentException("Alignment must be between 0 and 0x7fff, was: " + i);
        }
        if (i2 >= 0) {
            this.q = (short) i;
            this.c0 = z;
            this.d0 = i2;
        } else {
            throw new IllegalArgumentException("Padding must not be negative, was: " + i2);
        }
    }
}
