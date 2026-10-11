/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Q2.a;
import ax.Q2.g;
import ax.Z2.c;
import ax.a3.Q;
import ax.c3.d0;
import ax.c3.k;
import ax.c3.u;
import ax.c3.w;
import ax.u3.b;
import java.util.logging.Logger;

public class M
extends Fragment
implements Q.f {
    private static final Logger l0 = g.a(M.class);
    String d0;
    boolean e0;
    c.a f0;
    k g0;
    String h0;
    boolean i0;
    boolean j0;
    k k0;

    public static M K2(String string) {
        M m8 = new M();
        Bundle bundle = new Bundle();
        bundle.putString("LOCATION", string);
        m8.v2(bundle);
        return m8;
    }

    private void L2() {
        k k8 = this.g0;
        if (k8 != null) {
            this.M2(this.f0, k8, this.h0, this.i0, this.j0);
            this.g0 = null;
            this.h0 = null;
            return;
        }
    }

    private void N2(Intent object, int n8, String string) {
        String string2;
        block0: {
            block3: {
                block2: {
                    block1: {
                        string2 = w.n(this, object, n8, false) ? "success" : "failure";
                        if (string != null) break block0;
                        if (object.getData() == null) break block1;
                        string = ax.c3.d0.j(ax.c3.d0.h(object.getData().getPath()));
                        break block0;
                    }
                    if (!"com.filemanager.plugin.action.LAUNCH_FILE_URI".equals(object.getAction()) || !object.hasExtra("com.filemanager.plugin.extra.DATA")) break block2;
                    if ((object = object.getStringExtra("com.filemanager.plugin.extra.DATA")) == null) break block3;
                    string = ax.c3.d0.j(ax.c3.d0.h(Uri.parse((String)object).getPath()));
                    break block0;
                }
                b.g("What case is this?");
            }
            string = "";
        }
        a.i().m("command", "file_open").c("loc", this.d0).c("ext", string).c("result", string2).e();
    }

    @Override
    public void J1() {
        super.J1();
        this.L2();
    }

    @Override
    public void L() {
        this.k0 = null;
        if (this.f0() != null && this.e0) {
            this.f0().finish();
        }
    }

    public void M2(c.a a8, k k8, String string, boolean bl, boolean bl2) {
        Uri uri = Q.E3(k8);
        this.k0 = k8;
        Q.R3(this, a8, uri, string, string, bl, bl2);
    }

    public void O2(c.a a8, k k8, String string, boolean bl, boolean bl2) {
        this.f0 = a8;
        this.g0 = k8;
        this.h0 = string;
        this.i0 = bl;
        this.j0 = bl2;
    }

    public void P2(boolean bl) {
        this.e0 = bl;
    }

    @Override
    public void W(int n8, Intent intent) {
        k k8 = this.k0;
        this.k0 = null;
        if (this.f0() != null) {
            if (intent != null) {
                if (u.S(intent)) {
                    if (k8 != null) {
                        w.b(intent.getData(), k8);
                        this.N2(w.d((Context)this.f0(), k8, false), n8, k8.A());
                    }
                } else if (u.T(intent)) {
                    if (k8 != null) {
                        w.b(intent.getData(), k8);
                        u.d0((Context)this.f0(), Uri.parse((String)k8.Q()));
                    }
                } else {
                    this.N2(intent, n8, null);
                }
            }
            if (this.e0) {
                this.f0().finish();
            }
        }
    }

    @Override
    public void f() {
        this.k0 = null;
        if (this.f0() != null) {
            Toast.makeText((Context)this.f0(), (int)2131952448, (int)1).show();
            if (this.e0) {
                this.f0().finish();
            }
        }
    }

    @Override
    public void k1(Context context) {
        super.k1(context);
        this.d0 = this.j0().getString("LOCATION");
    }
}

