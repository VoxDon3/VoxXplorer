package ax.h9;

import ax.Z8.a;
import ax.h9.InterfaceC2172c;

/* renamed from: ax.h9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2174e<H extends InterfaceC2172c> implements ax.X8.b<C2171b> {
    private H a;
    protected C2171b b;

    public AbstractC2174e(H h, byte[] bArr) throws a.b {
        this(h, new C2171b(bArr));
    }

    public C2171b a() {
        return this.b;
    }

    public H b() {
        return this.a;
    }

    protected void c() throws a.b {
        this.a.b(this.b);
    }

    protected AbstractC2174e(H h, C2171b c2171b) throws a.b {
        this.a = h;
        this.b = c2171b;
        c();
    }

    protected AbstractC2174e(H h) {
        this.a = h;
    }
}
