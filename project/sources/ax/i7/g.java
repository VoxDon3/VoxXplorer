package ax.i7;

import ax.n7.AbstractC2585b;
import ax.n7.C2584a;
import ax.n7.C2586c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class g extends ax.m7.k {
    private static final AbstractC2585b l0 = new C2586c("=&-_.!~*'()@:$,;/?:");
    private String e0;
    private String f0;
    private String g0;
    private int h0;
    private List<String> i0;
    private String j0;
    private boolean k0;

    public g() {
        this.h0 = -1;
    }

    static void i(Set<Map.Entry<String, Object>> set, StringBuilder sb, boolean z) {
        boolean z2 = true;
        for (Map.Entry<String, Object> entry : set) {
            Object value = entry.getValue();
            if (value != null) {
                String key = z ? entry.getKey() : C2584a.g(entry.getKey());
                if (value instanceof Collection) {
                    Iterator it = ((Collection) value).iterator();
                    while (it.hasNext()) {
                        z2 = j(z2, sb, key, it.next(), z);
                    }
                } else {
                    z2 = j(z2, sb, key, value, z);
                }
            }
        }
    }

    private static boolean j(boolean z, StringBuilder sb, String str, Object obj, boolean z2) {
        if (z) {
            sb.append('?');
            z = false;
        } else {
            sb.append('&');
        }
        sb.append(str);
        String obj2 = z2 ? obj.toString() : C2584a.g(obj.toString());
        if (obj2.length() != 0) {
            sb.append('=');
            sb.append(obj2);
        }
        return z;
    }

    private void k(StringBuilder sb) {
        int size = this.i0.size();
        for (int i = 0; i < size; i++) {
            String str = this.i0.get(i);
            if (i != 0) {
                sb.append('/');
            }
            if (str.length() != 0) {
                if (!this.k0) {
                    str = C2584a.e(str);
                }
                sb.append(str);
            }
        }
    }

    private static URL t(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static List<String> x(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        int i = 0;
        while (z2) {
            int indexOf = str.indexOf(47, i);
            boolean z3 = indexOf != -1;
            String substring = z3 ? str.substring(i, indexOf) : str.substring(i);
            if (!z) {
                substring = C2584a.b(substring);
            }
            arrayList.add(substring);
            i = indexOf + 1;
            z2 = z3;
        }
        return arrayList;
    }

    @Override // ax.m7.k, java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && (obj instanceof g)) {
            return l().equals(((g) obj).l());
        }
        return false;
    }

    @Override // ax.m7.k, java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return l().hashCode();
    }

    public final String l() {
        return m() + n();
    }

    public final String m() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) ax.m7.v.d(this.e0));
        sb.append("://");
        String str = this.g0;
        if (str != null) {
            if (!this.k0) {
                str = C2584a.h(str);
            }
            sb.append(str);
            sb.append('@');
        }
        sb.append((String) ax.m7.v.d(this.f0));
        int i = this.h0;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        return sb.toString();
    }

    public final String n() {
        StringBuilder sb = new StringBuilder();
        if (this.i0 != null) {
            k(sb);
        }
        i(entrySet(), sb, this.k0);
        String str = this.j0;
        if (str != null) {
            sb.append('#');
            if (!this.k0) {
                str = l0.a(str);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // ax.m7.k, java.util.AbstractMap
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g clone() {
        g gVar = (g) super.clone();
        if (this.i0 != null) {
            gVar.i0 = new ArrayList(this.i0);
        }
        return gVar;
    }

    public String r() {
        return this.f0;
    }

    public String s() {
        if (this.i0 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        k(sb);
        return sb.toString();
    }

    @Override // ax.m7.k, java.util.AbstractMap
    public String toString() {
        return l();
    }

    @Override // ax.m7.k
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public g f(String str, Object obj) {
        return (g) super.f(str, obj);
    }

    public void w(String str) {
        this.i0 = x(str, this.k0);
    }

    public final URL y() {
        return t(l());
    }

    public final URL z(String str) {
        try {
            return new URL(y(), str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public g(String str) {
        this(str, false);
    }

    public g(String str, boolean z) {
        this(t(str), z);
    }

    public g(URL url, boolean z) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo(), z);
    }

    private g(String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z) {
        this.h0 = -1;
        this.e0 = str.toLowerCase(Locale.US);
        this.f0 = str2;
        this.h0 = i;
        this.i0 = x(str3, z);
        this.k0 = z;
        if (z) {
            this.j0 = str4;
            if (str5 != null) {
                F.d(str5, this, false);
            }
            this.g0 = str6;
            return;
        }
        this.j0 = str4 != null ? C2584a.a(str4) : null;
        if (str5 != null) {
            F.c(str5, this);
        }
        this.g0 = str6 != null ? C2584a.a(str6) : null;
    }
}
