package ax.ke;

import java.io.IOException;
import okhttp3.Request;

/* renamed from: ax.ke.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2430b<T> extends Cloneable {
    void cancel();

    InterfaceC2430b<T> clone();

    D<T> execute() throws IOException;

    boolean isCanceled();

    Request request();

    void u(InterfaceC2432d<T> interfaceC2432d);
}
