/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ax.n.c;
import ax.u3.z;

public class h {
    public static final a r = ax.x3.h$a.q;
    c a;
    ViewGroup b;
    Toolbar c;
    Toolbar d;
    Toolbar e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    View j;
    View k;
    View l;
    View m;
    View n;
    View o;
    View.OnClickListener p;
    View.OnClickListener q;

    public h(c c8, ViewGroup viewGroup) {
        this.a = c8;
        this.b = viewGroup;
        c8 = c8.getLayoutInflater();
        this.d = (Toolbar)c8.inflate(2131558713, viewGroup, false);
        this.e = (Toolbar)c8.inflate(2131558714, viewGroup, false);
        this.f = (TextView)this.d.findViewById(2131362963);
        this.g = (TextView)this.d.findViewById(2131362918);
        this.j = this.d.findViewById(2131362983);
        this.l = this.d.findViewById(2131362965);
        this.n = this.d.findViewById(2131361900);
        this.h = (TextView)this.e.findViewById(2131362963);
        this.i = (TextView)this.e.findViewById(2131362918);
        this.k = this.e.findViewById(2131362983);
        this.m = this.e.findViewById(2131362965);
        this.o = this.e.findViewById(2131361900);
        this.c = r == ax.x3.h$a.q ? this.d : this.e;
        this.b.addView((View)this.c);
        this.j();
    }

    private void j() {
        this.a.setSupportActionBar(this.c);
        ax.n.a a8 = this.a.getSupportActionBar();
        a8.A(0.0f);
        a8.z(false);
        a8.C(true);
        a8.x(true);
        this.a.supportInvalidateOptionsMenu();
        this.c.setBackInvokedCallbackEnabled(false);
    }

    public void a(a a8) {
        this.b.removeView((View)this.c);
        this.c = a8 == ax.x3.h$a.q ? this.d : this.e;
        this.b.addView((View)this.c);
        this.j();
        this.c();
        a8 = this.q;
        if (a8 != null) {
            this.d.setNavigationOnClickListener((View.OnClickListener)a8);
            this.e.setNavigationOnClickListener(this.q);
        }
    }

    public void b() {
        this.c.getMenu().clear();
    }

    protected void c() {
        Toolbar toolbar = this.e();
        Menu menu = toolbar.getMenu();
        int n8 = z.o(toolbar.getContext(), 2130968862);
        for (int i8 = 0; i8 < menu.size(); ++i8) {
            Drawable drawable = menu.getItem(i8).getIcon();
            if (drawable == null) continue;
            drawable.mutate();
            drawable.setColorFilter(n8, PorterDuff.Mode.SRC_ATOP);
        }
        menu = toolbar.getOverflowIcon();
        if (menu != null) {
            menu.mutate();
            menu.setColorFilter(n8, PorterDuff.Mode.SRC_ATOP);
        }
        if ((toolbar = toolbar.getNavigationIcon()) != null) {
            toolbar.mutate();
            toolbar.setColorFilter(n8, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public a d() {
        if (this.c == this.d) {
            return ax.x3.h$a.q;
        }
        return ax.x3.h$a.c0;
    }

    public Toolbar e() {
        return this.c;
    }

    public Menu f() {
        return this.c.getMenu();
    }

    public String g() {
        if (this.g.getVisibility() != 0) {
            return "";
        }
        CharSequence charSequence = this.g.getText();
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    public String h() {
        CharSequence charSequence = this.f.getText();
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    public void i() {
        this.d.setNavigationIcon(null);
        this.e.setNavigationIcon(null);
    }

    public void k(boolean bl) {
        if (bl) {
            this.n.setVisibility(0);
            this.o.setVisibility(0);
            return;
        }
        this.n.setVisibility(8);
        this.o.setVisibility(8);
    }

    public void l(boolean bl) {
        if (bl) {
            int n8 = this.a.getResources().getDimensionPixelSize(2131166341);
            this.d.J(n8, 0);
            this.d.K(n8, 0);
            this.e.J(n8, 0);
            this.e.K(n8, 0);
            return;
        }
        int n9 = this.a.getResources().getDimensionPixelSize(2131166342);
        this.d.J(n9, 0);
        this.d.K(n9, 0);
        this.e.J(n9, 0);
        this.e.K(n9, 0);
    }

    public void m(int n8) {
        this.d.setNavigationIcon(n8);
        this.e.setNavigationIcon(n8);
    }

    public void n(View.OnClickListener onClickListener) {
        this.q = onClickListener;
        this.d.setNavigationOnClickListener(onClickListener);
        this.e.setNavigationOnClickListener(onClickListener);
    }

    public void o(String string) {
        if (string != null) {
            this.g.setText((CharSequence)string);
            this.i.setText((CharSequence)string);
            this.g.setVisibility(0);
            this.i.setVisibility(0);
            return;
        }
        this.g.setVisibility(8);
        this.i.setVisibility(8);
    }

    public void p(int n8) {
        this.f.setText(n8);
        this.h.setText(n8);
    }

    public void q(String string) {
        this.f.setText((CharSequence)string);
        this.h.setText((CharSequence)string);
    }

    public void r(boolean bl) {
        this.l.setEnabled(bl);
        this.m.setEnabled(bl);
    }

    public void s(View.OnClickListener onClickListener) {
        this.p = onClickListener;
        this.l.setOnClickListener(onClickListener);
        this.m.setOnClickListener(onClickListener);
        this.n.setOnClickListener(onClickListener);
        this.o.setOnClickListener(onClickListener);
    }

    public void t(boolean bl) {
        if (bl) {
            this.j.setVisibility(0);
            this.k.setVisibility(0);
            return;
        }
        this.j.setVisibility(8);
        this.k.setVisibility(8);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        private static final a[] d0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = ax.x3.h$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])d0.clone();
        }
    }
}

