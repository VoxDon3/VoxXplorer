/*
 * Decompiled with CFR 0.152.
 */
package ax.l9;

import ax.Q8.B;
import ax.Q8.D;
import ax.Q8.g;
import ax.Q8.q;
import ax.Q8.t;
import ax.Q8.x;
import ax.Xd.d;
import ax.Z8.a;
import ax.d9.b;
import ax.l9.b;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public class f {
    private static final d e = ax.Xd.f.k(f.class);
    private ax.d9.g a;
    private D b;
    private g c;
    private AtomicInteger d = new AtomicInteger(0);

    public f(ax.d9.g g8) {
        this.a = g8;
    }

    public boolean d(B b8) {
        return this.c.j() && b8.a().c() != 0 && ((x)b8.b()).d() == 1;
    }

    byte[] e(x x8) {
        ax.h9.b b8 = new ax.h9.b();
        x8.k(b8);
        b8.T(20);
        return b8.f();
    }

    public byte[] f(B b8, SecretKey object) {
        ax.d9.f f82;
        block7: {
            a.b b92;
            block6: {
                Object object2;
                block5: {
                    byte[] byArray = Arrays.copyOf(((x)b8.b()).e(), this.b.j());
                    byte[] byArray2 = this.e((x)b8.b());
                    byte[] byArray3 = b8.d();
                    byte[] byArray4 = ((x)b8.b()).h();
                    object2 = this.a.d(this.b.h());
                    b.a a8 = b.a.c0;
                    object = object.getEncoded();
                    GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, byArray);
                    object2.g(a8, (byte[])object, gCMParameterSpec);
                    object2.f(byArray2, 0, byArray2.length);
                    object = object2.b(byArray3, 0, byArray3.length);
                    object2 = object2.e(byArray4, 0, byArray4.length);
                    if (object == null) break block5;
                    try {
                        if (((Object)object).length != 0) {
                            byArray4 = new byte[((Object)object).length + ((Object)object2).length];
                            System.arraycopy(object, 0, byArray4, 0, ((Object)object).length);
                            System.arraycopy(object2, 0, byArray4, ((Object)object).length, ((Object)object2).length);
                            return byArray4;
                        }
                    }
                    catch (a.b b92) {
                        break block6;
                    }
                    catch (ax.d9.f f82) {
                        break block7;
                    }
                }
                return object2;
            }
            e.t("Could not read cipherText from packet << {} >>", b8);
            throw new ax.k9.d("Could not read cipherText from packet", b92);
        }
        e.t("Security exception while decrypting packet << {} >>", b8);
        throw new ax.k9.d(f82);
    }

    public q g(q q8, SecretKey secretKey) {
        if (secretKey != null) {
            return new a(this, q8, secretKey);
        }
        e.s("Not wrapping {} as encrypted, as no key is set.", (Object)((t)q8.c()).h());
        return q8;
    }

    byte[] h() {
        long l8 = System.nanoTime();
        ax.h9.b b8 = new ax.h9.b();
        b8.w(l8);
        b8.W(this.b.j() - 8);
        return b8.f();
    }

    void i(b b8) {
        this.c = b8.f().a();
        this.b = ((Object)((Object)b8.f().a())).equals((Object)g.i0) ? b8.b() : D.e0;
        e.a("Initialized PacketEncryptor with Cipher << {} >>", this.b);
    }

    public class a
    extends q {
        private final q e;
        private final SecretKey f;
        final f g;

        public a(f f8, q q8, SecretKey secretKey) {
            this.g = f8;
            this.e = q8;
            this.f = secretKey;
        }

        @Override
        public int f() {
            return this.e.f();
        }

        @Override
        public q g() {
            return this.e.g();
        }

        @Override
        public void l(ax.h9.b b8) {
            Object object = new ax.h9.b();
            this.e.l((ax.h9.b)object);
            object = ((ax.Z8.a)object).f();
            Object object2 = this.g.h();
            Object object3 = new GCMParameterSpec(128, (byte[])object2);
            object2 = new x((byte[])object2, ((Object)object).length, ((t)this.e.c()).k());
            byte[] byArray = this.g.e((x)object2);
            try {
                ax.d9.a a8 = this.g.a.d(this.g.b.h());
                a8.g(b.a.q, this.f.getEncoded(), (GCMParameterSpec)object3);
                a8.f(byArray, 0, byArray.length);
                object3 = a8.e((byte[])object, 0, ((Object)object).length);
            }
            catch (ax.d9.f f8) {
                e.t("Security exception while encrypting packet << {} >>", this.e.c());
                throw new ax.k9.d(f8);
            }
            if (((Object)object3).length == ((Object)object).length + 16) {
                byArray = new byte[16];
                System.arraycopy(object3, ((Object)object).length, byArray, 0, 16);
                ((x)object2).j(byArray);
                ((x)object2).k(b8);
                b8.p((byte[])object3, 0, ((Object)object).length);
                return;
            }
            throw new IllegalStateException("Invalid length for cipherText after encryption.");
        }

        public t n() {
            return (t)this.e.c();
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Encrypted[");
            stringBuilder.append(this.e.toString());
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }
}

