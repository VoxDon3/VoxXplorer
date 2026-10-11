/*
 * Decompiled with CFR 0.152.
 */
package ax.Q2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Ha.b;
import ax.Ha.c;
import ax.X2.J;
import ax.X2.Q;
import ax.c3.u;
import ax.t3.k;
import ax.u3.B;
import ax.u3.o;

public class i {
    private Context a;
    private Fragment b;
    private long c;
    private int d;
    private long e;

    public i(Fragment fragment) {
        this.a = fragment.b();
        this.b = fragment;
    }

    public static boolean a(Context context) {
        if (B.K(context, o.a(context))) {
            if (J.D(context)) {
                return Q.g();
            }
            return true;
        }
        J.D(context);
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void d(Context context, Fragment fragment, int n8, String[] stringArray, int[] nArray, a a8) {
        if (o.g(nArray)) {
            k.A(context, 1);
            if (a8 != null) {
                a8.b();
            }
            this.f("storage_permission");
            return;
        }
        n8 = k.g(context);
        if (o.k(fragment)) {
            k.A(context, 2);
            if (a8 == null) return;
            a8.c();
            return;
        }
        if (n8 == 2) {
            k.A(context, 3);
            if (a8 == null) return;
            a8.a(false);
            return;
        }
        if (n8 == 3) {
            if (a8 == null) return;
            a8.a(true);
            return;
        }
        if (System.currentTimeMillis() - this.c < 250L) {
            this.d = n8 = this.d + 1;
            if (n8 >= 2) {
                if (a8 == null) return;
                a8.a(true);
                return;
            }
        }
        if (a8 == null) return;
        a8.c();
    }

    private void e(Context context, Fragment fragment, int n8, String[] stringArray, int[] nArray, a a8) {
        if (o.g(nArray)) {
            k.E(context, 1);
            if (a8 != null) {
                a8.b();
                return;
            }
        } else {
            n8 = k.n(context);
            if (System.currentTimeMillis() - this.e < 250L) {
                k.E(context, 3);
                if (a8 != null) {
                    a8.a(true);
                    return;
                }
            } else if (o.l(fragment)) {
                k.E(context, 2);
                if (a8 != null) {
                    a8.c();
                    return;
                }
            } else if (n8 == 2) {
                k.E(context, 3);
                if (a8 != null) {
                    a8.a(false);
                    return;
                }
            } else if (n8 == 3) {
                if (a8 != null) {
                    a8.a(true);
                    return;
                }
            } else if (a8 != null) {
                a8.c();
            }
        }
    }

    private void f(String string) {
        ax.Q2.a.i().p("storage_permission_granted").b("from", string).c();
    }

    public void b(Context context, int n8, int n9, Intent intent, a a8, a a9) {
        if (n8 == 14013) {
            if (o.h(this.a)) {
                k.A(context, 1);
                a8.b();
                this.f("app_details");
                return;
            }
            a8.c();
            return;
        }
        if (n8 == 14012) {
            if (o.c()) {
                a9.b();
                this.f("all_files_access");
                return;
            }
            a9.c();
        }
    }

    public void c(int n8, String[] stringArray, int[] nArray, a a8, a a9) {
        if (n8 == 14011) {
            this.d(this.a, this.b, n8, stringArray, nArray, a8);
            return;
        }
        if (n8 == 14030 && Q.e0()) {
            this.e(this.a, this.b, n8, stringArray, nArray, a9);
        }
    }

    public void g() {
        b b8;
        b b9;
        b b10;
        block7: {
            b b11;
            block6: {
                b10 = null;
                b9 = b11 = null;
                b8 = b10;
                if (!i.a(this.a)) break block6;
                b9 = b11;
                b8 = b10;
                b10 = o.a(this.a);
                break block7;
            }
            b9 = b11;
            b8 = b10;
            b10 = u.d(this.a.getPackageName());
        }
        b9 = b10;
        b8 = b10;
        try {
            u.r0(this.b, (Intent)b10, 14012);
            return;
        }
        catch (NullPointerException | SecurityException runtimeException) {
            b8 = ax.Ha.c.h().f().b("all files access security error");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("intent:");
            stringBuilder.append(b9);
            b8.g(stringBuilder.toString()).h();
            Toast.makeText((Context)this.b.f0(), (int)2131951927, (int)1).show();
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            b9 = ax.Ha.c.h().f().b("no all files access activity");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("intent:");
            stringBuilder.append(b8);
            b9.g(stringBuilder.toString()).h();
            Toast.makeText((Context)this.b.f0(), (int)2131951927, (int)1).show();
        }
    }

    public void h() {
        o.m(this.b, 14013);
    }

    public void i() {
        this.c = System.currentTimeMillis();
        o.p(this.b, 14011);
    }

    public void j() {
        this.e = System.currentTimeMillis();
        o.q(this.b, 14030);
    }

    public static interface a {
        public void a(boolean var1);

        public void b();

        public void c();
    }
}

