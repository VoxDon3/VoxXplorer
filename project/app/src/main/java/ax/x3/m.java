/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ax.Q2.e;
import ax.Q2.f;
import ax.Z2.d;
import ax.Z2.j;
import ax.c3.K;
import ax.s3.b;
import ax.x3.n;
import com.voxdon.xplorer.widget.PieProgress;
import java.util.List;

public class m
extends n {
    private Context a;
    List<K> b;
    d c;
    private int d;
    private int e;

    public m(Context context, d d8) {
        this.a = context;
        this.c = d8;
        this.d();
    }

    @Override
    public K a(int n8) {
        return this.b.get(n8);
    }

    public boolean b(K k8) {
        return this.b.contains(k8);
    }

    public void c() {
        this.b = this.c.i();
        this.notifyDataSetChanged();
    }

    public void d() {
        this.d = ax.Q.b.c(this.a, 2131099842);
        this.e = ax.Q.b.c(this.a, 2131100498);
    }

    public int getCount() {
        List<K> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long getItemId(int n8) {
        return n8;
    }

    @SuppressLint(value={"DefaultLocale"})
    public View getView(int n8, View view, ViewGroup object) {
        if (view == null) {
            view = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(2131558485, null);
        }
        PieProgress pieProgress = (PieProgress)view.findViewById(2131362695);
        Object object2 = (TextView)view.findViewById(2131362593);
        TextView textView = (TextView)view.findViewById(2131362401);
        ImageView imageView = (ImageView)view.findViewById(2131362383);
        object = this.a(n8);
        if (((K)object).d() == f.m0) {
            object2.setText((CharSequence)"");
            imageView.setImageDrawable(null);
            textView.setText((CharSequence)"");
            pieProgress.setVisibility(8);
            imageView.setVisibility(0);
            return view;
        }
        object2.setText((CharSequence)((K)object).f(this.a));
        object2 = ((K)object).d();
        n8 = this.c.t((K)object) && this.c.r((K)object) >= (float)ax.Q2.e.l(this.a) ? 1 : 0;
        if (n8 != 0) {
            textView.setTextColor(this.d);
        } else {
            textView.setTextColor(this.e);
        }
        if (((K)object).d() == f.i1) {
            if (n8 != 0) {
                pieProgress.b(this.d, 4);
            } else {
                pieProgress.b(this.e, 4);
            }
            pieProgress.setStyle(3);
            pieProgress.setProgressPercent((int)this.c.r((K)object));
            pieProgress.setVisibility(0);
            imageView.setVisibility(8);
        } else {
            if (object2 == f.p1) {
                boolean bl = this.c.q((K)object) > 0L;
                imageView.setImageDrawable(ax.s3.b.f(this.a, (f)((Object)object2), bl));
            } else {
                imageView.setImageDrawable(ax.s3.b.f(this.a, (f)((Object)object2), null));
            }
            pieProgress.setVisibility(8);
            imageView.setVisibility(0);
        }
        if (((K)object).d() == f.p0 && !j.F().t0() && !j.F().v0()) {
            imageView.setAlpha(0.8f);
        } else {
            imageView.setAlpha(1.0f);
        }
        textView.setText((CharSequence)this.c.v((K)object, false));
        if (textView.getLineCount() > 1) {
            textView.setText((CharSequence)this.c.v((K)object, true));
        }
        return view;
    }

    public boolean isEnabled(int n8) {
        K k8;
        try {
            k8 = this.a(n8);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return true;
        }
        if (k8.d() == f.p0) {
            if (!j.F().t0()) {
                return j.F().v0();
            }
        } else if (k8.d() == f.m0) {
            return false;
        }
        return super.isEnabled(n8);
    }
}

