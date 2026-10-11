package ax.d3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Z2.c;
import ax.a3.Q;
import ax.c3.AbstractC1823k;
import ax.c3.C1832u;
import ax.c3.C1834w;
import ax.u3.C3184b;
import com.voxdon.xplorer.R;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class M extends Fragment implements Q.f {
    private static final Logger l0 = ax.Q2.g.a(M.class);
    String d0;
    boolean e0;
    c.a f0;
    AbstractC1823k g0;
    String h0;
    boolean i0;
    boolean j0;
    AbstractC1823k k0;

    public static M K2(String str) {
        M m = new M();
        Bundle bundle = new Bundle();
        bundle.putString("LOCATION", str);
        m.v2(bundle);
        return m;
    }

    private void L2() {
        AbstractC1823k abstractC1823k = this.g0;
        if (abstractC1823k != null) {
            M2(this.f0, abstractC1823k, this.h0, this.i0, this.j0);
            this.g0 = null;
            this.h0 = null;
        }
    }

    private void N2(Intent intent, int i, String str) {
        String str2 = C1834w.n(this, intent, i, false) ? "success" : "failure";
        if (str == null) {
            if (intent.getData() != null) {
                str = ax.c3.d0.j(ax.c3.d0.h(intent.getData().getPath()));
            } else {
                if ("com.filemanager.plugin.action.LAUNCH_FILE_URI".equals(intent.getAction()) && intent.hasExtra("com.filemanager.plugin.extra.DATA")) {
                    String stringExtra = intent.getStringExtra("com.filemanager.plugin.extra.DATA");
                    if (stringExtra != null) {
                        str = ax.c3.d0.j(ax.c3.d0.h(Uri.parse(stringExtra).getPath()));
                    }
                } else {
                    C3184b.g("What case is this?");
                }
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        ax.Q2.a.i().m("command", "file_open").c("loc", this.d0).c("ext", str).c("result", str2).e();
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        L2();
    }

    @Override // ax.a3.Q.f
    public void L() {
        this.k0 = null;
        if (f0() != null && this.e0) {
            f0().finish();
        }
    }

    public void M2(c.a aVar, AbstractC1823k abstractC1823k, String str, boolean z, boolean z2) {
        Uri E3 = ax.a3.Q.E3(abstractC1823k);
        this.k0 = abstractC1823k;
        ax.a3.Q.R3(this, aVar, E3, str, str, z, z2);
    }

    public void O2(c.a aVar, AbstractC1823k abstractC1823k, String str, boolean z, boolean z2) {
        this.f0 = aVar;
        this.g0 = abstractC1823k;
        this.h0 = str;
        this.i0 = z;
        this.j0 = z2;
    }

    public void P2(boolean z) {
        this.e0 = z;
    }

    @Override // ax.a3.Q.f
    public void W(int i, Intent intent) {
        AbstractC1823k abstractC1823k = this.k0;
        this.k0 = null;
        if (f0() == null) {
            return;
        }
        if (intent != null) {
            if (C1832u.S(intent)) {
                if (abstractC1823k != null) {
                    C1834w.b(intent.getData(), abstractC1823k);
                    N2(C1834w.d(f0(), abstractC1823k, false), i, abstractC1823k.A());
                }
            } else if (!C1832u.T(intent)) {
                N2(intent, i, null);
            } else if (abstractC1823k != null) {
                C1834w.b(intent.getData(), abstractC1823k);
                C1832u.d0(f0(), Uri.parse(abstractC1823k.Q()));
            }
        }
        if (this.e0) {
            f0().finish();
        }
    }

    @Override // ax.a3.Q.f
    public void f() {
        this.k0 = null;
        if (f0() == null) {
            return;
        }
        Toast.makeText(f0(), R.string.no_application, 1).show();
        if (this.e0) {
            f0().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void k1(Context context) {
        super.k1(context);
        this.d0 = j0().getString("LOCATION");
    }
}
