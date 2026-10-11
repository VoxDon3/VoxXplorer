/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
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
import ax.h0.e;
import ax.s.c;
import ax.u.w;
import ax.u3.B;
import ax.u3.b;
import ax.u3.z;

public class d {
    public static int n = 24;
    private Context a;
    private View b;
    private View c;
    private LinearLayout d;
    private LayoutInflater e;
    private int f = -1;
    private float g;
    private w h;
    private h i;
    private g j;
    private f k;
    private View.OnClickListener l = new ax.g3.c(this, 400L){
        final d c;
        {
            this.c = d8;
            super(l8);
        }

        @Override
        public void a(View view) {
            if (view.getId() == 2131361935) {
                this.c.z();
                return;
            }
            if (this.c.k != null) {
                this.c.k.a(view.getId());
            }
        }
    };
    View.OnLongClickListener m = new View.OnLongClickListener(this){
        final d a;
        {
            this.a = d8;
        }

        public boolean onLongClick(View view) {
            TextView textView = (TextView)view.findViewById(2131362944);
            textView = Toast.makeText((Context)this.a.b.getContext(), (CharSequence)textView.getText(), (int)0);
            textView.setGravity(83, view.getLeft(), view.getBottom() + B.e(this.a.b.getContext(), 20));
            textView.show();
            return true;
        }
    };

    public d(ax.n.c c8, View view, View view2) {
        this.a = c8;
        this.b = view;
        this.c = view2;
        this.d = (LinearLayout)view.findViewById(2131361927);
        c8 = c8.getSupportActionBar().m();
        this.e = LayoutInflater.from((Context)c8);
        this.g = z.i((Context)c8, 0x1010033, 0.3f);
    }

    public void A() {
        Animation animation = AnimationUtils.loadAnimation((Context)this.b.getContext(), (int)2130772016);
        this.d.setAnimation(animation);
        animation.start();
    }

    public void B() {
        w w8 = this.h;
        if (w8 != null) {
            if (w8.b().hasVisibleItems()) {
                this.w(true);
                return;
            }
            this.w(false);
        }
    }

    public View d(int n8, int n9, int n10, View.OnClickListener onClickListener) {
        View view = this.e.inflate(2131558568, (ViewGroup)this.d, false);
        view.setId(n8);
        TextView textView = (TextView)view.findViewById(2131362944);
        textView.setText(n9);
        textView.setTextColor(this.f);
        textView = (ImageView)view.findViewById(2131362383);
        textView.setImageResource(n10);
        ax.h0.e.c((ImageView)textView, ColorStateList.valueOf((int)this.f));
        this.d.addView(view);
        view.setOnClickListener(onClickListener);
        view.setOnLongClickListener(this.m);
        return view;
    }

    public View e() {
        w w8;
        View view = this.d(2131361935, 2131952273, 2131231170, this.l);
        view.setOnLongClickListener(new View.OnLongClickListener(this){
            final d a;
            {
                this.a = d8;
            }

            public boolean onLongClick(View view) {
                this.a.z();
                return true;
            }
        });
        this.h = w8 = new w((Context)new c(this.a, 2132017450), view);
        w8.f(new w.d(this){
            final d a;
            {
                this.a = d8;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                this.a.f();
                if (this.a.k != null) {
                    return this.a.k.a(menuItem.getItemId());
                }
                return false;
            }
        });
        this.h.e(new w.c(this){
            final d a;
            {
                this.a = d8;
            }

            @Override
            public void a(w w8) {
                if (this.a.j != null) {
                    this.a.j.b(false);
                }
            }
        });
        w8 = this.h.b();
        if (w8 instanceof androidx.appcompat.view.menu.e) {
            ((androidx.appcompat.view.menu.e)((Object)w8)).b0(true);
        }
        return view;
    }

    public void f() {
        w w8 = this.h;
        if (w8 != null) {
            w8.a();
        }
    }

    public View g(int n8) {
        return this.d.getChildAt(n8);
    }

    public View.OnLongClickListener h() {
        return this.m;
    }

    public int i() {
        View view = this.j();
        if (view != null) {
            return view.getId();
        }
        return -1;
    }

    public View j() {
        return this.g(0);
    }

    public int k() {
        return this.b.getVisibility();
    }

    public void l(int n8) {
        this.h.b().clear();
        this.h.d(n8);
    }

    public boolean m() {
        return this.b.getVisibility() == 0;
    }

    public void n(f f8) {
        this.k = f8;
    }

