/*
 * Decompiled with CFR 0.152.
 */
package ax.ka;

import java.io.File;

public final class a {
    public static boolean a(String object, ax.V9.a a8) {
        return (object = a8.i((String)object)) != null && ((File)object).exists() && ((File)object).delete();
    }
}

