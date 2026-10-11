package ax.F6;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: ax.F6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0692b {
    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
