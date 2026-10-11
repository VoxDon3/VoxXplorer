/*
 * Decompiled with CFR 0.152.
 */
package ax.Sa;

import ax.Sa.d;
import ax.Sa.k;
import ax.Ta.a;
import ax.xc.C;
import ax.xc.e;
import ax.xc.p;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;

abstract class f {
    private static final ax.Xd.d a = ax.Xd.f.k(f.class);

    f() {
    }

    static RequestBody b(MediaType object, k k8, long l8, d d8) {
        if (k8 != null) {
            long l9 = k8.length();
            if (l8 >= 0L) {
                return new RequestBody(d8, l8, l9, (MediaType)object, k8){
                    final d a;
                    final long b;
                    final long c;
                    final MediaType d;
                    final k e;
                    {
                        this.a = d8;
                        this.b = l8;
                        this.c = l9;
                        this.d = mediaType;
                        this.e = k8;
                    }

                    private void a(long l8) throws a {
                        d d8 = this.a;
                        if (d8 != null) {
                            if (!d8.a()) {
                                this.a.b(l8 + this.b, this.c);
                                return;
                            }
                            throw new a();
                        }
                    }

                    @Override
                    public long contentLength() {
                        long l8 = this.c;
                        if (l8 < 0L) {
                            return -1L;
                        }
                        return l8 - this.b;
                    }

                    @Override
                    public MediaType contentType() {
                        return this.d;
                    }

                    /*
                     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                     * Loose catch block
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    @Override
                    public void writeTo(ax.xc.f object) throws IOException {
                        Throwable throwable3222222;
                        InputStream inputStream;
                        block11: {
                            inputStream = this.e.a(this.b);
                            C c8 = p.k(inputStream);
                            long l8 = 0L;
                            {
                                Throwable throwable22222222;
                                block12: {
                                    Object object2;
                                    catch (Throwable throwable3222222) {
                                        break block11;
                                    }
                                    try {
                                        long l9;
                                        this.a(0L);
                                        object2 = new e();
                                        while ((l9 = c8.read((e)object2, 8192L)) != -1L) {
                                            object.write((e)object2, l9);
                                            this.a(l8 += l9);
                                        }
                                    }
                                    catch (Throwable throwable22222222) {
                                        break block12;
                                    }
                                    object2 = a;
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("loaded: ");
                                    ((StringBuilder)object).append(l8);
                                    object2.n(((StringBuilder)object).toString());
                                    {
                                        c8.close();
                                        if (inputStream == null) return;
                                    }
                                    inputStream.close();
                                    return;
                                }
                                if (c8 == null) throw throwable22222222;
                                try {
                                    c8.close();
                                    throw throwable22222222;
                                }
                                catch (Throwable throwable4) {}
                                {
                                    throwable22222222.addSuppressed(throwable4);
                                    throw throwable22222222;
                                }
                            }
                        }
                        if (inputStream == null) throw throwable3222222;
                        try {
                            inputStream.close();
                            throw throwable3222222;
                        }
                        catch (Throwable throwable5) {
                            throwable3222222.addSuppressed(throwable5);
                        }
                        throw throwable3222222;
                    }
                };
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid startOffset: ");
            ((StringBuilder)object).append(l8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        throw new NullPointerException("source == null");
    }
}

