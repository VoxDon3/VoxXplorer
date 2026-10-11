package ax.A8;

import ax.C8.b;
import ax.C8.c;
import ax.C8.d;
import ax.y8.C3514c;
import ax.z8.InterfaceC3557a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class a implements InterfaceC3557a {
    @Override // ax.z8.InterfaceC3557a
    public int a(InputStream inputStream) {
        try {
            int read = inputStream.read();
            if (read <= 127) {
                return read;
            }
            int i = read & 127;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                i2 = (i2 << 8) + inputStream.read();
            }
            if (i2 != 0) {
                return i2;
            }
            throw new C3514c("The indefinite length form is not (yet) supported!");
        } catch (IOException e) {
            throw new C3514c("Unable to read the length of the ASN.1 object.", e);
        }
    }

    @Override // ax.z8.InterfaceC3557a
    public c<? extends b> b(InputStream inputStream) {
        try {
            int read = inputStream.read();
            byte b = (byte) read;
            d h = d.h(b);
            ax.C8.a h2 = ax.C8.a.h(b);
            int i = read & 31;
            if (i <= 30) {
                return c.e(h, i).b(h2);
            }
            int read2 = inputStream.read();
            if ((read2 & 127) == 0) {
                throw new C3514c("corrupted stream - invalid high tag number found");
            }
            int i2 = 0;
            while (read2 >= 0 && (read2 & 128) != 0) {
                i2 = ((read2 & 127) | i2) << 7;
                read2 = inputStream.read();
            }
            if (read2 >= 0) {
                return c.e(h, (read2 & 127) | i2).b(h2);
            }
            throw new C3514c("EOF found inside tag value.");
        } catch (IOException e) {
            throw new C3514c("Unable to parse ASN.1 tag", e);
        }
    }

    @Override // ax.z8.InterfaceC3557a
    public byte[] c(int i, InputStream inputStream) {
        try {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            return bArr;
        } catch (IOException e) {
            throw new C3514c("Unable to read the value of the ASN.1 object", e);
        }
    }
}
