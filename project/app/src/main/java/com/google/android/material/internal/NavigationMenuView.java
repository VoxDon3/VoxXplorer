/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NavigationMenuView
extends RecyclerView
implements k {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        this.setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @Override
    public void b(e e8) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}

