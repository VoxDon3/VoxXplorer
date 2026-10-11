package ax.pb;

import ax.jb.C2345a;
import okhttp3.internal.http2.Settings;

/* renamed from: ax.pb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2797c {
    private static final int a;
    static Object[] b;
    private static int c;

    static {
        int d = C2345a.d("jcifs.smb.maxBuffers", 16);
        a = d;
        b = new Object[d];
        c = 0;
    }

    public static byte[] a() {
        synchronized (b) {
            try {
                if (c > 0) {
                    for (int i = 0; i < a; i++) {
                        Object[] objArr = b;
                        Object obj = objArr[i];
                        if (obj != null) {
                            byte[] bArr = (byte[]) obj;
                            objArr[i] = null;
                            c--;
                            return bArr;
                        }
                    }
                }
                return new byte[Settings.DEFAULT_INITIAL_WINDOW_SIZE];
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void b(P p, Q q) {
        synchronized (b) {
            p.b1 = a();
            q.U0 = a();
        }
    }

    public static void c(byte[] bArr) {
        synchronized (b) {
            try {
                if (c < a) {
                    for (int i = 0; i < a; i++) {
                        Object[] objArr = b;
                        if (objArr[i] == null) {
                            objArr[i] = bArr;
                            c++;
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
