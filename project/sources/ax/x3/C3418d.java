package ax.x3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import ax.n.ActivityC2561c;
import ax.s.C3036c;
import ax.u.w;
import ax.u3.C3180B;
import ax.u3.C3184b;
import com.voxdon.xplorer.R;

/* renamed from: ax.x3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3418d {
    public static int n = 24;
    private Context a;
    private View b;
    private View c;
    private LinearLayout d;
    private LayoutInflater e;
    private float g;
    private ax.u.w h;
    private h i;
    private g j;
    private f k;
    private int f = -1;
    private View.OnClickListener l = new a(400);
    View.OnLongClickListener m = new b();

    /* renamed from: ax.x3.d$a */
    class a extends ax.g3.c {
        a(long j) {
            super(j);
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (view.getId() == R.id.bottom_menu_more) {
                C3418d.this.z();
            } else if (C3418d.this.k != null) {
                C3418d.this.k.a(view.getId());
            }
        }
    }

    /* renamed from: ax.x3.d$b */
    class b implements View.OnLongClickListener {
        b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            Toast makeText = Toast.makeText(C3418d.this.b.getContext(), ((TextView) view.findViewById(R.id.text)).getText(), 0);
            makeText.setGravity(83, view.getLeft(), view.getBottom() + C3180B.e(C3418d.this.b.getContext(), 20));
            makeText.show();
            return true;
        }
    }

    /* renamed from: ax.x3.d$c */
    class c implements View.OnLongClickListener {
        c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C3418d.this.z();
            return true;
        }
    }

    /* renamed from: ax.x3.d$d, reason: collision with other inner class name */
    class C0493d implements w.d {
        C0493d() {
        }

        @Override // ax.u.w.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            C3418d.this.f();
            if (C3418d.this.k != null) {
                return C3418d.this.k.a(menuItem.getItemId());
            }
            return false;
        }
    }

    /* renamed from: ax.x3.d$e */
    class e implements w.c {
        e() {
        }

        @Override // ax.u.w.c
        public void a(ax.u.w wVar) {
            if (C3418d.this.j != null) {
                C3418d.this.j.b(false);
            }
        }
    }

    /* renamed from: ax.x3.d$f */
    public interface f {
        boolean a(int i);
    }

    /* renamed from: ax.x3.d$g */
    public interface g {
        void a();

        void b(boolean z);
    }

    /* renamed from: ax.x3.d$h */
    public interface h {
        void a(int i);
    }

    public C3418d(ActivityC2561c activityC2561c, View view, View view2) {
        this.a = activityC2561c;
        this.b = view;
        this.c = view2;
        this.d = (LinearLayout) view.findViewById(R.id.bottom_menu_container);
        Context m = activityC2561c.getSupportActionBar().m();
        this.e = LayoutInflater.from(m);
        this.g = ax.u3.z.i(m, android.R.attr.disabledAlpha, 0.3f);
    }

    public void A() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.b.getContext(), R.anim.scale_up);
        this.d.setAnimation(loadAnimation);
        loadAnimation.start();
    }

    public void B() {
        ax.u.w wVar = this.h;
        if (wVar != null) {
            if (wVar.b().hasVisibleItems()) {
                w(true);
            } else {
                w(false);
            }
        }
    }

    public View d(int i, int i2, int i3, View.OnClickListener onClickListener) {
        View inflate = this.e.inflate(R.layout.item_bottom_menu, (ViewGroup) this.d, false);
        inflate.setId(i);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        textView.setText(i2);
        textView.setTextColor(this.f);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        imageView.setImageResource(i3);
        ax.h0.e.c(imageView, ColorStateList.valueOf(this.f));
        this.d.addView(inflate);
        inflate.setOnClickListener(onClickListener);
        inflate.setOnLongClickListener(this.m);
        return inflate;
    }

    public View e() {
        View d = d(R.id.bottom_menu_more, R.string.menu_more, R.drawable.ic_more_vert, this.l);
        d.setOnLongClickListener(new c());
        ax.u.w wVar = new ax.u.w(new C3036c(this.a, R.style.Bottom_Widget_PopupTheme), d);
        this.h = wVar;
        wVar.f(new C0493d());
        this.h.e(new e());
        Menu b2 = this.h.b();
        if (b2 instanceof androidx.appcompat.view.menu.e) {
            ((androidx.appcompat.view.menu.e) b2).b0(true);
        }
        return d;
    }

    public void f() {
        ax.u.w wVar = this.h;
        if (wVar != null) {
            wVar.a();
        }
    }

    public View g(int i) {
        return this.d.getChildAt(i);
    }

    public View.OnLongClickListener h() {
        return this.m;
    }

    public int i() {
        View j = j();
        if (j != null) {
            return j.getId();
        }
        return -1;
    }

    public View j() {
        return g(0);
    }

    public int k() {
        return this.b.getVisibility();
    }

    public void l(int i) {
        this.h.b().clear();
        this.h.d(i);
    }

    public boolean m() {
        return this.b.getVisibility() == 0;
    }

    public void n(f fVar) {
        this.k = fVar;
    }

    public void o(int i, boolean z) {
        boolean z2;
        MenuItem findItem;
        View findViewById = this.b.findViewById(i);
        boolean z3 = true;
        if (findViewById != null) {
            if (z) {
                findViewById.setAlpha(1.0f);
            } else {
                findViewById.setAlpha(this.g);
            }
            findViewById.setEnabled(z);
            z2 = true;
        } else {
            z2 = false;
        }
        ax.u.w wVar = this.h;
        if (wVar == null || (findItem = wVar.b().findItem(i)) == null) {
            z3 = z2;
        } else {
            findItem.setEnabled(z);
        }
        if (z3) {
            return;
        }
        C3184b.g("MenuItem not found");
    }

    public void p(int i, int i2) {
        boolean z;
        MenuItem findItem;
        View findViewById = this.d.findViewById(i);
        boolean z2 = true;
        if (findViewById != null) {
            ((ImageView) findViewById.findViewById(R.id.icon)).setImageResource(i2);
            z = true;
        } else {
            z = false;
        }
        ax.u.w wVar = this.h;
        if (wVar == null || (findItem = wVar.b().findItem(i)) == null) {
            z2 = z;
        } else {
            findItem.setIcon(i2);
        }
        if (z2) {
            return;
        }
        C3184b.g("MenuItem not found");
    }

    public void q(int i, Drawable drawable) {
        boolean z;
        MenuItem findItem;
        View findViewById = this.d.findViewById(i);
        boolean z2 = true;
        if (findViewById != null) {
            ((ImageView) findViewById.findViewById(R.id.icon)).setImageDrawable(drawable);
            z = true;
        } else {
            z = false;
        }
        ax.u.w wVar = this.h;
        if (wVar == null || (findItem = wVar.b().findItem(i)) == null) {
            z2 = z;
        } else {
            findItem.setIcon(drawable);
        }
        if (z2) {
            return;
        }
        C3184b.g("MenuItem not found");
    }

    public void r(int i, int i2) {
        boolean z;
        MenuItem findItem;
        View findViewById = this.b.findViewById(i);
        boolean z2 = true;
        if (findViewById != null) {
            ((TextView) findViewById.findViewById(R.id.text)).setText(i2);
            z = true;
        } else {
            z = false;
        }
        ax.u.w wVar = this.h;
        if (wVar == null || (findItem = wVar.b().findItem(i)) == null) {
            z2 = z;
        } else {
            findItem.setTitle(i2);
        }
        if (z2) {
            return;
        }
        C3184b.g("MenuItem not found");
    }

    public void s(int i, CharSequence charSequence) {
        boolean z;
        MenuItem findItem;
        View findViewById = this.b.findViewById(i);
        boolean z2 = true;
        if (findViewById != null) {
            ((TextView) findViewById.findViewById(R.id.text)).setText(charSequence);
            z = true;
        } else {
            z = false;
        }
        ax.u.w wVar = this.h;
        if (wVar == null || (findItem = wVar.b().findItem(i)) == null) {
            z2 = z;
        } else {
            findItem.setTitle(charSequence);
        }
        if (z2) {
            return;
        }
        C3184b.g("MenuItem not found");
    }

    public void t(int i, boolean z) {
        MenuItem findItem;
        View findViewById = this.d.findViewById(i);
        boolean z2 = true;
        boolean z3 = false;
        if (findViewById != null) {
            if (z) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
            z3 = true;
        }
        ax.u.w wVar = this.h;
        if (wVar == null || (findItem = wVar.b().findItem(i)) == null) {
            z2 = z3;
        } else {
            findItem.setVisible(z);
        }
        if (z2) {
            return;
        }
        C3184b.g("MenuItem not found");
    }

    public void u(int i, View.OnClickListener onClickListener) {
        this.b.findViewById(i).setOnClickListener(onClickListener);
    }

    public void v(h hVar) {
        this.i = hVar;
    }

    public void w(boolean z) {
        o(R.id.bottom_menu_more, z);
    }

    public void x(g gVar) {
        this.j = gVar;
    }

    public void y(int i) {
        int visibility = this.b.getVisibility();
        this.b.setVisibility(i);
        View view = this.c;
        if (view != null) {
            view.setVisibility(i);
        }
        h hVar = this.i;
        if (hVar == null || visibility == i) {
            return;
        }
        hVar.a(i);
    }

    public void z() {
        try {
            ax.u.w wVar = this.h;
            if (wVar != null) {
                wVar.a();
                this.h.g();
                g gVar = this.j;
                if (gVar != null) {
                    gVar.a();
                    this.j.b(true);
                }
            }
        } catch (WindowManager.BadTokenException unused) {
            ax.Ha.c.h().d("BADTOKEN").g("activestate:").h();
        }
    }
}
