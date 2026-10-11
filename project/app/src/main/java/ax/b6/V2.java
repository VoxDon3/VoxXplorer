/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.Context;
import android.net.Uri;
import ax.B.a;

public final class V2 {
    private static final a<String, Uri> a = new a();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri a(String string) {
        synchronized (V2.class) {
            Throwable throwable2;
            block5: {
                Object object;
                block4: {
                    try {
                        a<String, Uri> a8 = a;
                        Object object2 = a8.get((Object)string);
                        object = object2;
                        if (object2 != null) break block4;
                        object = Uri.encode((String)string);
                        object2 = new StringBuilder("content://com.google.android.gms.phenotype/");
                        ((StringBuilder)object2).append((String)object);
                        object = Uri.parse((String)((StringBuilder)object2).toString());
                        a8.put(string, (Uri)object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return object;
            }
            throw throwable2;
        }
    }

    public static String b(Context object, String string) {
        if (!string.contains("#")) {
            object = object.getPackageName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("#");
            stringBuilder.append("");
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }
        object = new StringBuilder("The passed in package cannot already have a subpackage: ");
        ((StringBuilder)object).append(string);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public static boolean c(String string, String string2) {
        return !(!string.equals("eng") && !string.equals("userdebug") || !string2.contains("dev-keys") && !string2.contains("test-keys"));
        {
        }
    }
}

