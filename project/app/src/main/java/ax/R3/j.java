/*
 * Decompiled with CFR 0.152.
 */
package ax.R3;

import ax.M3.h;
import ax.b0.d;
import ax.k4.e;
import ax.k4.i;
import ax.l4.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class j {
    private final e<h, String> a = new e(1000);
    private final d<b> b = ax.l4.a.e(10, new a.d<b>(this){
        final j a;
        {
            this.a = j8;
        }

        public b b() {
            try {
                b b8 = new b(MessageDigest.getInstance("SHA-256"));
                return b8;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new RuntimeException(noSuchAlgorithmException);
            }
        }
    });

    private String a(h object) {
        b b8 = this.b.b();
        try {
            object.a(b8.q);
            object = i.s(b8.q.digest());
            return object;
        }
        finally {
            this.b.a(b8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String b(h h8) {
        Object object;
        Object object2 = this.a;
        synchronized (object2) {
            object = this.a.g(h8);
        }
        object2 = object;
        if (object == null) {
            object2 = this.a(h8);
        }
        object = this.a;
        synchronized (object) {
            this.a.k(h8, (String)object2);
            return object2;
        }
    }

    private static final class b
    implements a.f {
        private final ax.l4.b c0 = ax.l4.b.a();
        final MessageDigest q;

        b(MessageDigest messageDigest) {
            this.q = messageDigest;
        }

        @Override
        public ax.l4.b l() {
            return this.c0;
        }
    }
}

