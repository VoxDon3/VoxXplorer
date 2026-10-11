package ax.S8;

import ax.Z8.a;
import ax.h9.C2171b;

/* loaded from: classes3.dex */
public class e extends c {
    private String b;

    e() {
        super(d.SMB2_NETNAME_NEGOTIATE_CONTEXT_ID);
    }

    @Override // ax.S8.c
    protected void d(C2171b c2171b, int i) throws a.b {
        this.b = c2171b.C(ax.Y8.b.d);
    }

    @Override // ax.S8.c
    protected int g(C2171b c2171b) {
        c2171b.m(this.b, ax.Y8.b.d);
        return (this.b.length() * 2) + 2;
    }
}
