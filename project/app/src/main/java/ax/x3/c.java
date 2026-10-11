/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.a;
import ax.Q2.f;
import ax.U2.d;
import ax.c3.K;
import ax.x3.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class c
extends a {
    private final Context c;
    private final ArrayList<String> d;
    private final ArrayList<String> e;
    private final ArrayList<b> f;
    private final ax.g3.a g;
    private final K h;

    public c(Activity activity, K k8, ax.g3.a a8) {
        this.c = activity;
        this.h = k8;
        this.g = a8;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        if (k8.d() == ax.Q2.f.q1) {
            this.v("APPS_DOWNLOADED", activity.getString(2131951675));
            return;
        }
        if (k8.d() == ax.Q2.f.r1) {
            this.v("APPS_UNUSED", activity.getString(2131952190));
            return;
        }
        this.v("APPS_DOWNLOADED", activity.getString(2131951675));
        this.v("APPS_ALL", activity.getString(2131951674));
    }

    public void A(String object, List<ax.U2.f> list, Map<String, d.e> map) {
        int n8 = this.d.indexOf(object);
        object = this.f.get(n8);
        ((b)((Object)object)).q();
        ((b)((Object)object)).l(list, map);
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
        View view = (View)this.f.get(n8);
        viewGroup.addView(view);
        return view;
    }

    @Override
    public boolean k(View view, Object object) {
        return view == object;
    }

    void v(String string, String string2) {
        this.d.add(string);
        this.e.add(string2);
        this.f.add(new b(this.c, this.h, this.g));
        this.l();
    }

    public b w(int n8) {
        return this.f.get(n8);
    }

    public int x(String string) {
        return this.d.indexOf(string);
    }

    public String y(int n8) {
        return this.d.get(n8);
    }

    public void z(ax.T.b b8, boolean bl) {
        ArrayList<b> arrayList = this.f;
        if (arrayList != null) {
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                b b9 = arrayList.get(i8);
                b9.i(b8, bl);
            }
        }
    }
}

