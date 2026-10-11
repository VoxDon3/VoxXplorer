/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

class b {
    final b a;
    final a b;
    final List<View> c;
    private int d = 0;
    private View e;

    b(b b8) {
        this.a = b8;
        this.b = new a();
        this.c = new ArrayList<View>();
    }

    private int h(int n8) {
        int n9;
        if (n8 < 0) {
            return -1;
        }
        int n10 = this.a.c();
        for (int i8 = n8; i8 < n10; i8 += n9) {
            n9 = n8 - (i8 - this.b.b(i8));
            if (n9 != 0) continue;
            while (this.b.d(i8)) {
                ++i8;
            }
            return i8;
        }
        return -1;
    }

    private void l(View view) {
        this.c.add(view);
        this.a.b(view);
    }

    private boolean t(View view) {
        if (this.c.remove(view)) {
            this.a.h(view);
            return true;
        }
        return false;
    }

    void a(View view, int n8, boolean bl) {
        n8 = n8 < 0 ? this.a.c() : this.h(n8);
        this.b.e(n8, bl);
        if (bl) {
            this.l(view);
        }
        this.a.i(view, n8);
    }

    void b(View view, boolean bl) {
        this.a(view, -1, bl);
    }

    void c(View view, int n8, ViewGroup.LayoutParams layoutParams, boolean bl) {
        n8 = n8 < 0 ? this.a.c() : this.h(n8);
        this.b.e(n8, bl);
        if (bl) {
            this.l(view);
        }
        this.a.k(view, n8, layoutParams);
    }

    void d(int n8) {
        n8 = this.h(n8);
        this.b.f(n8);
        this.a.g(n8);
    }

