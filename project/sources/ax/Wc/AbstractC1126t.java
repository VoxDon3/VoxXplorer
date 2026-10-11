package ax.Wc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ax.Wc.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1126t implements InterfaceC1101g {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC1101g) {
            return g().y(((InterfaceC1101g) obj).g());
        }
        return false;
    }

    @Override // ax.Wc.InterfaceC1101g
    public abstract A g();

    public int hashCode() {
        return g().hashCode();
    }

    public void n(OutputStream outputStream, String str) throws IOException {
        g().n(outputStream, str);
    }

    public byte[] p() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g().u(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] q(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g().n(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
