/*
 * Decompiled with CFR 0.152.
 */
package ax.d4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import ax.J3.c;
import ax.J3.j;
import ax.d4.m;
import java.util.HashSet;

public class o
extends Fragment {
    private final ax.d4.a d0;
    private final m e0 = new a(this);
    private final HashSet<o> f0 = new HashSet();
    private o g0;
    private j h0;
    private Fragment i0;

    public o() {
        this(new ax.d4.a());
    }

    @SuppressLint(value={"ValidFragment"})
    public o(ax.d4.a a8) {
        this.d0 = a8;
    }

    private void K2(o o8) {
        this.f0.add(o8);
    }

    private Fragment M2() {
        Fragment fragment = this.z0();
        if (fragment != null) {
            return fragment;
        }
        return this.i0;
    }

    private void P2(f c8) {
        this.T2();
        c8 = c.c((Context)c8).k().h(((f)c8).getSupportFragmentManager(), null);
        this.g0 = c8;
        if (c8 != this) {
            super.K2(this);
        }
    }

    private void Q2(o o8) {
        this.f0.remove(o8);
    }

    private void T2() {
        o o8 = this.g0;
        if (o8 != null) {
            o8.Q2(this);
            this.g0 = null;
        }
    }

    @Override
    public void J1() {
        super.J1();
        this.d0.d();
    }

    @Override
    public void K1() {
        super.K1();
        this.d0.e();
    }

    ax.d4.a L2() {
        return this.d0;
    }

    public j N2() {
        return this.h0;
    }

    public m O2() {
        return this.e0;
    }

    void R2(Fragment fragment) {
        this.i0 = fragment;
        if (fragment != null && fragment.f0() != null) {
            this.P2(fragment.f0());
        }
    }

    public void S2(j j8) {
        this.h0 = j8;
    }

    @Override
    public void k1(Context context) {
        super.k1(context);
        try {
            this.P2(this.f0());
            return;
        }
        catch (IllegalStateException illegalStateException) {
            if (Log.isLoggable((String)"SupportRMFragment", (int)5)) {
                Log.w((String)"SupportRMFragment", (String)"Unable to register fragment with root", (Throwable)illegalStateException);
            }
            return;
        }
    }

    @Override
    public void s1() {
        super.s1();
        this.d0.c();
        this.T2();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{parent=");
        stringBuilder.append(this.M2());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public void v1() {
        super.v1();
        this.i0 = null;
        this.T2();
    }

    private class a
    implements m {
        final o a;

        a(o o8) {
            this.a = o8;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append("{fragment=");
            stringBuilder.append(this.a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }
}

