/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.p;
import ax.Wc.z;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

class W0
implements Enumeration {
    private Object c0;
    private p q;

    public W0(byte[] byArray) {
        this.q = new p(byArray, true);
        this.c0 = this.a();
    }

    private Object a() {
        try {
            A a8 = this.q.m();
            return a8;
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("malformed ASN.1: ");
            stringBuilder.append(iOException);
            throw new z(stringBuilder.toString(), iOException);
        }
    }

    @Override
    public boolean hasMoreElements() {
        return this.c0 != null;
    }

    public Object nextElement() {
        Object object = this.c0;
        if (object != null) {
            this.c0 = this.a();
            return object;
        }
        throw new NoSuchElementException();
    }
}

