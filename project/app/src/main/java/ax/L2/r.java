/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.content.ComponentName;
import android.content.Context;
import ax.B2.i;

public class r {
    private static final String a = i.i("PackageManagerHelper");

    public static void a(Context object, Class<?> clazz, boolean bl) {
        int n8;
        Object object2;
        Object object3;
        String string = "disabled";
        try {
            object3 = object.getPackageManager();
            object2 = new ComponentName(object, clazz.getName());
            n8 = bl ? 1 : 2;
        }
        catch (Exception exception) {
            object2 = i.e();
            String string2 = a;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(clazz.getName());
            ((StringBuilder)object3).append("could not be ");
            object = string;
            if (bl) {
                object = "enabled";
            }
            ((StringBuilder)object3).append((String)object);
            ((i)object2).b(string2, ((StringBuilder)object3).toString(), exception);
            return;
        }
        object3.setComponentEnabledSetting((ComponentName)object2, n8, 1);
        object3 = i.e();
        String string3 = a;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(clazz.getName());
        ((StringBuilder)object2).append(" ");
        object = bl ? "enabled" : "disabled";
        ((StringBuilder)object2).append((String)object);
        ((i)object3).a(string3, ((StringBuilder)object2).toString());
    }
}

