/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ax.Ha.c;
import ax.Q2.f;
import ax.a3.I;
import ax.a3.M;
import ax.d3.J;
import ax.d3.T;
import ax.d3.k0;
import ax.d3.n;
import ax.u3.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.a;
import java.io.Serializable;

public class d
extends I
implements M {
    int t0;

    public static d i3(n n8, String string, boolean bl) {
        d d8 = new d();
        Bundle bundle = new Bundle();
        bundle.putInt("DIALOG_TYPE", 2);
        bundle.putSerializable("location", (Serializable)((Object)n8.z3()));
        bundle.putInt("locationKey", n8.x3());
        bundle.putString("folderPath", string);
        bundle.putBoolean("show_analysis", bl);
        d8.v2(bundle);
        return d8;
    }

    @Override
    public void S() {
        int n8 = this.t0;
        if (n8 == 1) {
            J.d(this, "selection_settings_request", "result_pref_changed", true);
            return;
        }
        if (n8 == 2) {
            J.d(this, "view_settings_request", "result_pref_changed", true);
            this.O2();
        }
    }

    @Override
    public void e3() {
        androidx.preference.d d8;
        int n8 = this.t0;
        if (n8 == 1) {
            d8 = new k0();
            Bundle bundle = new Bundle();
            bundle.putSerializable("location", (Serializable)((Object)((f)((Object)this.j0().getSerializable("location")))));
            bundle.putInt("locationKey", this.j0().getInt("locationKey"));
            d8.v2(bundle);
        } else if (n8 == 2) {
            d8 = new T();
            Bundle bundle = new Bundle();
            bundle.putSerializable("location", (Serializable)((Object)((f)((Object)this.j0().getSerializable("location")))));
            bundle.putInt("locationKey", this.j0().getInt("locationKey"));
            bundle.putString("folderPath", this.j0().getString("folderPath"));
            bundle.putBoolean("show_analysis", this.j0().getBoolean("show_analysis"));
            d8.v2(bundle);
        } else {
            d8 = null;
        }
        this.k0().o().b(2131362057, d8).i();
    }

    @Override
    public void f3() {
        super.f3();
        this.t0 = this.j0().getInt("DIALOG_TYPE");
    }

    @Override
    public Dialog g3() {
        a a8 = new a(this.b(), this.S2());
        a8.setOnShowListener(new DialogInterface.OnShowListener(){
            final a a;
            final d b;
            {
                this.b = d8;
                this.a = a8;
            }

            public void onShow(DialogInterface object) {
                block5: {
                    object = this.a.findViewById(2131362110);
                    if (object == null) break block5;
                    try {
                        BottomSheetBehavior.q0(object).Z0(3);
                        object.requestFocus();
                        return;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        b.e("cannot expand bottom sheet");
                        if (this.b.R0() != null && this.b.R0().getParent() != null) {
                            View view = (View)this.b.R0().getParent();
                            object = new StringBuilder();
                            ((StringBuilder)object).append(view.getId());
                            ((StringBuilder)object).append(",");
                            ((StringBuilder)object).append(view.getClass().getSimpleName());
                            object = ((StringBuilder)object).toString();
                        } else {
                            object = "";
                        }
                        c.h().b("BottomSheetBehavior expand").l(illegalArgumentException).g(object).h();
                    }
                }
            }
        });
        return a8;
    }

    @Override
    public View h3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(2131558557, viewGroup, false);
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override
    public void s1() {
        super.s1();
        int n8 = this.t0;
        if (n8 == 1) {
            J.b(this, "selection_settings_request");
            return;
        }
        if (n8 == 2) {
            J.b(this, "view_settings_request");
        }
    }
}

