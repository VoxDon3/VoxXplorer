/*
 * Decompiled with CFR 0.152.
 */
package ax.y3;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ax.y3.b;
import java.util.HashMap;

public abstract class a
extends b {
    protected Context f;
    protected Cursor g;
    protected int h;
    protected SparseIntArray i;
    protected final HashMap<Object, Integer> j = new HashMap();

    public a(Context context, FragmentManager fragmentManager, Cursor cursor) {
        super(fragmentManager);
        this.z(context, cursor);
    }

    private boolean A(int n8) {
        Cursor cursor = this.g;
        if (cursor != null && !cursor.isClosed()) {
            return this.g.moveToPosition(n8);
        }
        return false;
    }

    private void B() {
        Cursor cursor = this.g;
        if (cursor != null && !cursor.isClosed()) {
            cursor = new SparseIntArray(this.g.getCount());
            this.g.moveToPosition(-1);
            while (this.g.moveToNext()) {
                cursor.append(this.g.getString(this.h).hashCode(), this.g.getPosition());
            }
            this.i = cursor;
            return;
        }
        this.i = null;
    }

    private void z(Context context, Cursor cursor) {
        int n8 = cursor != null ? 1 : 0;
        this.g = cursor;
        this.f = context;
        n8 = n8 != 0 ? cursor.getColumnIndex("uri") : -1;
        this.h = n8;
    }

    public Cursor C(Cursor cursor) {
        Object object;
        if (Log.isLoggable((String)"BaseCursorPagerAdapter", (int)2)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("swapCursor old=");
            Cursor cursor2 = this.g;
            int n8 = cursor2 == null ? -1 : cursor2.getCount();
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append("; new=");
            n8 = cursor == null ? -1 : cursor.getCount();
            ((StringBuilder)object).append(n8);
            Log.v((String)"BaseCursorPagerAdapter", (String)((StringBuilder)object).toString());
        }
        if (cursor == (object = this.g)) {
            return null;
        }
        this.g = cursor;
        this.h = cursor != null ? cursor.getColumnIndex("uri") : -1;
        this.B();
        this.l();
        return object;
    }

    @Override
    public void a(View view, int n8, Object object) {
        this.j.remove(object);
        super.a(view, n8, object);
    }

    @Override
    public int e() {
        Cursor cursor = this.g;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public int f(Object object) {
        SparseIntArray sparseIntArray;
        if ((object = this.j.get(object)) != null && (sparseIntArray = this.i) != null) {
            return sparseIntArray.get(((Integer)object).intValue(), -2);
        }
        return -2;
    }

    @Override
    public Object i(View object, int n8) {
        if (this.g != null) {
            Integer n9 = this.A(n8) ? Integer.valueOf(this.g.getString(this.h).hashCode()) : null;
            if ((object = super.i((View)object, n8)) != null) {
                this.j.put(object, n9);
            }
            return object;
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    @Override
    public Fragment v(int n8) {
        if (this.g != null && this.A(n8)) {
            return this.y(this.f, this.g, n8);
        }
        return null;
    }

    @Override
    protected String w(int n8, int n9) {
        if (this.A(n9)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android:pager:");
            stringBuilder.append(n8);
            stringBuilder.append(":");
            stringBuilder.append(this.g.getString(this.h).hashCode());
            return stringBuilder.toString();
        }
        return super.w(n8, n9);
    }

    public Cursor x() {
        return this.g;
    }

    public abstract Fragment y(Context var1, Cursor var2, int var3);
}

