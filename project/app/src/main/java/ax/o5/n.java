/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.U7.a;
import ax.o5.b;
import ax.o5.d;
import ax.o5.u;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class n {
    public static n a(List<u> list) {
        return new d(list);
    }

    public static a b() {
        return new ax.W7.d().j(b.a).k(true).i();
    }

    public abstract List<u> c();
}

