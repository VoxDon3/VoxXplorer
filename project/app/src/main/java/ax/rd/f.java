/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.h;
import ax.Wc.t;
import ax.Wc.v;
import ax.Wc.x0;
import ax.rd.e;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class f
extends t {
    private Vector c0;
    private Hashtable q = new Hashtable();

    private f(D t8) {
        this.c0 = new Vector();
        Object object = ((D)t8).J();
        while (object.hasMoreElements()) {
            t8 = e.t(object.nextElement());
            if (!this.q.containsKey(((e)t8).r())) {
                this.q.put(((e)t8).r(), t8);
                this.c0.addElement(((e)t8).r());
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("repeated extension found: ");
            ((StringBuilder)object).append(((e)t8).r());
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
    }

    public f(e[] eArray) {
        this.c0 = new Vector();
        for (int i8 = 0; i8 != eArray.length; ++i8) {
            e e8 = eArray[i8];
            this.c0.addElement(e8.r());
            this.q.put(e8.r(), e8);
        }
    }

    public static f s(Object object) {
        if (object instanceof f) {
            return (f)object;
        }
        if (object != null) {
            return new f(D.G(object));
        }
        return null;
    }

    @Override
    public A g() {
        h h8 = new h(this.c0.size());
        Enumeration enumeration = this.c0.elements();
        while (enumeration.hasMoreElements()) {
            v v8 = (v)enumeration.nextElement();
            h8.a((e)this.q.get(v8));
        }
        return new x0(h8);
    }

    public e r(v v8) {
        return (e)this.q.get(v8);
    }
}

