/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ax.g3.c;
import java.util.List;

public class D
extends RecyclerView.h<a> {
    private LayoutInflater d;
    private View.OnClickListener e;
    private AdapterView.OnItemClickListener f;
    private List<String> g;
    private Context h;

    public D(Context context, List<String> list) {
        this.g = list;
        this.h = context;
        this.d = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public void P(a a8, int n8) {
        String string = this.g.get(n8);
        a8.u.setText((CharSequence)string);
        a8.w.setTag((Object)n8);
    }

    public a Q(ViewGroup viewGroup, int n8) {
        return new a(this, this.d.inflate(2131558577, viewGroup, false));
    }

    public void R(AdapterView.OnItemClickListener onItemClickListener) {
        this.f = onItemClickListener;
    }

    public void S(View.OnClickListener onClickListener) {
        this.e = onClickListener;
    }

    @Override
    public int l() {
        return this.g.size();
    }

    public class a
    extends RecyclerView.F {
        TextView u;
        ImageView v;
        ImageView w;
        final D x;

        a(D d8, View view) {
            ImageView imageView;
            this.x = d8;
            super(view);
            this.v = (ImageView)view.findViewById(2131362383);
            this.u = (TextView)view.findViewById(16908308);
            this.w = imageView = (ImageView)view.findViewById(2131362104);
            imageView.setOnClickListener(d8.e);
            view.setOnClickListener((View.OnClickListener)new c(this, d8){
                final D c;
                final a d;
                {
                    this.d = a8;
                    this.c = d8;
                }

                @Override
                public void a(View view) {
                    int n8;
                    if (this.d.x.f != null && (n8 = this.d.k()) >= 0) {
                        this.d.x.f.onItemClick(null, view, n8, this.d.l());
                    }
                }
            });
        }
    }
}

