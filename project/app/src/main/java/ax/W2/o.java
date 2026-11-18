/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;
import androidx.fragment.app.e;
import ax.Q2.f;
import ax.W2.h;
import ax.W2.i;
import ax.W2.j;
import ax.W2.p;
import ax.W2.q;
import ax.a3.r;
import ax.b3.c;
import ax.c3.x;
import ax.d3.s;
import ax.u3.b;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.file.K;
import com.voxdon.xplorer.file.f;
import com.voxdon.xplorer.file.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class o
extends h {
    private com.voxdon.xplorer.file.o d;
    private List<n> e;
    private List<n> f;
    private int g;
    private long h;
    private boolean i;
    private Map<String, f.a> j;
    private boolean k;

    public static void l(s s8, com.voxdon.xplorer.file.o object, List<n> list, int n8, boolean bl, boolean bl2, int n9, int n10, h.a a8, DialogInterface.OnCancelListener onCancelListener) {
        o o8 = o.v();
        boolean bl3 = n8 == 4;
        o8.o((com.voxdon.xplorer.file.o)object, list, bl3, a8);
        bl3 = n8 == 2;
        boolean bl4 = n8 == 2 || n8 == 3;
        o8.y(bl3);
        if (bl2) {
            try {
                s8.l(o8, bl);
                return;
            }
            catch (c c8) {
                Toast.makeText((Context)s8.b(), (int)2131951927, (int)1).show();
            }
        } else {
            ax.W2.i.d(o8);
            object = r.A3(o8, ((com.voxdon.xplorer.file.o)object).T(), n9, n10, bl3, bl4);
            ((r)object).G3(onCancelListener);
            ((r)object).F3(new r.f(){
                final s a;
                final o b;
                final boolean c;
                {
                    this.a = s8;
                    this.b = o8;
                    this.c = bl;
                }

                @Override
                public void a(boolean bl) {
                    if (bl) {
                        try {
                            this.a.l(this.b, this.c);
                            return;
                        }
                        catch (c c8) {
                            Toast.makeText((Context)this.a.b(), (int)2131951927, (int)1).show();
                        }
                    }
                }
            });
            if (!s8.A((e)object, "delete", true)) {
                ax.W2.i.c(o8.e());
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void m(com.voxdon.xplorer.file.o o8, List<n> list, int n8, boolean bl, s s8, boolean bl2, h.a a8, DialogInterface.OnCancelListener onCancelListener) {
        block3: {
            block2: {
                block0: {
                    block1: {
                        if (n8 == 1) break block0;
                        if (n8 != 2) break block1;
                        b.c(bl);
                        break block2;
                    }
                    if (!bl) break block0;
                    if (ax.t3.j.G(o8.t()) && !o.t(o8) && !o.r(list)) break block2;
                    n8 = 3;
                    break block3;
                }
                n8 = 1;
                break block3;
            }
            n8 = 2;
        }
        bl = n8 == 2 && !ax.t3.j.A(o8.t());
        o.l(s8, o8, list, n8, bl2, bl, 0, 0, a8, onCancelListener);
    }

    public static void n(s s8, ax.c3.K object, h.a a8) {
        o o8 = o.v();
        ax.W2.i.d(o8);
        o8.i(a8);
        o8.x(true);
        object = r.z3(o8, (ax.c3.K)object);
        ((r)object).F3(new r.f(){
            final s a;
            final o b;
            {
                this.a = s8;
                this.b = o8;
            }

            @Override
            public void a(boolean bl) {
                if (bl) {
                    try {
                        this.a.l(this.b, true);
                        return;
                    }
                    catch (c c8) {
                        Toast.makeText((Context)this.a.b(), (int)2131951927, (int)1).show();
                    }
                }
            }
        });
        if (!s8.A((e)object, "delete", true)) {
            ax.W2.i.c(o8.e());
        }
    }

    private static boolean r(List<n> object) {
        if (object == null) {
            return false;
        }
        object = object.iterator();
        while (object.hasNext()) {
            if (!J.i2((n)object.next())) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean t(com.voxdon.xplorer.file.o o8) {
        if (!ax.Q2.f.j0(o8.S())) return false;
        com.voxdon.xplorer.file.o o9 = o8;
        try {
            long l8;
            if (o8.S() == ax.Q2.f.q0) {
                o9 = x.g(ax.c3.K.i.e());
            }
            if ((l8 = o9.v()) <= 0L) return false;
            if (l8 >= 0x500000L) return false;
            return true;
        }
        catch (ax.b3.j j8) {
            return false;
        }
    }

    public static o v() {
        return new o();
    }

    public void A(long l8) {
        this.h = l8;
    }

    @Override
    protected j b() {
        if (this.i) {
            return new q(this.f(), this.d, this.e, this.g, this.h, this.j);
        }
        return new p(this.f(), this.d, this.e, this.f, this.g, this.h, this.u(), this.k, this.j);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void k() {
        ArrayList<n> arrayList = new ArrayList<n>();
        ArrayList<n> arrayList2 = new ArrayList<n>();
        Iterator<n> iterator = this.e.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.e = arrayList;
                this.f = arrayList2;
                return;
            }
            n n8 = iterator.next();
            try {
                n n9 = (K)n8;
                if (!(n8 = this.d.z(((K)n9).z1())).n()) continue;
                if ((n9 = this.d.z(((K)n9).B1())).n() && n9.E().contains(".$recycle_bin$")) {
                    arrayList.add(n9);
                    arrayList2.add(n8);
                }
            }
            catch (ax.b3.j j8) {}
            continue;
            this.d.P(n8);
        }
    }

    public void o(com.voxdon.xplorer.file.o o8, List<n> list, boolean bl, h.a a8) {
        this.i(a8);
        this.d = o8;
        this.i = false;
        this.g = 0;
        this.h = 0L;
        this.e = list;
        this.f = new ArrayList<n>();
        this.j = null;
        this.k = bl;
        this.j(h.c.c0);
    }

    public boolean p() {
        return this.i;
    }

    public List<n> q() {
        return this.e;
    }

    public boolean s() {
        return this.k;
    }

    public boolean u() {
        com.voxdon.xplorer.file.o o8 = this.d;
        if (o8 == null) {
            return false;
        }
        return o8.S() == ax.Q2.f.o1;
    }

    public void w(Map<String, f.a> map) {
        this.j = map;
    }

    public void x(boolean bl) {
        this.k = bl;
    }

    public void y(boolean bl) {
        this.i = bl;
    }

    public void z(int n8) {
        this.g = n8;
    }
}

