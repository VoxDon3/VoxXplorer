/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.L;

public final class ExpandedMenuView
extends ListView
implements e.b,
k,
AdapterView.OnItemClickListener {
    private static final int[] c = new int[]{16842964, 16843049};
    private e a;
    private int b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context object, AttributeSet attributeSet, int n8) {
        super((Context)object, attributeSet);
        this.setOnItemClickListener(this);
        object = L.v((Context)object, attributeSet, c, n8, 0);
        if (((L)object).s(0)) {
            this.setBackgroundDrawable(((L)object).g(0));
        }
        if (((L)object).s(1)) {
            this.setDivider(((L)object).g(1));
        }
        ((L)object).x();
    }

    @Override
    public boolean a(g g8) {
        return this.a.M(g8, 0);
    }

    @Override
    public void b(e e8) {
        this.a = e8;
    }

    public int getWindowAnimations() {
        return this.b;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int n8, long l8) {
        this.a((g)this.getAdapter().getItem(n8));
    }
}

