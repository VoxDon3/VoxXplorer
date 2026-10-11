/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import ax.X2.A;
import ax.X2.B;
import ax.X2.C;
import ax.X2.D;
import ax.X2.z;
import java.io.File;
import java.io.IOException;

@TargetApi(value=28)
public class E {
    public static Drawable a(File file) throws IOException {
        if (B.a(file = A.a(z.a(file)))) {
            D.a(C.a(file), -1);
        }
        return file;
    }
}

