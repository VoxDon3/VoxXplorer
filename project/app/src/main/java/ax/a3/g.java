/*
 * Decompiled with CFR 0.152.
 */
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
import androidx.fragment.app.e;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.a;
import ax.u3.B;
import ax.u3.h;
import ax.x3.f;
import com.alphainventor.filemanager.activity.MainActivity;
import com.google.android.material.tabs.TabLayout;

public class g
extends e {
    private void d3(TabLayout tabLayout, String string, int n8, int n9) {
        Context context = this.b();
        TabLayout.g g8 = tabLayout.F();
        g8.t(string);
        g8.u(n8);
        g8.q(ax.s3.a.c(context, n9));
        tabLayout.i(g8);
    }

    @Override
    public Dialog T2(Bundle object) {
        object = h.a((Context)this.f0());
        Object object2 = ((a.a)object).getContext();
        f f8 = f.a(object2);
        f f9 = f.b(object2);
        Object object3 = LayoutInflater.from((Context)object2).inflate(2131558494, null, false);
        Object object4 = (ListView)object3.findViewById(2131362453);
        object4.setAdapter((ListAdapter)f8);
        object4.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            final f a;
            final g b;
            {
                this.b = g8;
                this.a = f8;
            }

            public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
                object = this.a.c(n8);
                if (this.b.X0() && this.b.f0() instanceof MainActivity) {
                    ((MainActivity)this.b.f0()).v1().a(object.a, object.b);
                }
                this.b.O2();
            }
        });
        object4 = (ListView)object3.findViewById(2131362454);
        object4.setAdapter((ListAdapter)f9);
        object4.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            final f a;
            final g b;
            {
                this.b = g8;
                this.a = f8;
            }

            public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
                object = this.a.c(n8);
                if (this.b.X0() && this.b.f0() instanceof MainActivity) {
                    ((MainActivity)this.b.f0()).v1().a(object.a, object.b);
                }
                this.b.O2();
            }
        });
        object4 = (TabLayout)object3.findViewById(2131362927);
        this.d3((TabLayout)((Object)object4), "CLOUD", 2131952153, 2131231519);
        this.d3((TabLayout)((Object)object4), "REMOTE", 2131952180, 2131231538);
        ((a.a)object).setView((View)object3);
        ((a.a)object).b(true);
        object3 = (ViewPager)object3.findViewById(2131363038);
        object3.getLayoutParams().height = B.e(object2, Math.max(f8.getCount(), f9.getCount()) * 48 + 10);
        object2 = new d();
        ((ViewPager)((Object)object3)).setOffscreenPageLimit(2);
        ((ViewPager)((Object)object3)).setAdapter((a)object2);
        ((ViewPager)((Object)object3)).c(new TabLayout.h((TabLayout)((Object)object4)));
        ((TabLayout)((Object)object4)).h(new TabLayout.d(){
            final ViewPager a;
            final g b;
            {
                this.b = g8;
                this.a = viewPager;
            }

            @Override
            public void a(TabLayout.g g8) {
            }

            @Override
            public void b(TabLayout.g g8) {
                this.a.setCurrentItem(g8.g());
            }

            @Override
            public void c(TabLayout.g g8) {
            }
        });
        object = ((a.a)object).create();
        object.setCanceledOnTouchOutside(true);
        return object;
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    public static class d
    extends a {
        d() {
        }

        @Override
        public void b(ViewGroup viewGroup, int n8, Object object) {
            viewGroup.removeView((View)object);
        }

        @Override
        public int e() {
            return 2;
        }

        @Override
        public Object j(ViewGroup viewGroup, int n8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    return null;
                }
                return viewGroup.findViewById(2131362454);
            }
            return viewGroup.findViewById(2131362453);
        }

        @Override
        public boolean k(View view, Object object) {
            return view == object;
        }
    }
}

