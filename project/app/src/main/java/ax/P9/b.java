/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

import android.net.Uri;
import ax.M9.e;
import ax.M9.f;
import ax.P9.k;
import ax.P9.o;
import ax.S9.a;
import ax.S9.c;
import ax.S9.d;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class b
implements o {
    private k a;
    private final String b;
    private final f c;
    private final List<ax.S9.b> d;
    protected final List<d> e;
    protected final List<a> f;
    private final Class g;
    private boolean h;

    /*
     * WARNING - void declaration
     */
    public b(String object3, f object2, List<c> list, Class clazz) {
        Object var3_6;
        Object var4_7;
        Iterator iterator;
        this.b = object3;
        this.c = iterator;
        this.g = var4_7;
        this.d = new ArrayList<ax.S9.b>();
        this.e = new ArrayList<d>();
        this.f = new ArrayList<a>();
        if (var3_6 != null) {
            for (c c8 : var3_6) {
                if (c8 instanceof ax.S9.b) {
                    this.d.add((ax.S9.b)c8);
                }
                if (c8 instanceof d) {
                    this.e.add((d)c8);
                }
                if (!(c8 instanceof a)) continue;
                this.f.add((a)c8);
            }
        }
        ax.S9.b b8 = new ax.S9.b("SdkVersion", String.format("graph-android-v%s", "1.7.0"));
        this.d.add(b8);
    }

    private String l() {
        StringBuilder stringBuilder = new StringBuilder(this.b);
        if (this.n().size() > 0) {
            stringBuilder.append("(");
            int n8 = 0;
            while (n8 < this.f.size()) {
                int n9;
                a a8 = this.f.get(n8);
                stringBuilder.append(a8.a());
                stringBuilder.append("=");
                if (a8.b() != null) {
                    if (a8.b() instanceof String) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("'");
                        stringBuilder2.append(a8.b());
                        stringBuilder2.append("'");
                        stringBuilder.append(stringBuilder2.toString());
                    } else {
                        stringBuilder.append(a8.b());
                    }
                } else {
                    stringBuilder.append("null");
                }
                n8 = n9 = n8 + 1;
                if (n9 >= this.f.size()) continue;
                stringBuilder.append(",");
                n8 = n9;
            }
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }

    @Override
    public List<ax.S9.b> a() {
        return this.d;
    }

    @Override
    public URL d() {
        Uri.Builder builder = Uri.parse((String)this.l()).buildUpon();
        for (d object2 : this.e) {
            builder.appendQueryParameter(object2.a(), object2.b().toString());
        }
        try {
            URL uRL = new URL(builder.toString());
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid URL: ");
            stringBuilder.append(builder.toString());
            throw new ax.M9.d(stringBuilder.toString(), malformedURLException, ax.M9.e.j0);
        }
    }

    @Override
    public boolean g() {
        return this.h;
    }

    @Override
    public k h() {
        return this.a;
    }

    @Override
    public void k(String string, String string2) {
        this.d.add(new ax.S9.b(string, string2));
    }

    public f m() {
        return this.c;
    }

    public List<a> n() {
        return this.f;
    }

    public List<c> o() {
        LinkedList<c> linkedList = new LinkedList<c>();
        linkedList.addAll(this.d);
        linkedList.addAll(this.e);
        linkedList.addAll(this.f);
        return java.util.DesugarCollections.unmodifiableList(linkedList);
    }

    public List<d> p() {
        return this.e;
    }

    public Class q() {
        return this.g;
    }

    protected <T1, T2> T1 r(k k8, T2 T22) throws ax.M9.d {
        this.a = k8;
        return (T1)this.c.b().a(this, this.g, T22);
    }

    protected <T1, T2> void s(k k8, ax.L9.c<T1> c8, T2 T22) {
        this.a = k8;
        this.c.b().b(this, c8, this.g, T22);
    }

    public void t(k k8) {
        this.a = k8;
    }
}

