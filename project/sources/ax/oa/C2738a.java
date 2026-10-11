package ax.oa;

import ax.Y8.c;
import ax.pa.AbstractC2787a;
import java.io.IOException;
import java.util.Set;

/* renamed from: ax.oa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2738a extends AbstractC2787a implements ax.pa.b {
    private d c;
    private Set<e> d;
    private byte a = 5;
    private byte b = 0;
    private byte[] e = {16, 0, 0, 0};
    private short f = 16;
    private short g = 0;
    private int h = 0;

    @Override // ax.pa.b
    public void a(ax.pa.d dVar) throws IOException {
        if (h() == null) {
            throw new IllegalStateException("Invalid PDU type: " + h());
        }
        if (i() == null) {
            throw new IllegalStateException("Invalid PFC flag(s): " + i());
        }
        dVar.b(e());
        dVar.b(f());
        dVar.b((byte) h().getValue());
        dVar.b((byte) c.a.e(i()));
        dVar.a(g());
        dVar.e(d());
        dVar.e(0);
        dVar.c(c());
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.h;
    }

    public int d() {
        return this.f;
    }

    public byte e() {
        return this.a;
    }

    public byte f() {
        return this.b;
    }

    public byte[] g() {
        return this.e;
    }

    public d h() {
        return this.c;
    }

    public Set<e> i() {
        return this.d;
    }

    public void j(short s) {
        this.g = s;
    }

    public void k(int i) {
        this.h = i;
    }

    public void l(short s) {
        this.f = s;
    }

    public void m(byte b) {
        this.a = b;
    }

    public void n(byte b) {
        this.b = b;
    }

    public void o(byte[] bArr) {
        this.e = bArr;
    }

    public void p(d dVar) {
        this.c = dVar;
    }

    public void q(Set<e> set) {
        this.d = set;
    }

    public void r(ax.pa.c cVar) throws IOException {
        m(cVar.c());
        n(cVar.c());
        if (5 != e() || f() != 0) {
            throw new IOException(String.format("Version mismatch: %d.%d != 5.0", Byte.valueOf(e()), Byte.valueOf(f())));
        }
        d dVar = (d) c.a.f(cVar.c(), d.class, null);
        if (dVar == null) {
            throw new IOException(String.format("PDU type invalid: %d", dVar));
        }
        p(dVar);
        q(c.a.d(cVar.c(), e.class));
        byte[] bArr = new byte[4];
        cVar.e(bArr);
        if (bArr[0] != 16) {
            throw new IOException(String.format("Integer and Character representation mismatch: %d", Byte.valueOf(bArr[0])));
        }
        if (bArr[1] != 0) {
            throw new IOException(String.format("Floating-Point representation mismatch: %d", Byte.valueOf(bArr[1])));
        }
        o(bArr);
        l(cVar.g());
        j(cVar.g());
        k(cVar.f());
    }
}
