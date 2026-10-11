/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ax.Q2.f;
import ax.a3.I;
import ax.a3.M;
import ax.d3.J;
import ax.d3.k0;
import ax.d3.n;
import ax.n.x;
import java.io.Serializable;

public class T
extends I
implements M {
    public static T i3(n n8) {
        T t8 = new T();
        Bundle bundle = new Bundle();
        bundle.putSerializable("location", (Serializable)((Object)n8.z3()));
        bundle.putInt("locationKey", n8.x3());
        t8.v2(bundle);
        return t8;
    }

    @Override
    public void D1() {
        super.D1();
        this.O2();
    }

    @Override
    public void S() {
        J.d(this, "selection_settings_popup_request", "result_pref_changed", true);
    }

    @Override
    public void e3() {
        k0 k02 = new k0();
        Bundle bundle = new Bundle();
        bundle.putSerializable("location", (Serializable)((Object)((f)((Object)this.j0().getSerializable("location")))));
        bundle.putInt("locationKey", this.j0().getInt("locationKey"));
        k02.v2(bundle);
        this.k0().o().b(2131362057, k02).i();
    }

    @Override
    public Dialog g3() {
        x x8 = new x(this.b());
        x8.setCanceledOnTouchOutside(true);
        x8.setCancelable(true);
        return x8;
    }

    @Override
    public View h3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(2131558557, viewGroup, false);
    }

    @Override
    public void s1() {
        super.s1();
        J.b(this, "selection_settings_popup_request");
    }
}

