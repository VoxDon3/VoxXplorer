/*
 * Decompiled with CFR 0.152.
 */
package ax.c1;

import java.io.IOException;

public final class i
extends IOException {
    public i(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to bind a sample queue to TrackGroup with MIME type ");
        stringBuilder.append(string);
        stringBuilder.append(".");
        super(stringBuilder.toString());
    }
}

