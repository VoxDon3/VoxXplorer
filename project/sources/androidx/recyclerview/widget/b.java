package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class b {
    final InterfaceC0038b a;
    private View e;
    private int d = 0;
    final a b = new a();
    final List<View> c = new ArrayList();

    static class a {
        long a = 0;
        a b;

        a() {
        }

        private void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        void a(int i) {
            if (i < 64) {
                this.a &= ~(1 << i);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        int b(int i) {
            a aVar = this.b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.a);
        }

        boolean d(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i) {
            if (i < 64) {
                this.a |= 1 << i;
            } else {
                c();
                this.b.h(i - 64);
            }
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0038b {
        View a(int i);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.F f(View view);

        void g(int i);

        void h(View view);

        void i(View view, int i);

        void j(int i);

        void k(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    b(InterfaceC0038b interfaceC0038b) {
        this.a = interfaceC0038b;
    }

    private int h(int i) {
        if (i < 0) {
            return -1;
        }
        int c = this.a.c();
        int i2 = i;
        while (i2 < c) {
            int b = i - (i2 - this.b.b(i2));
            if (b == 0) {
                while (this.b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    private void l(View view) {
        this.c.add(view);
        this.a.b(view);
    }

    private boolean t(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.h(view);
        return true;
    }

    void a(View view, int i, boolean z) {
        int c = i < 0 ? this.a.c() : h(i);
        this.b.e(c, z);
        if (z) {
            l(view);
        }
        this.a.i(view, c);
    }

    void b(View view, boolean z) {
        a(view, -1, z);
    }

    void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int c = i < 0 ? this.a.c() : h(i);
        this.b.e(c, z);
        if (z) {
            l(view);
        }
        this.a.k(view, c, layoutParams);
    }

    void d(int i) {
        int h = h(i);
        this.b.f(h);
        this.a.g(h);
    }

    View e(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.c.get(i2);
            RecyclerView.F f = this.a.f(view);
            if (f.n() == i && !f.u() && !f.w()) {
                return view;
            }
        }
        return null;
    }

    View f(int i) {
        return this.a.a(h(i));
    }

    int g() {
        return this.a.c() - this.c.size();
    }

    View i(int i) {
        return this.a.a(i);
    }

    int j() {
        return this.a.c();
    }

    void k(View view) {
        int e = this.a.e(view);
        if (e >= 0) {
            this.b.h(e);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int e = this.a.e(view);
        if (e == -1 || this.b.d(e)) {
            return -1;
        }
        return e - this.b.b(e);
    }

    boolean n(View view) {
        return this.c.contains(view);
    }

    void o() {
        this.b.g();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.a.h(this.c.get(size));
            this.c.remove(size);
        }
        this.a.d();
    }

    void p(View view) {
        int i = this.d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.d = 1;
            this.e = view;
            int e = this.a.e(view);
            if (e >= 0) {
                if (this.b.f(e)) {
                    t(view);
                }
                this.a.j(e);
            }
            this.d = 0;
            this.e = null;
        } catch (Throwable th) {
            this.d = 0;
            this.e = null;
            throw th;
        }
    }

    void q(int i) {
        int i2 = this.d;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int h = h(i);
            View a2 = this.a.a(h);
            if (a2 != null) {
                this.d = 1;
                this.e = a2;
                if (this.b.f(h)) {
                    t(a2);
                }
                this.a.j(h);
            }
            this.d = 0;
            this.e = null;
        } catch (Throwable th) {
            this.d = 0;
            this.e = null;
            throw th;
        }
    }

    boolean r(View view) {
        int i = this.d;
        if (i == 1) {
            if (this.e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.d = 2;
            int e = this.a.e(view);
            if (e == -1) {
                t(view);
                return true;
            }
            if (!this.b.d(e)) {
                return false;
            }
            this.b.f(e);
            t(view);
            this.a.j(e);
            return true;
        } finally {
            this.d = 0;
        }
    }

    void s(View view) {
        int e = this.a.e(view);
        if (e < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.b.d(e)) {
            this.b.a(e);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
