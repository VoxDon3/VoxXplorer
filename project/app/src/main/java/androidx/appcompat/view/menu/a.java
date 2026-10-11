/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import java.util.ArrayList;

public abstract class a
implements j {
    protected Context a;
    protected Context b;
    protected e c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    private j.a f;
    private int g;
    private int h;
    protected k i;
    private int j;

    public a(Context context, int n8, int n9) {
        this.a = context;
        this.d = LayoutInflater.from((Context)context);
        this.g = n8;
        this.h = n9;
    }

    @Override
    public void a(e e8, boolean bl) {
        j.a a8 = this.f;
        if (a8 != null) {
            a8.a(e8, bl);
        }
    }

    protected void b(View view, int n8) {
        ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup)this.i).addView(view, n8);
    }

    public abstract void c(g var1, k.a var2);

    @Override
    public void d(boolean bl) {
        ViewGroup viewGroup = (ViewGroup)this.i;
        if (viewGroup != null) {
            Object object = this.c;
            int n8 = 0;
            if (object != null) {
                ((e)object).r();
                ArrayList<g> arrayList = this.c.E();
                int n9 = arrayList.size();
                n8 = 0;
                for (int i8 = 0; i8 < n9; ++i8) {
                    g g8 = arrayList.get(i8);
                    int n10 = n8;
                    if (this.q(n8, g8)) {
                        View view = viewGroup.getChildAt(n8);
                        object = view instanceof k.a ? ((k.a)view).getItemData() : null;
                        View view2 = this.n(g8, view, viewGroup);
                        if (g8 != object) {
                            view2.setPressed(false);
                            view2.jumpDrawablesToCurrentState();
                        }
                        if (view2 != view) {
                            this.b(view2, n8);
                        }
                        n10 = n8 + 1;
                    }
                    n8 = n10;
                }
            }
            while (n8 < viewGroup.getChildCount()) {
                if (this.l(viewGroup, n8)) continue;
                ++n8;
            }
        }
    }

    @Override
    public boolean f(e e8, g g8) {
        return false;
    }

    @Override
    public boolean g(e e8, g g8) {
        return false;
    }

    @Override
    public void h(j.a a8) {
        this.f = a8;
    }

    @Override
    public void i(Context context, e e8) {
        this.b = context;
        this.e = LayoutInflater.from((Context)context);
        this.c = e8;
    }

    public k.a j(ViewGroup viewGroup) {
        return (k.a)this.d.inflate(this.h, viewGroup, false);
    }

    @Override
    public boolean k(m e8) {
        j.a a8 = this.f;
        if (a8 != null) {
            if (e8 == null) {
                e8 = this.c;
            }
            return a8.b(e8);
        }
        return false;
    }

    protected boolean l(ViewGroup viewGroup, int n8) {
        viewGroup.removeViewAt(n8);
        return true;
    }

    public j.a m() {
        return this.f;
    }

    public View n(g g8, View object, ViewGroup viewGroup) {
        object = object instanceof k.a ? (k.a)object : this.j(viewGroup);
        this.c(g8, (k.a)object);
        return object;
    }

    public k o(ViewGroup object) {
        if (this.i == null) {
            object = (k)this.d.inflate(this.g, (ViewGroup)object, false);
            this.i = object;
            object.b(this.c);
            this.d(true);
        }
        return this.i;
    }

    public void p(int n8) {
        this.j = n8;
    }

    public abstract boolean q(int var1, g var2);
}

