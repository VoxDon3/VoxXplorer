package ax.a3;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class I extends ax.n.y {
    @Override // ax.n.y, androidx.fragment.app.e
    public final Dialog T2(Bundle bundle) {
        return bundle != null ? d3() : !R2() ? d3() : g3();
    }

    protected Dialog d3() {
        Z2(false);
        O2();
        return new ax.n.x(b(), S2());
    }

    public abstract Dialog g3();

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void h1(Bundle bundle) {
        super.h1(bundle);
        if (bundle != null) {
            return;
        }
        e3();
    }

    public View h3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void n1(Bundle bundle) {
        try {
            super.n1(null);
        } catch (IllegalStateException unused) {
        }
        if (bundle == null) {
            f3();
        } else {
            Z2(false);
            N2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            return null;
        }
        return h3(layoutInflater, viewGroup);
    }

    public void e3() {
    }

    public void f3() {
    }
}
