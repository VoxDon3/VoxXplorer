package ax.d3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import ax.u3.C3184b;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class k0 extends androidx.preference.d implements SharedPreferences.OnSharedPreferenceChangeListener {

    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            Fragment z0 = k0.this.z0();
            if (z0 instanceof ax.n.y) {
                ((ax.n.y) z0).O2();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void D1() {
        super.D1();
        P2().L().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        P2().L().registerOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        View R0 = R0();
        if (!(R0 instanceof LinearLayout)) {
            C3184b.f();
            return;
        }
        LayoutInflater from = LayoutInflater.from(b());
        ViewGroup viewGroup = ax.u3.z.w(b()) ? (ViewGroup) from.inflate(R.layout.view_selection_settings_title_dark, (ViewGroup) R0, false) : (ViewGroup) from.inflate(R.layout.view_selection_settings_title_light, (ViewGroup) R0, false);
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.menu_settings);
        toolbar.setNavigationIcon(R.drawable.ic_close);
        toolbar.setNavigationContentDescription(R.string.close_button_text);
        toolbar.setNavigationOnClickListener(new a());
        ((LinearLayout) R0).addView(viewGroup, 0);
    }

    @Override // androidx.preference.d
    public void T2(Bundle bundle, String str) {
        K2(R.xml.selection_settings);
        if (!ax.Q2.f.l((ax.Q2.f) j0().getSerializable("location"))) {
            n("settings_recycle_bin").N0(false);
            n("use_recycle_bin").N0(false);
            n("recycle_bin_confirmation_2").N0(false);
        }
        n("show_add_to_favorite").N0(false);
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ax.G0.h z0 = z0();
        if (z0 instanceof ax.a3.M) {
            ((ax.a3.M) z0).S();
        }
    }
}
