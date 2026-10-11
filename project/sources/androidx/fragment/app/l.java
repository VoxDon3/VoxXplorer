package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
class l {
    private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    private final FragmentManager b;

    private static final class a {
        final boolean a;
    }

    l(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void b(Fragment fragment, boolean z) {
        this.b.w0().f();
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().b(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void d(Fragment fragment, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void e(Fragment fragment, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void f(Fragment fragment, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void g(Fragment fragment, boolean z) {
        this.b.w0().f();
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().g(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void i(Fragment fragment, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void k(Fragment fragment, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void l(Fragment fragment, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }

    void n(Fragment fragment, boolean z) {
        Fragment z0 = this.b.z0();
        if (z0 != null) {
            z0.A0().y0().n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.a) {
                next.getClass();
                throw null;
            }
        }
    }
}
