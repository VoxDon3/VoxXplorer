package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements j {
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

    public a(Context context, int i, int i2) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
        j.a aVar = this.f;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    protected void b(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    public abstract void c(g gVar, k.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.c;
        int i = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> E = this.c.E();
            int size = E.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = E.get(i3);
                if (q(i2, gVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n.setPressed(false);
                        n.jumpDrawablesToCurrentState();
                    }
                    if (n != childAt) {
                        b(n, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!l(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        this.b = context;
        this.e = LayoutInflater.from(context);
        this.c = eVar;
    }

    public k.a j(ViewGroup viewGroup) {
        return (k.a) this.d.inflate(this.h, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        j.a aVar = this.f;
        m mVar2 = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            mVar2 = this.c;
        }
        return aVar.b(mVar2);
    }

    protected boolean l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public j.a m() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a j = view instanceof k.a ? (k.a) view : j(viewGroup);
        c(gVar, j);
        return (View) j;
    }

    public k o(ViewGroup viewGroup) {
        if (this.i == null) {
            k kVar = (k) this.d.inflate(this.g, viewGroup, false);
            this.i = kVar;
            kVar.b(this.c);
            d(true);
        }
        return this.i;
    }

    public void p(int i) {
        this.j = i;
    }

    public abstract boolean q(int i, g gVar);
}
