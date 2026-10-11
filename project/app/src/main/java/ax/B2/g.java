/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

import androidx.work.b;
import ax.B2.i;
import java.util.List;

public abstract class g {
    private static final String a = i.i("InputMerger");

    public static g a(String string) {
        try {
            g g8 = (g)Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            return g8;
        }
        catch (Exception exception) {
            i i8 = i.e();
            String string2 = a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble instantiating + ");
            stringBuilder.append(string);
            i8.d(string2, stringBuilder.toString(), exception);
            return null;
        }
    }

    public abstract b b(List<b> var1);
}

