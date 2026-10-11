/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.i2.C;
import ax.i2.I;
import ax.i2.q;
import java.util.ArrayList;
import java.util.List;

final class B<K> {
    private final List<C> a = new ArrayList<C>();
    private final RecyclerView.t b = new RecyclerView.t(this){
        final B a;
        {
            this.a = b8;
        }

        @Override
        public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            if (q.d(motionEvent)) {
                this.a.b();
            }
            return false;
        }

        @Override
        public void e(boolean bl) {
        }
    };
    private final I.b<K> c = new I.b<K>(this){
        final B a;
        {
            this.a = b8;
        }

        @Override
        protected void c() {
            this.a.b();
        }
    };

    B() {
    }

    void a(C c8) {
        this.a.add(c8);
    }

    void b() {
        for (C c8 : this.a) {
            if (!c8.d()) continue;
            c8.a();
        }
    }

    RecyclerView.t c() {
        return this.b;
    }

    I.b<K> d() {
        return this.c;
    }
}

