/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.h;
import ax.b6.l;
import ax.b6.q;
import ax.b6.u;
import ax.b6.z;
import java.util.Iterator;
import java.util.List;

public interface s {
    public static final s f = new z();
    public static final s g = new q();
    public static final s h = new l("continue");
    public static final s i = new l("break");
    public static final s j = new l("return");
    public static final s k = new h(Boolean.TRUE);
    public static final s l = new h(Boolean.FALSE);
    public static final s m = new u("");

    public s c();

    public Boolean e();

    public Double f();

    public String g();

    public Iterator<s> i();

    public s k(String var1, Z2 var2, List<s> var3);
}

