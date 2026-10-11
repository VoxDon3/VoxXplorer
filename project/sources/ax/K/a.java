package ax.K;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;

@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public class a {
    public static String a(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return "?" + i;
        }
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
