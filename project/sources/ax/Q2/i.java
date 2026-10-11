package ax.Q2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.X2.J;
import ax.X2.Q;
import ax.c3.C1832u;
import ax.u3.C3180B;
import ax.u3.C3197o;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class i {
    private Context a;
    private Fragment b;
    private long c;
    private int d;
    private long e;

    public interface a {
        void a(boolean z);

        void b();

        void c();
    }

    public i(Fragment fragment) {
        this.a = fragment.b();
        this.b = fragment;
    }

    public static boolean a(Context context) {
        if (!C3180B.K(context, C3197o.a(context))) {
            J.D(context);
            return false;
        }
        if (J.D(context)) {
            return Q.g();
        }
        return true;
    }

    private void d(Context context, Fragment fragment, int i, String[] strArr, int[] iArr, a aVar) {
        if (C3197o.g(iArr)) {
            ax.t3.k.A(context, 1);
            if (aVar != null) {
                aVar.b();
            }
            f("storage_permission");
            return;
        }
        int g = ax.t3.k.g(context);
        if (C3197o.k(fragment)) {
            ax.t3.k.A(context, 2);
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        if (g == 2) {
            ax.t3.k.A(context, 3);
            if (aVar != null) {
                aVar.a(false);
                return;
            }
            return;
        }
        if (g == 3) {
            if (aVar != null) {
                aVar.a(true);
                return;
            }
            return;
        }
        if (System.currentTimeMillis() - this.c < 250) {
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= 2) {
                if (aVar != null) {
                    aVar.a(true);
                    return;
                }
                return;
            }
        }
        if (aVar != null) {
            aVar.c();
        }
    }

    private void e(Context context, Fragment fragment, int i, String[] strArr, int[] iArr, a aVar) {
        if (C3197o.g(iArr)) {
            ax.t3.k.E(context, 1);
            if (aVar != null) {
                aVar.b();
                return;
            }
            return;
        }
        int n = ax.t3.k.n(context);
        if (System.currentTimeMillis() - this.e < 250) {
            ax.t3.k.E(context, 3);
            if (aVar != null) {
                aVar.a(true);
                return;
            }
            return;
        }
        if (C3197o.l(fragment)) {
            ax.t3.k.E(context, 2);
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        if (n == 2) {
            ax.t3.k.E(context, 3);
            if (aVar != null) {
                aVar.a(false);
                return;
            }
            return;
        }
        if (n == 3) {
            if (aVar != null) {
                aVar.a(true);
            }
        } else if (aVar != null) {
            aVar.c();
        }
    }

    private void f(String str) {
        ax.Q2.a.i().p("storage_permission_granted").b("from", str).c();
    }

    public void b(Context context, int i, int i2, Intent intent, a aVar, a aVar2) {
        if (i == 14013) {
            if (!C3197o.h(this.a)) {
                aVar.c();
                return;
            }
            ax.t3.k.A(context, 1);
            aVar.b();
            f("app_details");
            return;
        }
        if (i == 14012) {
            if (!C3197o.c()) {
                aVar2.c();
            } else {
                aVar2.b();
                f("all_files_access");
            }
        }
    }

    public void c(int i, String[] strArr, int[] iArr, a aVar, a aVar2) {
        if (i == 14011) {
            d(this.a, this.b, i, strArr, iArr, aVar);
        } else if (i == 14030 && Q.e0()) {
            e(this.a, this.b, i, strArr, iArr, aVar2);
        }
    }

    public void g() {
        Intent intent = null;
        try {
            intent = a(this.a) ? C3197o.a(this.a) : C1832u.d(this.a.getPackageName());
            C1832u.r0(this.b, intent, 14012);
        } catch (ActivityNotFoundException unused) {
            ax.Ha.c.h().f().b("no all files access activity").g("intent:" + intent).h();
            Toast.makeText(this.b.f0(), R.string.error, 1).show();
        } catch (NullPointerException | SecurityException unused2) {
            ax.Ha.c.h().f().b("all files access security error").g("intent:" + intent).h();
            Toast.makeText(this.b.f0(), R.string.error, 1).show();
        }
    }

    public void h() {
        C3197o.m(this.b, 14013);
    }

    public void i() {
        this.c = System.currentTimeMillis();
        C3197o.p(this.b, 14011);
    }

    public void j() {
        this.e = System.currentTimeMillis();
        C3197o.q(this.b, 14030);
    }
}
