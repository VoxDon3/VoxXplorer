package ax.x3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ax.c3.K;
import com.voxdon.xplorer.R;
import java.util.List;

/* renamed from: ax.x3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3423i extends AbstractC3428n {
    private Context a;
    List<K> b;
    ax.Z2.d c;
    a d;

    /* renamed from: ax.x3.i$a */
    public enum a {
        LOCAL,
        LIBRARY,
        NETWORK
    }

    public C3423i(Context context, ax.Z2.d dVar, a aVar) {
        this.a = context;
        this.c = dVar;
        this.d = aVar;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public K getItem(int i) {
        return this.b.get(i);
    }

    public void b() {
        int ordinal = this.d.ordinal();
        if (ordinal == 0) {
            this.b = this.c.n();
        } else if (ordinal == 1) {
            this.b = this.c.k();
        } else if (ordinal == 2) {
            this.b = this.c.p();
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"DefaultLocale"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.desktop2_item, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.name);
        TextView textView2 = (TextView) view.findViewById(R.id.info);
        K item = getItem(i);
        ax.Q2.f d = item.d();
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        if (d == ax.Q2.f.p1) {
            imageView.setImageDrawable(ax.s3.b.f(this.a, d, Boolean.valueOf(this.c.q(item) > 1048576)));
        } else {
            imageView.setImageDrawable(ax.s3.b.f(this.a, d, null));
        }
        textView.setText(item.f(this.a));
        textView2.setVisibility(8);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return (getItem(i).d() != ax.Q2.f.p0 || ax.Z2.j.F().t0()) ? super.isEnabled(i) : ax.Z2.j.F().v0();
    }
}
