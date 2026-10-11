/*
 * Decompiled with CFR 0.152.
 */
package ax.b2;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import ax.c0.a;
import ax.d0.H;

@Deprecated
public class e
extends q {
    final RecyclerView f;
    final a g = super.n();
    final a h = new a(this){
        final e d;
        {
            this.d = e8;
        }

        @Override
        public void g(View object, H h8) {
            this.d.g.g((View)object, h8);
            int n8 = this.d.f.k0((View)object);
            object = this.d.f.getAdapter();
            if (!(object instanceof androidx.preference.e) || (object = ((androidx.preference.e)object).Q(n8)) == null) {
                return;
            }
            ((Preference)object).h0(h8);
        }

        @Override
        public boolean j(View view, int n8, Bundle bundle) {
            return this.d.g.j(view, n8, bundle);
        }
    };

    public e(RecyclerView recyclerView) {
        super(recyclerView);
        this.f = recyclerView;
    }

    @Override
    public a n() {
        return this.h;
    }
}

