/*
 * Decompiled with CFR 0.152.
 */
package ax.i0;

import android.database.Cursor;
import android.widget.Filter;

class b
extends Filter {
    a a;

    b(a a8) {
        this.a = a8;
    }

    public CharSequence convertResultToString(Object object) {
        return this.a.c((Cursor)object);
    }

    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        charSequence = this.a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence != null) {
            filterResults.count = charSequence.getCount();
            filterResults.values = charSequence;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, Filter.FilterResults object) {
        charSequence = this.a.b();
        object = object.values;
        if (object != null && object != charSequence) {
            this.a.a((Cursor)object);
        }
    }

    static interface a {
        public void a(Cursor var1);

        public Cursor b();

        public CharSequence c(Cursor var1);

        public Cursor d(CharSequence var1);
    }
}

