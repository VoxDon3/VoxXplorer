package ax.y8;

import ax.C8.b;
import ax.z8.InterfaceC3558b;
import java.io.IOException;

/* renamed from: ax.y8.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3516e<T extends ax.C8.b> {
    protected final InterfaceC3558b a;

    public AbstractC3516e(InterfaceC3558b interfaceC3558b) {
        this.a = interfaceC3558b;
    }

    public abstract void a(T t, C3513b c3513b) throws IOException;

    public abstract int b(T t) throws IOException;
}
