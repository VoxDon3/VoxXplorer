package ax.Dc;

import java.util.zip.ZipException;

/* renamed from: ax.Dc.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0677l implements N {
    private static final W q = new W(51966);
    private static final W c0 = new W(0);
    private static final C0677l d0 = new C0677l();

    @Override // ax.Dc.N
    public W b() {
        return q;
    }

    @Override // ax.Dc.N
    public W c() {
        return c0;
    }

    @Override // ax.Dc.N
    public void d(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }

    @Override // ax.Dc.N
    public byte[] f() {
        return ax.Kc.f.a;
    }

    @Override // ax.Dc.N
    public byte[] h() {
        return ax.Kc.f.a;
    }

    @Override // ax.Dc.N
    public W i() {
        return c0;
    }

    @Override // ax.Dc.N
    public void j(byte[] bArr, int i, int i2) throws ZipException {
        d(bArr, i, i2);
    }
}
