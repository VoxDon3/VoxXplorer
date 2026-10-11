/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.g;
import ax.i2.o;

public abstract class b {
    static boolean b(RecyclerView object) {
        return (object = ((RecyclerView)object).getLayoutManager()) instanceof GridLayoutManager || object instanceof LinearLayoutManager;
        {
        }
    }

    public abstract boolean a(MotionEvent var1);

    public static final class a
    extends b {
        private final RecyclerView a;
        private final o<?> b;

        public a(RecyclerView recyclerView, o<?> o8) {
            boolean bl = false;
            boolean bl2 = recyclerView != null;
            g.a(bl2);
            bl2 = bl;
            if (o8 != null) {
                bl2 = true;
            }
            g.a(bl2);
            this.a = recyclerView;
            this.b = o8;
        }

        @Override
        public boolean a(MotionEvent motionEvent) {
            if (ax.i2.b.b(this.a) && !this.a.v0()) {
                o.a<?> a8 = this.b.a(motionEvent);
                return a8 == null || !a8.d(motionEvent);
                {
                }
            }
            return false;
        }
    }
}

