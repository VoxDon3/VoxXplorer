/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Wc.D;
import ax.Wc.h;
import ax.Wc.t;
import ax.Wc.t0;
import ax.Wc.v;
import ax.Wc.w;
import ax.Wc.x0;
import ax.Wc.z;
import ax.rd.e;
import ax.rd.f;
import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

public class g {
    private static final Set c;
    private Hashtable a = new Hashtable();
    private Vector b = new Vector();

    static {
        HashSet<v> hashSet = new HashSet<v>();
        hashSet.add(e.i0);
        hashSet.add(e.j0);
        hashSet.add(e.e0);
        hashSet.add(e.r0);
        c = java.util.DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a(v v8, boolean bl, ax.Wc.g g8) throws IOException {
        this.b(v8, bl, g8.g().q("DER"));
    }

    public void b(v v8, boolean bl, byte[] object) {
        if (this.a.containsKey(v8)) {
            if (c.contains(v8)) {
                Object object2 = D.G(w.E(((e)this.a.get(v8)).s()).G());
                Object object3 = D.G(object);
                object = new h(((D)object2).size() + ((D)object3).size());
                object2 = ((D)object2).J();
                while (object2.hasMoreElements()) {
                    ((h)object).a((ax.Wc.g)object2.nextElement());
                }
                object3 = ((D)object3).J();
                while (object3.hasMoreElements()) {
                    ((h)object).a((ax.Wc.g)object3.nextElement());
                }
                try {
                    object2 = this.a;
                    object3 = new x0((h)object);
                    e e8 = new e(v8, bl, ((t)object3).p());
                    ((Hashtable)object2).put(v8, e8);
                    return;
                }
                catch (IOException iOException) {
                    throw new z(iOException.getMessage(), iOException);
                }
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("extension ");
            ((StringBuilder)object).append(v8);
            ((StringBuilder)object).append(" already added");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        this.b.addElement(v8);
        this.a.put(v8, new e(v8, bl, new t0((byte[])object)));
    }

    public f c() {
        e[] eArray = new e[this.b.size()];
        for (int i8 = 0; i8 != this.b.size(); ++i8) {
            eArray[i8] = (e)this.a.get(this.b.elementAt(i8));
        }
        return new f(eArray);
    }

    public boolean d() {
        return this.b.isEmpty();
    }
}

