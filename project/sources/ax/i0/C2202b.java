package ax.i0;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: ax.i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2202b extends Filter {
    a a;

    /* renamed from: ax.i0.b$a */
    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    C2202b(a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d = this.a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d != null) {
            filterResults.count = d.getCount();
            filterResults.values = d;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b = this.a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == b) {
            return;
        }
        this.a.a((Cursor) obj);
    }
}
