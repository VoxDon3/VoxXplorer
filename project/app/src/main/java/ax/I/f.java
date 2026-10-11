/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.I.d;
import ax.I.g;
import ax.I.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f
implements d {
    public d a = null;
    public boolean b = false;
    public boolean c = false;
    p d;
    a e = ax.I.f$a.q;
    int f;
    public int g;
    int h = 1;
    g i = null;
    public boolean j = false;
    List<d> k = new ArrayList<d>();
    List<f> l = new ArrayList<f>();

    public f(p p8) {
        this.d = p8;
    }

    @Override
    public void a(d object) {
        block8: {
            block9: {
                block10: {
                    f f8;
                    object = this.l.iterator();
                    while (object.hasNext()) {
                        if (((f)object.next()).j) continue;
                        break block8;
                    }
                    this.c = true;
                    object = this.a;
                    if (object != null) {
                        object.a(this);
                    }
                    if (this.b) {
                        this.d.a(this);
                        return;
                    }
                    Iterator<f> iterator = this.l.iterator();
                    object = null;
                    int n8 = 0;
                    while (iterator.hasNext()) {
                        f8 = iterator.next();
                        if (f8 instanceof g) continue;
                        ++n8;
                        object = f8;
                    }
                    if (object == null || n8 != true || !((f)object).j) break block9;
                    f8 = this.i;
                    if (f8 == null) break block10;
                    if (!f8.j) break block8;
                    this.f = this.h * f8.g;
                }
                this.d(((f)object).g + this.f);
            }
            if ((object = this.a) != null) {
                object.a(this);
            }
        }
    }

    public void b(d d8) {
        this.k.add(d8);
        if (this.j) {
            d8.a(d8);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int n8) {
        if (!this.j) {
            this.j = true;
            this.g = n8;
            for (d d8 : this.k) {
                d8.a(d8);
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d.b.t());
        stringBuilder.append(":");
        stringBuilder.append((Object)this.e);
        stringBuilder.append("(");
        Object object = this.j ? Integer.valueOf(this.g) : "unresolved";
        stringBuilder.append(object);
        stringBuilder.append(") <t=");
        stringBuilder.append(this.l.size());
        stringBuilder.append(":d=");
        stringBuilder.append(this.k.size());
        stringBuilder.append(">");
        return stringBuilder.toString();
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        public static final /* enum */ a g0;
        public static final /* enum */ a h0;
        public static final /* enum */ a i0;
        private static final a[] j0;
        public static final /* enum */ a q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            a a13;
            a a14;
            a a15;
            q = a15 = new a();
            c0 = a14 = new a();
            d0 = a13 = new a();
            e0 = a12 = new a();
            f0 = a11 = new a();
            g0 = a10 = new a();
            h0 = a9 = new a();
            i0 = a8 = new a();
            j0 = new a[]{a15, a14, a13, a12, a11, a10, a9, a8};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])j0.clone();
        }
    }
}

