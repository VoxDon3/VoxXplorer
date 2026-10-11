package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import ax.b0.C1446g;

/* loaded from: classes.dex */
public class h {
    private final j<?> a;

    private h(j<?> jVar) {
        this.a = jVar;
    }

    public static h b(j<?> jVar) {
        return new h((j) C1446g.h(jVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        j<?> jVar = this.a;
        jVar.e.m(jVar, jVar, fragment);
    }

    public void c() {
        this.a.e.z();
    }

    public boolean d(MenuItem menuItem) {
        return this.a.e.C(menuItem);
    }

    public void e() {
        this.a.e.D();
    }

    public void f() {
        this.a.e.F();
    }

    public void g() {
        this.a.e.O();
    }

    public void h() {
        this.a.e.S();
    }

    public void i() {
        this.a.e.T();
    }

    public void j() {
        this.a.e.V();
    }

    public boolean k() {
        return this.a.e.c0(true);
    }

    public FragmentManager l() {
        return this.a.e;
    }

    public void m() {
        this.a.e.V0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.e.x0().onCreateView(view, str, context, attributeSet);
    }
}
