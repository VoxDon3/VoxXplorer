package ax.k7;

import ax.i7.AbstractC2277a;
import ax.l7.AbstractC2475c;
import ax.l7.AbstractC2476d;
import ax.m7.v;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ax.k7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2411a extends AbstractC2277a {
    private final Object c;
    private final AbstractC2475c d;
    private String e;

    public C2411a(AbstractC2475c abstractC2475c, Object obj) {
        super("application/json; charset=UTF-8");
        this.d = (AbstractC2475c) v.d(abstractC2475c);
        this.c = v.d(obj);
    }

    @Override // ax.m7.y
    public void b(OutputStream outputStream) throws IOException {
        AbstractC2476d a = this.d.a(outputStream, f());
        if (this.e != null) {
            a.F();
            a.g(this.e);
        }
        a.b(this.c);
        if (this.e != null) {
            a.f();
        }
        a.flush();
    }

    public C2411a h(String str) {
        this.e = str;
        return this;
    }
}
