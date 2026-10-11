package ax.x3;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ax.U2.d;
import ax.c3.K;
import ax.g3.InterfaceC2111a;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ax.x3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3417c extends androidx.viewpager.widget.a {
    private final Context c;
    private final ArrayList<String> d = new ArrayList<>();
    private final ArrayList<String> e = new ArrayList<>();
    private final ArrayList<C3416b> f = new ArrayList<>();
    private final InterfaceC2111a g;
    private final K h;

    public C3417c(Activity activity, K k, InterfaceC2111a interfaceC2111a) {
        this.c = activity;
        this.h = k;
        this.g = interfaceC2111a;
        if (k.d() == ax.Q2.f.q1) {
            v("APPS_DOWNLOADED", activity.getString(R.string.apps_downloaded));
        } else if (k.d() == ax.Q2.f.r1) {
            v("APPS_UNUSED", activity.getString(R.string.location_unused_apps));
        } else {
            v("APPS_DOWNLOADED", activity.getString(R.string.apps_downloaded));
            v("APPS_ALL", activity.getString(R.string.apps_all));
        }
    }

    public void A(String str, List<ax.U2.f> list, Map<String, d.e> map) {
        C3416b c3416b = this.f.get(this.d.indexOf(str));
        c3416b.q();
        c3416b.l(list, map);
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int e() {
        return this.d.size();
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence g(int i) {
        return this.e.get(i);
    }

    @Override // androidx.viewpager.widget.a
    public Object j(ViewGroup viewGroup, int i) {
        C3416b c3416b = this.f.get(i);
        viewGroup.addView(c3416b);
        return c3416b;
    }

    @Override // androidx.viewpager.widget.a
    public boolean k(View view, Object obj) {
        return view == obj;
    }

    void v(String str, String str2) {
        this.d.add(str);
        this.e.add(str2);
        this.f.add(new C3416b(this.c, this.h, this.g));
        l();
    }

    public C3416b w(int i) {
        return this.f.get(i);
    }

    public int x(String str) {
        return this.d.indexOf(str);
    }

    public String y(int i) {
        return this.d.get(i);
    }

    public void z(ax.T.b bVar, boolean z) {
        ArrayList<C3416b> arrayList = this.f;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C3416b c3416b = arrayList.get(i);
            i++;
            c3416b.i(bVar, z);
        }
    }
}
