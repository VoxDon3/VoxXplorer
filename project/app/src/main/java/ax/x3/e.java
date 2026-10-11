/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.a;
import java.util.ArrayList;

public class e
extends a {
    private final Context c;
    private final ArrayList<Object> d;
    private final ArrayList<String> e;
    private final ArrayList<View> f;
    private final ArrayList<LinearLayout> g;
    private final ArrayList<NestedScrollView> h;

    public e(Context context) {
        this.c = context;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
    }

    @Override
    public void b(ViewGroup viewGroup, int n8, Object object) {
        viewGroup.removeView((View)object);
    }

    @Override
    public int e() {
        return this.d.size();
    }

    @Override
    public CharSequence g(int n8) {
        return this.e.get(n8);
    }

    @Override
    public Object j(ViewGroup viewGroup, int n8) {
        View view = this.f.get(n8);
        viewGroup.addView(view);
        return view;
    }

    @Override
    public boolean k(View view, Object object) {
        return view == object;
    }

    public void v(ViewGroup object, String string, String string2) {
        this.d.add(string);
        this.e.add(string2);
        string = LayoutInflater.from((Context)this.c).inflate(2131558569, object, false);
        this.f.add((View)string);
        object = (LinearLayout)string.findViewById(2131362002);
        this.g.add((LinearLayout)object);
        object = (NestedScrollView)string.findViewById(2131362004);
        this.h.add((NestedScrollView)object);
        this.l();
    }

    public LinearLayout w(int n8) {
        return this.g.get(n8);
    }

    public View x(int n8) {
        return this.f.get(n8);
    }

    public ArrayList<NestedScrollView> y() {
        return this.h;
    }
}

