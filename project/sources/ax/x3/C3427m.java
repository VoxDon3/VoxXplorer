package ax.x3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ax.c3.K;
import com.voxdon.xplorer.widget.PieProgress;
import com.voxdon.xplorer.R;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.x3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3427m extends AbstractC3428n {
    private Context a;
    List<K> b;
    ax.Z2.d c;
    private int d;
    private int e;

    public C3427m(Context context, ax.Z2.d dVar) {
        this.a = context;
        this.c = dVar;
        d();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public K getItem(int i) {
        return this.b.get(i);
    }

    public boolean b(K k) {
        return this.b.contains(k);
    }

    public void c() {
        this.b = this.c.i();
        notifyDataSetChanged();
    }

    public void d() {
        this.d = ax.Q.b.c(this.a, R.color.desktop_disk_full_text_color);
        this.e = ax.Q.b.c(this.a, R.color.main_secondary_text);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<K> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"DefaultLocale"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.desktop_item, (ViewGroup) null);
        }
        PieProgress pieProgress = (PieProgress) view.findViewById(R.id.pie_progress);
        TextView textView = (TextView) view.findViewById(R.id.name);
        TextView textView2 = (TextView) view.findViewById(R.id.info);
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        K item = getItem(i);
        if (item.d() == ax.Q2.f.m0) {
            textView.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            imageView.setImageDrawable(null);
            textView2.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            pieProgress.setVisibility(8);
            imageView.setVisibility(0);
            return view;
        }
        textView.setText(item.f(this.a));
        ax.Q2.f d = item.d();
        boolean z = this.c.t(item) && this.c.r(item) >= ((float) ax.Q2.e.l(this.a));
        if (z) {
            textView2.setTextColor(this.d);
        } else {
            textView2.setTextColor(this.e);
        }
        if (item.d() == ax.Q2.f.i1) {
            if (z) {
                pieProgress.b(this.d, 4);
            } else {
                pieProgress.b(this.e, 4);
            }
            pieProgress.setStyle(3);
            pieProgress.setProgressPercent((int) this.c.r(item));
            pieProgress.setVisibility(0);
            imageView.setVisibility(8);
        } else {
            if (d == ax.Q2.f.p1) {
                imageView.setImageDrawable(ax.s3.b.f(this.a, d, Boolean.valueOf(this.c.q(item) > 0)));
            } else {
                imageView.setImageDrawable(ax.s3.b.f(this.a, d, null));
            }
            pieProgress.setVisibility(8);
            imageView.setVisibility(0);
        }
        if (item.d() != ax.Q2.f.p0 || ax.Z2.j.F().t0() || ax.Z2.j.F().v0()) {
            imageView.setAlpha(1.0f);
        } else {
            imageView.setAlpha(0.8f);
        }
        textView2.setText(this.c.v(item, false));
        if (textView2.getLineCount() > 1) {
            textView2.setText(this.c.v(item, true));
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        try {
            K item = getItem(i);
            if (item.d() == ax.Q2.f.p0) {
                if (!ax.Z2.j.F().t0()) {
                    return ax.Z2.j.F().v0();
                }
            } else if (item.d() == ax.Q2.f.m0) {
                return false;
            }
            return super.isEnabled(i);
        } catch (IndexOutOfBoundsException unused) {
            return true;
        }
    }
}
