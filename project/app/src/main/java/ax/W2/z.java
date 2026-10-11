/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.text.TextUtils;
import androidx.fragment.app.e;
import ax.W2.A;
import ax.W2.h;
import ax.W2.j;
import ax.a3.N;
import ax.a3.c;
import ax.a3.l;
import ax.c3.d0;
import ax.d3.s;
import ax.u3.b;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.util.Collections;
import java.util.List;

public class z
extends h {
    private o d;
    private List<n> e;
    private List<String> f;
    private d g;
    private String h;

    public static z n() {
        return new z();
    }

    public static void o(o o8, String string, List<n> list, s s8, h.a a8, c c8) {
        z z8 = z.n();
        d d8 = list.size() == 1 ? ax.W2.z$d.q : ax.W2.z$d.c0;
        z8.k(o8, string, list, d8, a8);
        if (d8 == ax.W2.z$d.q) {
            z.q(s8, z8, c8);
            return;
        }
        z.p(s8, z8, c8);
    }

    private static void p(s s8, z z8, c c8) {
        Object object = z8.m();
        List<n> list = z8.l();
        object = ax.a3.c.t3(((o)object).S(), list);
        ((ax.a3.c)object).E3(new c.h(){
            final List a;
            final c b;
            final z c;
            final s d;
            {
                this.a = list;
                this.b = c8;
                this.c = z8;
                this.d = s8;
            }

            @Override
            public l a(List<String> object) {
                if (this.a.size() != object.size()) {
                    b.f();
                    return l.d0;
                }
                for (int i8 = 0; i8 < this.a.size(); ++i8) {
                    Object object2 = (n)this.a.get(i8);
                    String string = object.get(i8);
                    String string2 = ((n)object2).B();
                    if (!this.b.a((String)(object2 = d0.Q(((n)object2).T(), string))) || d0.F(string2, string)) continue;
                    return l.c0;
                }
                this.c.r((List<String>)object);
                try {
                    this.d.l(this.c, true);
                    object = l.q;
                    return object;
                }
                catch (ax.b3.c c8) {
                    return l.d0;
                }
            }
        });
        s8.A((e)object, "rename", true);
    }

    private static void q(s s8, z z8, c c8) {
        Object object = z8.m();
        n n8 = z8.l().get(0);
        object = N.k3(((o)object).S(), n8);
        ((N)object).m3(new N.d(){
            final n a;
            final c b;
            final z c;
            final s d;
            {
                this.a = n8;
                this.b = c8;
                this.c = z8;
                this.d = s8;
            }

            @Override
            public l a(String object) {
                b.c(TextUtils.isEmpty((CharSequence)object) ^ true);
                String string = this.a.B();
                String string2 = d0.Q(this.a.T(), object);
                if (string.equals(object)) {
                    return l.q;
                }
                if (this.b.a(string2) && !d0.F(string, object)) {
                    return l.c0;
                }
                this.c.r(Collections.singletonList(object));
                try {
                    this.d.l(this.c, false);
                    object = l.q;
                    return object;
                }
                catch (ax.b3.c c8) {
                    return l.d0;
                }
            }
        });
        s8.A((e)object, "rename", true);
    }

    @Override
    protected j b() {
        return new A(this.f(), this.d, this.f, this.h, this.e, this.g);
    }

    public void k(o o8, String string, List<n> list, d d8, h.a a8) {
        this.d = o8;
        this.e = list;
        this.g = d8;
        this.h = string;
        this.i(a8);
        this.j(h.c.c0);
    }

    public List<n> l() {
        return this.e;
    }

    public o m() {
        return this.d;
    }

    public void r(List<String> list) {
        this.f = list;
    }

    public static interface c {
        public boolean a(String var1);
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d c0;
        private static final d[] d0;
        public static final /* enum */ d q;

        static {
            q = new d();
            c0 = new d();
            d0 = ax.W2.z$d.d();
        }

        private static /* synthetic */ d[] d() {
            return new d[]{q, c0};
        }

        public static d valueOf(String string) {
            return Enum.valueOf(d.class, string);
        }

        public static d[] values() {
            return (d[])d0.clone();
        }
    }
}

