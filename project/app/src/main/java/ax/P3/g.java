/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import android.util.Log;
import ax.M3.j;
import ax.M3.k;
import ax.N3.c;
import ax.P3.o;
import ax.P3.s;
import ax.c4.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class g<DataType, ResourceType, Transcode> {
    private final Class<DataType> a;
    private final List<? extends k<DataType, ResourceType>> b;
    private final d<ResourceType, Transcode> c;
    private final ax.b0.d<List<Exception>> d;
    private final String e;

    public g(Class<DataType> clazz, Class<ResourceType> clazz2, Class<Transcode> clazz3, List<? extends k<DataType, ResourceType>> object, d<ResourceType, Transcode> d8, ax.b0.d<List<Exception>> d9) {
        this.a = clazz;
        this.b = object;
        this.c = d8;
        this.d = d9;
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed DecodePath{");
        ((StringBuilder)object).append(clazz.getSimpleName());
        ((StringBuilder)object).append("->");
        ((StringBuilder)object).append(clazz2.getSimpleName());
        ((StringBuilder)object).append("->");
        ((StringBuilder)object).append(clazz3.getSimpleName());
        ((StringBuilder)object).append("}");
        this.e = ((StringBuilder)object).toString();
    }

    private s<ResourceType> b(c<DataType> object, int n8, int n9, j j8) throws o {
        List<Exception> list = this.d.b();
        try {
            object = this.c((c<DataType>)object, n8, n9, j8, list);
            return object;
        }
        finally {
            this.d.a(list);
        }
    }

    private s<ResourceType> c(c<DataType> c8, int n8, int n9, j j8, List<Exception> list) throws o {
        Object object;
        int n10 = this.b.size();
        StringBuilder stringBuilder = null;
        int n11 = 0;
        while (true) {
            object = stringBuilder;
            if (n11 >= n10) break;
            k<DataType, ResourceType> k8 = this.b.get(n11);
            object = stringBuilder;
            try {
                if (k8.b(c8.a(), j8)) {
                    object = k8.a(c8.a(), n8, n9, j8);
                }
            }
            catch (IOException iOException) {
                if (Log.isLoggable((String)"DecodePath", (int)2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Failed to decode data for ");
                    ((StringBuilder)object).append(k8);
                    Log.v((String)"DecodePath", (String)((StringBuilder)object).toString(), (Throwable)iOException);
                }
                list.add(iOException);
                object = stringBuilder;
            }
            if (object != null) break;
            ++n11;
            stringBuilder = object;
        }
        if (object != null) {
            return object;
        }
        throw new o(this.e, new ArrayList<Exception>(list));
    }

    public s<Transcode> a(c<DataType> object, int n8, int n9, j j8, a<ResourceType> a8) throws o {
        object = a8.a(this.b((c<DataType>)object, n8, n9, j8));
        return this.c.a((s<ResourceType>)object);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DecodePath{ dataClass=");
        stringBuilder.append(this.a);
        stringBuilder.append(", decoders=");
        stringBuilder.append(this.b);
        stringBuilder.append(", transcoder=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    static interface a<ResourceType> {
        public s<ResourceType> a(s<ResourceType> var1);
    }
}

