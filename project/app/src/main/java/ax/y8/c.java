/*
 * Decompiled with CFR 0.152.
 */
package ax.y8;

public class c
extends RuntimeException {
    public c(String string) {
        super(string);
    }

    public c(String string, Object ... objectArray) {
        super(String.format(string, objectArray));
    }

    public c(Throwable throwable, String string, Object ... objectArray) {
        super(String.format(string, objectArray), throwable);
    }
}

