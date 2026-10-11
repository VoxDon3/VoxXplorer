package ax.b2;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import ax.c0.C1753a;
import ax.d0.H;

@Deprecated
/* renamed from: ax.b2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1477e extends q {
    final RecyclerView f;
    final C1753a g;
    final C1753a h;

    /* renamed from: ax.b2.e$a */
    class a extends C1753a {
        a() {
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            Preference Q;
            C1477e.this.g.g(view, h);
            int k0 = C1477e.this.f.k0(view);
            RecyclerView.h adapter = C1477e.this.f.getAdapter();
            if ((adapter instanceof androidx.preference.e) && (Q = ((androidx.preference.e) adapter).Q(k0)) != null) {
                Q.h0(h);
            }
        }

        @Override // ax.c0.C1753a
        public boolean j(View view, int i, Bundle bundle) {
            return C1477e.this.g.j(view, i, bundle);
        }
    }

    public C1477e(RecyclerView recyclerView) {
        super(recyclerView);
        this.g = super.n();
        this.h = new a();
        this.f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.q
    public C1753a n() {
        return this.h;
    }
}
