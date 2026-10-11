package ax.B0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ax.Gb.l;
import ax.tb.C3115F;
import ax.tb.C3121L;
import ax.tb.C3139o;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();
    private static C0053c b = C0053c.d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* renamed from: ax.B0.c$c, reason: collision with other inner class name */
    public static final class C0053c {
        public static final a c = new a(null);
        public static final C0053c d = new C0053c(C3121L.d(), null, C3115F.g());
        private final Set<a> a;
        private final Map<String, Set<Class<? extends h>>> b;

        /* renamed from: ax.B0.c$c$a */
        public static final class a {
            public /* synthetic */ a(ax.Gb.g gVar) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0053c(Set<? extends a> set, b bVar, Map<String, ? extends Set<Class<? extends h>>> map) {
            l.f(set, "flags");
            l.f(map, "allowedViolations");
            this.a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends h>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.b = linkedHashMap;
        }

        public final Set<a> a() {
            return this.a;
        }

        public final b b() {
            return null;
        }

        public final Map<String, Set<Class<? extends h>>> c() {
            return this.b;
        }
    }

    private c() {
    }

    private final C0053c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.X0()) {
                FragmentManager A0 = fragment.A0();
                l.e(A0, "declaringFragment.parentFragmentManager");
                if (A0.C0() != null) {
                    C0053c C0 = A0.C0();
                    l.c(C0);
                    return C0;
                }
            }
            fragment = fragment.z0();
        }
        return b;
    }

    private final void c(C0053c c0053c, final h hVar) {
        Fragment a2 = hVar.a();
        final String name = a2.getClass().getName();
        if (c0053c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, hVar);
        }
        c0053c.b();
        if (c0053c.a().contains(a.PENALTY_DEATH)) {
            k(a2, new Runnable() { // from class: ax.B0.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, hVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, h hVar) {
        l.f(hVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, hVar);
        throw hVar;
    }

    private final void e(h hVar) {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + hVar.a().getClass().getName(), hVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(Fragment fragment, String str) {
        l.f(fragment, "fragment");
        l.f(str, "previousFragmentId");
        ax.B0.a aVar = new ax.B0.a(fragment, str);
        c cVar = a;
        cVar.e(aVar);
        C0053c b2 = cVar.b(fragment);
        if (b2.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.l(b2, fragment.getClass(), aVar.getClass())) {
            cVar.c(b2, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        l.f(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = a;
        cVar.e(dVar);
        C0053c b2 = cVar.b(fragment);
        if (b2.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.l(b2, fragment.getClass(), dVar.getClass())) {
            cVar.c(b2, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(Fragment fragment) {
        l.f(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = a;
        cVar.e(eVar);
        C0053c b2 = cVar.b(fragment);
        if (b2.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.l(b2, fragment.getClass(), eVar.getClass())) {
            cVar.c(b2, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Fragment fragment, Fragment fragment2, int i) {
        l.f(fragment, "violatingFragment");
        l.f(fragment2, "targetFragment");
        f fVar = new f(fragment, fragment2, i);
        c cVar = a;
        cVar.e(fVar);
        C0053c b2 = cVar.b(fragment);
        if (b2.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.l(b2, fragment.getClass(), fVar.getClass())) {
            cVar.c(b2, fVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Fragment fragment, ViewGroup viewGroup) {
        l.f(fragment, "fragment");
        l.f(viewGroup, "container");
        i iVar = new i(fragment, viewGroup);
        c cVar = a;
        cVar.e(iVar);
        C0053c b2 = cVar.b(fragment);
        if (b2.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.l(b2, fragment.getClass(), iVar.getClass())) {
            cVar.c(b2, iVar);
        }
    }

    private final void k(Fragment fragment, Runnable runnable) {
        if (!fragment.X0()) {
            runnable.run();
            return;
        }
        Handler g = fragment.A0().w0().g();
        l.e(g, "fragment.parentFragmentManager.host.handler");
        if (l.a(g.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            g.post(runnable);
        }
    }

    private final boolean l(C0053c c0053c, Class<? extends Fragment> cls, Class<? extends h> cls2) {
        Set<Class<? extends h>> set = c0053c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (l.a(cls2.getSuperclass(), h.class) || !C3139o.z(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
