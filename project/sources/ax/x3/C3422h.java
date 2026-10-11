package ax.x3;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ax.n.AbstractC2559a;
import ax.n.ActivityC2561c;
import com.voxdon.xplorer.R;
import okhttp3.HttpUrl;

/* renamed from: ax.x3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3422h {
    public static final a r = a.DARK;
    ActivityC2561c a;
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

    /* renamed from: ax.x3.h$a */
    public enum a {
        DARK,
        LIGHT
    }

    public C3422h(ActivityC2561c activityC2561c, ViewGroup viewGroup) {
        this.a = activityC2561c;
        this.b = viewGroup;
        LayoutInflater layoutInflater = activityC2561c.getLayoutInflater();
        this.d = (Toolbar) layoutInflater.inflate(R.layout.view_toolbar_dark, viewGroup, false);
        this.e = (Toolbar) layoutInflater.inflate(R.layout.view_toolbar_light, viewGroup, false);
        this.f = (TextView) this.d.findViewById(R.id.title);
        this.g = (TextView) this.d.findViewById(R.id.subtitle);
        this.j = this.d.findViewById(R.id.toolbar_progress);
        this.l = this.d.findViewById(R.id.title_container);
        this.n = this.d.findViewById(R.id.arrow_drop_down);
        this.h = (TextView) this.e.findViewById(R.id.title);
        this.i = (TextView) this.e.findViewById(R.id.subtitle);
        this.k = this.e.findViewById(R.id.toolbar_progress);
        this.m = this.e.findViewById(R.id.title_container);
        this.o = this.e.findViewById(R.id.arrow_drop_down);
        if (r == a.DARK) {
            this.c = this.d;
        } else {
            this.c = this.e;
        }
        this.b.addView(this.c);
        j();
    }

    private void j() {
        this.a.setSupportActionBar(this.c);
        AbstractC2559a supportActionBar = this.a.getSupportActionBar();
        supportActionBar.A(0.0f);
        supportActionBar.z(false);
        supportActionBar.C(true);
        supportActionBar.x(true);
        this.a.supportInvalidateOptionsMenu();
        this.c.setBackInvokedCallbackEnabled(false);
    }

    public void a(a aVar) {
        this.b.removeView(this.c);
        if (aVar == a.DARK) {
            this.c = this.d;
        } else {
            this.c = this.e;
        }
        this.b.addView(this.c);
        j();
        c();
        View.OnClickListener onClickListener = this.q;
        if (onClickListener != null) {
            this.d.setNavigationOnClickListener(onClickListener);
            this.e.setNavigationOnClickListener(this.q);
        }
    }

    public void b() {
        this.c.getMenu().clear();
    }

    protected void c() {
        Toolbar e = e();
        Menu menu = e.getMenu();
        int o = ax.u3.z.o(e.getContext(), R.attr.colorControlNormal);
        for (int i = 0; i < menu.size(); i++) {
            Drawable icon = menu.getItem(i).getIcon();
            if (icon != null) {
                icon.mutate();
                icon.setColorFilter(o, PorterDuff.Mode.SRC_ATOP);
            }
        }
        Drawable overflowIcon = e.getOverflowIcon();
        if (overflowIcon != null) {
            overflowIcon.mutate();
            overflowIcon.setColorFilter(o, PorterDuff.Mode.SRC_ATOP);
        }
        Drawable navigationIcon = e.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.mutate();
            navigationIcon.setColorFilter(o, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public a d() {
        return this.c == this.d ? a.DARK : a.LIGHT;
    }

    public Toolbar e() {
        return this.c;
    }

    public Menu f() {
        return this.c.getMenu();
    }

    public String g() {
        CharSequence text;
        return (this.g.getVisibility() == 0 && (text = this.g.getText()) != null) ? text.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public String h() {
        CharSequence text = this.f.getText();
        return text == null ? HttpUrl.FRAGMENT_ENCODE_SET : text.toString();
    }

    public void i() {
        this.d.setNavigationIcon((Drawable) null);
        this.e.setNavigationIcon((Drawable) null);
    }

    public void k(boolean z) {
        if (z) {
            this.n.setVisibility(0);
            this.o.setVisibility(0);
        } else {
            this.n.setVisibility(8);
            this.o.setVisibility(8);
        }
    }

    public void l(boolean z) {
        if (z) {
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.toolbarInsetSize);
            this.d.J(dimensionPixelSize, 0);
            this.d.K(dimensionPixelSize, 0);
            this.e.J(dimensionPixelSize, 0);
            this.e.K(dimensionPixelSize, 0);
            return;
        }
        int dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.toolbarNoIconInsetSize);
        this.d.J(dimensionPixelSize2, 0);
        this.d.K(dimensionPixelSize2, 0);
        this.e.J(dimensionPixelSize2, 0);
        this.e.K(dimensionPixelSize2, 0);
    }

    public void m(int i) {
        this.d.setNavigationIcon(i);
        this.e.setNavigationIcon(i);
    }

    public void n(View.OnClickListener onClickListener) {
        this.q = onClickListener;
        this.d.setNavigationOnClickListener(onClickListener);
        this.e.setNavigationOnClickListener(onClickListener);
    }

    public void o(String str) {
        if (str == null) {
            this.g.setVisibility(8);
            this.i.setVisibility(8);
        } else {
            this.g.setText(str);
            this.i.setText(str);
            this.g.setVisibility(0);
            this.i.setVisibility(0);
        }
    }

    public void p(int i) {
        this.f.setText(i);
        this.h.setText(i);
    }

    public void q(String str) {
        this.f.setText(str);
        this.h.setText(str);
    }

    public void r(boolean z) {
        this.l.setEnabled(z);
        this.m.setEnabled(z);
    }

    public void s(View.OnClickListener onClickListener) {
        this.p = onClickListener;
        this.l.setOnClickListener(onClickListener);
        this.m.setOnClickListener(onClickListener);
        this.n.setOnClickListener(onClickListener);
        this.o.setOnClickListener(onClickListener);
    }

    public void t(boolean z) {
        if (z) {
            this.j.setVisibility(0);
            this.k.setVisibility(0);
        } else {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
        }
    }
}
