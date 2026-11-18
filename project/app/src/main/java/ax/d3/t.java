/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import ax.Q2.f;
import ax.Z2.j;
import ax.d3.E;
import ax.u3.g;
import com.voxdon.xplorer.activity.a;
import com.voxdon.xplorer.activity.b;

@TargetApi(value=23)
public abstract class t
extends E {
    private int s2;
    BroadcastReceiver t2;

    static /* synthetic */ int ua(t t8, int n8) {
        t8.s2 = n8;
        return n8;
    }

    private void wa() {
        if (this.X0() && !this.xa()) {
            this.h3();
            ((b)this.f0()).a0(this.z3(), this.x3(), this.z3().name());
        }
    }

    private boolean xa() {
        return j.F().l0(this.A3());
    }

    private void za() {
        if (this.s2 < 5) {
            this.ya();
            return;
        }
        ((a)this.f0()).L();
        this.i3("etc");
    }

    @Override
    protected String B7() {
        return null;
    }

    @Override
    public void k1(Context context) {
        super.k1(context);
        this.t2 = new BroadcastReceiver(this){
            final t a;
            {
                this.a = t8;
            }

            public void onReceive(Context context, Intent intent) {
                this.a.wa();
            }
        };
        g.a().d("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED", this.t2);
    }

    @Override
    protected void m8(boolean bl, Object object) {
        if (bl) {
            this.h9();
            this.x9(null);
            return;
        }
        this.T9(2131951929, 0);
        this.x9(new View.OnClickListener(this){
            final t a;
            {
                this.a = t8;
            }

            public void onClick(View view) {
                t.ua(this.a, 0);
                this.a.za();
            }
        });
        this.za();
    }

    @Override
    public void v1() {
        super.v1();
        if (this.t2 != null) {
            g.a().h(this.t2);
            this.t2 = null;
        }
    }

    protected void ya() {
        if (!((a)this.f0()).M()) {
            ++this.s2;
            if (this.v3().d0() == this) {
                if (f.c0(this.z3())) {
                    if (j.F().Z(this.A3()) != null && !com.voxdon.xplorer.file.g.C(this.o3(), this.A3(), null)) {
                        this.n9(this.A3(), false);
                        return;
                    }
                } else if (f.h1 == this.z3() && !com.voxdon.xplorer.file.g.C(this.o3(), this.A3(), null)) {
                    this.n9(this.A3(), false);
                }
            }
        }
    }
}

