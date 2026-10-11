package ax.Wc;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
class W0 implements Enumeration {
    private Object c0 = a();
    private C1119p q;

    public W0(byte[] bArr) {
        this.q = new C1119p(bArr, true);
    }

    private Object a() {
        try {
            return this.q.m();
        } catch (IOException e) {
            throw new C1138z("malformed ASN.1: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.c0 != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.c0;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.c0 = a();
        return obj;
    }
}
