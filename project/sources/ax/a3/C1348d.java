package ax.a3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ax.d3.AbstractC1927n;
import ax.d3.k0;
import ax.u3.C3184b;
import com.voxdon.xplorer.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import okhttp3.HttpUrl;

/* renamed from: ax.a3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1348d extends I implements M {
    int t0;

    /* renamed from: ax.a3.d$a */
    class a implements DialogInterface.OnShowListener {
        final /* synthetic */ com.google.android.material.bottomsheet.a a;

        a(com.google.android.material.bottomsheet.a aVar) {
            this.a = aVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            String str;
            try {
                View findViewById = this.a.findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    BottomSheetBehavior.q0(findViewById).Z0(3);
                    findViewById.requestFocus();
                }
            } catch (IllegalArgumentException e) {
                C3184b.e("cannot expand bottom sheet");
                if (C1348d.this.R0() == null || C1348d.this.R0().getParent() == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    View view = (View) C1348d.this.R0().getParent();
                    str = view.getId() + "," + view.getClass().getSimpleName();
                }
                ax.Ha.c.h().b("BottomSheetBehavior expand").l(e).g(str).h();
            }
        }
    }

    public static C1348d i3(AbstractC1927n abstractC1927n, String str, boolean z) {
        C1348d c1348d = new C1348d();
        Bundle bundle = new Bundle();
        bundle.putInt("DIALOG_TYPE", 2);
        bundle.putSerializable("location", abstractC1927n.z3());
        bundle.putInt("locationKey", abstractC1927n.x3());
        bundle.putString("folderPath", str);
        bundle.putBoolean("show_analysis", z);
        c1348d.v2(bundle);
        return c1348d;
    }

    @Override // ax.a3.M
    public void S() {
        int i = this.t0;
        if (i == 1) {
            ax.d3.J.d(this, "selection_settings_request", "result_pref_changed", true);
        } else if (i == 2) {
            ax.d3.J.d(this, "view_settings_request", "result_pref_changed", true);
            O2();
        }
    }

    @Override // ax.a3.I
    public void e3() {
        Fragment fragment;
        int i = this.t0;
        if (i == 1) {
            fragment = new k0();
            Bundle bundle = new Bundle();
            bundle.putSerializable("location", (ax.Q2.f) j0().getSerializable("location"));
            bundle.putInt("locationKey", j0().getInt("locationKey"));
            fragment.v2(bundle);
        } else if (i == 2) {
            fragment = new ax.d3.T();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("location", (ax.Q2.f) j0().getSerializable("location"));
            bundle2.putInt("locationKey", j0().getInt("locationKey"));
            bundle2.putString("folderPath", j0().getString("folderPath"));
            bundle2.putBoolean("show_analysis", j0().getBoolean("show_analysis"));
            fragment.v2(bundle2);
        } else {
            fragment = null;
        }
        k0().o().b(R.id.content, fragment).i();
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        this.t0 = j0().getInt("DIALOG_TYPE");
    }

    @Override // ax.a3.I
    public Dialog g3() {
        com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(b(), S2());
        aVar.setOnShowListener(new a(aVar));
        return aVar;
    }

    @Override // ax.a3.I
    public View h3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_popup_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        int i = this.t0;
        if (i == 1) {
            ax.d3.J.b(this, "selection_settings_request");
        } else if (i == 2) {
            ax.d3.J.b(this, "view_settings_request");
        }
    }
}
