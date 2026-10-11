/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import ax.M3.j;
import ax.N3.c;
import ax.P3.g;
import ax.P3.o;
import ax.P3.s;
import ax.b0.d;
import ax.k4.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q<Data, ResourceType, Transcode> {
    private final Class<Data> a;
    private final d<List<Exception>> b;
    private final List<? extends g<Data, ResourceType, Transcode>> c;
    private final String d;

    public q(Class<Data> clazz, Class<ResourceType> clazz2, Class<Transcode> clazz3, List<g<Data, ResourceType, Transcode>> object, d<List<Exception>> d8) {
        this.a = clazz;
        this.b = d8;
        this.c = h.c(object);
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed LoadPath{");
        ((StringBuilder)object).append(clazz.getSimpleName());
        ((StringBuilder)object).append("->");
        ((StringBuilder)object).append(clazz2.getSimpleName());
        ((StringBuilder)object).append("->");
        ((StringBuilder)object).append(clazz3.getSimpleName());
        ((StringBuilder)object).append("}");
        this.d = ((StringBuilder)object).toString();
    }

    private s<Transcode> b(c<Data> c8, j j8, int n8, int n9, g.a<ResourceType> a8, List<Exception> list) throws o {
        g<Data, ResourceType, Transcode> g8;
        int n10 = this.c.size();
        Object object = null;
        int n11 = 0;
        while (true) {
            g8 = object;
            if (n11 >= n10) break;
            g8 = this.c.get(n11);
            try {
                g8 = g8.a(c8, n8, n9, j8, a8);
                object = g8;
            }
            catch (o o8) {
                list.add(o8);
            }
            if (object != null) {
                g8 = object;
                break;
            }
            ++n11;
        }
        if (g8 != null) {
            return g8;
        }
        throw new o(this.d, new ArrayList<Exception>(list));
    }

    public s<Transcode> a(c<Data> object, j j8, int n8, int n9, g.a<ResourceType> a8) throws o {
        List<Exception> list = this.b.b();
        try {
            object = this.b((c<Data>)object, j8, n8, n9, a8, list);
            return object;
        }
        finally {
            this.b.a(list);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LoadPath{decodePaths=");
        List<g<Data, ResourceType, Transcode>> list = this.c;
        stringBuilder.append(Arrays.toString(list.toArray(new g[list.size()])));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

