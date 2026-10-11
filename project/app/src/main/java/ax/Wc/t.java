/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class t
implements g {
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof g)) {
            return false;
        }
        object = (g)object;
        return this.g().y(object.g());
    }

    @Override
    public abstract A g();

    public int hashCode() {
        return this.g().hashCode();
    }

    public void n(OutputStream outputStream, String string) throws IOException {
        this.g().n(outputStream, string);
    }

    public byte[] p() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.g().u(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] q(String string) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.g().n(byteArrayOutputStream, string);
        return byteArrayOutputStream.toByteArray();
    }
}

