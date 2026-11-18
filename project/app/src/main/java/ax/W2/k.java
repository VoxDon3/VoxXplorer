/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.W2.h;
import ax.W2.j;
import ax.W2.l;
import ax.c3.d0;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class k
extends h {
    private o d;
    private a e;
    private List<n> f;
    private String g;
    private String h;

    public static k n() {
        return new k();
    }

    @Override
    protected j b() {
        return new l(this.f(), this.e, this.d, this.f, this.h, this.l());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void k(o o8, List<n> object, h.a object2) {
        block8: {
            ax.b3.j j82;
            block7: {
                block6: {
                    this.i((h.a)object2);
                    this.d = o8;
                    object = new ArrayList<n>((Collection<n>)object);
                    this.f = object;
                    if (object.size() <= 0) break block8;
                    try {
                        object = this.f.get(0);
                        object2 = this.d.z(((n)object).T());
                        if (object2 == null) break block6;
                        this.h = ((n)object2).E();
                    }
                    catch (ax.b3.j j82) {
                        break block7;
                    }
                }
                if (this.f.size() > 1) {
                    if (object2 != null) {
                        this.g = this.h.equals(o8.V()) ? this.m((n)object) : this.m((n)object2);
                    }
                    break block8;
                } else if (this.f.size() == 1) {
                    this.g = this.m((n)object);
                }
                break block8;
            }
            j82.printStackTrace();
        }
        this.j(h.c.c0);
    }

    public String l() {
        return this.g;
    }

    public String m(n n8) {
        if (n8.isDirectory()) {
            return n8.B();
        }
        return d0.g(n8.B());
    }

    public void o(a a8) {
        this.e = a8;
    }

    public void p(String string) {
        this.g = string;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        private static final a[] d0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])d0.clone();
        }
    }
}

