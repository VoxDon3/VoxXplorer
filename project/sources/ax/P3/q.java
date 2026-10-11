package ax.P3;

import ax.P3.g;
import ax.b0.InterfaceC1443d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class q<Data, ResourceType, Transcode> {
    private final Class<Data> a;
    private final InterfaceC1443d<List<Exception>> b;
    private final List<? extends g<Data, ResourceType, Transcode>> c;
    private final String d;

    public q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<g<Data, ResourceType, Transcode>> list, InterfaceC1443d<List<Exception>> interfaceC1443d) {
        this.a = cls;
        this.b = interfaceC1443d;
        this.c = (List) ax.k4.h.c(list);
        this.d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private s<Transcode> b(ax.N3.c<Data> cVar, ax.M3.j jVar, int i, int i2, g.a<ResourceType> aVar, List<Exception> list) throws o {
        int size = this.c.size();
        s<Transcode> sVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                sVar = this.c.get(i3).a(cVar, i, i2, jVar, aVar);
            } catch (o e) {
                list.add(e);
            }
            if (sVar != null) {
                break;
            }
        }
        if (sVar != null) {
            return sVar;
        }
        throw new o(this.d, new ArrayList(list));
    }

    public s<Transcode> a(ax.N3.c<Data> cVar, ax.M3.j jVar, int i, int i2, g.a<ResourceType> aVar) throws o {
        List<Exception> b = this.b.b();
        try {
            return b(cVar, jVar, i, i2, aVar, b);
        } finally {
            this.b.a(b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadPath{decodePaths=");
        List<? extends g<Data, ResourceType, Transcode>> list = this.c;
        sb.append(Arrays.toString(list.toArray(new g[list.size()])));
        sb.append('}');
        return sb.toString();
    }
}
