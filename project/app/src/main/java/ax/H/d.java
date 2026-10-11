/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.E.c;
import ax.E.i;
import ax.H.e;
import ax.H.h;
import ax.I.i;
import ax.I.o;
import java.util.ArrayList;
import java.util.HashSet;

public class d {
    private HashSet<d> a = null;
    private int b;
    private boolean c;
    public final e d;
    public final b e;
    public d f;
    public int g = 0;
    int h = Integer.MIN_VALUE;
    ax.E.i i;

    public d(e e8, b b8) {
        this.d = e8;
        this.e = b8;
    }

    public boolean a(d d8, int n8) {
        return this.b(d8, n8, Integer.MIN_VALUE, false);
    }

    public boolean b(d object, int n8, int n9, boolean bl) {
        if (object == null) {
            this.q();
            return true;
        }
        if (!bl && !this.p((d)object)) {
            return false;
        }
        this.f = object;
        if (((d)object).a == null) {
            ((d)object).a = new HashSet();
        }
        if ((object = this.f.a) != null) {
            ((HashSet)object).add(this);
        }
        this.g = n8;
        this.h = n9;
        return true;
    }

    public void c(int n8, ArrayList<o> arrayList, o o8) {
        HashSet<d> hashSet = this.a;
        if (hashSet != null) {
            hashSet = hashSet.iterator();
            while (hashSet.hasNext()) {
                ax.I.i.a(((d)hashSet.next()).d, n8, arrayList, o8);
            }
        }
    }

    public HashSet<d> d() {
        return this.a;
    }

    public int e() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public int f() {
        d d8;
        if (this.d.V() == 8) {
            return 0;
        }
        if (this.h != Integer.MIN_VALUE && (d8 = this.f) != null && d8.d.V() == 8) {
            return this.h;
        }
        return this.g;
    }

    public final d g() {
        switch (ax.H.d$a.a[this.e.ordinal()]) {
            default: {
                throw new AssertionError((Object)this.e.name());
            }
            case 5: {
                return this.d.P;
            }
            case 4: {
                return this.d.R;
            }
            case 3: {
                return this.d.O;
            }
            case 2: {
                return this.d.Q;
            }
            case 1: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
        }
        return null;
    }

    public e h() {
        return this.d;
    }

    public ax.E.i i() {
        return this.i;
    }

    public d j() {
        return this.f;
    }

    public b k() {
        return this.e;
    }

    public boolean l() {
        HashSet<d> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        hashSet = hashSet.iterator();
        while (hashSet.hasNext()) {
            if (!((d)hashSet.next()).g().o()) continue;
            return true;
        }
        return false;
    }

    public boolean m() {
        HashSet<d> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        return hashSet.size() > 0;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.f != null;
    }

    public boolean p(d d8) {
        b b8;
        if (d8 == null) {
            return false;
        }
        b b9 = d8.k();
        if (b9 == (b8 = this.e)) {
            return b8 != ax.H.d$b.g0 || d8.h().Z() && this.h().Z();
        }
        switch (ax.H.d$a.a[b8.ordinal()]) {
            default: {
                throw new AssertionError((Object)this.e.name());
            }
            case 7: 
            case 8: 
            case 9: {
                return false;
            }
            case 6: {
                return b9 != ax.H.d$b.c0 && b9 != ax.H.d$b.e0;
                {
                }
            }
            case 4: 
            case 5: {
                boolean bl = b9 == ax.H.d$b.d0 || b9 == ax.H.d$b.f0;
                if (d8.h() instanceof h) {
                    return bl || b9 == ax.H.d$b.j0;
                    {
                    }
                }
                return bl;
            }
            case 2: 
            case 3: {
                boolean bl = b9 == ax.H.d$b.c0 || b9 == ax.H.d$b.e0;
                if (d8.h() instanceof h) {
                    return bl || b9 == ax.H.d$b.i0;
                    {
                    }
                }
                return bl;
            }
            case 1: 
        }
        return b9 != ax.H.d$b.g0 && b9 != ax.H.d$b.i0 && b9 != ax.H.d$b.j0;
    }

    public void q() {
        Object object = this.f;
        if (object != null && (object = ((d)object).a) != null) {
            ((HashSet)object).remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public void r() {
        this.c = false;
        this.b = 0;
    }

    public void s(c object) {
        object = this.i;
        if (object == null) {
            this.i = new ax.E.i(i.a.q, null);
            return;
        }
        ((ax.E.i)object).n();
    }

    public void t(int n8) {
        this.b = n8;
        this.c = true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d.t());
        stringBuilder.append(":");
        stringBuilder.append(((Object)((Object)this.e)).toString());
        return stringBuilder.toString();
    }

    public void u(int n8) {
        if (this.o()) {
            this.h = n8;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        public static final /* enum */ b g0;
        public static final /* enum */ b h0;
        public static final /* enum */ b i0;
        public static final /* enum */ b j0;
        private static final b[] k0;
        public static final /* enum */ b q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            b b14;
            b b15;
            b b16;
            q = b16 = new b();
            c0 = b15 = new b();
            d0 = b14 = new b();
            e0 = b13 = new b();
            f0 = b12 = new b();
            g0 = b11 = new b();
            h0 = b10 = new b();
            i0 = b9 = new b();
            j0 = b8 = new b();
            k0 = new b[]{b16, b15, b14, b13, b12, b11, b10, b9, b8};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])k0.clone();
        }
    }
}

