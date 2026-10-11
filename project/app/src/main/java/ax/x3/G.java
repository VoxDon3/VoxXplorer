/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ax.g3.c;
import ax.u3.z;

public class G
extends RecyclerView.h<a> {
    public static long h = Long.MAX_VALUE;
    private int d;
    private boolean e;
    private AdapterView.OnItemClickListener f;
    private float g;

    public G(Context context, int n8) {
        this.K(true);
        this.d = n8;
        this.g = z.i(context, 0x1010033, 0.3f);
        this.e = false;
    }

    public void Q(a a8, int n8) {
        a8.N();
    }

    public a R(ViewGroup viewGroup, int n8) {
        viewGroup = LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131558695, viewGroup, false);
        ((TextView)viewGroup.findViewById(2131362607)).setText(this.d);
        return new a(this, (View)viewGroup);
    }

    public void S(AdapterView.OnItemClickListener onItemClickListener) {
        this.f = onItemClickListener;
    }

    public void T(RecyclerView recyclerView, boolean bl) {
        this.e = bl;
        for (int i8 = 0; i8 < recyclerView.getChildCount(); ++i8) {
            RecyclerView.F f8 = recyclerView.m0(recyclerView.getChildAt(i8));
            if (!(f8 instanceof a)) continue;
            ((a)f8).N();
        }
    }

    @Override
    public int l() {
        return 1;
    }

    @Override
    public long m(int n8) {
        return h;
    }

    public class a
    extends RecyclerView.F {
        private View u;
        final G v;

        a(G g8, View view) {
            this.v = g8;
            super(view);
            this.u = view = view.findViewById(2131361913);
            view.setOnClickListener((View.OnClickListener)new c(this, g8){
                final G c;
                final a d;
                {
                    this.d = a8;
                    this.c = g8;
                }

                @Override
                public void a(View view) {
                    int n8;
                    if (!this.d.v.e && this.d.v.f != null && (n8 = this.d.k()) >= 0) {
                        this.d.v.f.onItemClick(null, view, n8, this.d.l());
                    }
                }
            });
            this.u.setOnLongClickListener(new View.OnLongClickListener(){
                final G a;
                final a b;
                {
                    this.b = a8;
                    this.a = g8;
                }

                public boolean onLongClick(View view) {
                    return false;
                }
            });
        }

        void N() {
            if (this.u != null) {
                if (this.v.e) {
                    this.u.setBackgroundResource(0);
                    this.a.setAlpha(this.v.g);
                    this.a.setEnabled(true);
                    return;
                }
                this.u.setBackgroundResource(2131230876);
                this.a.setAlpha(1.0f);
                this.a.setEnabled(false);
            }
        }
    }
}

