/*
 * Decompiled with CFR 0.152.
 */
package ax.n4;

public class a {
    public static <T> T a(T object, String string) {
        if (object != null) {
            return (T)object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" may not be null");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }
}

