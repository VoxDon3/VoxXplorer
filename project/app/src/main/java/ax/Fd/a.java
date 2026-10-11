/*
 * Decompiled with CFR 0.152.
 */
package ax.Fd;

import ax.Wc.h;
import ax.Wc.t;
import ax.Wc.x0;
import ax.md.b;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.List;

public class a
implements PrivateKey {
    private final List<PrivateKey> q;

    public List<PrivateKey> a() {
        return this.q;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof a) {
            return this.q.equals(((a)object).q);
        }
        return false;
    }

    @Override
    public String getAlgorithm() {
        return "Composite";
    }

    @Override
    public byte[] getEncoded() {
        h h8 = new h();
        for (int i8 = 0; i8 != this.q.size(); ++i8) {
            h8.a(b.r(this.q.get(i8).getEncoded()));
        }
        try {
            ax.rd.a a8 = new ax.rd.a(ax.id.a.N);
            x0 x02 = new x0(h8);
            Object object = new b(a8, x02);
            object = ((t)object).q("DER");
            return object;
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unable to encode composite key: ");
            stringBuilder.append(iOException.getMessage());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    @Override
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.q.hashCode();
    }
}

