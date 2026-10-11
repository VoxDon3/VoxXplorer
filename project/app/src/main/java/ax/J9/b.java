/*
 * Decompiled with CFR 0.152.
 */
package ax.J9;

import java.io.PrintStream;

public class b {
    public static Class a(String string) {
        return b.b(string, true);
    }

    public static Class b(String object, boolean bl) {
        try {
            Class<?> clazz = Class.forName((String)object);
            return clazz;
        }
        catch (Throwable throwable) {
            try {
                object = Class.forName((String)object, true, ClassLoader.getSystemClassLoader());
            }
            catch (Throwable throwable2) {
                if (bl) {
                    PrintStream printStream = System.err;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Caught ");
                    stringBuilder.append(throwable2);
                    printStream.println(stringBuilder.toString());
                }
                object = null;
            }
            return object;
        }
    }
}

