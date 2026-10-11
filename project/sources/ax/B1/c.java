package ax.B1;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c {
    private final ByteArrayOutputStream a;
    private final DataOutputStream b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.a.reset();
        try {
            b(this.b, aVar.a);
            String str = aVar.b;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            b(this.b, str);
            this.b.writeLong(aVar.c);
            this.b.writeLong(aVar.d);
            this.b.write(aVar.e);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
