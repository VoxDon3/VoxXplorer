package ax.d3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.R;
import java.util.List;

/* renamed from: ax.d3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1938z extends E {
    ax.Q2.f s2;

    @Override // ax.d3.E
    protected String B7() {
        return A3().f(b());
    }

    @Override // ax.d3.E
    protected boolean C7() {
        return false;
    }

    @Override // ax.d3.E
    protected String G7(String str) {
        return "None";
    }

    @Override // ax.d3.E
    protected boolean K8() {
        return false;
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        s7().t(R.id.bottom_menu_rename, false);
        s7().t(R.id.bottom_menu_more, false);
        s7().t(R.id.bottom_menu_copy, false);
        s7().t(R.id.bottom_menu_cut, false);
        s7().d(R.id.bottom_menu_properties, R.string.menu_properties, R.drawable.ic_info_outline, this.C1);
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public boolean N3() {
        return false;
    }

    @Override // ax.d3.E
    protected boolean Y9(String str) {
        return true;
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public void c4(boolean z) {
        ta().n();
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
        ta().J0();
    }

    @Override // ax.d3.E
    protected void k8(List<AbstractC3595n> list) {
        super.k8(list);
        s7().o(R.id.bottom_menu_properties, false);
    }

    @Override // ax.d3.E
    protected void l8(AbstractC3595n abstractC3595n) {
        super.l8(abstractC3595n);
        s7().o(R.id.bottom_menu_properties, true);
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_refresh);
    }

    ax.T2.h ta() {
        return ax.T2.h.S(ax.T2.h.q(x3()));
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        ta().G0();
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        if (this.s2 == null) {
            this.s2 = (ax.Q2.f) j0().getSerializable("location");
        }
        return this.s2;
    }
}
