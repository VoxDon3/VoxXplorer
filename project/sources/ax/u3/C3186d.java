package ax.u3;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: ax.u3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3186d {

    /* renamed from: ax.u3.d$a */
    public static class a {
        public String a;
        public String b;
        public String c;
    }

    public static a a(InputStream inputStream, InterfaceC3185c interfaceC3185c) throws IOException {
        MessageDigest messageDigest;
        MessageDigest messageDigest2;
        a aVar = new a();
        MessageDigest messageDigest3 = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        try {
            messageDigest2 = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException unused2) {
            messageDigest2 = null;
        }
        try {
            messageDigest3 = MessageDigest.getInstance("SHA256");
        } catch (NoSuchAlgorithmException unused3) {
        }
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    if (messageDigest != null) {
                        aVar.a = c(messageDigest);
                    }
                    if (messageDigest2 != null) {
                        aVar.b = c(messageDigest2);
                    }
                    if (messageDigest3 != null) {
                        aVar.c = c(messageDigest3);
                    }
                    return aVar;
                }
                if (read == 0) {
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException unused4) {
                    }
                    int i2 = i + 1;
                    if (i > 1000) {
                        throw new IOException("Read erro : too many read zero");
                    }
                    i = i2;
                } else {
                    if (messageDigest != null) {
                        messageDigest.update(bArr, 0, read);
                    }
                    if (messageDigest2 != null) {
                        messageDigest2.update(bArr, 0, read);
                    }
                    if (messageDigest3 != null) {
                        messageDigest3.update(bArr, 0, read);
                    }
                    if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                        throw new IOException("cancelled");
                    }
                }
            } finally {
                try {
                    inputStream.close();
                } catch (IOException unused5) {
                }
            }
        }
    }

    public static String b(InputStream inputStream, long j, InterfaceC3185c interfaceC3185c) throws IOException {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        byte[] bArr = new byte[8192];
        int i = 0;
        do {
            if (interfaceC3185c != null) {
                try {
                    if (interfaceC3185c.isCancelled()) {
                        throw new IOException("cancelled");
                    }
                } catch (Throwable th) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
            int read = inputStream.read(bArr, 0, (int) Math.min(8192L, j));
            if (read < 0) {
                break;
            }
            if (read == 0) {
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException unused3) {
                }
                int i2 = i + 1;
                if (i > 1000) {
                    throw new IOException("Read erro : too many read zero");
                }
                i = i2;
            } else {
                if (messageDigest != null) {
                    messageDigest.update(bArr, 0, read);
                }
                j -= read;
            }
        } while (j > 0);
        if (messageDigest == null) {
            try {
                inputStream.close();
            } catch (IOException unused4) {
            }
            return null;
        }
        String c = c(messageDigest);
        try {
            inputStream.close();
        } catch (IOException unused5) {
        }
        return c;
    }

    private static String c(MessageDigest messageDigest) {
        byte[] digest = messageDigest.digest();
        String bigInteger = new BigInteger(1, digest).toString(16);
        return String.format("%" + (digest.length * 2) + "s", bigInteger).replace(' ', '0');
    }
}
