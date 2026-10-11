/*
 * Decompiled with CFR 0.152.
 */
package ax.td;

import ax.rd.c;
import ax.rd.f;
import java.io.IOException;
import java.io.Serializable;

public class b
implements Serializable {
    private transient f c0;
    private transient c q;

    public b(c c8) {
        this.a(c8);
    }

    private void a(c c8) {
        this.q = c8;
        this.c0 = c8.s().r();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return this.q.equals(((b)object).q);
    }

    public byte[] getEncoded() throws IOException {
        return this.q.p();
    }

    public int hashCode() {
        return this.q.hashCode();
    }
}

