/*
 * Decompiled with CFR 0.152.
 */
package ax.i0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ax.i0.a;

public abstract class c
extends a {
    private int i;
    private int j;
    private LayoutInflater k;

    @Deprecated
    public c(Context context, int n8, Cursor cursor, boolean bl) {
        super(context, cursor, bl);
        this.j = n8;
        this.i = n8;
        this.k = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    @Override
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.j, viewGroup, false);
    }

    @Override
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.i, viewGroup, false);
    }
}

