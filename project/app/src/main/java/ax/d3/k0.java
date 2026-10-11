/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import androidx.preference.d;
import ax.Q2.f;
import ax.a3.M;
import ax.g3.c;
import ax.n.y;
import ax.u3.b;
import ax.u3.z;

public class k0
extends d
implements SharedPreferences.OnSharedPreferenceChangeListener {
    @Override
    public void D1() {
        super.D1();
        this.P2().L().unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
    }

    @Override
    public void H1() {
        super.H1();
        this.P2().L().registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        bundle = this.R0();
        if (bundle instanceof LinearLayout) {
            view = LayoutInflater.from((Context)this.b());
            view = z.w(this.b()) ? (ViewGroup)view.inflate(2131558708, (ViewGroup)((LinearLayout)bundle), false) : (ViewGroup)view.inflate(2131558709, (ViewGroup)((LinearLayout)bundle), false);
            Toolbar toolbar = (Toolbar)view.findViewById(2131362981);
            toolbar.setTitle(2131952303);
            toolbar.setNavigationIcon(2131231111);
            toolbar.setNavigationContentDescription(2131951765);
            toolbar.setNavigationOnClickListener(new c(this){
                final k0 c;
                {
                    this.c = k02;
                }

                @Override
                public void a(View object) {
                    object = this.c.z0();
                    if (object instanceof y) {
                        ((y)object).O2();
                    }
                }
            });
            ((LinearLayout)bundle).addView(view, 0);
            return;
        }
        b.f();
    }

    @Override
    public void T2(Bundle bundle, String string) {
        this.K2(2132148240);
        if (!f.l((f)((Object)this.j0().getSerializable("location")))) {
            ((Preference)this.n("settings_recycle_bin")).N0(false);
            ((Preference)this.n("use_recycle_bin")).N0(false);
            ((Preference)this.n("recycle_bin_confirmation_2")).N0(false);
        }
        ((Preference)this.n("show_add_to_favorite")).N0(false);
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    public void onSharedPreferenceChanged(SharedPreferences object, String string) {
        object = this.z0();
        if (object instanceof M) {
            ((M)object).S();
        }
    }
}

