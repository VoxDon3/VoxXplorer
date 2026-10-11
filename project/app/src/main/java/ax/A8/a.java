/*
 * Decompiled with CFR 0.152.
 */
package ax.A8;

import ax.C8.b;
import ax.C8.d;
import ax.y8.c;
import java.io.IOException;
import java.io.InputStream;

public class a
implements ax.z8.a {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int a(InputStream object) {
        try {
            int n8 = ((InputStream)object).read();
            if (n8 <= 127) {
                return n8;
            }
            int n9 = 0;
            for (int i8 = 0; i8 < (n8 & 0x7F); ++i8) {
                n9 = (n9 << 8) + ((InputStream)object).read();
            }
            if (n9 != 0) {
                return n9;
            }
            object = new c("The indefinite length form is not (yet) supported!");
            throw object;
        }
        catch (IOException iOException) {}
        throw new c("Unable to read the length of the ASN.1 object.", new Object[]{iOException});
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public ax.C8.c<? extends b> b(InputStream object) {
        int n8;
        try {
            n8 = ((InputStream)object).read();
        }
        catch (IOException iOException) {
            throw new c("Unable to parse ASN.1 tag", new Object[]{iOException});
        }
        byte by = (byte)n8;
        d d8 = d.h(by);
        ax.C8.a a8 = ax.C8.a.h(by);
        if ((n8 &= 0x1F) <= 30) {
            return ax.C8.c.e(d8, n8).b(a8);
        }
        int n9 = ((InputStream)object).read();
        if ((n9 & 0x7F) == 0) {
            object = new c("corrupted stream - invalid high tag number found");
            throw object;
        }
        n8 = 0;
        while (n9 >= 0 && (n9 & 0x80) != 0) {
            n8 = (n9 & 0x7F | n8) << 7;
            n9 = ((InputStream)object).read();
        }
        if (n9 >= 0) {
            return ax.C8.c.e(d8, n9 & 0x7F | n8).b(a8);
        }
        object = new c("EOF found inside tag value.");
        throw object;
    }

    @Override
    public byte[] c(int n8, InputStream inputStream) {
        IOException iOException2;
        block4: {
            int n9;
            byte[] byArray = new byte[n8];
            for (int i8 = 0; i8 < n8; i8 += n9) {
                try {
                    n9 = inputStream.read(byArray, i8, n8 - i8);
                    if (n9 == -1) break;
                    continue;
                }
                catch (IOException iOException2) {
                    break block4;
                }
            }
            return byArray;
        }
        throw new c("Unable to read the value of the ASN.1 object", new Object[]{iOException2});
    }
}