    public void o(int n8, boolean bl) {
        boolean bl2;
        Object object = this.b.findViewById(n8);
        boolean bl3 = true;
        if (object != null) {
            if (bl) {
                object.setAlpha(1.0f);
            } else {
                object.setAlpha(this.g);
            }
            object.setEnabled(bl);
            bl2 = true;
        } else {
            bl2 = false;
        }
        object = this.h;
        if (object != null && (object = ((w)object).b().findItem(n8)) != null) {
            object.setEnabled(bl);
            bl2 = bl3;
        }
        if (!bl2) {
            ax.u3.b.g("MenuItem not found");
        }
    }

    public void p(int n8, int n9) {
        int n10;
        Object object = this.d.findViewById(n8);
        int n11 = 1;
        if (object != null) {
            ((ImageView)object.findViewById(2131362383)).setImageResource(n9);
            n10 = 1;
        } else {
            n10 = 0;
        }
        object = this.h;
        if (object != null && (object = ((w)object).b().findItem(n8)) != null) {
            object.setIcon(n9);
            n8 = n11;
        } else {
            n8 = n10;
        }
        if (n8 == 0) {
            ax.u3.b.g("MenuItem not found");
        }
    }

    public void q(int n8, Drawable drawable) {
        int n9;
        Object object = this.d.findViewById(n8);
        int n10 = 1;
        if (object != null) {
            ((ImageView)object.findViewById(2131362383)).setImageDrawable(drawable);
            n9 = 1;
        } else {
            n9 = 0;
        }
        object = this.h;
        if (object != null && (object = ((w)object).b().findItem(n8)) != null) {
            object.setIcon(drawable);
            n8 = n10;
        } else {
            n8 = n9;
        }
        if (n8 == 0) {
            ax.u3.b.g("MenuItem not found");
        }
    }

    public void r(int n8, int n9) {
        boolean bl;
        Object object = this.b.findViewById(n8);
        boolean bl2 = true;
        if (object != null) {
            ((TextView)object.findViewById(2131362944)).setText(n9);
            bl = true;
        } else {
            bl = false;
        }
        object = this.h;
        if (object != null && (object = ((w)object).b().findItem(n8)) != null) {
            object.setTitle(n9);
            bl = bl2;
        }
        if (!bl) {
            ax.u3.b.g("MenuItem not found");
        }
    }

    public void s(int n8, CharSequence charSequence) {
        int n9;
        Object object = this.b.findViewById(n8);
        int n10 = 1;
        if (object != null) {
            ((TextView)object.findViewById(2131362944)).setText(charSequence);
            n9 = 1;
        } else {
            n9 = 0;
        }
        object = this.h;
        if (object != null && (object = ((w)object).b().findItem(n8)) != null) {
            object.setTitle(charSequence);
            n8 = n10;
        } else {
            n8 = n9;
        }
        if (n8 == 0) {
            ax.u3.b.g("MenuItem not found");
        }
    }

    public void t(int n8, boolean bl) {
        Object object = this.d.findViewById(n8);
        boolean bl2 = true;
        boolean bl3 = false;
        if (object != null) {
            if (bl) {
                object.setVisibility(0);
            } else {
                object.setVisibility(8);
            }
            bl3 = true;
        }
        if ((object = this.h) != null && (object = ((w)object).b().findItem(n8)) != null) {
            object.setVisible(bl);
            bl3 = bl2;
        }
        if (!bl3) {
            ax.u3.b.g("MenuItem not found");
        }
    }

    public void u(int n8, View.OnClickListener onClickListener) {
        this.b.findViewById(n8).setOnClickListener(onClickListener);
    }

    public void v(h h8) {
        this.i = h8;
    }

    public void w(boolean bl) {
        this.o(2131361935, bl);
    }

    public void x(g g8) {
        this.j = g8;
    }

    public void y(int n8) {
        int n9 = this.b.getVisibility();
        this.b.setVisibility(n8);
        Object object = this.c;
        if (object != null) {
            object.setVisibility(n8);
        }
        if ((object = this.i) != null && n9 != n8) {
            object.a(n8);
        }
    }

    public void z() {
        block4: {
            Object object = this.h;
            if (object == null) break block4;
            ((w)object).a();
            this.h.g();
            object = this.j;
            if (object == null) break block4;
            try {
                object.a();
                this.j.b(true);
                return;
            }
            catch (WindowManager.BadTokenException badTokenException) {
                ax.Ha.c.h().d("BADTOKEN").g("activestate:").h();
            }
        }
    }

    public static interface f {
        public boolean a(int var1);
    }

    public static interface g {
        public void a();

        public void b(boolean var1);
    }

    public static interface h {
        public void a(int var1);
    }
}

