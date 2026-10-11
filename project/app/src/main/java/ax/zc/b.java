/*
 * Decompiled with CFR 0.152.
 */
package ax.zc;

import java.io.IOException;

public class b
extends IOException {
    public b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot read encrypted content from ");
        stringBuilder.append(string);
        stringBuilder.append(" without a password.");
        super(stringBuilder.toString());
    }
}

