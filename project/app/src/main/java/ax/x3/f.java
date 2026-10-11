/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ax.X2.Q;
import ax.s3.b;
import ax.u3.B;
import java.util.ArrayList;
import java.util.List;

public class f
extends BaseAdapter {
    private List<a> a;
    private Context b;

    public f(Context context, List<a> list) {
        this.b = context;
        this.a = list;
    }

    public static f a(Context context) {
        ArrayList<a> arrayList = new ArrayList<a>();
        arrayList.add(new a(context, ax.Q2.f.N0, null));
        arrayList.add(new a(context, ax.Q2.f.O0, null));
        arrayList.add(new a(context, ax.Q2.f.P0, null));
        if (Q.D0()) {
            arrayList.add(new a(context, ax.Q2.f.S0, null));
        }
        return new f(context, arrayList);
    }

    public static f b(Context context) {
        ArrayList<a> arrayList = new ArrayList<a>();
        arrayList.add(new a(context, ax.Q2.f.L0, null));
        arrayList.add(new a(context, ax.Q2.f.J0, null));
        arrayList.add(new a(context, ax.Q2.f.H0, Boolean.FALSE));
        arrayList.add(new a(context, ax.Q2.f.I0, null));
        arrayList.add(new a(context, ax.Q2.f.K0, null));
        return new f(context, arrayList);
    }

    public a c(int n8) {
        return this.a.get(n8);
    }

    public int getCount() {
        return this.a.size();
    }

    public long getItemId(int n8) {
        return n8;
    }

    public View getView(int n8, View view, ViewGroup object) {
        view = view != null ? (TextView)view : (TextView)((LayoutInflater)this.b.getSystemService("layout_inflater")).inflate(2131558690, object, false);
        object = this.c(n8);
        view.setText((CharSequence)object.c);
        object = ax.s3.a.c(this.b, ax.s3.b.k(object.a, null));
        n8 = B.e(this.b, 32);
        object.setBounds(0, 0, n8, n8);
        view.setCompoundDrawables((Drawable)object, null, null, null);
        view.setCompoundDrawablePadding(B.e(this.b, 12));
        return view;
    }

    public static class a {
        public ax.Q2.f a;
        public Object b;
        public String c;

        a(Context context, ax.Q2.f f8, Object object) {
            this.a = f8;
            this.b = object;
            if (f8 == ax.Q2.f.H0) {
                if (object == Boolean.FALSE) {
                    this.c = context.getString(2131952159);
                    return;
                }
                this.c = context.getString(2131952160);
                return;
            }
            this.c = f8.M(context);
        }
    }
}

