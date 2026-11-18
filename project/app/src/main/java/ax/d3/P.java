/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import ax.Q2.a;
import ax.Q2.f;
import ax.Q2.g;
import ax.W2.h;
import ax.W2.m;
import ax.a3.l;
import ax.a3.p;
import ax.b3.c;
import ax.b3.j;
import ax.c3.A;
import ax.c3.d0;
import ax.c3.x;
import ax.d3.E;
import ax.u3.b;
import ax.u3.q;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

public class P
extends E {
    private static final Logger t2 = g.a(E.class);
    private f s2;

    private boolean va(n n8) {
        block2: {
            n n9 = this.wa();
            List<n> list = ax.Z2.b.k().g(n9);
            if (list != null) {
                Iterator<n> iterator = list.iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().E().equals(n8.E())) continue;
                    break block2;
                }
                list = new ArrayList<n>(list);
                list.add(n8);
                ax.Z2.b.k().m(n9, list);
                return true;
            }
        }
        return false;
    }

    private n wa() {
        if (this.v7() != null && d0.E(this.v7())) {
            return this.v7();
        }
        try {
            n n8 = this.w7().z(this.A3().e());
            return n8;
        }
        catch (j j8) {
            ax.Ha.c.h().d("GET LIBRARY ROOT FAILED").h();
            return null;
        }
    }

    @Override
    protected String B7() {
        return this.A3().f(this.b());
    }

    @Override
    public void F1(Menu menu) {
        super.F1(menu);
        menu = menu.findItem(2131362519);
        if (menu != null) {
            if (this.v7() != null && d0.E(this.v7())) {
                menu.setVisible(true);
                return;
            }
            menu.setVisible(false);
        }
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.G9(true);
    }

    @Override
    public boolean N3() {
        if (!super.N3()) {
            return false;
        }
        if (this.C3() != null && this.C3().equals(this.A3().e())) {
            return false;
        }
        return ax.W2.c.q().r(A.h(this.z3()));
    }

    @Override
    protected void P9(m m8, boolean bl) {
        Object object = a.i();
        String string = bl ? "new_folder" : "new_file";
        ((a)object).m("menu_folder", string).c("loc", this.z3().I()).e();
        object = new p();
        string = new Bundle();
        string.putBoolean("isDirectory", bl);
        ((Fragment)object).v2((Bundle)string);
        ((p)object).n3(new p.d(){
            final m a;
            final boolean b;
            final P c;
            {
                this.c = p8;
                this.a = m8;
                this.b = bl;
            }

            @Override
            public l a(String object) {
                b.c(TextUtils.isEmpty((CharSequence)object) ^ true);
                Object object2 = d0.Q(this.a.m(), object);
                if (this.c.C3() != null && this.c.c1.X((String)object2)) {
                    return l.c0;
                }
                try {
                    object2 = this.c.w7().z((String)object2);
                }
                catch (j j8) {
                    object2 = null;
                }
                if (object2 != null && object2.n() && this.b) {
                    ((u)this.c.w7().u()).U1((n)object2);
                    this.c.va((n)object2);
                    this.c.j9();
                    return l.q;
                }
                this.a.o((String)object);
                try {
                    this.c.l(this.a, false);
                    object = l.q;
                    return object;
                }
                catch (c c8) {
                    return l.d0;
                }
            }
        });
        this.A((androidx.fragment.app.e)object, "createFileName", true);
    }

    @Override
    protected void a7(boolean bl) {
        if (!bl) {
            ax.Ha.b b8 = ax.Ha.c.h().f().d("CREATE NEW FILE IN LIBRARY");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location:");
            stringBuilder.append(this.z3().I());
            b8.g(stringBuilder.toString()).h();
            return;
        }
        AtomicReference atomicReference = new AtomicReference();
        String string = u.c2(this.z3());
        m m8 = m.n();
        m8.k(this.w7(), string, bl, new h.a(){
            final AtomicReference a;
            final m b;
            final String c;
            final P d;
            {
                this.d = p8;
                this.a = atomicReference;
                this.b = m8;
                this.c = string;
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                object = d0.Q(this.c, (String)this.a.get());
                try {
                    object = this.d.w7().z((String)object);
                }
                catch (j j8) {
                    object = null;
                }
                if (object != null && object.n()) {
                    boolean bl = this.d.va((n)object);
                    this.d.j9();
                    if (bl) {
                        return;
                    }
                }
                this.d.y4(b8, string, string2, arrayList);
            }

            @Override
            public void b() {
                this.a.set(this.b.l());
            }
        });
        this.P9(m8, bl);
    }

    @Override
    protected void c7(List<n> list, int n8) {
        Iterator<n> iterator = list.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            if (!iterator.next().isDirectory()) continue;
            bl = true;
        }
        if (!bl) {
            super.c7(list, n8);
            return;
        }
        if (this.O6(list)) {
            this.aa();
            return;
        }
        new e(this, list, new d(){
            final int a;
            final P b;
            {
                this.b = p8;
                this.a = n8;
            }

            @Override
            public void a(List<n> list) {
                P.super.c7(list, this.a);
            }
        }).i(new Void[0]);
    }

    @Override
    protected void h8(h.b b8) {
        if (b8 != h.b.c0) {
            this.c4(false);
            return;
        }
        this.j9();
    }

    @Override
    protected void i8(boolean bl) {
        super.i8(bl);
        if (this.v3() != null && bl && this.z3() == f.A0) {
            ax.h3.c.d(this, 0L);
        }
    }

    @Override
    protected void j8(boolean bl) {
        super.j8(bl);
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689497);
        this.O7(menu);
        this.ia(menu);
    }

    @Override
    public f z3() {
        if (this.s2 == null) {
            this.s2 = (f)((Object)this.j0().getSerializable("location"));
        }
        return this.s2;
    }

    static interface d {
        public void a(List<n> var1);
    }

    private class e
    extends q<Void, Integer, List<n>> {
        List<n> h;
        d i;
        final P j;

        e(P p8, List<n> list, d d8) {
            this.j = p8;
            super(q.e.d0);
            this.h = list;
            this.i = d8;
        }

        @Override
        protected void r() {
            this.j.W9(true);
        }

        protected List<n> w(Void ... object) {
            object = new ArrayList();
            for (n n8 : this.h) {
                if (n8.isDirectory()) {
                    try {
                        Object object2 = n8.E();
                        o o8 = x.g((String)object2);
                        int n9 = o8.f0(o8.z((String)object2)).size();
                        object2 = this.j.w7().f0(n8);
                        if (object2.size() == n9) {
                            object.add(n8);
                            continue;
                        }
                        object.addAll(object2);
                        u.V1(this.j.w7().u(), n8);
                    }
                    catch (j j8) {
                        object.add(n8);
                    }
                    continue;
                }
                object.add(n8);
            }
            return object;
        }

        protected void x(List<n> list) {
            this.j.W9(false);
            this.i.a(list);
        }
    }
}

