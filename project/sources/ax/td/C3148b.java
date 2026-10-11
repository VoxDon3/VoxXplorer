package ax.td;

import ax.rd.C3033c;
import ax.rd.f;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: ax.td.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3148b implements Serializable {
    private transient f c0;
    private transient C3033c q;

    public C3148b(C3033c c3033c) {
        a(c3033c);
    }

    private void a(C3033c c3033c) {
        this.q = c3033c;
        this.c0 = c3033c.s().r();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3148b) {
            return this.q.equals(((C3148b) obj).q);
        }
        return false;
    }

    public byte[] getEncoded() throws IOException {
        return this.q.p();
    }

    public int hashCode() {
        return this.q.hashCode();
    }
}
