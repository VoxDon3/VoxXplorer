package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.a;
import androidx.viewpager.widget.ViewPager;
import ax.s3.C3045a;
import ax.u3.C3180B;
import ax.u3.C3190h;
import ax.x3.C3420f;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.R;
import com.google.android.material.tabs.TabLayout;

/* renamed from: ax.a3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1351g extends androidx.fragment.app.e {

    /* renamed from: ax.a3.g$a */
    class a implements AdapterView.OnItemClickListener {
        final /* synthetic */ C3420f a;

        a(C3420f c3420f) {
            this.a = c3420f;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C3420f.a item = this.a.getItem(i);
            if (C1351g.this.X0() && (C1351g.this.f0() instanceof MainActivity)) {
                ((MainActivity) C1351g.this.f0()).v1().a(item.a, item.b);
            }
            C1351g.this.O2();
        }
    }

    /* renamed from: ax.a3.g$b */
    class b implements AdapterView.OnItemClickListener {
        final /* synthetic */ C3420f a;

        b(C3420f c3420f) {
            this.a = c3420f;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C3420f.a item = this.a.getItem(i);
            if (C1351g.this.X0() && (C1351g.this.f0() instanceof MainActivity)) {
                ((MainActivity) C1351g.this.f0()).v1().a(item.a, item.b);
            }
            C1351g.this.O2();
        }
    }

    /* renamed from: ax.a3.g$d */
    public static class d extends androidx.viewpager.widget.a {
        d() {
        }

        @Override // androidx.viewpager.widget.a
        public void b(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.a
        public int e() {
            return 2;
        }

        @Override // androidx.viewpager.widget.a
        public Object j(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return viewGroup.findViewById(R.id.list1);
            }
            if (i != 1) {
                return null;
            }
            return viewGroup.findViewById(R.id.list2);
        }

        @Override // androidx.viewpager.widget.a
        public boolean k(View view, Object obj) {
            return view == obj;
        }
    }

    private void d3(TabLayout tabLayout, String str, int i, int i2) {
        Context b2 = b();
        TabLayout.g F = tabLayout.F();
        F.t(str);
        F.u(i);
        F.q(C3045a.c(b2, i2));
        tabLayout.i(F);
    }

    @Override // androidx.fragment.app.e
    public Dialog T2(Bundle bundle) {
        a.C0006a a2 = C3190h.a(f0());
        Context context = a2.getContext();
        C3420f a3 = C3420f.a(context);
        C3420f b2 = C3420f.b(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_choose_network, (ViewGroup) null, false);
        ListView listView = (ListView) inflate.findViewById(R.id.list1);
        listView.setAdapter((ListAdapter) a3);
        listView.setOnItemClickListener(new a(a3));
        ListView listView2 = (ListView) inflate.findViewById(R.id.list2);
        listView2.setAdapter((ListAdapter) b2);
        listView2.setOnItemClickListener(new b(b2));
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.tab_layout);
        d3(tabLayout, "CLOUD", R.string.location_cloud, R.drawable.v_shape_cloud);
        d3(tabLayout, "REMOTE", R.string.location_remote, R.drawable.v_shape_remote);
        a2.setView(inflate);
        a2.b(true);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.view_pager);
        viewPager.getLayoutParams().height = C3180B.e(context, (Math.max(a3.getCount(), b2.getCount()) * 48) + 10);
        d dVar = new d();
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(dVar);
        viewPager.c(new TabLayout.h(tabLayout));
        tabLayout.h(new c(viewPager));
        androidx.appcompat.app.a create = a2.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    /* renamed from: ax.a3.g$c */
    class c implements TabLayout.d {
        final /* synthetic */ ViewPager a;

        c(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            this.a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }
}
