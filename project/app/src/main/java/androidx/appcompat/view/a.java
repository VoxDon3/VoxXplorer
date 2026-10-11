/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class a {
    private Object a;
    private boolean b;

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.b;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View var1);

    public abstract void n(int var1);

    public abstract void o(CharSequence var1);

    public void p(Object object) {
        this.a = object;
    }

    public abstract void q(int var1);

    public abstract void r(CharSequence var1);

    public void s(boolean bl) {
        this.b = bl;
    }

    public static interface a {
        public void a(a var1);

        public boolean b(a var1, Menu var2);

        public boolean c(a var1, Menu var2);

        public boolean d(a var1, MenuItem var2);
    }
}

