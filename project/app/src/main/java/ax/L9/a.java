/*
 * Decompiled with CFR 0.152.
 */
package ax.L9;

import ax.P9.f;
import ax.P9.j;
import ax.P9.l;
import ax.P9.o;
import ax.P9.q;
import ax.Q9.b;
import ax.T9.e;
import com.microsoft.graph.extensions.UploadSession;
import java.io.BufferedInputStream;
import java.io.InputStream;

public class a<UploadType>
implements q<ax.N9.e, UploadType> {
    private final Class<UploadType> a;

    public a(Class<UploadType> clazz) {
        this.a = clazz;
    }

    @Override
    public void b(l l8) {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ax.N9.e c(o object, l e8, e e9, b object2) throws Exception {
        RuntimeException var2_5;
        block11: {
            block10: {
                block9: {
                    Object var5_8;
                    block8: {
                        var5_8 = null;
                        if (e8.f() != 202) break block8;
                        object2.a("Chunk bytes has been accepted by the server.");
                        object = object2 = new BufferedInputStream(e8.c());
                        try {
                            e8 = new ax.N9.e(e9.b(f.d((InputStream)object2), UploadSession.class));
                        }
                        catch (Throwable throwable) {
                            break block11;
                        }
                        ((InputStream)object2).close();
                        return e8;
                    }
                    try {
                        if (e8.f() != 201 && e8.f() != 200) break block9;
                        break block10;
                    }
                    catch (Throwable throwable) {
                        object = var5_8;
                    }
                    break block11;
                }
                if (e8.f() >= 400) {
                    object2.a("Receiving error during upload, see detail on result error");
                    return new ax.N9.e(j.b((o)object, null, (e)((Object)e9), e8));
                }
                return null;
            }
            object2.a("Upload session is completed, uploaded item returned.");
            e8 = new BufferedInputStream(e8.c());
            object = e8;
            e9 = new ax.N9.e<UploadType>(e9.b(f.d(e8), this.a));
            ((InputStream)((Object)e8)).close();
            return e9;
        }
        if (object != null) {
            ((InputStream)object).close();
        }
        throw var2_5;
    }
}

