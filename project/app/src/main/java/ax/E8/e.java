/*
 * Decompiled with CFR 0.152.
 */
package ax.E8;

import ax.E8.f;
import ax.y8.d;
import ax.z8.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class e
extends f<String> {
    private String d0;

    public e(String string) {
        super(ax.C8.c.k);
        this.d0 = string;
    }

    private e(byte[] byArray, String string) {
        super(ax.C8.c.k, byArray);
        this.d0 = string;
    }

    public String k() {
        return this.d0;
    }

    public static class b
    extends d<e> {
        public b(a a8) {
            super(a8);
        }

        public e b(ax.C8.c<e> object, byte[] byArray) {
            boolean bl = byArray.length > 0;
            ax.G8.a.a(bl, "An ASN.1 OBJECT IDENTIFIER should have at least a one byte value", new Object[0]);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            StringBuilder stringBuilder = new StringBuilder();
            int n8 = byteArrayInputStream.read();
            stringBuilder.append(n8 / 40);
            stringBuilder.append('.');
            stringBuilder.append(n8 % 40);
            while (byteArrayInputStream.available() > 0) {
                BigInteger bigInteger;
                n8 = byteArrayInputStream.read();
                if (n8 < 127) {
                    stringBuilder.append('.');
                    stringBuilder.append(n8);
                    continue;
                }
                object = BigInteger.valueOf(n8 & 0x7F);
                do {
                    n8 = byteArrayInputStream.read();
                    bigInteger = ((BigInteger)object).shiftLeft(7).add(BigInteger.valueOf(n8 & 0x7F));
                    object = bigInteger;
                } while (n8 > 127);
                stringBuilder.append('.');
                stringBuilder.append(bigInteger);
            }
            return new e(byArray, stringBuilder.toString());
        }
    }

    public static class c
    extends ax.y8.e<e> {
        public c(ax.z8.b b8) {
            super(b8);
        }

        private void c(e e8) {
            Object object = e8.d0;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object = new StringTokenizer((String)object, ".");
            byteArrayOutputStream.write(Integer.parseInt(((StringTokenizer)object).nextToken()) * 40 + Integer.parseInt(((StringTokenizer)object).nextToken()));
            while (((StringTokenizer)object).hasMoreTokens()) {
                BigInteger bigInteger = new BigInteger(((StringTokenizer)object).nextToken());
                if (bigInteger.intValue() > 0 && bigInteger.intValue() < 127) {
                    byteArrayOutputStream.write(bigInteger.intValue());
                    continue;
                }
                int n8 = bigInteger.bitLength() / 7;
                int n9 = bigInteger.bitLength() % 7 > 0 ? 1 : 0;
                for (n9 = n8 + n9 - 1; n9 >= 0; --n9) {
                    byte by = (byte)(bigInteger.shiftRight(n9 * 7).byteValue() & 0x7F);
                    n8 = by;
                    if (n9 > 0) {
                        n8 = (byte)(by | 0x80);
                    }
                    byteArrayOutputStream.write(n8);
                }
            }
            e8.c0 = byteArrayOutputStream.toByteArray();
        }

        public void d(e e8, ax.y8.b b8) throws IOException {
            if (e8.c0 == null) {
                this.c(e8);
            }
            ((OutputStream)b8).write(e8.c0);
        }

        public int e(e e8) {
            if (e8.c0 == null) {
                this.c(e8);
            }
            return e8.c0.length;
        }
    }
}

