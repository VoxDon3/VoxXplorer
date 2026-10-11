/*
 * Decompiled with CFR 0.152.
 */
package ax.K5;

import com.google.android.gms.common.api.Status;

public class b
extends Exception {
    @Deprecated
    protected final Status q;

    public b(Status status) {
        int n8 = status.y();
        String string = status.z() != null ? status.z() : "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n8);
        stringBuilder.append(": ");
        stringBuilder.append(string);
        super(stringBuilder.toString());
        this.q = status;
    }

    public Status a() {
        return this.q;
    }
}

