/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ax.g3.c;
import ax.o3.o;
import ax.x3.B;
import java.util.List;

public class J
extends RecyclerView.h<a> {
    private final Context d;
    private final List<o> e;
    private B f;

    public J(Context context, List<o> list) {
        this.d = context;
        this.e = list;
    }

    public void O(a a8, int n8) {
        a8.N(this.e.get(n8));
    }

    public a P(ViewGroup viewGroup, int n8) {
        return new a(this, LayoutInflater.from((Context)this.d).inflate(2131558700, viewGroup, false));
    }

    public void Q(B b8) {
        this.f = b8;
    }

    @Override
    public int l() {
        return this.e.size();
    }

    class a
    extends RecyclerView.F {
        private final TextView u;
        private final ImageView v;
        final J w;

        public a(J j8, View view) {
            this.w = j8;
            super(view);
            view.setOnClickListener((View.OnClickListener)new c(this, j8){
                final J c;
                final a d;
                {
                    this.d = a8;
                    this.c = j8;
                }

                @Override
                public void a(View view) {
                    int n8;
                    if (this.d.w.f != null && (n8 = this.d.k()) >= 0) {
                        this.d.w.f.a(view, n8);
                    }
                }
            });
            this.u = (TextView)view.findViewById(2131362593);
            this.v = (ImageView)view.findViewById(2131362383);
        }

        public void N(o o8) {
            this.u.setText((CharSequence)o8.e());
            int n8 = o8.f();
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        this.v.setImageResource(2131231227);
                        return;
                    }
                    this.v.setImageResource(2131231237);
                    return;
                }
                this.v.setImageResource(2131231158);
                return;
            }
            this.v.setImageResource(2131231236);
        }
    }
}

