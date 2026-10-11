/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.E;
import ax.Wc.W0;
import ax.Wc.c;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.k;
import ax.Wc.p;
import ax.Wc.w;
import ax.Wc.y;
import ax.Wc.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;

class X0
extends D {
    private byte[] d0;

    X0(byte[] byArray) throws IOException {
        if (byArray != null) {
            this.d0 = byArray;
            return;
        }
        throw new NullPointerException("'encoded' cannot be null");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Q() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        if (this.d0 == null) break block5;
                        Object object = new p(this.d0, true);
                        try {
                            h h8 = ((p)object).q();
                            ((InputStream)object).close();
                            this.q = h8.g();
                            this.d0 = null;
                        }
                        catch (IOException iOException) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("malformed ASN.1: ");
                            stringBuilder.append(iOException);
                            object = new z(stringBuilder.toString(), iOException);
                            throw object;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private byte[] R() {
        synchronized (this) {
            return this.d0;
        }
    }

    @Override
    A A() {
        this.Q();
        return super.A();
    }

    @Override
    A B() {
        this.Q();
        return super.B();
    }

    @Override
    public g I(int n8) {
        this.Q();
        return super.I(n8);
    }

    @Override
    public Enumeration J() {
        byte[] byArray = this.R();
        if (byArray != null) {
            return new W0(byArray);
        }
        return super.J();
    }

    @Override
    c K() {
        return ((D)this.B()).K();
    }

    @Override
    k M() {
        return ((D)this.B()).M();
    }

    @Override
    w N() {
        return ((D)this.B()).N();
    }

    @Override
    E O() {
        return ((D)this.B()).O();
    }

    @Override
    public int hashCode() {
        this.Q();
        return super.hashCode();
    }

    @Override
    public Iterator<g> iterator() {
        this.Q();
        return super.iterator();
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        byte[] byArray = this.R();
        if (byArray != null) {
            y8.o(bl, 48, byArray);
            return;
        }
        super.B().s(y8, bl);
    }

    @Override
    public int size() {
        this.Q();
        return super.size();
    }

    @Override
    int w(boolean bl) throws IOException {
        byte[] byArray = this.R();
        if (byArray != null) {
            return y.g(bl, byArray.length);
        }
        return super.B().w(bl);
    }
}

