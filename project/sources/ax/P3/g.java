package ax.P3;

import android.util.Log;
import ax.b0.InterfaceC1443d;
import ax.c4.InterfaceC1841d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g<DataType, ResourceType, Transcode> {
    private final Class<DataType> a;
    private final List<? extends ax.M3.k<DataType, ResourceType>> b;
    private final InterfaceC1841d<ResourceType, Transcode> c;
    private final InterfaceC1443d<List<Exception>> d;
    private final String e;

    interface a<ResourceType> {
        s<ResourceType> a(s<ResourceType> sVar);
    }

    public g(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ax.M3.k<DataType, ResourceType>> list, InterfaceC1841d<ResourceType, Transcode> interfaceC1841d, InterfaceC1443d<List<Exception>> interfaceC1443d) {
        this.a = cls;
        this.b = list;
        this.c = interfaceC1841d;
        this.d = interfaceC1443d;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private s<ResourceType> b(ax.N3.c<DataType> cVar, int i, int i2, ax.M3.j jVar) throws o {
        List<Exception> b = this.d.b();
        try {
            return c(cVar, i, i2, jVar, b);
        } finally {
            this.d.a(b);
        }
    }

    private s<ResourceType> c(ax.N3.c<DataType> cVar, int i, int i2, ax.M3.j jVar, List<Exception> list) throws o {
        int size = this.b.size();
        s<ResourceType> sVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            ax.M3.k<DataType, ResourceType> kVar = this.b.get(i3);
            try {
                if (kVar.b(cVar.a(), jVar)) {
                    sVar = kVar.a(cVar.a(), i, i2, jVar);
                }
            } catch (IOException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e);
                }
                list.add(e);
            }
            if (sVar != null) {
                break;
            }
        }
        if (sVar != null) {
            return sVar;
        }
        throw new o(this.e, new ArrayList(list));
    }

    public s<Transcode> a(ax.N3.c<DataType> cVar, int i, int i2, ax.M3.j jVar, a<ResourceType> aVar) throws o {
        return this.c.a(aVar.a(b(cVar, i, i2, jVar)));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
