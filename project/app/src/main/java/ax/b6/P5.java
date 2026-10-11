/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

final class P5
extends IllegalArgumentException {
    P5(int n8, int n9) {
        StringBuilder stringBuilder = new StringBuilder("Unpaired surrogate at index ");
        stringBuilder.append(n8);
        stringBuilder.append(" of ");
        stringBuilder.append(n9);
        super(stringBuilder.toString());
    }
}

