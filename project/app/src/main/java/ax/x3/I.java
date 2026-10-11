/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ax.i2.I;
import ax.i2.J;
import ax.i2.o;
import ax.i2.p;
import ax.x3.G;
import ax.x3.H;

public class I {
    RecyclerView a;
    ax.i2.I<Long> b;
    p<Long> c;

    I(RecyclerView recyclerView, ax.i2.I<Long> i8, p<Long> p8) {
        this.a = recyclerView;
        this.b = i8;
        this.c = p8;
    }

    public static I a(RecyclerView recyclerView, H object) {
        object = new b(recyclerView, (H)object);
        return new I(recyclerView, new I.a<Long>("selection-1", recyclerView, (p<Long>)object, new c(recyclerView), J.a()).b(new I.c<Long>(recyclerView){
            final RecyclerView a;
            {
                this.a = recyclerView;
            }

            @Override
            public boolean a() {
                return true;
            }

            @Override
            public boolean b(int n8, boolean bl) {
                if (n8 == -1) {
                    return false;
                }
                if (this.a.getAdapter() == null) {
                    return false;
                }
                return this.a.getAdapter().m(n8) != G.h;
            }

            public boolean d(Long l8, boolean bl) {
                return l8 != G.h;
            }
        }).a(), (p<Long>)object);
    }

    public int b(long l8) {
        return this.c.b(l8);
    }

    public ax.i2.I<Long> c() {
        return this.b;
    }

    public static class b
    extends p<Long> {
        private final RecyclerView b;
        private final H c;

        b(RecyclerView recyclerView, H h8) {
            super(0);
            this.b = recyclerView;
            this.c = h8;
        }

        public Long d(int n8) {
            if (this.b.getAdapter() == null) {
                return null;
            }
            return this.b.getAdapter().m(n8);
        }

        public int e(Long l8) {
            if (this.b.getAdapter() == null) {
                return -1;
            }
            if (G.h == l8) {
                return this.b.getAdapter().l() - 1;
            }
            return this.c.V(l8);
        }
    }

    public static class c
    extends o<Long> {
        private RecyclerView a;

        public c(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override
        public o.a<Long> a(MotionEvent motionEvent) {
            if ((motionEvent = this.a.X(motionEvent.getX(), motionEvent.getY())) != null) {
                return new o.a<Long>(this, this.a.m0((View)motionEvent)){
                    final RecyclerView.F a;
                    final c b;
                    {
                        this.b = c8;
                        this.a = f8;
                    }

                    @Override
                    public int a() {
                        return this.a.j();
                    }

                    public Long g() {
                        return this.a.l();
                    }
                };
            }
            return null;
        }
    }
}

