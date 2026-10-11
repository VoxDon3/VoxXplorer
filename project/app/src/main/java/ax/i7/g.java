/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.F;
import ax.m7.k;
import ax.m7.v;
import ax.n7.a;
import ax.n7.b;
import ax.n7.c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class g
extends k {
    private static final b l0 = new c("=&-_.!~*'()@:$,;/?:");
    private String e0;
    private String f0;
    private String g0;
    private int h0 = -1;
    private List<String> i0;
    private String j0;
    private boolean k0;

    public g() {
    }

    public g(String string) {
        this(string, false);
    }

    private g(String string, String string2, int n8, String string3, String string4, String string5, String string6, boolean bl) {
        this.e0 = string.toLowerCase(Locale.US);
        this.f0 = string2;
        this.h0 = n8;
        this.i0 = g.x(string3, bl);
        this.k0 = bl;
        if (bl) {
            this.j0 = string4;
            if (string5 != null) {
                F.d(string5, this, false);
            }
            this.g0 = string6;
            return;
        }
        string2 = null;
        string = string4 != null ? a.a(string4) : null;
        this.j0 = string;
        if (string5 != null) {
            F.c(string5, this);
        }
        string = string2;
        if (string6 != null) {
            string = a.a(string6);
        }
        this.g0 = string;
    }

    public g(String string, boolean bl) {
        this(g.t(string), bl);
    }

    public g(URL uRL, boolean bl) {
        this(uRL.getProtocol(), uRL.getHost(), uRL.getPort(), uRL.getPath(), uRL.getRef(), uRL.getQuery(), uRL.getUserInfo(), bl);
    }

    static void i(Set<Map.Entry<String, Object>> entry, StringBuilder stringBuilder, boolean bl) {
        Iterator<Map.Entry<String, Object>> iterator = entry.iterator();
        boolean bl2 = true;
        block0: while (iterator.hasNext()) {
            entry = iterator.next();
            Object object = entry.getValue();
            if (object == null) continue;
            entry = bl ? (String)entry.getKey() : a.g((String)entry.getKey());
            if (object instanceof Collection) {
                object = ((Collection)object).iterator();
                boolean bl3 = bl2;
                while (true) {
                    bl2 = bl3;
                    if (!object.hasNext()) continue block0;
                    bl3 = g.j(bl3, stringBuilder, (String)((Object)entry), object.next(), bl);
                }
            }
            bl2 = g.j(bl2, stringBuilder, (String)((Object)entry), object, bl);
        }
    }

    private static boolean j(boolean bl, StringBuilder stringBuilder, String string, Object object, boolean bl2) {
        if (bl) {
            stringBuilder.append('?');
            bl = false;
        } else {
            stringBuilder.append('&');
        }
        stringBuilder.append(string);
        string = bl2 ? object.toString() : a.g(object.toString());
        if (string.length() != 0) {
            stringBuilder.append('=');
            stringBuilder.append(string);
        }
        return bl;
    }

    private void k(StringBuilder stringBuilder) {
        int n8 = this.i0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            String string = this.i0.get(i8);
            if (i8 != 0) {
                stringBuilder.append('/');
            }
            if (string.length() == 0) continue;
            if (!this.k0) {
                string = a.e(string);
            }
            stringBuilder.append(string);
        }
    }

    private static URL t(String object) {
        try {
            object = new URL((String)object);
            return object;
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException(malformedURLException);
        }
    }

    public static List<String> x(String string, boolean bl) {
        if (string != null && string.length() != 0) {
            ArrayList<String> arrayList = new ArrayList<String>();
            boolean bl2 = true;
            int n8 = 0;
            while (bl2) {
                int n9 = string.indexOf(47, n8);
                bl2 = n9 != -1;
                String string2 = bl2 ? string.substring(n8, n9) : string.substring(n8);
                if (!bl) {
                    string2 = a.b(string2);
                }
                arrayList.add(string2);
                n8 = n9 + 1;
            }
            return arrayList;
        }
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (super.equals(object) && object instanceof g) {
            object = (g)object;
            return this.l().equals(((g)object).l());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.l().hashCode();
    }

    public final String l() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.m());
        stringBuilder.append(this.n());
        return stringBuilder.toString();
    }

    public final String m() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(v.d(this.e0));
        stringBuilder.append("://");
        String string = this.g0;
        if (string != null) {
            if (!this.k0) {
                string = a.h(string);
            }
            stringBuilder.append(string);
            stringBuilder.append('@');
        }
        stringBuilder.append(v.d(this.f0));
        int n8 = this.h0;
        if (n8 != -1) {
            stringBuilder.append(':');
            stringBuilder.append(n8);
        }
        return stringBuilder.toString();
    }

    public final String n() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.i0 != null) {
            this.k(stringBuilder);
        }
        g.i(this.entrySet(), stringBuilder, this.k0);
        String string = this.j0;
        if (string != null) {
            stringBuilder.append('#');
            if (!this.k0) {
                string = l0.a(string);
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public g o() {
        g g8 = (g)super.b();
        if (this.i0 != null) {
            g8.i0 = new ArrayList<String>(this.i0);
        }
        return g8;
    }

    public String r() {
        return this.f0;
    }

    public String s() {
        if (this.i0 == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        this.k(stringBuilder);
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return this.l();
    }

    public g v(String string, Object object) {
        return (g)super.f(string, object);
    }

    public void w(String string) {
        this.i0 = g.x(string, this.k0);
    }

    public final URL y() {
        return g.t(this.l());
    }

    public final URL z(String object) {
        try {
            object = new URL(this.y(), (String)object);
            return object;
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException(malformedURLException);
        }
    }
}

