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
import ax.Q2.f;
import ax.Z2.d;
import ax.Z2.j;
import ax.c3.K;
import ax.s3.b;
import ax.x3.n;
import java.util.List;

public class i
extends n {
    private Context a;
    List<K> b;
    d c;
    a d;

    public i(Context context, d d8, a a8) {
        this.a = context;
        this.c = d8;
        this.d = a8;
        this.b();
    }

    @Override
    public K a(int n8) {
        return this.b.get(n8);
    }

    public void b() {
        int n8 = this.d.ordinal();
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) {
                    this.b = this.c.p();
                }
            } else {
                this.b = this.c.k();
            }
        } else {
            this.b = this.c.n();
        }
        this.notifyDataSetChanged();
    }

    public int getCount() {
        return this.b.size();
    }

    public long getItemId(int n8) {
        return n8;
    }

    @SuppressLint(value={"DefaultLocale"})
    public View getView(int n8, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(2131558484, null);
        }
        TextView textView = (TextView)view.findViewById(2131362593);
        viewGroup = (TextView)view.findViewById(2131362401);
        K k8 = this.a(n8);
        f f8 = k8.d();
        ImageView imageView = (ImageView)view.findViewById(2131362383);
        if (f8 == f.p1) {
            boolean bl = this.c.q(k8) > 0x100000L;
            imageView.setImageDrawable(ax.s3.b.f(this.a, f8, bl));
        } else {
            imageView.setImageDrawable(ax.s3.b.f(this.a, f8, null));
        }
        textView.setText((CharSequence)k8.f(this.a));
        viewGroup.setVisibility(8);
        return view;
    }

    public boolean isEnabled(int n8) {
        if (this.a(n8).d() == f.p0 && !j.F().t0()) {
            return j.F().v0();
        }
        return super.isEnabled(n8);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = ax.x3.i$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

