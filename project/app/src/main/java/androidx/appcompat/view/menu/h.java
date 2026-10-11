/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;

abstract class h
implements ax.t.e,
j,
AdapterView.OnItemClickListener {
    private Rect a;

    h() {
    }

    protected static int o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int n8) {
        int n9 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        int n10 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        int n11 = listAdapter.getCount();
        ViewGroup viewGroup2 = null;
        int n12 = 0;
        int n13 = 0;
        ViewGroup viewGroup3 = viewGroup;
        viewGroup = viewGroup2;
        for (int i8 = 0; i8 < n11; ++i8) {
            int n14 = listAdapter.getItemViewType(i8);
            int n15 = n13;
            if (n14 != n13) {
                viewGroup = null;
                n15 = n14;
            }
            viewGroup2 = viewGroup3;
            if (viewGroup3 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            viewGroup = listAdapter.getView(i8, (View)viewGroup, viewGroup2);
            viewGroup.measure(n9, n10);
            n14 = viewGroup.getMeasuredWidth();
            if (n14 >= n8) {
                return n8;
            }
            n13 = n12;
            if (n14 > n12) {
                n13 = n14;
            }
            n12 = n13;
            n13 = n15;
            viewGroup3 = viewGroup2;
        }
        return n12;
    }

    protected static boolean x(e e8) {
        int n8 = e8.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            MenuItem menuItem = e8.getItem(i8);
            if (!menuItem.isVisible() || menuItem.getIcon() == null) continue;
            return true;
        }
        return false;
    }

    protected static d y(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (d)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        }
        return (d)listAdapter;
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
    public void i(Context context, e e8) {
    }

    public abstract void l(e var1);

    protected boolean m() {
        return true;
    }

    public Rect n() {
        return this.a;
    }

    public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
        view = (ListAdapter)object.getAdapter();
        object = h.y((ListAdapter)view).a;
        view = (MenuItem)view.getItem(n8);
        n8 = this.m() ? 0 : 4;
        ((e)object).N((MenuItem)view, this, n8);
    }

    public abstract void p(View var1);

    public void q(Rect rect) {
        this.a = rect;
    }

    public abstract void r(boolean var1);

    public abstract void s(int var1);

    public abstract void t(int var1);

    public abstract void u(PopupWindow.OnDismissListener var1);

    public abstract void v(boolean var1);

    public abstract void w(int var1);
}

