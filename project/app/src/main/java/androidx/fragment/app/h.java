/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j;
import ax.b0.g;

public class h {
    private final j<?> a;

    private h(j<?> j8) {
        this.a = j8;
    }

    public static h b(j<?> j8) {
        return new h(g.h(j8, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        j<?> j8 = this.a;
        j8.e.m(j8, j8, fragment);
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

    public View n(View view, String string, Context context, AttributeSet attributeSet) {
        return this.a.e.x0().onCreateView(view, string, context, attributeSet);
    }
}

