/*
 * Decompiled with CFR 0.152.
 */
package ax.A3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import ax.B3.a;
import ax.K0.b;

public class c
extends b {
    private final Uri w;
    private final String[] x;

    public c(Context context, Uri uri, String[] stringArray) {
        super(context);
        this.w = uri;
        if (stringArray == null) {
            stringArray = a.a;
        }
        this.x = stringArray;
    }

    @Override
    public Cursor M() {
        this.P(this.w.buildUpon().appendQueryParameter("contentType", "image/").build());
        this.O(this.x);
        return super.M();
    }
}

