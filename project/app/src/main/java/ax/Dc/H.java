/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.I;
import java.util.zip.ZipException;

public class H
extends ZipException {
    public H(String string) {
        super(string);
    }

    static String a(I i8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i8.getName());
        stringBuilder.append("'s size exceeds the limit of 4GByte.");
        return stringBuilder.toString();
    }
}

