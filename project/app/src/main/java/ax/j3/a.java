/*
 * Decompiled with CFR 0.152.
 */
package ax.j3;

import android.app.Activity;
import android.content.DialogInterface;
import ax.j3.b;

public class a
extends b {
    public a(Activity activity, String string, String string2, b.d d8) {
        super(activity, b.c.c0, string, null, null, null, string2, d8);
    }

    public static a F(Activity object, String string, String string2, b.d d8) {
        object = new a((Activity)object, string, string2, d8);
        object.setOnCancelListener(new DialogInterface.OnCancelListener(d8){
            final b.d a;
            {
                this.a = d8;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.a.a();
            }
        });
        return object;
    }
}

