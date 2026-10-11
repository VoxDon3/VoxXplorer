/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.W2.e;
import ax.W2.f;
import ax.W2.g;
import ax.W2.h;
import ax.W2.j;
import ax.c3.A;
import ax.c3.B;
import ax.c3.d0;
import ax.c3.z;
import ax.u3.b;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.util.Iterator;
import java.util.List;

public class c
extends h {
    private static c m;
    private List<n> d;
    private n e;
    private o f;
    private List<g> g;
    private a h;
    private boolean i;
    private n j;
    private o k;
    private boolean l;

    public static c q() {
        if (m == null) {
            m = new c();
        }
        return m;
    }

    @Override
    protected j b() {
        j j8 = this.h == a.d0 ? new f(this.f(), this.g, this.k, this.j) : new e(this.f(), this.d, this.f, this.e, this.k, this.j, this.t());
        this.l = true;
        this.l();
        return j8;
    }

    @Override
    protected boolean c() {
        return true;
    }

    public boolean k(n n8) {
        return this.e == null || n8 == null || !this.t() || !B.O(this.e, n8) || !d0.G(this.e.E(), n8.E());
    }

    public void l() {
        Object object = this.g;
        if (object != null && !this.l) {
            object = object.iterator();
            while (object.hasNext()) {
                ((g)object.next()).f();
            }
        }
        this.l = false;
        this.g = null;
        this.d = null;
        this.e = null;
        this.j = null;
        this.i = false;
        object = this.f;
        if (object != null) {
            ((o)object).k0(false);
            this.f = null;
        }
        if ((object = this.k) != null) {
            ((o)object).k0(false);
            this.k = null;
        }
    }

    public void m(o o8, n n8, List<n> list, boolean bl) {
        this.l();
        this.f = o8;
        o8.n0();
        this.e = n8;
        this.d = list;
        this.h = bl ? a.c0 : a.q;
        this.l = false;
    }

    public void n(List<g> list) {
        this.l();
        this.g = list;
        this.h = a.d0;
        this.l = false;
    }

    public void o(o o8, n n8, h.a a8) {
        b.c(n8.isDirectory());
        this.k = o8;
        o8.n0();
        this.j = n8;
        this.i(a8);
        this.i = true;
        this.j(h.c.c0);
    }

    public List<n> p() {
        return this.d;
    }

    public boolean r(z z8) {
        if (this.u()) {
            List<g> list = this.g;
            if (list == null) {
                return false;
            }
            list = list.iterator();
            while (list.hasNext()) {
                if (A.y(d0.j(((g)list.next()).h()), z8)) continue;
                return false;
            }
            return true;
        }
        Object object = this.d;
        if (object == null) {
            return false;
        }
        Iterator<n> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!object.isDirectory() && A.y(((n)object).A(), z8)) continue;
            return false;
        }
        return true;
    }

    public boolean s() {
        if (this.g != null) {
            return true;
        }
        List<n> list = this.d;
        return list != null && list.size() > 0;
    }

    public boolean t() {
        return this.h == a.c0;
    }

    public boolean u() {
        return this.h == a.d0;
    }

    public boolean v() {
        return this.s() && !this.i;
        {
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

