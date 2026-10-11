/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import java.util.ArrayList;

public class c
implements j,
AdapterView.OnItemClickListener {
    Context a;
    LayoutInflater b;
    e c;
    ExpandedMenuView d;
    int e;
    int f;
    int g;
    private j.a h;
    a i;

    public c(int n8, int n9) {
        this.g = n8;
        this.f = n9;
    }

    public c(Context context, int n8) {
        this(n8, 0);
        this.a = context;
        this.b = LayoutInflater.from((Context)context);
    }

    @Override
    public void a(e e8, boolean bl) {
        j.a a8 = this.h;
        if (a8 != null) {
            a8.a(e8, bl);
        }
    }

    public ListAdapter b() {
        if (this.i == null) {
            this.i = new a(this);
        }
        return this.i;
    }

    public k c(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView)this.b.inflate(ax.m.g.g, viewGroup, false);
            if (this.i == null) {
                this.i = new a(this);
            }
            this.d.setAdapter((ListAdapter)this.i);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    @Override
    public void d(boolean bl) {
        a a8 = this.i;
        if (a8 != null) {
            a8.notifyDataSetChanged();
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean f(e e8, g g8) {
        return false;
    }

    @Override
    public boolean g(e e8, g g8) {
        return false;
    }

    @Override
    public void h(j.a a8) {
        this.h = a8;
    }

    @Override
    public void i(Context object, e e8) {
        if (this.f != 0) {
            object = new ContextThemeWrapper((Context)object, this.f);
            this.a = object;
            this.b = LayoutInflater.from((Context)object);
        } else if (this.a != null) {
            this.a = object;
            if (this.b == null) {
                this.b = LayoutInflater.from((Context)object);
            }
        }
        this.c = e8;
        object = this.i;
        if (object != null) {
            ((a)((Object)object)).notifyDataSetChanged();
        }
    }

    @Override
    public boolean k(m m8) {
        if (!m8.hasVisibleItems()) {
            return false;
        }
        new f(m8).d(null);
        j.a a8 = this.h;
        if (a8 != null) {
            a8.b(m8);
        }
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int n8, long l8) {
        this.c.N(this.i.b(n8), this, 0);
    }

    private class a
    extends BaseAdapter {
        private int a;
        final c b;

        public a(c c8) {
            this.b = c8;
            this.a = -1;
            this.a();
        }

        void a() {
            g g8 = this.b.c.v();
            if (g8 != null) {
                ArrayList<g> arrayList = this.b.c.z();
                int n8 = arrayList.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    if (arrayList.get(i8) != g8) continue;
                    this.a = i8;
                    return;
                }
            }
            this.a = -1;
        }

        public g b(int n8) {
            ArrayList<g> arrayList = this.b.c.z();
            int n9 = n8 + this.b.e;
            int n10 = this.a;
            n8 = n9;
            if (n10 >= 0) {
                n8 = n9;
                if (n9 >= n10) {
                    n8 = n9 + 1;
                }
            }
            return arrayList.get(n8);
        }

        public int getCount() {
            int n8 = this.b.c.z().size() - this.b.e;
            if (this.a < 0) {
                return n8;
            }
            return n8 - 1;
        }

        public long getItemId(int n8) {
            return n8;
        }

        public View getView(int n8, View object, ViewGroup viewGroup) {
            View view = object;
            if (object == null) {
                object = this.b;
                view = object.b.inflate(object.g, viewGroup, false);
            }
            ((k.a)view).e(this.b(n8), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            this.a();
            super.notifyDataSetChanged();
        }
    }
}

