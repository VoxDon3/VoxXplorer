package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.d;
import ax.Gb.l;
import ax.Gb.m;
import ax.b0.InterfaceC1440a;
import ax.i.C2186b;
import ax.i.InterfaceC2187c;
import ax.i.r;
import ax.i.s;
import ax.sb.t;
import ax.tb.C3132h;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private final Runnable a;
    private final InterfaceC1440a<Boolean> b;
    private final C3132h<r> c;
    private r d;
    private OnBackInvokedCallback e;
    private OnBackInvokedDispatcher f;
    private boolean g;
    private boolean h;

    private final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.f, InterfaceC2187c {
        private final r c0;
        private InterfaceC2187c d0;
        final /* synthetic */ OnBackPressedDispatcher e0;
        private final androidx.lifecycle.d q;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, androidx.lifecycle.d dVar, r rVar) {
            l.f(dVar, "lifecycle");
            l.f(rVar, "onBackPressedCallback");
            this.e0 = onBackPressedDispatcher;
            this.q = dVar;
            this.c0 = rVar;
            dVar.a(this);
        }

        @Override // androidx.lifecycle.f
        public void b(ax.G0.h hVar, d.a aVar) {
            l.f(hVar, "source");
            l.f(aVar, "event");
            if (aVar == d.a.ON_START) {
                this.d0 = this.e0.i(this.c0);
                return;
            }
            if (aVar != d.a.ON_STOP) {
                if (aVar == d.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC2187c interfaceC2187c = this.d0;
                if (interfaceC2187c != null) {
                    interfaceC2187c.cancel();
                }
            }
        }

        @Override // ax.i.InterfaceC2187c
        public void cancel() {
            this.q.c(this);
            this.c0.i(this);
            InterfaceC2187c interfaceC2187c = this.d0;
            if (interfaceC2187c != null) {
                interfaceC2187c.cancel();
            }
            this.d0 = null;
        }
    }

    static final class a extends m implements ax.Fb.l<C2186b, t> {
        a() {
            super(1);
        }

        public final void a(C2186b c2186b) {
            l.f(c2186b, "backEvent");
            OnBackPressedDispatcher.this.m(c2186b);
        }

        @Override // ax.Fb.l
        public /* bridge */ /* synthetic */ t invoke(C2186b c2186b) {
            a(c2186b);
            return t.a;
        }
    }

    static final class b extends m implements ax.Fb.l<C2186b, t> {
        b() {
            super(1);
        }

        public final void a(C2186b c2186b) {
            l.f(c2186b, "backEvent");
            OnBackPressedDispatcher.this.l(c2186b);
        }

        @Override // ax.Fb.l
        public /* bridge */ /* synthetic */ t invoke(C2186b c2186b) {
            a(c2186b);
            return t.a;
        }
    }

    static final class c extends m implements ax.Fb.a<t> {
        c() {
            super(0);
        }

        public final void a() {
            OnBackPressedDispatcher.this.k();
        }

        @Override // ax.Fb.a
        public /* bridge */ /* synthetic */ t invoke() {
            a();
            return t.a;
        }
    }

    static final class d extends m implements ax.Fb.a<t> {
        d() {
            super(0);
        }

        public final void a() {
            OnBackPressedDispatcher.this.j();
        }

        @Override // ax.Fb.a
        public /* bridge */ /* synthetic */ t invoke() {
            a();
            return t.a;
        }
    }

    static final class e extends m implements ax.Fb.a<t> {
        e() {
            super(0);
        }

        public final void a() {
            OnBackPressedDispatcher.this.k();
        }

        @Override // ax.Fb.a
        public /* bridge */ /* synthetic */ t invoke() {
            a();
            return t.a;
        }
    }

    public static final class f {
        public static final f a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(ax.Fb.a aVar) {
            l.f(aVar, "$onBackInvoked");
            aVar.invoke();
        }

        public final OnBackInvokedCallback b(final ax.Fb.a<t> aVar) {
            l.f(aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: ax.i.t
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.f.c(ax.Fb.a.this);
                }
            };
        }

        public final void d(Object obj, int i, Object obj2) {
            l.f(obj, "dispatcher");
            l.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            l.f(obj, "dispatcher");
            l.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class g {
        public static final g a = new g();

        public static final class a implements OnBackAnimationCallback {
            final /* synthetic */ ax.Fb.l<C2186b, t> a;
            final /* synthetic */ ax.Fb.l<C2186b, t> b;
            final /* synthetic */ ax.Fb.a<t> c;
            final /* synthetic */ ax.Fb.a<t> d;

            /* JADX WARN: Multi-variable type inference failed */
            a(ax.Fb.l<? super C2186b, t> lVar, ax.Fb.l<? super C2186b, t> lVar2, ax.Fb.a<t> aVar, ax.Fb.a<t> aVar2) {
                this.a = lVar;
                this.b = lVar2;
                this.c = aVar;
                this.d = aVar2;
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                this.d.invoke();
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                this.c.invoke();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(BackEvent backEvent) {
                l.f(backEvent, "backEvent");
                this.b.invoke(new C2186b(backEvent));
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(BackEvent backEvent) {
                l.f(backEvent, "backEvent");
                this.a.invoke(new C2186b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(ax.Fb.l<? super C2186b, t> lVar, ax.Fb.l<? super C2186b, t> lVar2, ax.Fb.a<t> aVar, ax.Fb.a<t> aVar2) {
            l.f(lVar, "onBackStarted");
            l.f(lVar2, "onBackProgressed");
            l.f(aVar, "onBackInvoked");
            l.f(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    private final class h implements InterfaceC2187c {
        final /* synthetic */ OnBackPressedDispatcher c0;
        private final r q;

        public h(OnBackPressedDispatcher onBackPressedDispatcher, r rVar) {
            l.f(rVar, "onBackPressedCallback");
            this.c0 = onBackPressedDispatcher;
            this.q = rVar;
        }

        @Override // ax.i.InterfaceC2187c
        public void cancel() {
            this.c0.c.remove(this.q);
            if (l.a(this.c0.d, this.q)) {
                this.q.c();
                this.c0.d = null;
            }
            this.q.i(this);
            ax.Fb.a<t> b = this.q.b();
            if (b != null) {
                b.invoke();
            }
            this.q.k(null);
        }
    }

    /* synthetic */ class i extends ax.Gb.j implements ax.Fb.a<t> {
        i(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // ax.Fb.a
        public /* bridge */ /* synthetic */ t invoke() {
            l();
            return t.a;
        }

        public final void l() {
            ((OnBackPressedDispatcher) this.c0).p();
        }
    }

    /* synthetic */ class j extends ax.Gb.j implements ax.Fb.a<t> {
        j(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // ax.Fb.a
        public /* bridge */ /* synthetic */ t invoke() {
            l();
            return t.a;
        }

        public final void l() {
            ((OnBackPressedDispatcher) this.c0).p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        r rVar;
        r rVar2 = this.d;
        if (rVar2 == null) {
            C3132h<r> c3132h = this.c;
            ListIterator<r> listIterator = c3132h.listIterator(c3132h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    rVar = null;
                    break;
                } else {
                    rVar = listIterator.previous();
                    if (rVar.g()) {
                        break;
                    }
                }
            }
            rVar2 = rVar;
        }
        this.d = null;
        if (rVar2 != null) {
            rVar2.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(C2186b c2186b) {
        r rVar;
        r rVar2 = this.d;
        if (rVar2 == null) {
            C3132h<r> c3132h = this.c;
            ListIterator<r> listIterator = c3132h.listIterator(c3132h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    rVar = null;
                    break;
                } else {
                    rVar = listIterator.previous();
                    if (rVar.g()) {
                        break;
                    }
                }
            }
            rVar2 = rVar;
        }
        if (rVar2 != null) {
            rVar2.e(c2186b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(C2186b c2186b) {
        r rVar;
        C3132h<r> c3132h = this.c;
        ListIterator<r> listIterator = c3132h.listIterator(c3132h.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                rVar = null;
                break;
            } else {
                rVar = listIterator.previous();
                if (rVar.g()) {
                    break;
                }
            }
        }
        r rVar2 = rVar;
        if (this.d != null) {
            j();
        }
        this.d = rVar2;
        if (rVar2 != null) {
            rVar2.f(c2186b);
        }
    }

    private final void o(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f;
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.g) {
            f.a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.g = true;
        } else {
            if (z || !this.g) {
                return;
            }
            f.a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        boolean z = this.h;
        C3132h<r> c3132h = this.c;
        boolean z2 = false;
        if (!s.a(c3132h) || !c3132h.isEmpty()) {
            Iterator<r> it = c3132h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().g()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.h = z2;
        if (z2 != z) {
            InterfaceC1440a<Boolean> interfaceC1440a = this.b;
            if (interfaceC1440a != null) {
                interfaceC1440a.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                o(z2);
            }
        }
    }

    public final void h(ax.G0.h hVar, r rVar) {
        l.f(hVar, "owner");
        l.f(rVar, "onBackPressedCallback");
        androidx.lifecycle.d lifecycle = hVar.getLifecycle();
        if (lifecycle.b() == d.b.DESTROYED) {
            return;
        }
        rVar.a(new LifecycleOnBackPressedCancellable(this, lifecycle, rVar));
        p();
        rVar.k(new i(this));
    }

    public final InterfaceC2187c i(r rVar) {
        l.f(rVar, "onBackPressedCallback");
        this.c.add(rVar);
        h hVar = new h(this, rVar);
        rVar.a(hVar);
        p();
        rVar.k(new j(this));
        return hVar;
    }

    public final void k() {
        r rVar;
        r rVar2 = this.d;
        if (rVar2 == null) {
            C3132h<r> c3132h = this.c;
            ListIterator<r> listIterator = c3132h.listIterator(c3132h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    rVar = null;
                    break;
                } else {
                    rVar = listIterator.previous();
                    if (rVar.g()) {
                        break;
                    }
                }
            }
            rVar2 = rVar;
        }
        this.d = null;
        if (rVar2 != null) {
            rVar2.d();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void n(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        l.f(onBackInvokedDispatcher, "invoker");
        this.f = onBackInvokedDispatcher;
        o(this.h);
    }

    public OnBackPressedDispatcher(Runnable runnable, InterfaceC1440a<Boolean> interfaceC1440a) {
        this.a = runnable;
        this.b = interfaceC1440a;
        this.c = new C3132h<>();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.e = i2 >= 34 ? g.a.a(new a(), new b(), new c(), new d()) : f.a.b(new e());
        }
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i2, ax.Gb.g gVar) {
        this((i2 & 1) != 0 ? null : runnable);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
