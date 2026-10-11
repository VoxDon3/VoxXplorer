package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;
import ax.i2.AbstractC2264o;

/* renamed from: ax.i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2251b {

    /* renamed from: ax.i2.b$a */
    public static final class a extends AbstractC2251b {
        private final RecyclerView a;
        private final AbstractC2264o<?> b;

        public a(RecyclerView recyclerView, AbstractC2264o<?> abstractC2264o) {
            C1446g.a(recyclerView != null);
            C1446g.a(abstractC2264o != null);
            this.a = recyclerView;
            this.b = abstractC2264o;
        }

        @Override // ax.i2.AbstractC2251b
        public boolean a(MotionEvent motionEvent) {
            if (!AbstractC2251b.b(this.a) || this.a.v0()) {
                return false;
            }
            AbstractC2264o.a<?> a = this.b.a(motionEvent);
            return a == null || !a.d(motionEvent);
        }
    }

    static boolean b(RecyclerView recyclerView) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        return (layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager);
    }

    public abstract boolean a(MotionEvent motionEvent);
}
