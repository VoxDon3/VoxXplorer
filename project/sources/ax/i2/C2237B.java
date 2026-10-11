package ax.i2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.i2.AbstractC2244I;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.i2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2237B<K> {
    private final List<InterfaceC2238C> a = new ArrayList();
    private final RecyclerView.t b = new a();
    private final AbstractC2244I.b<K> c = new b();

    /* renamed from: ax.i2.B$b */
    class b extends AbstractC2244I.b<K> {
        b() {
        }

        @Override // ax.i2.AbstractC2244I.b
        protected void c() {
            C2237B.this.b();
        }
    }

    C2237B() {
    }

    void a(InterfaceC2238C interfaceC2238C) {
        this.a.add(interfaceC2238C);
    }

    void b() {
        for (InterfaceC2238C interfaceC2238C : this.a) {
            if (interfaceC2238C.d()) {
                interfaceC2238C.a();
            }
        }
    }

    RecyclerView.t c() {
        return this.b;
    }

    AbstractC2244I.b<K> d() {
        return this.c;
    }

    /* renamed from: ax.i2.B$a */
    class a implements RecyclerView.t {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            if (!q.d(motionEvent)) {
                return false;
            }
            C2237B.this.b();
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }
}
