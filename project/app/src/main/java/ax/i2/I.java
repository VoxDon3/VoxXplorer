/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.i2.B;
import ax.i2.C;
import ax.i2.D;
import ax.i2.E;
import ax.i2.F;
import ax.i2.G;
import ax.i2.H;
import ax.i2.J;
import ax.i2.M;
import ax.i2.N;
import ax.i2.b;
import ax.i2.e;
import ax.i2.f;
import ax.i2.g;
import ax.i2.h;
import ax.i2.i;
import ax.i2.j;
import ax.i2.k;
import ax.i2.l;
import ax.i2.m;
import ax.i2.o;
import ax.i2.p;
import ax.i2.s;
import ax.i2.u;
import ax.i2.v;
import ax.i2.w;
import ax.i2.x;
import ax.i2.y;
import ax.i2.z;
import java.util.Set;

public abstract class I<K> {
    public abstract void b(b<K> var1);

    public abstract void c(int var1);

    public abstract boolean e();

    public abstract boolean f(K var1);

    protected abstract void g(int var1);

    public abstract void h(int var1);

    protected abstract RecyclerView.j i();

    public abstract D<K> j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m(K var1);

    protected abstract void n();

    public abstract boolean o(K var1);

    @SuppressLint(value={"LambdaLast"})
    public abstract boolean p(Iterable<K> var1, boolean var2);

    protected abstract void q(Set<K> var1);

    public abstract void r(int var1);

    public static final class a<K> {
        final RecyclerView a;
        private final RecyclerView.h<?> b;
        private final Context c;
        private final String d;
        private final J<K> e;
        c<K> f = E.a();
        private x g = new x();
        private p<K> h;
        private o<K> i;
        private j<K> j = ax.i2.j.e();
        private w<K> k;
        private v l;
        private u m;
        private ax.i2.b n;
        private int o = z.a;
        private int[] p;
        private int[] q;

        public a(String object, RecyclerView recyclerView, p<K> p8, o<K> o8, J<K> j8) {
            boolean bl = true;
            this.p = new int[]{1};
            this.q = new int[]{3};
            boolean bl2 = object != null;
            ax.b0.g.a(bl2);
            ax.b0.g.a(((String)object).trim().isEmpty() ^ true);
            bl2 = recyclerView != null;
            ax.b0.g.a(bl2);
            this.d = object;
            this.a = recyclerView;
            this.c = recyclerView.getContext();
            this.b = object = recyclerView.getAdapter();
            bl2 = object != null;
            ax.b0.g.a(bl2);
            bl2 = p8 != null;
            ax.b0.g.a(bl2);
            bl2 = o8 != null;
            ax.b0.g.a(bl2);
            bl2 = j8 != null ? bl : false;
            ax.b0.g.a(bl2);
            this.i = o8;
            this.h = p8;
            this.e = j8;
            this.n = new b.a(recyclerView, o8);
        }

        /*
         * WARNING - void declaration
         */
        public I<K> a() {
            RecyclerView.t var5_19;
            Object var5_13;
            Object var5_10;
            Object var5_7;
            e e8 = new e(this.d, this.h, this.f, this.e);
            RecyclerView.h<?> object = this.b;
            Object object2 = this.h;
            Object object3 = this.a;
            j.Objects.requireNonNull((Object)object3);
            ax.i2.h.a(object, e8, object2, new F((RecyclerView)object3));
            N n8 = new N(N.e(this.a));
            l<RecyclerView.t> l8 = new l<RecyclerView.t>();
            GestureDetector gestureDetector = new GestureDetector(this.c, l8);
            Object object4 = ax.i2.m.f(e8, this.f, this.a, n8, this.g);
            object2 = new i();
            k k8 = new k(gestureDetector);
            Object object5 = new i();
            Object object6 = new g();
            Object object7 = new f((RecyclerView.t)object6);
            ((i)object5).f(1, (RecyclerView.t)object7);
            this.a.m((RecyclerView.t)object2);
            this.a.m(k8);
            this.a.m((RecyclerView.t)object5);
            object3 = new B();
            e8.b(((B)object3).d());
            ((i)object2).f(0, ((B)object3).c());
            ((B)object3).a(e8);
            ((B)object3).a(this.g.a());
            ((B)object3).a((C)object4);
            ((B)object3).a(k8);
            ((B)object3).a((C)object2);
            ((B)object3).a((C)object5);
            ((B)object3).a((C)object6);
            ((B)object3).a((C)object7);
            v v8 = this.l;
            if (v8 == null) {
                v v9 = new v(this){
                    final a a;
                    {
                        this.a = a8;
                    }

                    @Override
                    public boolean a(MotionEvent motionEvent) {
                        return false;
                    }
                };
            }
            this.l = var5_7;
            w<K> w8 = this.k;
            if (w8 == null) {
                w w9 = new w<K>(this){
                    final a a;
                    {
                        this.a = a8;
                    }

                    @Override
                    public boolean a(o.a<K> a8, MotionEvent motionEvent) {
                        return false;
                    }
                };
            }
            this.k = var5_10;
            u u8 = this.m;
            if (u8 == null) {
                u u9 = new u(this){
                    final a a;
                    {
                        this.a = a8;
                    }

                    @Override
                    public boolean onContextClick(MotionEvent motionEvent) {
                        return false;
                    }
                };
            }
            this.m = var5_13;
            object5 = this.h;
            object7 = this.i;
            c<K> c8 = this.f;
            j.Objects.requireNonNull((Object)object4);
            object6 = new M<K>(e8, object5, object7, c8, new G((m)object4), this.l, this.k, this.j, new Runnable(this){
                final a q;
                {
                    this.q = a8;
                }

                @Override
                public void run() {
                    this.q.a.performHapticFeedback(0);
                }
            }, new H((g)object6));
            for (int n9 : this.p) {
                l8.a(n9, (RecyclerView.t)object6);
                ((i)object2).f(n9, (RecyclerView.t)object4);
            }
            object4 = new s<K>(e8, this.h, this.i, this.m, this.k, this.j);
            int[] nArray = this.q;
            int n10 = nArray.length;
            for (int i8 = 0; i8 < n10; ++i8) {
                l8.a(nArray[i8], (RecyclerView.t)object4);
            }
            if (this.h.c(0) && this.f.a()) {
                ax.i2.c<K> c9 = ax.i2.c.f(this.a, n8, this.o, this.h, e8, this.f, this.n, this.j, this.g);
                ((B)object3).a(c9);
            } else {
                Object var5_18 = null;
            }
            ((i)object2).f(3, new y(this.i, this.l, (RecyclerView.t)var5_19));
            return e8;
        }

        public a<K> b(c<K> c8) {
            boolean bl = c8 != null;
            ax.b0.g.a(bl);
            this.f = c8;
            return this;
        }
    }

    public static abstract class b<K> {
        public void a(K k8, boolean bl) {
        }

        public void b() {
        }

        protected void c() {
        }

        public void d() {
        }
    }

    public static abstract class c<K> {
        public abstract boolean a();

        public abstract boolean b(int var1, boolean var2);

        public abstract boolean c(K var1, boolean var2);
    }
}

