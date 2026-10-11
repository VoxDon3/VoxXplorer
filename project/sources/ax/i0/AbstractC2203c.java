package ax.i0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ax.i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2203c extends AbstractC2201a {
    private int i;
    private int j;
    private LayoutInflater k;

    @Deprecated
    public AbstractC2203c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.j = i;
        this.i = i;
        this.k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // ax.i0.AbstractC2201a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.j, viewGroup, false);
    }

    @Override // ax.i0.AbstractC2201a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.i, viewGroup, false);
    }
}
