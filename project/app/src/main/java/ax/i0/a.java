/*
 * Decompiled with CFR 0.152.
 */
package ax.i0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import ax.i0.b;

public abstract class a
extends BaseAdapter
implements Filterable,
b.a {
    protected boolean a;
    protected boolean b;
    protected Cursor c;
    protected Context d;
    protected int e;
    protected a f;
    protected DataSetObserver g;
    protected ax.i0.b h;

    public a(Context context, Cursor cursor, boolean bl) {
        int n8 = bl ? 1 : 2;
        this.f(context, cursor, n8);
    }

    @Override
    public void a(Cursor cursor) {
        if ((cursor = this.j(cursor)) != null) {
            cursor.close();
        }
    }

    @Override
    public Cursor b() {
        return this.c;
    }

    public abstract void e(View var1, Context var2, Cursor var3);

    void f(Context object, Cursor cursor, int n8) {
        boolean bl = false;
        if ((n8 & 1) == 1) {
            n8 |= 2;
            this.b = true;
        } else {
            this.b = false;
        }
        if (cursor != null) {
            bl = true;
        }
        this.c = cursor;
        this.a = bl;
        this.d = object;
        int n9 = bl ? cursor.getColumnIndexOrThrow("_id") : -1;
        this.e = n9;
        if ((n8 & 2) == 2) {
            this.f = new a(this);
            this.g = new b(this);
        } else {
            this.f = null;
            this.g = null;
        }
        if (bl) {
            object = this.f;
            if (object != null) {
                cursor.registerContentObserver((ContentObserver)object);
            }
            if ((object = this.g) != null) {
                cursor.registerDataSetObserver((DataSetObserver)object);
            }
        }
    }

    public abstract View g(Context var1, Cursor var2, ViewGroup var3);

    public int getCount() {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    public View getDropDownView(int n8, View view, ViewGroup viewGroup) {
        if (this.a) {
            this.c.moveToPosition(n8);
            View view2 = view;
            if (view == null) {
                view2 = this.g(this.d, this.c, viewGroup);
            }
            this.e(view2, this.d, this.c);
            return view2;
        }
        return null;
    }

    public Filter getFilter() {
        if (this.h == null) {
            this.h = new ax.i0.b(this);
        }
        return this.h;
    }

    public Object getItem(int n8) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null) {
            cursor.moveToPosition(n8);
            return this.c;
        }
        return null;
    }

    public long getItemId(int n8) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(n8)) {
            return this.c.getLong(this.e);
        }
        return 0L;
    }

    public View getView(int n8, View object, ViewGroup viewGroup) {
        if (this.a) {
            if (this.c.moveToPosition(n8)) {
                View view = object;
                if (object == null) {
                    view = this.h(this.d, this.c, viewGroup);
                }
                this.e(view, this.d, this.c);
                return view;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("couldn't move cursor to position ");
            ((StringBuilder)object).append(n8);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context var1, Cursor var2, ViewGroup var3);

    protected void i() {
        Cursor cursor;
        if (this.b && (cursor = this.c) != null && !cursor.isClosed()) {
            this.a = this.c.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        a a8;
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a8 = this.f;
            if (a8 != null) {
                cursor2.unregisterContentObserver((ContentObserver)a8);
            }
            if ((a8 = this.g) != null) {
                cursor2.unregisterDataSetObserver((DataSetObserver)a8);
            }
        }
        this.c = cursor;
        if (cursor != null) {
            a8 = this.f;
            if (a8 != null) {
                cursor.registerContentObserver((ContentObserver)a8);
            }
            if ((a8 = this.g) != null) {
                cursor.registerDataSetObserver((DataSetObserver)a8);
            }
            this.e = cursor.getColumnIndexOrThrow("_id");
            this.a = true;
            this.notifyDataSetChanged();
            return cursor2;
        }
        this.e = -1;
        this.a = false;
        this.notifyDataSetInvalidated();
        return cursor2;
    }

    private class a
    extends ContentObserver {
        final a a;

        a(a a8) {
            this.a = a8;
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean bl) {
            this.a.i();
        }
    }

    private class b
    extends DataSetObserver {
        final a a;

        b(a a8) {
            this.a = a8;
        }

        public void onChanged() {
            a a8 = this.a;
            a8.a = true;
            a8.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a a8 = this.a;
            a8.a = false;
            a8.notifyDataSetInvalidated();
        }
    }
}

