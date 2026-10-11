/*
 * Decompiled with CFR 0.152.
 */
package ax.Z7;

import ax.Z7.a;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class l {
    public static l a(String string, List<String> list) {
        return new a(string, list);
    }

    public abstract List<String> b();

    public abstract String c();
}

