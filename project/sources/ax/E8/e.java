package ax.E8;

import ax.y8.AbstractC3515d;
import ax.y8.AbstractC3516e;
import ax.y8.C3513b;
import ax.z8.InterfaceC3557a;
import ax.z8.InterfaceC3558b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public class e extends f<String> {
    private String d0;

    public static class b extends AbstractC3515d<e> {
        public b(InterfaceC3557a interfaceC3557a) {
            super(interfaceC3557a);
        }

        @Override // ax.y8.AbstractC3515d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(ax.C8.c<e> cVar, byte[] bArr) {
            int read;
            ax.G8.a.a(bArr.length > 0, "An ASN.1 OBJECT IDENTIFIER should have at least a one byte value", new Object[0]);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            StringBuilder sb = new StringBuilder();
            int read2 = byteArrayInputStream.read();
            sb.append(read2 / 40);
            sb.append('.');
            sb.append(read2 % 40);
            while (byteArrayInputStream.available() > 0) {
                int read3 = byteArrayInputStream.read();
                if (read3 < 127) {
                    sb.append('.');
                    sb.append(read3);
                } else {
                    BigInteger valueOf = BigInteger.valueOf(read3 & 127);
                    do {
                        read = byteArrayInputStream.read();
                        valueOf = valueOf.shiftLeft(7).add(BigInteger.valueOf(read & 127));
                    } while (read > 127);
                    sb.append('.');
                    sb.append(valueOf);
                }
            }
            return new e(bArr, sb.toString());
        }
    }

    public static class c extends AbstractC3516e<e> {
        public c(InterfaceC3558b interfaceC3558b) {
            super(interfaceC3558b);
        }

        private void c(e eVar) {
            String str = eVar.d0;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            byteArrayOutputStream.write((Integer.parseInt(stringTokenizer.nextToken()) * 40) + Integer.parseInt(stringTokenizer.nextToken()));
            while (stringTokenizer.hasMoreTokens()) {
                BigInteger bigInteger = new BigInteger(stringTokenizer.nextToken());
                if (bigInteger.intValue() <= 0 || bigInteger.intValue() >= 127) {
                    for (int bitLength = ((bigInteger.bitLength() / 7) + (bigInteger.bitLength() % 7 > 0 ? 1 : 0)) - 1; bitLength >= 0; bitLength--) {
                        byte byteValue = (byte) (bigInteger.shiftRight(bitLength * 7).byteValue() & Byte.MAX_VALUE);
                        if (bitLength > 0) {
                            byteValue = (byte) (byteValue | 128);
                        }
                        byteArrayOutputStream.write(byteValue);
                    }
                } else {
                    byteArrayOutputStream.write(bigInteger.intValue());
                }
            }
            eVar.c0 = byteArrayOutputStream.toByteArray();
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(e eVar, C3513b c3513b) throws IOException {
            if (eVar.c0 == null) {
                c(eVar);
            }
            c3513b.write(eVar.c0);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int b(e eVar) {
            if (eVar.c0 == null) {
                c(eVar);
            }
            return eVar.c0.length;
        }
    }

    @Override // ax.C8.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String g() {
        return this.d0;
    }

    public e(String str) {
        super(ax.C8.c.k);
        this.d0 = str;
    }

    private e(byte[] bArr, String str) {
        super(ax.C8.c.k, bArr);
        this.d0 = str;
    }
}
