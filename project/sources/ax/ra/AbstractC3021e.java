package ax.ra;

import ax.c.C1750a;
import ax.pa.AbstractC2787a;
import ax.qa.EnumC2891a;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: ax.ra.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3021e extends AbstractC2787a implements ax.pa.b {
    private int a;

    public int b() {
        return this.a;
    }

    public void c(ax.pa.c cVar) throws IOException {
        d(cVar);
        cVar.a(EnumC2891a.FOUR);
        this.a = cVar.f();
        try {
            cVar.c();
            throw new C1750a("At least one byte remained after reading the return code. Is this response aligned properly?");
        } catch (EOFException unused) {
        }
    }

    public abstract void d(ax.pa.c cVar) throws IOException;
}
