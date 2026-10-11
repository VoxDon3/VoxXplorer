/*
 * Decompiled with CFR 0.152.
 */
package ax.q0;

import ax.Gb.l;
import ax.n0.k;
import ax.p0.f;
import ax.p0.g;
import ax.p0.h;
import ax.q0.d;
import ax.q0.e;
import ax.q0.f;
import ax.r0.y;
import ax.sb.t;
import ax.tb.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Set;

public final class h
implements k<d> {
    public static final h a = new h();
    private static final String b = "preferences_pb";

    private h() {
    }

    private final void d(String a8, ax.p0.h list, ax.q0.a a9) {
        h.b b8 = ((ax.p0.h)((Object)list)).Z();
        int n8 = b8 == null ? -1 : ax.q0.h$a.a[b8.ordinal()];
        switch (n8) {
            default: {
                throw new ax.sb.l();
            }
            case 8: {
                throw new ax.n0.a("Value not set.", null, 2, null);
            }
            case 7: {
                a8 = f.g((String)((Object)a8));
                list = ((ax.p0.h)((Object)list)).Y().O();
                l.e(list, "value.stringSet.stringsList");
                a9.i(a8, o.Y((Iterable)list));
                return;
            }
            case 6: {
                a8 = f.f((String)((Object)a8));
                list = ((ax.p0.h)((Object)list)).X();
                l.e(list, "value.string");
                a9.i(a8, list);
                return;
            }
            case 5: {
                a9.i(f.e((String)((Object)a8)), ((ax.p0.h)((Object)list)).W());
                return;
            }
            case 4: {
                a9.i(f.d((String)((Object)a8)), ((ax.p0.h)((Object)list)).V());
                return;
            }
            case 3: {
                a9.i(f.b((String)((Object)a8)), ((ax.p0.h)((Object)list)).T());
                return;
            }
            case 2: {
                a9.i(f.c((String)((Object)a8)), Float.valueOf(((ax.p0.h)((Object)list)).U()));
                return;
            }
            case 1: {
                a9.i(f.a((String)((Object)a8)), ((ax.p0.h)((Object)list)).R());
                return;
            }
            case -1: 
        }
        throw new ax.n0.a("Value case is null.", null, 2, null);
    }

    private final ax.p0.h g(Object object) {
        if (object instanceof Boolean) {
            object = ax.p0.h.a0().C((Boolean)object).s();
            l.e(object, "newBuilder().setBoolean(value).build()");
            return (ax.p0.h)object;
        }
        if (object instanceof Float) {
            object = ax.p0.h.a0().E(((Number)object).floatValue()).s();
            l.e(object, "newBuilder().setFloat(value).build()");
            return (ax.p0.h)object;
        }
        if (object instanceof Double) {
            object = ax.p0.h.a0().D(((Number)object).doubleValue()).s();
            l.e(object, "newBuilder().setDouble(value).build()");
            return (ax.p0.h)object;
        }
        if (object instanceof Integer) {
            object = ax.p0.h.a0().F(((Number)object).intValue()).s();
            l.e(object, "newBuilder().setInteger(value).build()");
            return (ax.p0.h)object;
        }
        if (object instanceof Long) {
            object = ax.p0.h.a0().G(((Number)object).longValue()).s();
            l.e(object, "newBuilder().setLong(value).build()");
            return (ax.p0.h)object;
        }
        if (object instanceof String) {
            object = ax.p0.h.a0().H((String)object).s();
            l.e(object, "newBuilder().setString(value).build()");
            return (ax.p0.h)object;
        }
        if (object instanceof Set) {
            object = ax.p0.h.a0().I(g.P().C((Set)object)).s();
            l.e(object, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            return (ax.p0.h)object;
        }
        throw new IllegalStateException(l.m("PreferencesSerializer does not support type: ", object.getClass().getName()));
    }

    @Override
    public Object c(InputStream object, ax.wb.e<? super d> object2) throws IOException, ax.n0.a {
        object2 = ax.p0.d.a.a((InputStream)object);
        object = e.b(new d.b[0]);
        object2 = ((ax.p0.f)object2).M();
        l.e(object2, "preferencesProto.preferencesMap");
        for (Map.Entry<String, ax.p0.h> entry : object2.entrySet()) {
            object2 = entry.getKey();
            ax.p0.h h8 = entry.getValue();
            h object3 = a;
            l.e(object2, "name");
            l.e(h8, "value");
            object3.d((String)object2, h8, (ax.q0.a)object);
        }
        return ((d)object).d();
    }

    public d e() {
        return e.a();
    }

    public final String f() {
        return b;
    }

    public Object h(d object, OutputStream outputStream, ax.wb.e<? super t> object2) throws IOException, ax.n0.a {
        object2 = ((d)object).a();
        object = ax.p0.f.P();
        for (Map.Entry entry : object2.entrySet()) {
            object2 = (d.a)entry.getKey();
            entry = entry.getValue();
            ((f.a)object).C(((d.a)object2).a(), this.g(entry));
        }
        ((ax.p0.f)((y.a)object).s()).p(outputStream);
        return t.a;
    }

    public final class a {
        public static final int[] a;

        static {
            int[] nArray = new int[h.b.values().length];
            nArray[h.b.c0.ordinal()] = 1;
            nArray[h.b.d0.ordinal()] = 2;
            nArray[h.b.i0.ordinal()] = 3;
            nArray[h.b.e0.ordinal()] = 4;
            nArray[h.b.f0.ordinal()] = 5;
            nArray[h.b.g0.ordinal()] = 6;
            nArray[h.b.h0.ordinal()] = 7;
            nArray[h.b.j0.ordinal()] = 8;
            a = nArray;
        }
    }
}

