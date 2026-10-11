/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

public class b {
    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity)context;
            }
            context = ((ContextWrapper)context).getBaseContext();
        }
        return null;
    }
}

