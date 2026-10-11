/*
 * Decompiled with CFR 0.152.
 */
package ax.k5;

import android.util.Log;
import ax.h5.b;
import ax.j5.c;
import java.util.ArrayList;
import java.util.List;

public class a
implements ax.j5.b {
    private static final String b = "a";
    List<c> a = new ArrayList<c>();

    public a(ax.e5.a a8, b b8) {
        String string = b;
        Log.i((String)string, (String)"Found a device without partition table, yay!");
        int n8 = (int)b8.b() / a8.d();
        if (b8.b() % (long)a8.d() != 0L) {
            Log.w((String)string, (String)"fs capacity is not multiple of block size");
        }
        this.a.add(new c(b8.a(), 0, n8));
    }

    @Override
    public List<c> a() {
        return this.a;
    }
}

