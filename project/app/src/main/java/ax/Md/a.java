/*
 * Decompiled with CFR 0.152.
 */
package ax.Md;

import ax.Ld.d;
import ax.Ld.f;
import ax.Md.b;
import ax.Wc.D;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.k0;
import ax.Wc.t;
import ax.Wc.x0;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.List;

public class a {
    private b a = new b(new ax.Hd.a());
    private SecureRandom b;
    private String c;
    private ax.rd.a d;
    private AlgorithmParameterSpec e;

    public a(String string) {
        this.c = string;
        this.d = new ax.Ld.b().b(string);
        this.e = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ax.Ld.a c(ax.Fd.a object) throws d {
        Signature[] signatureArray;
        try {
            int n8;
            List<PrivateKey> list = ((ax.Fd.a)object).a();
            D d8 = D.G(this.d.u());
            int n9 = d8.size();
            signatureArray = new Signature[n9];
            for (n8 = 0; n8 != d8.size(); ++n8) {
                signatureArray[n8] = object = this.a.b(ax.rd.a.t(d8.I(n8)));
                if (this.b != null) {
                    ((Signature)object).initSign(list.get(n8), this.b);
                    continue;
                }
                ((Signature)object).initSign(list.get(n8));
            }
            object = ax.Gd.a.a(signatureArray[0]);
            for (n8 = 1; n8 != n9; ++n8) {
                object = new ax.Pd.b((OutputStream)object, ax.Gd.a.a(signatureArray[n8]));
            }
        }
        catch (GeneralSecurityException generalSecurityException) {}
        return new ax.Ld.a(this, (OutputStream)object, signatureArray){
            OutputStream a;
            final OutputStream b;
            final Signature[] c;
            final a d;
            {
                this.d = a8;
                this.b = outputStream;
                this.c = signatureArray;
                this.a = outputStream;
            }

            @Override
            public OutputStream b() {
                return this.a;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public byte[] c() {
                IOException iOException2;
                Object object;
                block6: {
                    SignatureException signatureException2;
                    Object object2;
                    block5: {
                        try {
                            object = new h();
                            for (int i8 = 0; i8 != this.c.length; ++i8) {
                                object2 = new k0(this.c[i8].sign());
                                ((h)object).a((g)object2);
                            }
                        }
                        catch (SignatureException signatureException2) {
                            break block5;
                        }
                        catch (IOException iOException2) {
                            break block6;
                        }
                        {
                            object2 = new x0((h)object);
                            return ((t)object2).q("DER");
                        }
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("exception obtaining signature: ");
                    ((StringBuilder)object2).append(signatureException2.getMessage());
                    throw new f(((StringBuilder)object2).toString(), signatureException2);
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("exception encoding signature: ");
                ((StringBuilder)object).append(iOException2.getMessage());
                throw new f(((StringBuilder)object).toString(), iOException2);
            }

            @Override
            public ax.rd.a d() {
                return this.d.d;
            }
        };
        signatureArray = new StringBuilder();
        signatureArray.append("cannot create signer: ");
        signatureArray.append(generalSecurityException.getMessage());
        throw new d(signatureArray.toString(), generalSecurityException);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ax.Ld.a b(PrivateKey object) throws d {
        GeneralSecurityException generalSecurityException2;
        block4: {
            ax.rd.a a8;
            Signature signature;
            block3: {
                if (object instanceof ax.Fd.a) {
                    return this.c((ax.Fd.a)object);
                }
                try {
                    signature = this.a.b(this.d);
                    a8 = this.d;
                    SecureRandom secureRandom = this.b;
                    if (secureRandom == null) break block3;
                    signature.initSign((PrivateKey)object, secureRandom);
                    return new ax.Ld.a(this, signature, a8){
                        private OutputStream a;
                        final Signature b;
                        final ax.rd.a c;
                        final a d;
                        {
                            this.d = a8;
                            this.b = signature;
                            this.c = a9;
                            this.a = ax.Gd.a.a(signature);
                        }

                        @Override
                        public OutputStream b() {
                            return this.a;
                        }

                        @Override
                        public byte[] c() {
                            try {
                                byte[] byArray = this.b.sign();
                                return byArray;
                            }
                            catch (SignatureException signatureException) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("exception obtaining signature: ");
                                stringBuilder.append(signatureException.getMessage());
                                throw new f(stringBuilder.toString(), signatureException);
                            }
                        }

                        @Override
                        public ax.rd.a d() {
                            return this.c;
                        }
                    };
                }
                catch (GeneralSecurityException generalSecurityException2) {
                    break block4;
                }
            }
            signature.initSign((PrivateKey)object);
            return new /* invalid duplicate definition of identical inner class */;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("cannot create signer: ");
        stringBuilder.append(generalSecurityException2.getMessage());
        throw new d(stringBuilder.toString(), generalSecurityException2);
    }
}

