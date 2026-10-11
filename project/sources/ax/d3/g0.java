package ax.d3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import ax.W2.h;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g0 extends E {
    private void ta() {
        ax.Q2.a.i().m("menu_recycle_bin", "empty_recycle_bin").e();
        ax.W2.o.n(this, va(), new a());
    }

    private ax.T2.h ua() {
        return x3() == 0 ? ax.T2.h.a0() : ax.T2.h.S(ax.T2.h.q(x3()));
    }

    private ax.c3.K va() {
        if (x3() == 0) {
            return null;
        }
        return ax.T2.h.q(x3());
    }

    @Override // ax.d3.E
    protected AdapterView.OnItemClickListener A7() {
        return H7();
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public boolean B1(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_empty) {
            return super.B1(menuItem);
        }
        ta();
        return true;
    }

    @Override // ax.d3.E
    protected String B7() {
        return A3().f(b());
    }

    @Override // ax.d3.E
    protected boolean C7() {
        return false;
    }

    @Override // ax.d3.E
    protected AdapterView.OnItemClickListener E7() {
        return H7();
    }

    @Override // ax.d3.E
    protected String G7(String str) {
        return "DateDownNoSeparate";
    }

    @Override // ax.d3.E
    protected boolean K7(int i, List<AbstractC3595n> list, boolean z) {
        if (i != R.id.bottom_menu_permanently_delete && i != R.id.bottom_menu_restore) {
            return super.K7(i, list, z);
        }
        ua().v0();
        return super.K7(i, list, z);
    }

    @Override // ax.d3.E
    protected boolean K8() {
        return false;
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
    }

    @Override // ax.d3.E
    protected void L9() {
        super.L9();
        s7().t(R.id.bottom_menu_copy, false);
        s7().t(R.id.bottom_menu_cut, false);
        s7().t(R.id.bottom_menu_rename, false);
        s7().t(R.id.bottom_menu_more, false);
        s7().t(R.id.bottom_menu_delete, false);
        s7().d(R.id.bottom_menu_restore, R.string.menu_restore, R.drawable.ic_restore, this.C1);
        s7().d(R.id.bottom_menu_permanently_delete, R.string.menu_permanently_delete, R.drawable.ic_delete_forever, this.C1);
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public boolean N3() {
        return false;
    }

    @Override // ax.d3.E
    protected boolean R9() {
        return true;
    }

    @Override // ax.d3.E
    public boolean Y7() {
        return false;
    }

    @Override // ax.d3.E
    protected boolean Y9(String str) {
        return true;
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public void c4(boolean z) {
        super.c4(z);
    }

    @Override // ax.d3.E
    protected boolean ca() {
        return true;
    }

    @Override // ax.d3.E
    protected boolean fa() {
        return true;
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
    }

    @Override // ax.d3.E
    protected void k8(List<AbstractC3595n> list) {
        super.k8(list);
        s7().o(R.id.bottom_menu_restore, true);
        s7().o(R.id.bottom_menu_permanently_delete, true);
    }

    @Override // ax.d3.E
    protected void l8(AbstractC3595n abstractC3595n) {
        super.l8(abstractC3595n);
        s7().o(R.id.bottom_menu_restore, true);
        s7().o(R.id.bottom_menu_permanently_delete, true);
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_recycle_bin);
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.o1;
    }

    class a implements h.a {
        a() {
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            if (bVar != h.b.FAILURE || !"NEED_STORAGE_PERMISSION".equals(str)) {
                g0.this.c4(false);
                return;
            }
            if (arrayList == null) {
                g0.this.Z2(ax.c3.K.f, null);
                return;
            }
            ax.c3.K h = ax.c3.K.h(arrayList.get(0));
            String str3 = arrayList.get(1);
            C3184b.c(arrayList.size() == 2);
            C3184b.c(h != null);
            g0.this.Z2(h, str3);
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }
}
