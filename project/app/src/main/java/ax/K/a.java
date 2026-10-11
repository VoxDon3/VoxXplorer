/*
 * Decompiled with CFR 0.152.
 */
package ax.K;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;

@SuppressLint(value={"LogConditional"})
public class a {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(Context context, int n8) {
        if (n8 == -1) return "UNKNOWN";
        try {
            return context.getResources().getResourceEntryName(n8);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("?");
            stringBuilder.append(n8);
            return stringBuilder.toString();
        }
    }

    public static String b(View object) {
        try {
            object = object.getContext().getResources().getResourceEntryName(object.getId());
            return object;
        }
        catch (Exception exception) {
            return "UNKNOWN";
        }
    }
}

