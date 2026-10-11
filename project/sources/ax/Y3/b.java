package ax.Y3;

import ax.P3.s;
import ax.k4.h;

/* loaded from: classes.dex */
public class b implements s<byte[]> {
    private final byte[] q;

    public b(byte[] bArr) {
        this.q = (byte[]) h.d(bArr);
    }

    @Override // ax.P3.s
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.q;
    }

    @Override // ax.P3.s
    public Class<byte[]> b() {
        return byte[].class;
    }

    @Override // ax.P3.s
    public int getSize() {
        return this.q.length;
    }

    @Override // ax.P3.s
    public void recycle() {
    }
}
