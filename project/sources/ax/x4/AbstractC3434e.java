package ax.x4;

import ax.p4.C2769f;
import ax.p4.C2773j;
import ax.p4.o;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.x4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3434e<R, E, X extends C2769f> {
    public abstract o<R, E, X> a() throws C2773j;

    public R b(InputStream inputStream) throws C2769f, C2773j, IOException {
        return a().d(inputStream);
    }

    public R c(InputStream inputStream, long j) throws C2769f, C2773j, IOException {
        return a().e(inputStream, j);
    }
}
