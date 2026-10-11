package ax.y3;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ax.B.k;
import ax.z3.ViewOnClickListenerC3543a;
import com.android.ex.photo.d;

/* loaded from: classes.dex */
public class c extends AbstractC3503a {
    protected k<String, Integer> k;
    protected final float l;
    protected boolean m;

    public c(Context context, FragmentManager fragmentManager, Cursor cursor, float f, boolean z) {
        super(context, fragmentManager, cursor);
        this.k = new k<>(ax.B3.a.a.length);
        this.l = f;
        this.m = z;
    }

    private String G(Cursor cursor, String str) {
        if (this.k.containsKey(str)) {
            return cursor.getString(this.k.get(str).intValue());
        }
        return null;
    }

    @Override // ax.y3.AbstractC3503a
    public Cursor C(Cursor cursor) {
        this.k.clear();
        if (cursor != null) {
            for (String str : ax.B3.a.a) {
                this.k.put(str, Integer.valueOf(cursor.getColumnIndexOrThrow(str)));
            }
            for (String str2 : ax.B3.a.b) {
                int columnIndex = cursor.getColumnIndex(str2);
                if (columnIndex != -1) {
                    this.k.put(str2, Integer.valueOf(columnIndex));
                }
            }
        }
        return super.C(cursor);
    }

    protected ViewOnClickListenerC3543a D(Intent intent, int i, boolean z) {
        return ViewOnClickListenerC3543a.g3(intent, i, z);
    }

    public String E(Cursor cursor) {
        return G(cursor, "contentUri");
    }

    protected Class<? extends ViewOnClickListenerC3543a> F() {
        return ViewOnClickListenerC3543a.class;
    }

    public String H(Cursor cursor) {
        return G(cursor, "thumbnailUri");
    }

    public boolean I(Cursor cursor) {
        String G = G(cursor, "loadingIndicator");
        if (G == null) {
            return false;
        }
        return Boolean.valueOf(G).booleanValue();
    }

    @Override // ax.y3.AbstractC3503a
    public Fragment y(Context context, Cursor cursor, int i) {
        String E = E(cursor);
        String H = H(cursor);
        boolean z = E == null && I(cursor);
        d.b a = d.a(this.f, F());
        a.e(E).f(H).c(this.m).d(this.l);
        return D(a.a(), i, z);
    }
}
