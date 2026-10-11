/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

final class a {
    public static final a a = new a();

    private a() {
    }

    public static final void a(Bundle bundle, String string, Size size) {
        bundle.putSize(string, size);
    }

    public static final void b(Bundle bundle, String string, SizeF sizeF) {
        bundle.putSizeF(string, sizeF);
    }
}

