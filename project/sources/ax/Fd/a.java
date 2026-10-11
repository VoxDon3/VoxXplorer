package ax.Fd;

import ax.Wc.C1103h;
import ax.Wc.C1135x0;
import ax.id.InterfaceC2298a;
import ax.md.C2555b;
import ax.rd.C3031a;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.List;

/* loaded from: classes3.dex */
public class a implements PrivateKey {
    private final List<PrivateKey> q;

    public List<PrivateKey> a() {
        return this.q;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return this.q.equals(((a) obj).q);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "Composite";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C1103h c1103h = new C1103h();
        for (int i = 0; i != this.q.size(); i++) {
            c1103h.a(C2555b.r(this.q.get(i).getEncoded()));
        }
        try {
            return new C2555b(new C3031a(InterfaceC2298a.N), new C1135x0(c1103h)).q("DER");
        } catch (IOException e) {
            throw new IllegalStateException("unable to encode composite key: " + e.getMessage());
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.q.hashCode();
    }
}
