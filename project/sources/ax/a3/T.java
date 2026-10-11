package ax.a3;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ax.d3.AbstractC1927n;
import ax.d3.k0;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class T extends I implements M {
    public static T i3(AbstractC1927n abstractC1927n) {
        T t = new T();
        Bundle bundle = new Bundle();
        bundle.putSerializable("location", abstractC1927n.z3());
        bundle.putInt("locationKey", abstractC1927n.x3());
        t.v2(bundle);
        return t;
    }

    @Override // androidx.fragment.app.Fragment
    public void D1() {
        super.D1();
        O2();
    }

    @Override // ax.a3.M
    public void S() {
        ax.d3.J.d(this, "selection_settings_popup_request", "result_pref_changed", true);
    }

    @Override // ax.a3.I
    public void e3() {
        k0 k0Var = new k0();
        Bundle bundle = new Bundle();
        bundle.putSerializable("location", (ax.Q2.f) j0().getSerializable("location"));
        bundle.putInt("locationKey", j0().getInt("locationKey"));
        k0Var.v2(bundle);
        k0().o().b(R.id.content, k0Var).i();
    }

    @Override // ax.a3.I
    public Dialog g3() {
        ax.n.x xVar = new ax.n.x(b());
        xVar.setCanceledOnTouchOutside(true);
        xVar.setCancelable(true);
        return xVar;
    }

    @Override // ax.a3.I
    public View h3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_popup_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        ax.d3.J.b(this, "selection_settings_popup_request");
    }
}
