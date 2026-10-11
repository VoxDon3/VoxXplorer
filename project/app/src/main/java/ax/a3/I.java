/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ax.n.x;
import ax.n.y;

public abstract class I
extends y {
    @Override
    public final Dialog T2(Bundle bundle) {
        if (bundle != null) {
            return this.d3();
        }
        if (!this.R2()) {
            return this.d3();
        }
        return this.g3();
    }

    protected Dialog d3() {
        this.Z2(false);
        this.O2();
        return new x(this.b(), this.S2());
    }

    public void e3() {
    }

    public void f3() {
    }

    public abstract Dialog g3();

    @Override
    public final void h1(Bundle bundle) {
        super.h1(bundle);
        if (bundle != null) {
            return;
        }
        this.e3();
    }

    public View h3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public final void n1(Bundle bundle) {
        try {
            super.n1(null);
        }
        catch (IllegalStateException illegalStateException) {
            // empty catch block
        }
        if (bundle != null) {
            this.Z2(false);
            this.N2();
        } else {
            this.f3();
        }
    }

    @Override
    public final View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            return null;
        }
        return this.h3(layoutInflater, viewGroup);
    }
}

