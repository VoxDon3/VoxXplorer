package ax.ie;

import ax.be.C1741i;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class d extends b {
    private final DataInputStream c;

    public d(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.c = dataInputStream;
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new C1741i();
        }
        this.b = dataInputStream.readInt();
        this.a = -1;
    }

    @Override // ax.ie.b
    public void f() throws IOException {
        if ((this.a & (-16777216)) == 0) {
            this.b = (this.b << 8) | this.c.readUnsignedByte();
            this.a <<= 8;
        }
    }

    public boolean g() {
        return this.b == 0;
    }
}
