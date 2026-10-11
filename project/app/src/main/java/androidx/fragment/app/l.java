/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class l {
    private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList();
    private final FragmentManager b;

    l(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    /*
     * WARNING - void declaration
     */
    void a(Fragment object3, Bundle object2, boolean bl) {
        Fragment fragment = this.b.z0();
        if (fragment != null) {
            Iterator<a> iterator;
            fragment.A0().y0().a((Fragment)object3, (Bundle)iterator, true);
        }
        for (a a8 : this.a) {
            Object var3_5;
            if (var3_5 != false && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    /*
     * WARNING - void declaration
     */
    void b(Fragment object2, boolean bl) {
        this.b.w0().f();
        Fragment fragment = this.b.z0();
        if (fragment != null) {
            fragment.A0().y0().b((Fragment)object2, true);
        }
        for (a a8 : this.a) {
            Object var2_4;
            if (var2_4 != false && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    /*
     * WARNING - void declaration
     */
    void c(Fragment object, Bundle object22, boolean bl) {
        Fragment fragment = this.b.z0();
        if (fragment != null) {
            fragment.A0().y0().c((Fragment)((Object)object), (Bundle)object22, true);
        }
        for (a a8 : this.a) {
            Object var3_5;
            if (var3_5 != false && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    void d(Fragment object, boolean bl) {
        Fragment object22 = this.b.z0();
        if (object22 != null) {
            object22.A0().y0().d((Fragment)((Object)object), true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    void e(Fragment object, boolean bl) {
        Fragment object22 = this.b.z0();
        if (object22 != null) {
            object22.A0().y0().e((Fragment)((Object)object), true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    void f(Fragment object, boolean bl) {
        Fragment object22 = this.b.z0();
        if (object22 != null) {
            object22.A0().y0().f((Fragment)((Object)object), true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    void g(Fragment object, boolean bl) {
        this.b.w0().f();
        Fragment object22 = this.b.z0();
        if (object22 != null) {
            object22.A0().y0().g((Fragment)((Object)object), true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    /*
     * WARNING - void declaration
     */
    void h(Fragment object, Bundle object22, boolean bl) {
        Fragment fragment = this.b.z0();
        if (fragment != null) {
            fragment.A0().y0().h((Fragment)((Object)object), (Bundle)object22, true);
        }
        for (a a8 : this.a) {
            Object var3_5;
            if (var3_5 != false && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    void i(Fragment object, boolean bl) {
        Fragment object22 = this.b.z0();
        if (object22 != null) {
            object22.A0().y0().i((Fragment)((Object)object), true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    /*
     * WARNING - void declaration
     */
    void j(Fragment object3, Bundle object2, boolean bl) {
        Fragment fragment = this.b.z0();
        if (fragment != null) {
            Iterator<a> iterator;
            fragment.A0().y0().j((Fragment)object3, (Bundle)iterator, true);
        }
        for (a a8 : this.a) {
            Object var3_5;
            if (var3_5 != false && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    void k(Fragment object, boolean bl) {
        Fragment object22 = this.b.z0();
        if (object22 != null) {
            object22.A0().y0().k((Fragment)((Object)object), true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    void l(Fragment object, boolean bl) {
        Fragment object22 = this.b.z0();
        if (object22 != null) {
            object22.A0().y0().l((Fragment)((Object)object), true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    /*
     * WARNING - void declaration
     */
    void m(Fragment object, View object22, Bundle bundle, boolean bl) {
        Fragment fragment = this.b.z0();
        if (fragment != null) {
            Bundle var3_5;
            fragment.A0().y0().m((Fragment)((Object)object), (View)object22, (Bundle)var3_5, true);
        }
        for (a a8 : this.a) {
            Object var4_6;
            if (var4_6 != false && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    /*
     * WARNING - void declaration
     */
    void n(Fragment object2, boolean bl) {
        Fragment fragment = this.b.z0();
        if (fragment != null) {
            fragment.A0().y0().n((Fragment)object2, true);
        }
        for (a a8 : this.a) {
            Object var2_4;
            if (var2_4 != false && !a8.a) continue;
            a8.getClass();
            throw null;
        }
    }

    private static final class a {
        final boolean a;
    }
}

