package ax.d3;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class O extends E {
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
        return "RecursiveDown";
    }

    @Override // ax.d3.E
    protected boolean K8() {
        return false;
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
    protected boolean Y9(String str) {
        return true;
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public void c4(boolean z) {
        ta().n();
        super.c4(z);
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
        return ax.Q2.f.k1;
    }
}
