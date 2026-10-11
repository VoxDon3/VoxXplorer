/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.A4.a;
import ax.T4.i;
import ax.p4.b;
import ax.p4.n;
import ax.p4.s;
import ax.s4.a;
import ax.v4.c;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class p
extends Exception {
    private final String c0;
    private final s d0;
    private final Object q;

    public p(Object object, String string, s s8) {
        this.q = object;
        this.c0 = string;
        this.d0 = s8;
    }

    public static <T> void a(a a8, String string, T t8) {
        if (a8 != null) {
            a8.a(string, t8);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void b(a a8, String string, Object object) {
        String string2;
        try {
            Object object2 = object.getClass().getMethod("tag", null).invoke(object, null);
            Field[] fieldArray = new StringBuilder();
            fieldArray.append(object2.toString().toLowerCase());
            fieldArray.append("value");
            string2 = fieldArray.toString();
        }
        catch (Exception exception) {
            return;
        }
        for (Field field : object.getClass().getDeclaredFields()) {
            if (!field.getName().equalsIgnoreCase(string2)) continue;
            ((AccessibleObject)field).setAccessible(true);
            p.a(a8, string, field.get(object));
            return;
        }
        return;
    }

    public static <T> p c(c<T> object, a.b b8, String string) throws IOException, i {
        String string2 = n.q(b8);
        object = (b)new b.a<T>(object).b(b8.b());
        b8 = ((b)object).a();
        p.a(null, string, b8);
        p.b(null, string, b8);
        return new p(b8, string2, ((b)object).b());
    }

    public Object d() {
        return this.q;
    }

    public String e() {
        return this.c0;
    }

    public s f() {
        return this.d0;
    }
}

