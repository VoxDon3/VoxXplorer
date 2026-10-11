/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

public final class n {
    public static final void a(int n8) {
        if (n8 >= 1) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected positive parallelism level, but got ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }
}

