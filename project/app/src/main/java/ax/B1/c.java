/*
 * Decompiled with CFR 0.152.
 */
package ax.B1;

import ax.B1.a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class c {
    private final ByteArrayOutputStream a;
    private final DataOutputStream b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream;
        this.a = byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String string) throws IOException {
        dataOutputStream.writeBytes(string);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a object) {
        String string;
        block3: {
            this.a.reset();
            try {
                c.b(this.b, ((a)object).a);
                string = ((a)object).b;
                if (string != null) break block3;
                string = "";
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        c.b(this.b, string);
        this.b.writeLong(((a)object).c);
        this.b.writeLong(((a)object).d);
        ((OutputStream)this.b).write(((a)object).e);
        this.b.flush();
        object = this.a.toByteArray();
        return object;
    }
}

