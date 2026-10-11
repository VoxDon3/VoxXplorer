package ax.k;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.d;
import ax.Gb.l;
import ax.Gb.m;
import ax.Gb.z;
import ax.Nb.h;
import ax.l.AbstractC2438a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: ax.k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2354e {
    private static final b h = new b(null);
    private final Map<Integer, String> a = new LinkedHashMap();
    private final Map<String, Integer> b = new LinkedHashMap();
    private final Map<String, c> c = new LinkedHashMap();
    private final List<String> d = new ArrayList();
    private final transient Map<String, a<?>> e = new LinkedHashMap();
    private final Map<String, Object> f = new LinkedHashMap();
    private final Bundle g = new Bundle();

    /* renamed from: ax.k.e$a */
    private static final class a<O> {
        private final InterfaceC2351b<O> a;
        private final AbstractC2438a<?, O> b;

        public a(InterfaceC2351b<O> interfaceC2351b, AbstractC2438a<?, O> abstractC2438a) {
            l.f(interfaceC2351b, "callback");
            l.f(abstractC2438a, "contract");
            this.a = interfaceC2351b;
            this.b = abstractC2438a;
        }

        public final InterfaceC2351b<O> a() {
            return this.a;
        }

        public final AbstractC2438a<?, O> b() {
            return this.b;
        }
    }

    /* renamed from: ax.k.e$b */
    private static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: ax.k.e$c */
    private static final class c {
        private final androidx.lifecycle.d a;
        private final List<androidx.lifecycle.f> b;

        public c(androidx.lifecycle.d dVar) {
            l.f(dVar, "lifecycle");
            this.a = dVar;
            this.b = new ArrayList();
        }

        public final void a(androidx.lifecycle.f fVar) {
            l.f(fVar, "observer");
            this.a.a(fVar);
            this.b.add(fVar);
        }

        public final void b() {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                this.a.c((androidx.lifecycle.f) it.next());
            }
            this.b.clear();
        }
    }

    /* renamed from: ax.k.e$d */
    static final class d extends m implements ax.Fb.a<Integer> {
        public static final d q = new d();

        d() {
            super(0);
        }

        @Override // ax.Fb.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(ax.Jb.c.q.c(2147418112) + 65536);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: ax.k.e$e, reason: collision with other inner class name */
    public static final class C0345e<I> extends AbstractC2352c<I> {
        final /* synthetic */ String b;
        final /* synthetic */ AbstractC2438a<I, O> c;

        C0345e(String str, AbstractC2438a<I, O> abstractC2438a) {
            this.b = str;
            this.c = abstractC2438a;
        }

        @Override // ax.k.AbstractC2352c
        public void b(I i, ax.P.c cVar) {
            Object obj = AbstractC2354e.this.b.get(this.b);
            Object obj2 = this.c;
            if (obj != null) {
                int intValue = ((Number) obj).intValue();
                AbstractC2354e.this.d.add(this.b);
                try {
                    AbstractC2354e.this.i(intValue, this.c, i, cVar);
                    return;
                } catch (Exception e) {
                    AbstractC2354e.this.d.remove(this.b);
                    throw e;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // ax.k.AbstractC2352c
        public void c() {
            AbstractC2354e.this.p(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: ax.k.e$f */
    public static final class f<I> extends AbstractC2352c<I> {
        final /* synthetic */ String b;
        final /* synthetic */ AbstractC2438a<I, O> c;

        f(String str, AbstractC2438a<I, O> abstractC2438a) {
            this.b = str;
            this.c = abstractC2438a;
        }

        @Override // ax.k.AbstractC2352c
        public void b(I i, ax.P.c cVar) {
            Object obj = AbstractC2354e.this.b.get(this.b);
            Object obj2 = this.c;
            if (obj != null) {
                int intValue = ((Number) obj).intValue();
                AbstractC2354e.this.d.add(this.b);
                try {
                    AbstractC2354e.this.i(intValue, this.c, i, cVar);
                    return;
                } catch (Exception e) {
                    AbstractC2354e.this.d.remove(this.b);
                    throw e;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // ax.k.AbstractC2352c
        public void c() {
            AbstractC2354e.this.p(this.b);
        }
    }

    private final void d(int i, String str) {
        this.a.put(Integer.valueOf(i), str);
        this.b.put(str, Integer.valueOf(i));
    }

    private final <O> void g(String str, int i, Intent intent, a<O> aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.d.contains(str)) {
            this.f.remove(str);
            this.g.putParcelable(str, new C2350a(i, intent));
        } else {
            aVar.a().a(aVar.b().c(i, intent));
            this.d.remove(str);
        }
    }

    private final int h() {
        for (Number number : h.f(d.q)) {
            if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(AbstractC2354e abstractC2354e, String str, InterfaceC2351b interfaceC2351b, AbstractC2438a abstractC2438a, ax.G0.h hVar, d.a aVar) {
        l.f(abstractC2354e, "this$0");
        l.f(str, "$key");
        l.f(interfaceC2351b, "$callback");
        l.f(abstractC2438a, "$contract");
        l.f(hVar, "<anonymous parameter 0>");
        l.f(aVar, "event");
        if (d.a.ON_START != aVar) {
            if (d.a.ON_STOP == aVar) {
                abstractC2354e.e.remove(str);
                return;
            } else {
                if (d.a.ON_DESTROY == aVar) {
                    abstractC2354e.p(str);
                    return;
                }
                return;
            }
        }
        abstractC2354e.e.put(str, new a<>(interfaceC2351b, abstractC2438a));
        if (abstractC2354e.f.containsKey(str)) {
            Object obj = abstractC2354e.f.get(str);
            abstractC2354e.f.remove(str);
            interfaceC2351b.a(obj);
        }
        C2350a c2350a = (C2350a) ax.Y.b.a(abstractC2354e.g, str, C2350a.class);
        if (c2350a != null) {
            abstractC2354e.g.remove(str);
            interfaceC2351b.a(abstractC2438a.c(c2350a.b(), c2350a.a()));
        }
    }

    private final void o(String str) {
        if (this.b.get(str) != null) {
            return;
        }
        d(h(), str);
    }

    public final boolean e(int i, int i2, Intent intent) {
        String str = this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        g(str, i2, intent, this.e.get(str));
        return true;
    }

    public final <O> boolean f(int i, O o) {
        String str = this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.g.remove(str);
            this.f.put(str, o);
            return true;
        }
        InterfaceC2351b<?> a2 = aVar.a();
        l.d(a2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.d.remove(str)) {
            return true;
        }
        a2.a(o);
        return true;
    }

    public abstract <I, O> void i(int i, AbstractC2438a<I, O> abstractC2438a, I i2, ax.P.c cVar);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            if (this.b.containsKey(str)) {
                Integer remove = this.b.remove(str);
                if (!this.g.containsKey(str)) {
                    z.b(this.a).remove(remove);
                }
            }
            Integer num = integerArrayList.get(i);
            l.e(num, "rcs[i]");
            int intValue = num.intValue();
            String str2 = stringArrayList.get(i);
            l.e(str2, "keys[i]");
            d(intValue, str2);
        }
    }

    public final void k(Bundle bundle) {
        l.f(bundle, "outState");
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.g));
    }

    public final <I, O> AbstractC2352c<I> l(final String str, ax.G0.h hVar, final AbstractC2438a<I, O> abstractC2438a, final InterfaceC2351b<O> interfaceC2351b) {
        l.f(str, "key");
        l.f(hVar, "lifecycleOwner");
        l.f(abstractC2438a, "contract");
        l.f(interfaceC2351b, "callback");
        androidx.lifecycle.d lifecycle = hVar.getLifecycle();
        if (lifecycle.b().h(d.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + hVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(str);
        c cVar = this.c.get(str);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new androidx.lifecycle.f() { // from class: ax.k.d
            @Override // androidx.lifecycle.f
            public final void b(ax.G0.h hVar2, d.a aVar) {
                AbstractC2354e.n(AbstractC2354e.this, str, interfaceC2351b, abstractC2438a, hVar2, aVar);
            }
        });
        this.c.put(str, cVar);
        return new C0345e(str, abstractC2438a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> AbstractC2352c<I> m(String str, AbstractC2438a<I, O> abstractC2438a, InterfaceC2351b<O> interfaceC2351b) {
        l.f(str, "key");
        l.f(abstractC2438a, "contract");
        l.f(interfaceC2351b, "callback");
        o(str);
        this.e.put(str, new a<>(interfaceC2351b, abstractC2438a));
        if (this.f.containsKey(str)) {
            Object obj = this.f.get(str);
            this.f.remove(str);
            interfaceC2351b.a(obj);
        }
        C2350a c2350a = (C2350a) ax.Y.b.a(this.g, str, C2350a.class);
        if (c2350a != null) {
            this.g.remove(str);
            interfaceC2351b.a(abstractC2438a.c(c2350a.b(), c2350a.a()));
        }
        return new f(str, abstractC2438a);
    }

    public final void p(String str) {
        Integer remove;
        l.f(str, "key");
        if (!this.d.contains(str) && (remove = this.b.remove(str)) != null) {
            this.a.remove(remove);
        }
        this.e.remove(str);
        if (this.f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f.get(str));
            this.f.remove(str);
        }
        if (this.g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C2350a) ax.Y.b.a(this.g, str, C2350a.class)));
            this.g.remove(str);
        }
        c cVar = this.c.get(str);
        if (cVar != null) {
            cVar.b();
            this.c.remove(str);
        }
    }
}
