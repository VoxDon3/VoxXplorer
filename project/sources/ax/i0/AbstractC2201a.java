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
import ax.i0.C2202b;

/* renamed from: ax.i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2201a extends BaseAdapter implements Filterable, C2202b.a {
    protected boolean a;
    protected boolean b;
    protected Cursor c;
    protected Context d;
    protected int e;
    protected C0330a f;
    protected DataSetObserver g;
    protected C2202b h;

    /* renamed from: ax.i0.a$a, reason: collision with other inner class name */
    private class C0330a extends ContentObserver {
        C0330a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC2201a.this.i();
        }
    }

    /* renamed from: ax.i0.a$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC2201a abstractC2201a = AbstractC2201a.this;
            abstractC2201a.a = true;
            abstractC2201a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC2201a abstractC2201a = AbstractC2201a.this;
            abstractC2201a.a = false;
            abstractC2201a.notifyDataSetInvalidated();
        }
    }

    public AbstractC2201a(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j = j(cursor);
        if (j != null) {
            j.close();
        }
    }

    @Override // ax.i0.C2202b.a
    public Cursor b() {
        return this.c;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.b = true;
        } else {
            this.b = false;
        }
        boolean z = cursor != null;
        this.c = cursor;
        this.a = z;
        this.d = context;
        this.e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f = new C0330a();
            this.g = new b();
        } else {
            this.f = null;
            this.g = null;
        }
        if (z) {
            C0330a c0330a = this.f;
            if (c0330a != null) {
                cursor.registerContentObserver(c0330a);
            }
            DataSetObserver dataSetObserver = this.g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            view = g(this.d, this.c, viewGroup);
        }
        e(view, this.d, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.h == null) {
            this.h = new C2202b(this);
        }
        return this.h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.c.moveToPosition(i)) {
            if (view == null) {
                view = h(this.d, this.c, viewGroup);
            }
            e(view, this.d, this.c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.b || (cursor = this.c) == null || cursor.isClosed()) {
            return;
        }
        this.a = this.c.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0330a c0330a = this.f;
            if (c0330a != null) {
                cursor2.unregisterContentObserver(c0330a);
            }
            DataSetObserver dataSetObserver = this.g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.c = cursor;
        if (cursor == null) {
            this.e = -1;
            this.a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0330a c0330a2 = this.f;
        if (c0330a2 != null) {
            cursor.registerContentObserver(c0330a2);
        }
        DataSetObserver dataSetObserver2 = this.g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.e = cursor.getColumnIndexOrThrow("_id");
        this.a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
