/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import ax.Q2.f;
import ax.U2.d;
import ax.X2.Q;
import ax.c3.K;
import ax.g3.c;
import ax.g3.d;
import ax.t3.e;
import ax.t3.k;
import ax.x3.a;
import ax.x3.u;
import ax.x3.z;
import java.util.List;
import java.util.Map;

public class b
extends LinearLayout
implements AbsListView.MultiChoiceModeListener {
    private Context a;
    private K b;
    private ListView c;
    private GridView d;
    private AbsListView e;
    private a f;
    private a g;
    private a h;
    private ax.g3.a i;
    private ActionMode j;
    AdapterView.OnItemClickListener k = new d(this, 200L){
        final b c;
        {
            this.c = b8;
            super(l8);
        }

        @Override
        public void a(AdapterView<?> object, View view, int n8, long l8) {
            if (n8 >= 0 && n8 < this.c.f.getCount()) {
                object = (ax.U2.f)this.c.f.getItem(n8);
                if (this.c.i != null) {
                    this.c.i.I((ax.U2.f)object);
                }
            }
        }
    };

    public b(Context context, K k8, ax.g3.a a8) {
        super(context);
        this.a = context;
        this.b = k8;
        this.g();
        this.i = a8;
    }

    private boolean f(int n8) {
        if (n8 != 2131362540) {
            return false;
        }
        if (this.getCheckedItems().size() == this.f.getCount()) {
            this.e();
            return true;
        }
        for (n8 = 0; n8 < this.f.getCount(); ++n8) {
            this.e.setItemChecked(n8, true);
        }
        return false;
    }

    private void g() {
        Object object = LayoutInflater.from((Context)this.a).inflate(2131558443, (ViewGroup)this, false);
        this.addView((View)object, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        this.c = (ListView)object.findViewById(2131362452);
        this.d = (GridView)object.findViewById(2131362350);
        object = new z(this){
            final b a;
            {
                this.a = b8;
            }

            @Override
            public void a(int n8) {
            }

            @Override
            public void b(int n8) {
                if (n8 >= 0 && n8 < this.a.f.getCount()) {
                    this.a.e.setItemChecked(n8, this.a.e.isItemChecked(n8) ^ true);
                }
            }

            @Override
            public void c(int n8, View view, int n9, int n10) {
                if (n8 >= 0 && n8 < this.a.f.getCount() && !this.a.e.isItemChecked(n8)) {
                    this.b(n8);
                }
            }
        };
        View.OnClickListener onClickListener = this.getManageSpaceButtonClickListener();
        this.g = new a(this.a, 0, onClickListener, (z)object, this.o(), true);
        this.h = new a(this.a, 2, onClickListener, (z)object, false, false);
        this.c.setAdapter((ListAdapter)this.g);
        this.c.setChoiceMode(3);
        this.c.setMultiChoiceModeListener((AbsListView.MultiChoiceModeListener)this);
        this.c.setOnItemClickListener(this.k);
        this.g.r(this.k);
        this.d.setAdapter((ListAdapter)this.h);
        this.d.setChoiceMode(3);
        this.d.setMultiChoiceModeListener((AbsListView.MultiChoiceModeListener)this);
        this.d.setOnItemClickListener(this.k);
        this.h.r(this.k);
        this.p(this.getViewType(), this.getIconSizeType());
    }

    private int getIconSizeType() {
        if (this.b.d().P()) {
            return ax.t3.e.d(this.a, this.b.d(), this.b.b(), null, false);
        }
        return 2;
    }

    private int getViewType() {
        if (this.b.d().P()) {
            return ax.t3.e.k(this.a, this.b.d(), this.b.b(), null, false);
        }
        return 0;
    }

    private void m(int n8, int n9) {
        if (n8 == 2) {
            n8 = n9 == 4 ? this.getResources().getDimensionPixelSize(2131165404) : this.getResources().getDimensionPixelSize(2131165405);
            this.d.setColumnWidth(n8);
            this.d.setNumColumns(-1);
        }
    }

    private void n(ax.U2.f f8) {
        ax.g3.a a8 = this.i;
        if (a8 != null) {
            a8.s(f8);
        }
    }

    private boolean o() {
        K k8 = this.b;
        if (k8 != null && k8.d().J() == ax.Q2.f.i1) {
            return true;
        }
        return ax.t3.k.I();
    }

    private void p(int n8, int n9) {
        if (n8 != 0 && n8 != 1) {
            this.c.setVisibility(8);
            this.d.setVisibility(0);
            this.e = this.d;
            this.f = this.h;
        } else {
            a a8;
            this.c.setVisibility(0);
            this.d.setVisibility(8);
            this.e = this.c;
            this.f = a8 = this.g;
            a8.q(n8);
        }
        this.m(n8, n9);
        this.f.p(n9);
        this.e.requestFocus();
        this.e.setAdapter((ListAdapter)this.f);
    }

    public void e() {
        ActionMode actionMode = this.j;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public List<ax.U2.f> getCheckedItems() {
        return u.a(this.e, (ListAdapter)this.f, false);
    }

    public GridView getGridView() {
        return this.d;
    }

    public ListView getListView() {
        return this.c;
    }

    View.OnClickListener getManageSpaceButtonClickListener() {
        return new c(this){
            final b c;
            {
                this.c = b8;
            }

            @Override
            public void a(View object) {
                int n8;
                if (Q.C0() && object.getId() == 2131362401 && (n8 = ((Integer)object.getTag()).intValue()) < this.c.f.getCount()) {
                    object = (ax.U2.f)this.c.f.getItem(n8);
                    this.c.n((ax.U2.f)object);
                }
            }
        };
    }

    public boolean h() {
        return this.j != null;
    }

    public void i(ax.T.b b8, boolean bl) {
        if (!bl) {
            this.c.setClipToPadding(false);
            ListView listView = this.c;
            listView.setPadding(listView.getPaddingLeft(), this.c.getPaddingTop(), this.c.getPaddingRight(), b8.d);
            this.d.setClipToPadding(false);
            listView = this.d;
            listView.setPadding(listView.getPaddingLeft(), this.d.getPaddingTop(), this.d.getPaddingRight(), b8.d);
        }
    }

    public void j() {
        this.p(this.getViewType(), this.getIconSizeType());
    }

    public void k(String string) {
        a a8 = this.f;
        if (a8 != null) {
            a8.getFilter().filter((CharSequence)string);
        }
    }

    public void l(List<ax.U2.f> list, Map<String, d.e> map) {
        Context context = this.a;
        if (context instanceof ax.n.c) {
            ax.u3.z.c((ax.n.c)context);
        }
        this.g.o(list, map);
        this.h.o(list, map);
        this.f.notifyDataSetChanged();
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f(menuItem.getItemId());
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.j = actionMode;
        ax.g3.a a8 = this.i;
        if (a8 != null) {
            a8.j(actionMode, menu);
        }
        this.f.n(true);
        return true;
    }

    public void onDestroyActionMode(ActionMode object) {
        this.j = null;
        object = this.i;
        if (object != null) {
            object.Q();
        }
        this.f.n(false);
    }

    public void onItemCheckedStateChanged(ActionMode actionMode, int n8, long l8, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e.getCheckedItemCount());
        stringBuilder.append("/");
        stringBuilder.append(this.e.getCount());
        actionMode.setTitle((CharSequence)stringBuilder.toString());
        actionMode.invalidate();
    }

    public boolean onPrepareActionMode(ActionMode object, Menu menu) {
        object = this.i;
        if (object != null) {
            object.D(this.getCheckedItems());
        }
        return false;
    }

    public void q() {
        this.g.s();
        this.h.s();
    }
}

