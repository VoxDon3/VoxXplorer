package ax.L9;

import ax.N9.C0841e;
import ax.P9.j;
import ax.P9.l;
import ax.P9.o;
import ax.P9.q;
import com.microsoft.graph.extensions.UploadSession;
import java.io.BufferedInputStream;

/* loaded from: classes3.dex */
public class a<UploadType> implements q<C0841e, UploadType> {
    private final Class<UploadType> a;

    public a(Class<UploadType> cls) {
        this.a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @Override // ax.P9.q
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0841e a(o oVar, l lVar, ax.T9.e eVar, ax.Q9.b bVar) throws Exception {
        ?? r0 = 0;
        try {
            try {
                if (lVar.f() == 202) {
                    bVar.a("Chunk bytes has been accepted by the server.");
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(lVar.c());
                    C0841e c0841e = new C0841e((UploadSession) eVar.b(ax.P9.f.d(bufferedInputStream), UploadSession.class));
                    bufferedInputStream.close();
                    return c0841e;
                }
                if (lVar.f() != 201 && lVar.f() != 200) {
                    if (lVar.f() < 400) {
                        return null;
                    }
                    bVar.a("Receiving error during upload, see detail on result error");
                    return new C0841e(j.b(oVar, null, eVar, lVar));
                }
                bVar.a("Upload session is completed, uploaded item returned.");
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(lVar.c());
                C0841e c0841e2 = new C0841e(eVar.b(ax.P9.f.d(bufferedInputStream2), this.a));
                bufferedInputStream2.close();
                return c0841e2;
            } catch (Throwable th) {
                th = th;
                r0 = oVar;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // ax.P9.q
    public void b(l lVar) {
    }
}
