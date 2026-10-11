package ax.w9;

import ax.y8.C3513b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class f {
    private int a;
    private String b;

    public f(int i, String str) {
        this.a = i;
        this.b = str;
    }

    protected void a(ax.C8.b<?> bVar) throws e {
        if (bVar instanceof ax.D8.c) {
            ax.D8.c cVar = (ax.D8.c) bVar;
            if (cVar.r() == this.a) {
                ax.C8.b p = cVar.p();
                if (!(p instanceof ax.D8.a)) {
                    throw new e("Expected a " + this.b + " (SEQUENCE), not: " + p);
                }
                Iterator<ax.C8.b> it = ((ax.D8.a) p).iterator();
                while (it.hasNext()) {
                    ax.C8.b next = it.next();
                    if (!(next instanceof ax.D8.c)) {
                        throw new e("Expected an ASN.1 TaggedObject as " + this.b + " contents, not: " + next);
                    }
                    b((ax.D8.c) next);
                }
                return;
            }
        }
        throw new e("Expected to find the " + this.b + " (CHOICE [" + this.a + "]) header, not: " + bVar);
    }

    protected abstract void b(ax.D8.c cVar) throws e;

    public abstract void c(ax.Z8.a<?> aVar) throws e;

    protected void d(ax.Z8.a<?> aVar, ax.C8.b<?> bVar) throws IOException {
        ax.D8.c cVar = new ax.D8.c(ax.C8.c.d(this.a).c(), bVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.a);
        arrayList.add(cVar);
        ax.D8.c cVar2 = new ax.D8.c(ax.C8.c.a(0), (ax.C8.b) new ax.D8.a(arrayList), false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C3513b c3513b = new C3513b(new ax.B8.b(), byteArrayOutputStream);
        try {
            c3513b.c(cVar2);
            c3513b.close();
            aVar.o(byteArrayOutputStream.toByteArray());
        } catch (Throwable th) {
            try {
                c3513b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
