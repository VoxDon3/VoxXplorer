package ax.y3;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;

/* renamed from: ax.y3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3503a extends AbstractC3504b {
    protected Context f;
    protected Cursor g;
    protected int h;
    protected SparseIntArray i;
    protected final HashMap<Object, Integer> j;

    public AbstractC3503a(Context context, FragmentManager fragmentManager, Cursor cursor) {
        super(fragmentManager);
        this.j = new HashMap<>();
        z(context, cursor);
    }

    private boolean A(int i) {
        Cursor cursor = this.g;
        if (cursor == null || cursor.isClosed()) {
            return false;
        }
        return this.g.moveToPosition(i);
    }

    private void B() {
        Cursor cursor = this.g;
        if (cursor == null || cursor.isClosed()) {
            this.i = null;
            return;
        }
        SparseIntArray sparseIntArray = new SparseIntArray(this.g.getCount());
        this.g.moveToPosition(-1);
        while (this.g.moveToNext()) {
            sparseIntArray.append(this.g.getString(this.h).hashCode(), this.g.getPosition());
        }
        this.i = sparseIntArray;
    }

    private void z(Context context, Cursor cursor) {
        boolean z = cursor != null;
        this.g = cursor;
        this.f = context;
        this.h = z ? cursor.getColumnIndex("uri") : -1;
    }

    public Cursor C(Cursor cursor) {
        if (Log.isLoggable("BaseCursorPagerAdapter", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("swapCursor old=");
            Cursor cursor2 = this.g;
            sb.append(cursor2 == null ? -1 : cursor2.getCount());
            sb.append("; new=");
            sb.append(cursor == null ? -1 : cursor.getCount());
            Log.v("BaseCursorPagerAdapter", sb.toString());
        }
        Cursor cursor3 = this.g;
        if (cursor == cursor3) {
            return null;
        }
        this.g = cursor;
        if (cursor != null) {
            this.h = cursor.getColumnIndex("uri");
        } else {
            this.h = -1;
        }
        B();
        l();
        return cursor3;
    }

    @Override // ax.y3.AbstractC3504b, androidx.viewpager.widget.a
    public void a(View view, int i, Object obj) {
        this.j.remove(obj);
        super.a(view, i, obj);
    }

    @Override // androidx.viewpager.widget.a
    public int e() {
        Cursor cursor = this.g;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.a
    public int f(Object obj) {
        SparseIntArray sparseIntArray;
        Integer num = this.j.get(obj);
        if (num == null || (sparseIntArray = this.i) == null) {
            return -2;
        }
        return sparseIntArray.get(num.intValue(), -2);
    }

    @Override // ax.y3.AbstractC3504b, androidx.viewpager.widget.a
    public Object i(View view, int i) {
        if (this.g == null) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        Integer valueOf = A(i) ? Integer.valueOf(this.g.getString(this.h).hashCode()) : null;
        Object i2 = super.i(view, i);
        if (i2 != null) {
            this.j.put(i2, valueOf);
        }
        return i2;
    }

    @Override // ax.y3.AbstractC3504b
    public Fragment v(int i) {
        if (this.g == null || !A(i)) {
            return null;
        }
        return y(this.f, this.g, i);
    }

    @Override // ax.y3.AbstractC3504b
    protected String w(int i, int i2) {
        if (!A(i2)) {
            return super.w(i, i2);
        }
        return "android:pager:" + i + ":" + this.g.getString(this.h).hashCode();
    }

    public Cursor x() {
        return this.g;
    }

    public abstract Fragment y(Context context, Cursor cursor, int i);
}
