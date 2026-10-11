/*
 * Decompiled with CFR 0.152.
 */
package ax.y3;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ax.B.k;
import ax.y3.a;
import com.android.ex.photo.d;

public class c
extends a {
    protected k<String, Integer> k = new k(ax.B3.a.a.length);
    protected final float l;
    protected boolean m;

    public c(Context context, FragmentManager fragmentManager, Cursor cursor, float f8, boolean bl) {
        super(context, fragmentManager, cursor);
        this.l = f8;
        this.m = bl;
    }

    private String G(Cursor cursor, String string) {
        if (this.k.containsKey(string)) {
            return cursor.getString(this.k.get(string).intValue());
        }
        return null;
    }

    @Override
    public Cursor C(Cursor cursor) {
        this.k.clear();
        if (cursor != null) {
            String string;
            int n8;
            String[] stringArray = ax.B3.a.a;
            int n9 = stringArray.length;
            int n10 = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                string = stringArray[n8];
                this.k.put(string, cursor.getColumnIndexOrThrow(string));
            }
            stringArray = ax.B3.a.b;
            n9 = stringArray.length;
            for (n8 = n10; n8 < n9; ++n8) {
                string = stringArray[n8];
                n10 = cursor.getColumnIndex(string);
                if (n10 == -1) continue;
                this.k.put(string, n10);
            }
        }
        return super.C(cursor);
    }

    protected ax.z3.a D(Intent intent, int n8, boolean bl) {
        return ax.z3.a.g3(intent, n8, bl);
    }

    public String E(Cursor cursor) {
        return this.G(cursor, "contentUri");
    }

    protected Class<? extends ax.z3.a> F() {
        return ax.z3.a.class;
    }

    public String H(Cursor cursor) {
        return this.G(cursor, "thumbnailUri");
    }

    public boolean I(Cursor object) {
        if ((object = this.G((Cursor)object, "loadingIndicator")) == null) {
            return false;
        }
        return Boolean.valueOf((String)object);
    }

    @Override
    public Fragment y(Context object, Cursor object2, int n8) {
        object = this.E((Cursor)object2);
        String string = this.H((Cursor)object2);
        boolean bl = this.I((Cursor)object2);
        bl = object == null && bl;
        object2 = d.a(this.f, this.F());
        ((d.b)object2).e((String)object).f(string).c(this.m).d(this.l);
        return this.D(((d.b)object2).a(), n8, bl);
    }
}

