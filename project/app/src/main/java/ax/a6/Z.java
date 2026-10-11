/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import ax.a6.X;
import ax.a6.Y;
import java.util.Iterator;
import java.util.Set;

public final class Z {
    public static X a(Context object, String string) {
        block4: {
            block6: {
                int n8;
                String[] stringArray;
                block5: {
                    if (TextUtils.isEmpty((CharSequence)string)) break block4;
                    stringArray = string.split("/", -1);
                    n8 = stringArray.length;
                    if (n8 != 1) break block5;
                    string = String.valueOf(object.getPackageName());
                    object = stringArray[0];
                    string = string.concat("_preferences");
                    break block6;
                }
                if (n8 != 2) break block4;
                string = stringArray[0];
                object = stringArray[1];
            }
            if (!TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)object)) {
                return new X(string, (String)object);
            }
        }
        return null;
    }

    public static void b(Context context, Set object) {
        Y y8 = new Y(context);
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (String)iterator.next();
            X x8 = Z.a(context, (String)object);
            if (x8 == null) {
                Log.d((String)"UserMessagingPlatform", (String)"clearKeys: unable to process key: ".concat(String.valueOf(object)));
                continue;
            }
            Y.a(y8, x8.a).remove(x8.b);
        }
        y8.c();
    }
}

