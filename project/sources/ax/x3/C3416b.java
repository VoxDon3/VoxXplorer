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
import ax.U2.d;
import ax.X2.Q;
import ax.c3.K;
import ax.g3.InterfaceC2111a;
import ax.n.ActivityC2561c;
import com.voxdon.xplorer.R;
import java.util.List;
import java.util.Map;

/* renamed from: ax.x3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3416b extends LinearLayout implements AbsListView.MultiChoiceModeListener {
    private Context a;
    private K b;
    private ListView c;
    private GridView d;
    private AbsListView e;
    private C3415a f;
    private C3415a g;
    private C3415a h;
    private InterfaceC2111a i;
    private ActionMode j;
    AdapterView.OnItemClickListener k;

    /* renamed from: ax.x3.b$b, reason: collision with other inner class name */
    class C0492b extends ax.g3.c {
        C0492b() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            int intValue;
            if (Q.C0() && view.getId() == R.id.info && (intValue = ((Integer) view.getTag()).intValue()) < C3416b.this.f.getCount()) {
                C3416b.this.n((ax.U2.f) C3416b.this.f.getItem(intValue));
            }
        }
    }

    /* renamed from: ax.x3.b$c */
    class c extends ax.g3.d {
        c(long j) {
            super(j);
        }

        @Override // ax.g3.d
        public void a(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < 0 || i >= C3416b.this.f.getCount()) {
                return;
            }
            ax.U2.f fVar = (ax.U2.f) C3416b.this.f.getItem(i);
            if (C3416b.this.i != null) {
                C3416b.this.i.I(fVar);
            }
        }
    }

    public C3416b(Context context, K k, InterfaceC2111a interfaceC2111a) {
        super(context);
        this.k = new c(200L);
        this.a = context;
        this.b = k;
        g();
        this.i = interfaceC2111a;
    }

    private boolean f(int i) {
        if (i != R.id.menu_select_all) {
            return false;
        }
        if (getCheckedItems().size() == this.f.getCount()) {
            e();
            return true;
        }
        for (int i2 = 0; i2 < this.f.getCount(); i2++) {
            this.e.setItemChecked(i2, true);
        }
        return false;
    }

    private void g() {
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.app_list_layout, (ViewGroup) this, false);
        addView(inflate, new LinearLayout.LayoutParams(-1, -1));
        this.c = (ListView) inflate.findViewById(R.id.list);
        this.d = (GridView) inflate.findViewById(R.id.grid);
        a aVar = new a();
        View.OnClickListener manageSpaceButtonClickListener = getManageSpaceButtonClickListener();
        this.g = new C3415a(this.a, 0, manageSpaceButtonClickListener, aVar, o(), true);
        this.h = new C3415a(this.a, 2, manageSpaceButtonClickListener, aVar, false, false);
        this.c.setAdapter((ListAdapter) this.g);
        this.c.setChoiceMode(3);
        this.c.setMultiChoiceModeListener(this);
        this.c.setOnItemClickListener(this.k);
        this.g.r(this.k);
        this.d.setAdapter((ListAdapter) this.h);
        this.d.setChoiceMode(3);
        this.d.setMultiChoiceModeListener(this);
        this.d.setOnItemClickListener(this.k);
        this.h.r(this.k);
        p(getViewType(), getIconSizeType());
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

    private void m(int i, int i2) {
        if (i == 2) {
            this.d.setColumnWidth(i2 == 4 ? getResources().getDimensionPixelSize(R.dimen.file_grid_column_width_large) : getResources().getDimensionPixelSize(R.dimen.file_grid_column_width_medium));
            this.d.setNumColumns(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(ax.U2.f fVar) {
        InterfaceC2111a interfaceC2111a = this.i;
        if (interfaceC2111a != null) {
            interfaceC2111a.s(fVar);
        }
    }

    private boolean o() {
        K k = this.b;
        if (k == null || k.d().J() != ax.Q2.f.i1) {
            return ax.t3.k.I();
        }
        return true;
    }

    private void p(int i, int i2) {
        if (i == 0 || i == 1) {
            this.c.setVisibility(0);
            this.d.setVisibility(8);
            this.e = this.c;
            C3415a c3415a = this.g;
            this.f = c3415a;
            c3415a.q(i);
        } else {
            this.c.setVisibility(8);
            this.d.setVisibility(0);
            this.e = this.d;
            this.f = this.h;
        }
        m(i, i2);
        this.f.p(i2);
        this.e.requestFocus();
        this.e.setAdapter((ListAdapter) this.f);
    }

    public void e() {
        ActionMode actionMode = this.j;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public List<ax.U2.f> getCheckedItems() {
        return u.a(this.e, this.f, false);
    }

    public GridView getGridView() {
        return this.d;
    }

    public ListView getListView() {
        return this.c;
    }

    View.OnClickListener getManageSpaceButtonClickListener() {
        return new C0492b();
    }

    public boolean h() {
        return this.j != null;
    }

    public void i(ax.T.b bVar, boolean z) {
        if (z) {
            return;
        }
        this.c.setClipToPadding(false);
        ListView listView = this.c;
        listView.setPadding(listView.getPaddingLeft(), this.c.getPaddingTop(), this.c.getPaddingRight(), bVar.d);
        this.d.setClipToPadding(false);
        GridView gridView = this.d;
        gridView.setPadding(gridView.getPaddingLeft(), this.d.getPaddingTop(), this.d.getPaddingRight(), bVar.d);
    }

    public void j() {
        p(getViewType(), getIconSizeType());
    }

    public void k(String str) {
        C3415a c3415a = this.f;
        if (c3415a != null) {
            c3415a.getFilter().filter(str);
        }
    }

    public void l(List<ax.U2.f> list, Map<String, d.e> map) {
        Context context = this.a;
        if (context instanceof ActivityC2561c) {
            ax.u3.z.c((ActivityC2561c) context);
        }
        this.g.o(list, map);
        this.h.o(list, map);
        this.f.notifyDataSetChanged();
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return f(menuItem.getItemId());
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.j = actionMode;
        InterfaceC2111a interfaceC2111a = this.i;
        if (interfaceC2111a != null) {
            interfaceC2111a.j(actionMode, menu);
        }
        this.f.n(true);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.j = null;
        InterfaceC2111a interfaceC2111a = this.i;
        if (interfaceC2111a != null) {
            interfaceC2111a.Q();
        }
        this.f.n(false);
    }

    @Override // android.widget.AbsListView.MultiChoiceModeListener
    public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        actionMode.setTitle(this.e.getCheckedItemCount() + "/" + this.e.getCount());
        actionMode.invalidate();
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        InterfaceC2111a interfaceC2111a = this.i;
        if (interfaceC2111a == null) {
            return false;
        }
        interfaceC2111a.D(getCheckedItems());
        return false;
    }

    public void q() {
        this.g.s();
        this.h.s();
    }

    /* renamed from: ax.x3.b$a */
    class a implements z {
        a() {
        }

        @Override // ax.x3.z
        public void b(int i) {
            if (i < 0 || i >= C3416b.this.f.getCount()) {
                return;
            }
            C3416b.this.e.setItemChecked(i, !C3416b.this.e.isItemChecked(i));
        }

        @Override // ax.x3.z
        public void c(int i, View view, int i2, int i3) {
            if (i < 0 || i >= C3416b.this.f.getCount() || C3416b.this.e.isItemChecked(i)) {
                return;
            }
            b(i);
        }

        @Override // ax.x3.z
        public void a(int i) {
        }
    }
}
