package ax.a6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Z {
    public static X a(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        int length = split.length;
        if (length == 1) {
            String valueOf = String.valueOf(context.getPackageName());
            str3 = split[0];
            str2 = valueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            str2 = split[0];
            str3 = split[1];
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return new X(str2, str3);
    }

    public static void b(Context context, Set set) {
        SharedPreferences.Editor f;
        Y y = new Y(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            X a = a(context, str);
            if (a == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                f = y.f(a.a);
                f.remove(a.b);
            }
        }
        y.c();
    }
}
