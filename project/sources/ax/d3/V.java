package ax.d3;

import android.view.Menu;
import android.view.MenuInflater;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class V extends E {
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
        return "DateDown";
    }

    @Override // ax.d3.E
    protected boolean K8() {
        return false;
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public boolean N3() {
        return false;
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_refresh);
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.F0;
    }
}
