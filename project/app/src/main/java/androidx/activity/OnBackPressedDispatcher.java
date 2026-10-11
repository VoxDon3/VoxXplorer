/*
 * Decompiled with CFR 0.152.
 */
package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.d;
import ax.Gb.l;
import ax.b0.a;
import ax.i.b;
import ax.i.c;
import ax.i.r;
import ax.i.s;
import ax.i.t;
import java.util.ListIterator;

public final class OnBackPressedDispatcher {
    private final Runnable a;
    private final a<Boolean> b;
    private final ax.tb.h<r> c;
    private r d;
    private OnBackInvokedCallback e;
    private OnBackInvokedDispatcher f;
    private boolean g;
    private boolean h;

    public OnBackPressedDispatcher() {
        this(null, 1, null);
    }

    public OnBackPressedDispatcher(Runnable runnable2) {
        this(runnable2, null);
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable2, int n8, ax.Gb.g g8) {
        if ((n8 & 1) != 0) {
            runnable2 = null;
        }
        this(runnable2);
    }

    public OnBackPressedDispatcher(Runnable runnable2, a<Boolean> a8) {
        this.a = runnable2;
        this.b = a8;
        this.c = new ax.tb.h();
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 33) {
            runnable2 = n8 >= 34 ? androidx.activity.OnBackPressedDispatcher$g.a.a((ax.Fb.l<? super b, ax.sb.t>)new ax.Fb.l<b, ax.sb.t>(this){
                final OnBackPressedDispatcher q;
                {
                    this.q = onBackPressedDispatcher;
                    super(1);
                }

                public final void a(b b8) {
                    l.f(b8, "backEvent");
                    this.q.m(b8);
                }
            }, (ax.Fb.l<? super b, ax.sb.t>)new ax.Fb.l<b, ax.sb.t>(this){
                final OnBackPressedDispatcher q;
                {
                    this.q = onBackPressedDispatcher;
                    super(1);
                }

                public final void a(b b8) {
                    l.f(b8, "backEvent");
                    this.q.l(b8);
                }
            }, new ax.Fb.a<ax.sb.t>(this){
                final OnBackPressedDispatcher q;
                {
                    this.q = onBackPressedDispatcher;
                    super(0);
                }

                public final void a() {
                    this.q.k();
                }
            }, new ax.Fb.a<ax.sb.t>(this){
                final OnBackPressedDispatcher q;
                {
                    this.q = onBackPressedDispatcher;
                    super(0);
                }

                public final void a() {
                    this.q.j();
                }
            }) : androidx.activity.OnBackPressedDispatcher$f.a.b(new ax.Fb.a<ax.sb.t>(this){
                final OnBackPressedDispatcher q;
                {
                    this.q = onBackPressedDispatcher;
                    super(0);
                }

                public final void a() {
                    this.q.k();
                }
            });
            this.e = runnable2;
        }
    }

    private final void j() {
        Object object;
        Object object2 = object = this.d;
        if (object == null) {
            block3: {
                object2 = this.c;
                object = object2.listIterator(object2.size());
                while (object.hasPrevious()) {
                    object2 = object.previous();
                    if (!((r)object2).g()) continue;
                    break block3;
                }
                object2 = null;
            }
            object2 = (r)object2;
        }
        this.d = null;
        if (object2 != null) {
            ((r)object2).c();
        }
    }

    private final void l(b b8) {
        Object object;
        Object object2 = object = this.d;
        if (object == null) {
            block3: {
                object2 = this.c;
                object = object2.listIterator(object2.size());
                while (object.hasPrevious()) {
                    object2 = object.previous();
                    if (!((r)object2).g()) continue;
                    break block3;
                }
                object2 = null;
            }
            object2 = (r)object2;
        }
        if (object2 != null) {
            ((r)object2).e(b8);
        }
    }

    private final void m(b b8) {
        Object object;
        block3: {
            object = this.c;
            ListIterator listIterator = object.listIterator(object.size());
            while (listIterator.hasPrevious()) {
                object = listIterator.previous();
                if (!((r)object).g()) continue;
                break block3;
            }
            object = null;
        }
        object = (r)object;
        if (this.d != null) {
            this.j();
        }
        this.d = object;
        if (object != null) {
            ((r)object).f(b8);
        }
    }

    private final void o(boolean bl) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f;
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (bl && !this.g) {
                androidx.activity.OnBackPressedDispatcher$f.a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.g = true;
                return;
            }
            if (!bl && this.g) {
                androidx.activity.OnBackPressedDispatcher$f.a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.g = false;
            }
        }
    }

    private final void p() {
        boolean bl;
        a<Boolean> a8;
        boolean bl2;
        block6: {
            bl2 = this.h;
            a8 = this.c;
            bl = s.a(a8);
            boolean bl3 = false;
            if (bl && a8.isEmpty()) {
                bl = bl3;
            } else {
                a8 = a8.iterator();
                do {
                    bl = bl3;
                    if (!a8.hasNext()) break block6;
                } while (!((r)a8.next()).g());
                bl = true;
            }
        }
        this.h = bl;
        if (bl != bl2) {
            a8 = this.b;
            if (a8 != null) {
                a8.accept(bl);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                this.o(bl);
            }
        }
    }

    public final void h(ax.G0.h object, r r8) {
        l.f(object, "owner");
        l.f(r8, "onBackPressedCallback");
        object = object.getLifecycle();
        if (((d)object).b() == d.b.q) {
            return;
        }
        r8.a(new LifecycleOnBackPressedCancellable(this, (d)object, r8));
        this.p();
        r8.k(new ax.Fb.a<ax.sb.t>((Object)this){

            public final void l() {
                ((OnBackPressedDispatcher)this.c0).p();
            }
        });
    }

    public final c i(r r8) {
        l.f(r8, "onBackPressedCallback");
        this.c.add(r8);
        h h8 = new h(this, r8);
        r8.a(h8);
        this.p();
        r8.k(new ax.Fb.a<ax.sb.t>((Object)this){

            public final void l() {
                ((OnBackPressedDispatcher)this.c0).p();
            }
        });
        return h8;
    }

    public final void k() {
        Object object;
        Object object2 = object = this.d;
        if (object == null) {
            block4: {
                object2 = this.c;
                object = object2.listIterator(object2.size());
                while (object.hasPrevious()) {
                    object2 = object.previous();
                    if (!((r)object2).g()) continue;
                    break block4;
                }
                object2 = null;
            }
            object2 = (r)object2;
        }
        this.d = null;
        if (object2 != null) {
            ((r)object2).d();
            return;
        }
        object2 = this.a;
        if (object2 != null) {
            object2.run();
        }
    }

    public final void n(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        l.f(onBackInvokedDispatcher, "invoker");
        this.f = onBackInvokedDispatcher;
        this.o(this.h);
    }

    private final class LifecycleOnBackPressedCancellable
    implements androidx.lifecycle.f,
    c {
        private final r c0;
        private c d0;
        final OnBackPressedDispatcher e0;
        private final d q;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, d d8, r r8) {
            l.f(d8, "lifecycle");
            l.f(r8, "onBackPressedCallback");
            this.e0 = onBackPressedDispatcher;
            this.q = d8;
            this.c0 = r8;
            d8.a(this);
        }

        @Override
        public void b(ax.G0.h object, d.a a8) {
            l.f(object, "source");
            l.f((Object)a8, "event");
            if (a8 == d.a.ON_START) {
                this.d0 = this.e0.i(this.c0);
                return;
            }
            if (a8 == d.a.ON_STOP) {
                object = this.d0;
                if (object != null) {
                    object.cancel();
                    return;
                }
            } else if (a8 == d.a.ON_DESTROY) {
                this.cancel();
            }
        }

        @Override
        public void cancel() {
            this.q.c(this);
            this.c0.i(this);
            c c8 = this.d0;
            if (c8 != null) {
                c8.cancel();
            }
            this.d0 = null;
        }
    }

    public static final class f {
        public static final f a = new f();

        private f() {
        }

        public static /* synthetic */ void a(ax.Fb.a a8) {
            androidx.activity.OnBackPressedDispatcher$f.c(a8);
        }

        private static final void c(ax.Fb.a a8) {
            l.f(a8, "$onBackInvoked");
            a8.invoke();
        }

        public final OnBackInvokedCallback b(ax.Fb.a<ax.sb.t> a8) {
            l.f(a8, "onBackInvoked");
            return new t(a8);
        }

        public final void d(Object object, int n8, Object object2) {
            l.f(object, "dispatcher");
            l.f(object2, "callback");
            ((OnBackInvokedDispatcher)object).registerOnBackInvokedCallback(n8, (OnBackInvokedCallback)object2);
        }

        public final void e(Object object, Object object2) {
            l.f(object, "dispatcher");
            l.f(object2, "callback");
            ((OnBackInvokedDispatcher)object).unregisterOnBackInvokedCallback((OnBackInvokedCallback)object2);
        }
    }

    public static final class g {
        public static final g a = new g();

        private g() {
        }

        public final OnBackInvokedCallback a(ax.Fb.l<? super b, ax.sb.t> l8, ax.Fb.l<? super b, ax.sb.t> l9, ax.Fb.a<ax.sb.t> a8, ax.Fb.a<ax.sb.t> a9) {
            l.f(l8, "onBackStarted");
            l.f(l9, "onBackProgressed");
            l.f(a8, "onBackInvoked");
            l.f(a9, "onBackCancelled");
            return new OnBackAnimationCallback(l8, l9, a8, a9){
                final ax.Fb.l<b, ax.sb.t> a;
                final ax.Fb.l<b, ax.sb.t> b;
                final ax.Fb.a<ax.sb.t> c;
                final ax.Fb.a<ax.sb.t> d;
                {
                    this.a = l8;
                    this.b = l9;
                    this.c = a8;
                    this.d = a9;
                }

                public void onBackCancelled() {
                    this.d.invoke();
                }

                public void onBackInvoked() {
                    this.c.invoke();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    l.f(backEvent, "backEvent");
                    this.b.invoke(new b(backEvent));
                }

                public void onBackStarted(BackEvent backEvent) {
                    l.f(backEvent, "backEvent");
                    this.a.invoke(new b(backEvent));
                }
            };
        }
    }

    private final class h
    implements c {
        final OnBackPressedDispatcher c0;
        private final r q;

        public h(OnBackPressedDispatcher onBackPressedDispatcher, r r8) {
            l.f(r8, "onBackPressedCallback");
            this.c0 = onBackPressedDispatcher;
            this.q = r8;
        }

        @Override
        public void cancel() {
            this.c0.c.remove(this.q);
            if (l.a(this.c0.d, this.q)) {
                this.q.c();
                this.c0.d = null;
            }
            this.q.i(this);
            ax.Fb.a<ax.sb.t> a8 = this.q.b();
            if (a8 != null) {
                a8.invoke();
            }
            this.q.k(null);
        }
    }
}

