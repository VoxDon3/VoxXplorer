/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ax.Ha.c;
import ax.Q.b;
import ax.Q2.a;
import ax.Q2.f;
import ax.X2.P;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.k0;
import ax.t3.k;
import com.alphainventor.filemanager.file.Q;
import com.alphainventor.filemanager.widget.PieProgress;
import java.io.File;

public class PathBar
extends FrameLayout {
    private k0 A;
    private RelativeLayout a;
    private HorizontalScrollView b;
    private LinearLayout c;
    private ViewGroup d;
    private TextView e;
    private View f;
    private TextView g;
    private View h;
    private View i;
    private TextView j;
    private PieProgress k;
    private h l;
    private TextView m;
    private View n;
    private String o;
    private String p;
    private String q;
    private boolean r;
    private K s;
    private int t;
    private int u = 0;
    private boolean v = false;
    private f w;
    private int x;
    private int y;
    private boolean z = true;

    public PathBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k(context);
    }

    private void g(String string, String string2, boolean bl) {
        LayoutInflater layoutInflater = (LayoutInflater)this.getContext().getSystemService("layout_inflater");
        layoutInflater = this.u == 2 ? (ViewGroup)layoutInflater.inflate(2131558663, (ViewGroup)this.c, false) : (ViewGroup)layoutInflater.inflate(2131558662, (ViewGroup)this.c, false);
        TextView textView = (TextView)layoutInflater.findViewById(2131361983);
        textView.setText((CharSequence)string);
        int n8 = bl ? this.x : this.y;
        textView.setTextColor(n8);
        textView.setOnClickListener(new View.OnClickListener(){
            final String a;
            final PathBar b;
            {
                this.b = pathBar;
                this.a = string;
            }

            public void onClick(View view) {
                this.b.l.b(this.a);
                ax.Q2.a.i().m("navigation", "open_folder_back").c("loc", this.b.s.d().I()).c("by", "pathbar_directory").e();
            }
        });
        this.c.addView((View)layoutInflater);
    }

    private void j() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if ((textView = this.f) != null) {
            textView.setVisibility(8);
        }
    }

    private boolean l(String string) {
        if (this.s.e() == null) {
            if (this.s.d() != ax.Q2.f.v0) {
                ax.Ha.c.h().f().d("ISROOT!! ROOTPATH NULL").g(this.s.toString()).h();
            }
            return false;
        }
        return this.s.e().equals(string);
    }

    private void m() {
        if (this.n != null) {
            if (this.l(this.q) && ax.Q2.f.w0(this.s.d())) {
                this.n.setVisibility(0);
                return;
            }
            this.n.setVisibility(8);
        }
    }

    private void n() {
        if (ax.Q2.f.T(this.s.d())) {
            if (this.l(this.q) && this.w == null && this.z && this.A != null) {
                this.i.setVisibility(0);
                return;
            }
            this.i.setVisibility(8);
            return;
        }
        if (this.s.d() == ax.Q2.f.F0) {
            this.i.setVisibility(0);
            if (P.b()) {
                this.j.setText(2131952260);
                View view = this.i;
                view.setContentDescription((CharSequence)view.getContext().getString(2131952260));
            } else {
                this.j.setText(2131952248);
                View view = this.i;
                view.setContentDescription((CharSequence)view.getContext().getString(2131952248));
            }
            this.k.setVisibility(8);
            return;
        }
        if (ax.Q2.f.v0(this.s.d())) {
            k0 k02;
            if (this.l(this.q) && (k02 = this.A) != null && k02.b != 0L) {
                this.m.setVisibility(0);
                return;
            }
            this.m.setVisibility(8);
            return;
        }
        if (ax.Q2.f.J0 == this.s.d()) {
            k0 k03 = this.A;
            if (k03 != null && k03.b != 0L && Q.B0(this.q)) {
                this.m.setVisibility(0);
                return;
            }
            this.m.setVisibility(8);
        }
    }

    private void o(Context context, View view) {
        int n8 = view.getPaddingLeft();
        int n9 = view.getPaddingRight();
        int n10 = view.getPaddingTop();
        int n11 = view.getPaddingBottom();
        view.setBackgroundDrawable(ax.s3.a.c(context, 2131230886));
        view.setPadding(n8, n10, n9, n11);
    }

    private void p(String string, boolean bl) {
        this.p = string;
        if (ax.t3.k.b()) {
            this.h.setVisibility(8);
            return;
        }
        if (bl) {
            this.h.setVisibility(0);
            return;
        }
        this.h.setVisibility(8);
    }

    private void q() {
        Drawable drawable = ax.s3.b.j(this.getContext(), ax.Q2.f.l0, true);
        this.e.setCompoundDrawables(drawable, null, null, null);
        this.e.setCompoundDrawablePadding(0);
        this.e.setVisibility(0);
        this.e.setContentDescription((CharSequence)this.getContext().getString(2131952162));
        int n8 = this.u;
        if (n8 == 2 || n8 == 3) {
            this.f.setVisibility(0);
        }
        this.e.setOnClickListener(new View.OnClickListener(this){
            final PathBar a;
            {
                this.a = pathBar;
            }

            public void onClick(View view) {
                this.a.l.d("pathbar_home");
            }
        });
    }

    private void r() {
        Drawable drawable = ax.s3.b.j(this.getContext(), this.w, true);
        this.e.setCompoundDrawables(drawable, null, null, null);
        this.e.setCompoundDrawablePadding(0);
        this.e.setContentDescription((CharSequence)this.w.M(this.getContext()));
        this.e.setVisibility(0);
        int n8 = this.u;
        if (n8 == 2 || n8 == 3) {
            this.f.setVisibility(0);
        }
        this.e.setOnClickListener(new View.OnClickListener(this){
            final PathBar a;
            {
                this.a = pathBar;
            }

            public void onClick(View view) {
                this.a.l.a("pathbar_home");
            }
        });
    }

    private void setAnalyzeButtonProgress(float f8) {
        String string = ax.u3.B.P(f8);
        this.j.setText((CharSequence)string);
        this.k.setProgressPercent((int)f8);
    }

    private void t(boolean bl) {
        if (ax.s3.b.k(this.s.d(), null) > 0) {
            Object object = ax.s3.b.j(this.getContext(), this.s.d(), bl);
            this.g.setCompoundDrawables(object, null, null, null);
            if (bl) {
                object = this.o;
                if (object != null && !"".equals(object)) {
                    this.g.setCompoundDrawablePadding(0);
                } else {
                    this.g.setCompoundDrawablePadding(0);
                }
            } else {
                this.g.setText((CharSequence)"");
                this.g.setCompoundDrawablePadding(0);
            }
        } else {
            this.g.setText((CharSequence)this.o);
            TextView textView = this.g;
            int n8 = bl ? this.x : this.y;
            textView.setTextColor(n8);
            this.g.setCompoundDrawablePadding(0);
        }
        this.g.setContentDescription((CharSequence)this.getContext().getString(2131952134));
    }

    public int getParentButtonId() {
        return 2131362378;
    }

    public void h(String object) {
        block15: {
            block14: {
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ax.Ha.c.h().d("CD!!!").j().g(this.s.toString()).h();
                }
                if (object == null) break block14;
                this.c.removeAllViews();
                this.c.addView((View)this.d);
                if (this.s.e() != null) break block15;
            }
            return;
        }
        CharSequence charSequence = d0.v(this.s, (String)object, Boolean.TRUE);
        if (charSequence == null) {
            object = ax.Ha.c.h().d("PTHBNU!!").j();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.s.toString());
            ((StringBuilder)charSequence).append(":");
            ((StringBuilder)charSequence).append(this.s.e());
            ((ax.Ha.b)object).g(((StringBuilder)charSequence).toString()).h();
            return;
        }
        String[] stringArray = ((String)charSequence).split(File.separator);
        if (stringArray.length > 0 && this.r) {
            this.g(stringArray[stringArray.length - 1], (String)object, true);
        } else {
            StringBuilder stringBuilder = new StringBuilder(this.s.e());
            for (int i8 = 0; i8 < stringArray.length; ++i8) {
                String string = stringArray[i8];
                if (string.length() == 0) continue;
                if (stringBuilder.toString().endsWith("/")) {
                    stringBuilder.append(string);
                    charSequence = stringBuilder.toString();
                } else {
                    stringBuilder.append(File.separator);
                    stringBuilder.append(string);
                    charSequence = stringBuilder.toString();
                }
                boolean bl = i8 == stringArray.length - 1;
                this.g(string, (String)charSequence, bl);
            }
        }
        charSequence = this.r ? this.s.e() : d0.r((String)object);
        this.q = object;
        if (this.l((String)object)) {
            if (ax.t3.k.K()) {
                this.p((String)object, true);
            } else {
                this.p((String)object, false);
            }
            this.t(true);
        } else {
            this.p((String)charSequence, true);
            this.t(false);
        }
        this.n();
        this.m();
        this.post(new Runnable(this){
            final PathBar q;
            {
                this.q = pathBar;
            }

            @Override
            public void run() {
                this.q.b.fullScroll(66);
            }
        });
    }

    public void i() {
        this.A = null;
        this.n();
    }

    public void k(Context context) {
        int n8;
        RelativeLayout relativeLayout;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)context);
        this.a = relativeLayout = (RelativeLayout)layoutInflater.inflate(2131558661, (ViewGroup)this, false);
        this.addView((View)relativeLayout);
        this.x = ax.Q.b.c(context, 2131100747);
        this.y = ax.Q.b.c(context, 2131100746);
        relativeLayout = (HorizontalScrollView)this.a.findViewById(2131362762);
        this.b = relativeLayout;
        this.c = (LinearLayout)relativeLayout.findViewById(2131362057);
        this.t = n8 = ax.t3.k.k();
        this.u = n8 = ax.t3.k.o(n8);
        this.d = n8 == 2 ? (ViewGroup)layoutInflater.inflate(2131558665, (ViewGroup)this.c, false) : (ViewGroup)layoutInflater.inflate(2131558664, (ViewGroup)this.c, false);
        this.e = (TextView)this.d.findViewById(2131362378);
        this.f = this.d.findViewById(2131362745);
        this.q();
        layoutInflater = (TextView)this.d.findViewById(2131362744);
        this.g = layoutInflater;
        layoutInflater.setOnClickListener(new View.OnClickListener(this){
            final PathBar a;
            {
                this.a = pathBar;
            }

            public void onClick(View view) {
                ax.Q2.a.i().m("navigation", "open_folder_back").c("loc", this.a.s.d().I()).c("by", "pathbar_root").e();
                this.a.l.b(this.a.s.e());
            }
        });
        this.c.addView((View)this.d);
        this.b.setHorizontalScrollBarEnabled(false);
        this.b.setHorizontalFadingEdgeEnabled(true);
        layoutInflater = this.a.findViewById(2131361985);
        this.i = layoutInflater;
        layoutInflater.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final PathBar c;
            {
                this.c = pathBar;
            }

            @Override
            public void a(View view) {
                this.c.l.e();
            }
        });
        boolean bl = context instanceof com.alphainventor.filemanager.activity.a;
        this.j = (TextView)this.a.findViewById(2131361986);
        this.k = (PieProgress)this.a.findViewById(2131362695);
        this.o(context, this.i);
        this.m = (TextView)this.a.findViewById(2131362903);
        context = this.a.findViewById(2131361989);
        this.h = context;
        context.setOnClickListener(new View.OnClickListener(this){
            final PathBar a;
            {
                this.a = pathBar;
            }

            public void onClick(View object) {
                object = this.a;
                if (((PathBar)((Object)object)).l(((PathBar)((Object)object)).q) && ax.t3.k.K()) {
                    this.a.l.a("pathbar_up");
                    return;
                }
                this.a.l.c(this.a.p);
                ax.Q2.a.i().m("navigation", "open_folder_back").c("loc", this.a.s.d().I()).c("by", "pathbar_up").e();
            }
        });
        this.p = "/";
    }

    public void s(boolean bl) {
        this.z = bl;
        this.n();
    }

    public void setActionButtonEnabled(boolean bl) {
        View view;
        for (int i8 = 0; i8 < this.c.getChildCount(); ++i8) {
            view = this.c.getChildAt(i8);
            if (!(view instanceof ViewGroup) || (view = ((ViewGroup)view).findViewById(2131361983)) == null) continue;
            view.setEnabled(bl);
        }
        this.e.setEnabled(bl);
        this.g.setEnabled(bl);
        this.b.setEnabled(bl);
        if (bl) {
            this.n();
        } else {
            this.i.setVisibility(8);
        }
        this.i.setEnabled(bl);
        view = this.n;
        if (view != null) {
            if (bl) {
                this.m();
            } else {
                view.setVisibility(8);
            }
            this.n.setEnabled(bl);
        }
    }

    public void setIsArchiveFile(boolean bl) {
        this.v = bl;
        if (bl) {
            this.j();
        }
    }

    public void setIsTwoDepth(boolean bl) {
        this.r = bl;
    }

    public void setLocationUnit(K k8) {
        this.s = k8;
    }

    public void setParentLocation(f f8) {
        this.w = f8;
        if (f8 != null) {
            this.r();
            return;
        }
        this.q();
    }

    public void setPathBarListener(h h8) {
        this.l = h8;
    }

    public void setRootInfo(String string) {
        this.o = string;
        this.t(true);
    }

    public void setRootTitle(String string) {
        this.o = string;
    }

    public void setStorageSpace(k0 object) {
        if (object == null) {
            return;
        }
        this.A = object;
        if (ax.Q2.f.T(this.s.d())) {
            object = this.A;
            long l8 = ((k0)object).b;
            float f8 = l8 != 0L ? (float)((double)((k0)object).a * 100.0 / (double)l8) : -1.0f;
            this.setAnalyzeButtonProgress(f8);
        } else if (this.A.b != 0L) {
            Context context = this.getContext();
            object = this.A;
            object = B.m(context, ((k0)object).b, ((k0)object).a, B.a.d0);
            this.m.setText((CharSequence)object);
        } else {
            this.m.setText((CharSequence)"");
        }
        this.n();
    }

    public static interface h {
        public void a(String var1);

        public void b(String var1);

        public void c(String var1);

        public void d(String var1);

        public void e();
    }
}

