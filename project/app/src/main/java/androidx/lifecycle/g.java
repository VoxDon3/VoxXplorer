/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import ax.Gb.l;
import ax.v.c;
import ax.w.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class g
extends d {
    public static final a j = new a(null);
    private final boolean b;
    private ax.w.a<ax.G0.g, b> c;
    private d.b d;
    private final WeakReference<ax.G0.h> e;
    private int f;
    private boolean g;
    private boolean h;
    private ArrayList<d.b> i;

    public g(ax.G0.h h8) {
        l.f(h8, "provider");
        this(h8, true);
    }

    private g(ax.G0.h h8, boolean bl) {
        this.b = bl;
        this.c = new ax.w.a();
        this.d = d.b.c0;
        this.i = new ArrayList();
        this.e = new WeakReference<ax.G0.h>(h8);
    }

    private final void d(ax.G0.h object) {
        Iterator iterator = this.c.descendingIterator();
        l.e(iterator, "observerMap.descendingIterator()");
        while (iterator.hasNext() && !this.h) {
            Object object2 = iterator.next();
            l.e(object2, "next()");
            ax.G0.g g8 = (ax.G0.g)object2.getKey();
            object2 = (b)object2.getValue();
            while (((b)object2).b().compareTo(this.d) > 0 && !this.h && this.c.contains(g8)) {
                d.a a8 = d.a.Companion.a(((b)object2).b());
                if (a8 != null) {
                    this.l(a8.j());
                    ((b)object2).a((ax.G0.h)object, a8);
                    this.k();
                    continue;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("no event down from ");
                ((StringBuilder)object).append((Object)((b)object2).b());
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
        }
    }

    private final d.b e(ax.G0.g object) {
        object = this.c.p((ax.G0.g)object);
        Object object2 = null;
        object = object != null && (object = (b)object.getValue()) != null ? ((b)object).b() : null;
        if (!this.i.isEmpty()) {
            object2 = this.i;
            object2 = object2.get(object2.size() - 1);
        }
        a a8 = j;
        return a8.a(a8.a(this.d, (d.b)((Object)object)), (d.b)((Object)object2));
    }

    @SuppressLint(value={"RestrictedApi"})
    private final void f(String string) {
        if (this.b && !ax.v.c.g().b()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Method ");
            stringBuilder.append(string);
            stringBuilder.append(" must be called on the main thread");
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
    }

    private final void g(ax.G0.h object) {
        b.d d8 = this.c.h();
        l.e(d8, "observerMap.iteratorWithAdditions()");
        while (d8.hasNext() && !this.h) {
            Object object2 = (Map.Entry)d8.next();
            ax.G0.g g8 = (ax.G0.g)object2.getKey();
            object2 = (b)object2.getValue();
            while (((b)object2).b().compareTo(this.d) < 0 && !this.h && this.c.contains(g8)) {
                this.l(((b)object2).b());
                d.a a8 = d.a.Companion.b(((b)object2).b());
                if (a8 != null) {
                    ((b)object2).a((ax.G0.h)object, a8);
                    this.k();
                    continue;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("no event up from ");
                ((StringBuilder)object).append((Object)((b)object2).b());
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
        }
    }

    private final boolean i() {
        if (this.c.size() == 0) {
            return true;
        }
        Object object = this.c.e();
        l.c(object);
        object = ((b)object.getValue()).b();
        Object object2 = this.c.i();
        l.c(object2);
        object2 = ((b)object2.getValue()).b();
        return object == object2 && this.d == object2;
    }

    private final void j(d.b object) {
        block6: {
            block5: {
                d.b b8 = this.d;
                if (b8 == object) break block5;
                if (b8 == d.b.c0 && object == d.b.q) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("no event down from ");
                    ((StringBuilder)object).append((Object)this.d);
                    ((StringBuilder)object).append(" in component ");
                    ((StringBuilder)object).append(this.e.get());
                    throw new IllegalStateException(((StringBuilder)object).toString().toString());
                }
                this.d = object;
                if (this.g || this.f != 0) break block6;
                this.g = true;
                this.n();
                this.g = false;
                if (this.d == d.b.q) {
                    this.c = new ax.w.a();
                }
            }
            return;
        }
        this.h = true;
    }

    private final void k() {
        ArrayList<d.b> arrayList = this.i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void l(d.b b8) {
        this.i.add(b8);
    }

    private final void n() {
        ax.G0.h h8 = (ax.G0.h)this.e.get();
        if (h8 != null) {
            while (!this.i()) {
                this.h = false;
                d.b b8 = this.d;
                Map.Entry entry = this.c.e();
                l.c(entry);
                if (b8.compareTo(((b)entry.getValue()).b()) < 0) {
                    this.d(h8);
                }
                entry = this.c.i();
                if (this.h || entry == null || this.d.compareTo(((b)entry.getValue()).b()) <= 0) continue;
                this.g(h8);
            }
            this.h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    @Override
    public void a(ax.G0.g object) {
        ax.G0.h h8;
        l.f(object, "observer");
        this.f("addObserver");
        Object object2 = this.d;
        Enum enum_ = d.b.q;
        if (object2 != enum_) {
            enum_ = d.b.c0;
        }
        object2 = new b((ax.G0.g)object, (d.b)enum_);
        if (this.c.l((ax.G0.g)object, (b)object2) != null || (h8 = (ax.G0.h)this.e.get()) == null) {
            return;
        }
        boolean bl = this.f != 0 || this.g;
        enum_ = this.e((ax.G0.g)object);
        ++this.f;
        while (((b)object2).b().compareTo(enum_) < 0 && this.c.contains((ax.G0.g)object)) {
            this.l(((b)object2).b());
            enum_ = d.a.Companion.b(((b)object2).b());
            if (enum_ != null) {
                ((b)object2).a(h8, (d.a)enum_);
                this.k();
                enum_ = this.e((ax.G0.g)object);
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("no event up from ");
            ((StringBuilder)object).append((Object)((b)object2).b());
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        if (!bl) {
            this.n();
        }
        --this.f;
    }

    @Override
    public d.b b() {
        return this.d;
    }

    @Override
    public void c(ax.G0.g g8) {
        l.f(g8, "observer");
        this.f("removeObserver");
        this.c.n(g8);
    }

    public void h(d.a a8) {
        l.f((Object)a8, "event");
        this.f("handleLifecycleEvent");
        this.j(a8.j());
    }

    public void m(d.b b8) {
        l.f((Object)b8, "state");
        this.f("setCurrentState");
        this.j(b8);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ax.Gb.g g8) {
            this();
        }

        public final d.b a(d.b b8, d.b b9) {
            l.f((Object)b8, "state1");
            if (b9 != null && b9.compareTo(b8) < 0) {
                return b9;
            }
            return b8;
        }
    }

    public static final class b {
        private d.b a;
        private f b;

        public b(ax.G0.g g8, d.b b8) {
            l.f((Object)b8, "initialState");
            l.c(g8);
            this.b = androidx.lifecycle.h.f(g8);
            this.a = b8;
        }

        public final void a(ax.G0.h h8, d.a a8) {
            l.f((Object)a8, "event");
            d.b b8 = a8.j();
            this.a = j.a(this.a, b8);
            f f8 = this.b;
            l.c(h8);
            f8.b(h8, a8);
            this.a = b8;
        }

        public final d.b b() {
            return this.a;
        }
    }
}

