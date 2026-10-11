package ax.i7;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: ax.i7.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2275B extends AbstractC2277a {
    private ArrayList<a> c;

    /* renamed from: ax.i7.B$a */
    public static final class a {
        i a;
        m b;
        j c;

        public a() {
            this(null);
        }

        public a a(i iVar) {
            this.a = iVar;
            return this;
        }

        public a b(m mVar) {
            this.b = mVar;
            return this;
        }

        public a(i iVar) {
            this(null, iVar);
        }

        public a(m mVar, i iVar) {
            b(mVar);
            a(iVar);
        }
    }

    public C2275B() {
        this("__END_OF_PART__" + UUID.randomUUID().toString() + "__");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [ax.i7.k] */
    @Override // ax.m7.y
    public void b(OutputStream outputStream) throws IOException {
        long j;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, f());
        String i = i();
        ArrayList<a> arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            a aVar = arrayList.get(i2);
            i2++;
            a aVar2 = aVar;
            m C = new m().C(null);
            m mVar = aVar2.b;
            if (mVar != null) {
                C.k(mVar);
            }
            C.F(null).P(null).I(null).G(null).f("Content-Transfer-Encoding", null);
            i iVar = aVar2.a;
            if (iVar != null) {
                C.f("Content-Transfer-Encoding", Arrays.asList("binary"));
                C.I(iVar.a());
                j jVar = aVar2.c;
                if (jVar == null) {
                    j = iVar.getLength();
                } else {
                    C.F(jVar.getName());
                    ?? kVar = new k(iVar, jVar);
                    long e = AbstractC2277a.e(iVar);
                    iVar = kVar;
                    j = e;
                }
                if (j != -1) {
                    C.G(Long.valueOf(j));
                }
            } else {
                iVar = null;
            }
            outputStreamWriter.write("--");
            outputStreamWriter.write(i);
            outputStreamWriter.write("\r\n");
            m.z(C, null, null, outputStreamWriter);
            if (iVar != null) {
                outputStreamWriter.write("\r\n");
                outputStreamWriter.flush();
                iVar.b(outputStream);
            }
            outputStreamWriter.write("\r\n");
        }
        outputStreamWriter.write("--");
        outputStreamWriter.write(i);
        outputStreamWriter.write("--");
        outputStreamWriter.write("\r\n");
        outputStreamWriter.flush();
    }

    @Override // ax.i7.AbstractC2277a, ax.i7.i
    public boolean c() {
        ArrayList<a> arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            a aVar = arrayList.get(i);
            i++;
            if (!aVar.a.c()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2275B h(a aVar) {
        this.c.add(ax.m7.v.d(aVar));
        return this;
    }

    public final String i() {
        return g().f("boundary");
    }

    public C2275B j(Collection<? extends i> collection) {
        this.c = new ArrayList<>(collection.size());
        Iterator<? extends i> it = collection.iterator();
        while (it.hasNext()) {
            h(new a(it.next()));
        }
        return this;
    }

    public C2275B(String str) {
        super(new o("multipart/related").m("boundary", str));
        this.c = new ArrayList<>();
    }
}