    View e(int n8) {
        int n9 = this.c.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            View view = this.c.get(i8);
            RecyclerView.F f8 = this.a.f(view);
            if (f8.n() != n8 || f8.u() || f8.w()) continue;
            return view;
        }
        return null;
    }

    View f(int n8) {
        n8 = this.h(n8);
        return this.a.a(n8);
    }

    int g() {
        return this.a.c() - this.c.size();
    }

    View i(int n8) {
        return this.a.a(n8);
    }

    int j() {
        return this.a.c();
    }

    void k(View view) {
        int n8 = this.a.e(view);
        if (n8 >= 0) {
            this.b.h(n8);
            this.l(view);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("view is not a child, cannot hide ");
        stringBuilder.append(view);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    int m(View view) {
        int n8 = this.a.e(view);
        if (n8 == -1) {
            return -1;
        }
        if (this.b.d(n8)) {
            return -1;
        }
        return n8 - this.b.b(n8);
    }

    boolean n(View view) {
        return this.c.contains(view);
    }

    void o() {
        this.b.g();
        for (int i8 = this.c.size() - 1; i8 >= 0; --i8) {
            this.a.h(this.c.get(i8));
            this.c.remove(i8);
        }
        this.a.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void p(View view) {
        Throwable throwable2;
        block8: {
            block7: {
                int n8;
                block6: {
                    n8 = this.d;
                    if (n8 == 1) {
                        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
                    }
                    if (n8 == 2) {
                        throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                    }
                    try {
                        this.d = 1;
                        this.e = view;
                        n8 = this.a.e(view);
                        if (n8 >= 0) break block6;
                        break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                if (this.b.f(n8)) {
                    this.t(view);
                }
                this.a.j(n8);
            }
            this.d = 0;
            this.e = null;
            return;
        }
        this.d = 0;
        this.e = null;
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void q(int n8) {
        Throwable throwable2;
        block8: {
            block7: {
                View view;
                block6: {
                    int n9 = this.d;
                    if (n9 == 1) {
                        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
                    }
                    if (n9 == 2) {
                        throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                    }
                    try {
                        n8 = this.h(n8);
                        view = this.a.a(n8);
                        if (view != null) break block6;
                        break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                this.d = 1;
                this.e = view;
                if (this.b.f(n8)) {
                    this.t(view);
                }
                this.a.j(n8);
            }
            this.d = 0;
            this.e = null;
            return;
        }
        this.d = 0;
        this.e = null;
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean r(View view) {
        Throwable throwable2;
        block8: {
            int n8 = this.d;
            if (n8 == 1) {
                if (this.e == view) {
                    return false;
                }
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            if (n8 == 2) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
            }
            try {
                this.d = 2;
                n8 = this.a.e(view);
                if (n8 == -1) {
                    this.t(view);
                    this.d = 0;
                    return true;
                }
            }
            catch (Throwable throwable2) {
                break block8;
            }
            {
                if (this.b.d(n8)) {
                    this.b.f(n8);
                    this.t(view);
                    this.a.j(n8);
                    this.d = 0;
                    return true;
                }
                this.d = 0;
                return false;
            }
        }
        this.d = 0;
        throw throwable2;
    }

    void s(View view) {
        int n8 = this.a.e(view);
        if (n8 >= 0) {
            if (this.b.d(n8)) {
                this.b.a(n8);
                this.t(view);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("trying to unhide a view that was not hidden");
            stringBuilder.append(view);
            throw new RuntimeException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("view is not a child, cannot hide ");
        stringBuilder.append(view);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.toString());
        stringBuilder.append(", hidden list:");
        stringBuilder.append(this.c.size());
        return stringBuilder.toString();
    }

    static class a {
        long a = 0L;
        a b;

        a() {
        }

        private void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        void a(int n8) {
            if (n8 >= 64) {
                a a8 = this.b;
                if (a8 != null) {
                    a8.a(n8 - 64);
                }
                return;
            }
            this.a &= 1L << n8 ^ 0xFFFFFFFFFFFFFFFFL;
        }

        int b(int n8) {
            a a8 = this.b;
            if (a8 == null) {
                if (n8 >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & (1L << n8) - 1L);
            }
            if (n8 < 64) {
                return Long.bitCount(this.a & (1L << n8) - 1L);
            }
            return a8.b(n8 - 64) + Long.bitCount(this.a);
        }

        boolean d(int n8) {
            if (n8 >= 64) {
                this.c();
                return this.b.d(n8 - 64);
            }
            return (this.a & 1L << n8) != 0L;
        }

        void e(int n8, boolean bl) {
            if (n8 >= 64) {
                this.c();
                this.b.e(n8 - 64, bl);
                return;
            }
            long l8 = this.a;
            boolean bl2 = (Long.MIN_VALUE & l8) != 0L;
            long l9 = (1L << n8) - 1L;
            this.a = (l8 & (l9 ^ 0xFFFFFFFFFFFFFFFFL)) << 1 | l8 & l9;
            if (bl) {
                this.h(n8);
            } else {
                this.a(n8);
            }
            if (!bl2 && this.b == null) {
                return;
            }
            this.c();
            this.b.e(0, bl2);
        }

        boolean f(int n8) {
            if (n8 >= 64) {
                this.c();
                return this.b.f(n8 - 64);
            }
            long l8 = this.a;
            long l9 = 1L << n8;
            boolean bl = (l8 & l9) != 0L;
            this.a = l8 &= l9 ^ 0xFFFFFFFFFFFFFFFFL;
            this.a = l8 & --l9 | Long.rotateRight((l9 ^ 0xFFFFFFFFFFFFFFFFL) & l8, 1);
            a a8 = this.b;
            if (a8 != null) {
                if (a8.d(0)) {
                    this.h(63);
                }
                this.b.f(0);
            }
            return bl;
        }

        void g() {
            this.a = 0L;
            a a8 = this.b;
            if (a8 != null) {
                a8.g();
            }
        }

        void h(int n8) {
            if (n8 >= 64) {
                this.c();
                this.b.h(n8 - 64);
                return;
            }
            this.a |= 1L << n8;
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b.toString());
            stringBuilder.append("xx");
            stringBuilder.append(Long.toBinaryString(this.a));
            return stringBuilder.toString();
        }
    }

    static interface b {
        public View a(int var1);

        public void b(View var1);

        public int c();

        public void d();

        public int e(View var1);

        public RecyclerView.F f(View var1);

        public void g(int var1);

        public void h(View var1);

        public void i(View var1, int var2);

        public void j(int var1);

        public void k(View var1, int var2, ViewGroup.LayoutParams var3);
    }
}

