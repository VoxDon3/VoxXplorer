/*
 * Decompiled with CFR 0.152.
 */
package ax.B0;

import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ax.B0.d;
import ax.B0.e;
import ax.B0.f;
import ax.B0.h;
import ax.B0.i;
import ax.Gb.g;
import ax.Gb.l;
import ax.tb.F;
import ax.tb.L;
import ax.tb.o;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class c {
    public static final c a = new c();
    private static c b = c.d;

    private c() {
    }

    public static /* synthetic */ void a(String string, h h8) {
        c.d(string, h8);
    }

    private final c b(Fragment object) {
        while (object != null) {
            if (((Fragment)object).X0()) {
                FragmentManager fragmentManager = ((Fragment)object).A0();
                l.e(fragmentManager, "declaringFragment.parentFragmentManager");
                if (fragmentManager.C0() != null) {
                    object = fragmentManager.C0();
                    l.c(object);
                    return object;
                }
            }
            object = ((Fragment)object).z0();
        }
        return b;
    }

    private final void c(c c8, h h8) {
        Fragment fragment = h8.a();
        String string = fragment.getClass().getName();
        if (c8.a().contains((Object)ax.B0.c$a.q)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Policy violation in ");
            stringBuilder.append(string);
            Log.d((String)"FragmentStrictMode", (String)stringBuilder.toString(), (Throwable)h8);
        }
        c8.b();
        if (c8.a().contains((Object)ax.B0.c$a.c0)) {
            this.k(fragment, new ax.B0.b(string, h8));
        }
    }

    private static final void d(String string, h h8) {
        l.f(h8, "$violation");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Policy violation with PENALTY_DEATH in ");
        stringBuilder.append(string);
        Log.e((String)"FragmentStrictMode", (String)stringBuilder.toString(), (Throwable)h8);
        throw h8;
    }

    private final void e(h h8) {
        if (FragmentManager.J0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("StrictMode violation in ");
            stringBuilder.append(h8.a().getClass().getName());
            Log.d((String)"FragmentManager", (String)stringBuilder.toString(), (Throwable)h8);
        }
    }

    public static final void f(Fragment fragment, String object) {
        l.f(fragment, "fragment");
        l.f(object, "previousFragmentId");
        ax.B0.a a8 = new ax.B0.a(fragment, (String)object);
        c c8 = a;
        c8.e(a8);
        object = c8.b(fragment);
        if (((c)object).a().contains((Object)ax.B0.c$a.d0) && c8.l((c)object, fragment.getClass(), a8.getClass())) {
            c8.c((c)object, a8);
        }
    }

    public static final void g(Fragment fragment, ViewGroup object) {
        l.f(fragment, "fragment");
        d d8 = new d(fragment, (ViewGroup)object);
        c c8 = a;
        c8.e(d8);
        object = c8.b(fragment);
        if (((c)object).a().contains((Object)ax.B0.c$a.e0) && c8.l((c)object, fragment.getClass(), d8.getClass())) {
            c8.c((c)object, d8);
        }
    }

    public static final void h(Fragment fragment) {
        l.f(fragment, "fragment");
        e e8 = new e(fragment);
        c c8 = a;
        c8.e(e8);
        c c9 = c8.b(fragment);
        if (c9.a().contains((Object)ax.B0.c$a.h0) && c8.l(c9, fragment.getClass(), e8.getClass())) {
            c8.c(c9, e8);
        }
    }

    public static final void i(Fragment fragment, Fragment object, int n8) {
        l.f(fragment, "violatingFragment");
        l.f(object, "targetFragment");
        f f8 = new f(fragment, (Fragment)object, n8);
        object = a;
        super.e(f8);
        c c8 = super.b(fragment);
        if (c8.a().contains((Object)ax.B0.c$a.h0) && super.l(c8, fragment.getClass(), f8.getClass())) {
            super.c(c8, f8);
        }
    }

    public static final void j(Fragment fragment, ViewGroup object) {
        l.f(fragment, "fragment");
        l.f(object, "container");
        i i8 = new i(fragment, (ViewGroup)object);
        object = a;
        super.e(i8);
        c c8 = super.b(fragment);
        if (c8.a().contains((Object)ax.B0.c$a.i0) && super.l(c8, fragment.getClass(), i8.getClass())) {
            super.c(c8, i8);
        }
    }

    private final void k(Fragment fragment, Runnable runnable2) {
        if (fragment.X0()) {
            fragment = fragment.A0().w0().g();
            l.e(fragment, "fragment.parentFragmentManager.host.handler");
            if (l.a(fragment.getLooper(), Looper.myLooper())) {
                runnable2.run();
                return;
            }
            fragment.post(runnable2);
            return;
        }
        runnable2.run();
    }

    private final boolean l(c object, Class<? extends Fragment> object2, Class<? extends h> clazz) {
        object2 = ((Class)object2).getName();
        if ((object = ((c)object).c().get(object2)) == null) {
            return true;
        }
        if (!l.a(clazz.getSuperclass(), h.class) && o.z(object, clazz.getSuperclass())) {
            return false;
        }
        return object.contains(clazz) ^ true;
    }

    public static final class a
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
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = new a();
            f0 = new a();
            g0 = new a();
            h0 = new a();
            i0 = new a();
            j0 = ax.B0.c$a.d();
        }

        private static final /* synthetic */ a[] d() {
            return new a[]{q, c0, d0, e0, f0, g0, h0, i0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])j0.clone();
        }
    }

    public static interface b {
    }

    public static final class c {
        public static final a c = new a(null);
        public static final c d = new c(L.d(), null, F.g());
        private final Set<ax.B0.c$a> a;
        private final Map<String, Set<Class<? extends h>>> b;

        public c(Set<? extends ax.B0.c$a> object, b object2, Map<String, ? extends Set<Class<? extends h>>> object32) {
            l.f(object, "flags");
            l.f(object32, "allowedViolations");
            this.a = object;
            object = new LinkedHashMap<String, Set<Class<? extends h>>>();
            for (Map.Entry entry : object32.entrySet()) {
                object.put((String)entry.getKey(), (Set)entry.getValue());
            }
            this.b = object;
        }

        public final Set<ax.B0.c$a> a() {
            return this.a;
        }

        public final b b() {
            return null;
        }

        public final Map<String, Set<Class<? extends h>>> c() {
            return this.b;
        }

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }
        }
    }
}

