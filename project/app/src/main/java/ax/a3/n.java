/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import ax.a3.I;
import ax.a3.t;
import ax.u3.h;

public class n
extends I {
    int t0;
    int u0;
    int v0;
    int w0;
    boolean x0;
    boolean y0;
    c z0;

    private Dialog j3(Context object) {
        object = h.a((Context)object);
        int n8 = this.t0;
        if (n8 != 0) {
            ((a.a)object).p(n8);
        }
        ((a.a)object).e(this.u0);
        ((a.a)object).setPositiveButton(this.v0, new t(this){
            final n b;
            {
                this.b = n8;
            }

            @Override
            public void a(DialogInterface object, int n8) {
                object = this.b.m3();
                if (object != null) {
                    object.P(this.b);
                }
            }
        });
        n8 = this.w0;
        if (n8 != 0) {
            ((a.a)object).setNegativeButton(n8, new t(this){
                final n b;
                {
                    this.b = n8;
                }

                @Override
                public void a(DialogInterface object, int n8) {
                    object = this.b.m3();
                    if (object != null) {
                        object.Z(this.b);
                    }
                }
            });
        }
        object = ((a.a)object).create();
        object.setCanceledOnTouchOutside(this.x0);
        object.setCancelable(this.y0);
        this.Y2(this.y0);
        return object;
    }

    public static n k3(int n8, int n9, int n10, int n11) {
        return n.l3(n8, n9, n10, n11, true, true);
    }

    public static n l3(int n8, int n9, int n10, int n11, boolean bl, boolean bl2) {
        Bundle bundle = new Bundle();
        bundle.putInt("TITLE", n8);
        bundle.putInt("MESSAGE", n9);
        bundle.putInt("POSITIVE", n10);
        bundle.putInt("NEGATIVE", n11);
        bundle.putBoolean("CANCELED_ON_TOUCHOUTSIDE", bl);
        bundle.putBoolean("CANCELABLE", bl2);
        n n12 = new n();
        n12.v2(bundle);
        return n12;
    }

    private c m3() {
        c c8 = this.z0;
        if (c8 != null) {
            return c8;
        }
        if (this.P0() instanceof c) {
            return (c)((Object)this.P0());
        }
        if (this.f0() instanceof c) {
            return (c)((Object)this.f0());
        }
        return null;
    }

    @Override
    public Dialog g3() {
        return this.j3((Context)this.f0());
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        this.t0 = this.j0().getInt("TITLE");
        this.u0 = this.j0().getInt("MESSAGE");
        this.v0 = this.j0().getInt("POSITIVE");
        this.w0 = this.j0().getInt("NEGATIVE");
        this.x0 = this.j0().getBoolean("CANCELED_ON_TOUCHOUTSIDE", true);
        this.y0 = this.j0().getBoolean("CANCELABLE", true);
    }

    public void n3(c c8) {
        this.z0 = c8;
    }

    @Override
    public void onCancel(DialogInterface object) {
        object = this.m3();
        if (object != null) {
            object.G(this);
        }
    }

    public static interface c {
        public void G(n var1);

        public void P(n var1);

        public void Z(n var1);
    }
}

