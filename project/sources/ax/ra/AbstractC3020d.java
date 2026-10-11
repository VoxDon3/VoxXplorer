package ax.ra;

import ax.pa.AbstractC2787a;
import ax.ra.AbstractC3021e;
import java.io.IOException;

/* renamed from: ax.ra.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3020d<T extends AbstractC3021e> extends AbstractC2787a implements ax.pa.b {
    private final short a;

    public AbstractC3020d(short s) {
        this.a = s;
    }

    public short b() {
        return this.a;
    }

    public abstract T c();

    public byte[] d() throws IOException {
        ax.Oc.b bVar = new ax.Oc.b();
        a(new ax.pa.d(bVar));
        return bVar.b();
    }
}
