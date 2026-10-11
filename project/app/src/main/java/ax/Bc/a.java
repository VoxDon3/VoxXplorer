/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Bc.e;
import ax.Bc.f;
import ax.zc.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

class a
extends f {
    a() {
        super(new Class[0]);
    }

    @Override
    InputStream b(String string, InputStream inputStream, long l8, e e8, byte[] byArray, int n8) throws IOException {
        return new j.InputStreamRetargetInterface(this, e8, string, byArray, inputStream){
            private CipherInputStream c0;
            final e d0;
            final String e0;
            final byte[] f0;
            final InputStream g0;
            final a h0;
            private boolean q;
            {
                this.h0 = a8;
                this.d0 = e8;
                this.e0 = string;
                this.f0 = byArray;
                this.g0 = inputStream;
            }

            /*
             * Loose catch block
             */
            private CipherInputStream a() throws IOException {
                if (this.q) {
                    return this.c0;
                }
                Object object = this.d0.d;
                if (object != null) {
                    if (((byte[])object).length >= 2) {
                        int n8 = object[0];
                        Object object2 = n8 & 0xFF;
                        int n9 = n8 & 0x3F;
                        Object object3 = object[1];
                        n8 = (object2 >> 6 & 1) + (object3 & 0xF);
                        if ((object2 = (Object)((object3 = (Object)((object2 >> 7 & 1) + ((object3 & 0xFF) >> 4))) + 2)) + n8 <= ((Object)object).length) {
                            Object object4 = new byte[object3];
                            System.arraycopy(object, 2, object4, 0, (int)object3);
                            Object object5 = new byte[16];
                            System.arraycopy(this.d0.d, object2, object5, 0, n8);
                            if (this.f0 != null) {
                                Object object6;
                                if (n9 == 63) {
                                    object = new byte[32];
                                    System.arraycopy(object4, 0, object, 0, (int)object3);
                                    object4 = this.f0;
                                    System.arraycopy(object4, 0, object, (int)object3, Math.min(((byte[])object4).length, 32 - object3));
                                } else {
                                    object = MessageDigest.getInstance("SHA-256");
                                    object6 = new byte[8];
                                    block4: for (long i8 = 0L; i8 < 1L << n9; ++i8) {
                                        object.update((byte[])object4);
                                        object.update(this.f0);
                                        object.update((byte[])object6);
                                        for (n8 = 0; n8 < 8; ++n8) {
                                            byte by;
                                            object6[n8] = by = (byte)(object6[n8] + 1);
                                            if (by != 0) continue block4;
                                        }
                                    }
                                    object = object.digest();
                                }
                                object6 = new SecretKeySpec((byte[])object, "AES");
                                try {
                                    object = Cipher.getInstance("AES/CBC/NoPadding");
                                    object4 = new IvParameterSpec;
                                    object4((byte[])object5);
                                    object.init(2, (Key)object6, (AlgorithmParameterSpec)object4);
                                    object5 = new CipherInputStream;
                                    object5(this.g0, (Cipher)object);
                                    this.c0 = object5;
                                    this.q = true;
                                    return object5;
                                }
                                catch (GeneralSecurityException generalSecurityException) {
                                    throw new IOException("Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)", generalSecurityException);
                                }
                                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                                    throw new IOException("SHA-256 is unsupported by your Java implementation", noSuchAlgorithmException);
                                }
                            }
                            throw new b(this.e0);
                        }
                        object = new StringBuilder();
                        object.append("Salt size + IV size too long in ");
                        object.append(this.e0);
                        throw new IOException(object.toString());
                    }
                    object = new StringBuilder();
                    object.append("AES256 properties too short in ");
                    object.append(this.e0);
                    throw new IOException(object.toString());
                }
                object = new StringBuilder();
                object.append("Missing AES256 properties in ");
                object.append(this.e0);
                throw new IOException(object.toString());
            }

            @Override
            public void close() throws IOException {
                CipherInputStream cipherInputStream = this.c0;
                if (cipherInputStream != null) {
                    cipherInputStream.close();
                }
            }

            @Override
            public int read() throws IOException {
                return this.a().read();
            }

            @Override
            public int read(byte[] byArray, int n8, int n9) throws IOException {
                return this.a().read(byArray, n8, n9);
            }

            @Override
            public /* synthetic */ long transferTo(OutputStream outputStream) {
                return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
            }
        };
    }
}

