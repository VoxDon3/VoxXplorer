package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import ax.s.C3037d;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b extends a implements e.a {
    private Context c;
    private ActionBarContextView d;
    private a.InterfaceC0007a e;
    private WeakReference<View> f;
    private boolean g;
    private boolean h;
    private e i;

    public b(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0007a interfaceC0007a, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = interfaceC0007a;
        e T = new e(actionBarContextView.getContext()).T(1);
        this.i = T;
        T.S(this);
        this.h = z;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(e eVar, MenuItem menuItem) {
        return this.e.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(e eVar) {
        k();
        this.d.l();
    }

    @Override // androidx.appcompat.view.a
    public void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.a(this);
    }

    @Override // androidx.appcompat.view.a
    public View d() {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.a
    public Menu e() {
        return this.i;
    }

    @Override // androidx.appcompat.view.a
    public MenuInflater f() {
        return new C3037d(this.d.getContext());
    }

    @Override // androidx.appcompat.view.a
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // androidx.appcompat.view.a
    public CharSequence i() {
        return this.d.getTitle();
    }

    @Override // androidx.appcompat.view.a
    public void k() {
        this.e.c(this, this.i);
    }

    @Override // androidx.appcompat.view.a
    public boolean l() {
        return this.d.j();
    }

    @Override // androidx.appcompat.view.a
    public void m(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.a
    public void n(int i) {
        o(this.c.getString(i));
    }

    @Override // androidx.appcompat.view.a
    public void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.a
    public void q(int i) {
        r(this.c.getString(i));
    }

    @Override // androidx.appcompat.view.a
    public void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.a
    public void s(boolean z) {
        super.s(z);
        this.d.setTitleOptional(z);
    }
}
