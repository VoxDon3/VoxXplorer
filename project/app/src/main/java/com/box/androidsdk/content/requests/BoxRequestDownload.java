/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import android.text.TextUtils;
import ax.H3.f;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxObject;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.a;
import com.box.androidsdk.content.requests.b;
import com.box.androidsdk.content.utils.SdkUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Locale;
import javax.net.ssl.SSLException;

public abstract class BoxRequestDownload<E extends BoxObject, R extends BoxRequest<E, R>>
extends BoxRequest<E, R> {
    protected ax.F3.a mDownloadStartListener;
    protected OutputStream mFileOutputStream;
    protected String mId;
    protected long mRangeEnd = -1L;
    protected long mRangeStart = -1L;
    private String mSha1;
    protected File mTarget;

    public BoxRequestDownload(String string, Class<E> clazz, File file, String string2, BoxSession boxSession) {
        super(clazz, string2, boxSession);
        this.mId = string;
        this.mRequestMethod = BoxRequest.Methods.q;
        this.mRequestUrlString = string2;
        this.mTarget = file;
        this.C(new DownloadRequestHandler(this));
        this.mRequiresSocket = true;
        this.mQueryMap.put("log_content_access", Boolean.toString(true));
    }

    public BoxRequestDownload(String string, Class<E> clazz, OutputStream outputStream, String string2, BoxSession boxSession) {
        super(clazz, string2, boxSession);
        this.mId = string;
        this.mRequestMethod = BoxRequest.Methods.q;
        this.mRequestUrlString = string2;
        this.mFileOutputStream = outputStream;
        this.C(new DownloadRequestHandler(this));
        this.mRequiresSocket = true;
        this.mQueryMap.put("log_content_access", Boolean.toString(true));
    }

    static /* synthetic */ String E(BoxRequestDownload boxRequestDownload) {
        return boxRequestDownload.mSha1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.c0 = new DownloadRequestHandler(this);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    @Override
    protected void B(a a8) {
        super.B(a8);
        long l8 = this.mRangeStart;
        if (l8 != -1L && this.mRangeEnd != -1L) {
            a8.a("Range", String.format("bytes=%s-%s", Long.toString(l8), Long.toString(this.mRangeEnd)));
        }
    }

    public File F() {
        return this.mTarget;
    }

    public OutputStream G() {
        return this.mFileOutputStream;
    }

    public R H(long l8, long l9) {
        this.mRangeStart = l8;
        this.mRangeEnd = l9;
        return (R)this;
    }

    @Override
    protected void r(b b8) throws BoxException {
        this.s();
        ax.H3.b.d("BoxContentSdk", String.format(Locale.ENGLISH, "Response (%s)", b8.f()));
    }

    public static class DownloadRequestHandler
    extends BoxRequest.a<BoxRequestDownload> {
        protected int d = 0;
        protected int e = 1000;

        public DownloadRequestHandler(BoxRequestDownload boxRequestDownload) {
            super(boxRequestDownload);
        }

        protected OutputStream j(BoxDownload boxDownload) throws FileNotFoundException, IOException {
            Object r8 = this.a;
            if (((BoxRequestDownload)r8).mFileOutputStream == null) {
                if (!boxDownload.D().exists()) {
                    boxDownload.D().createNewFile();
                }
                return new FileOutputStream(boxDownload.D());
            }
            return ((BoxRequestDownload)r8).mFileOutputStream;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public BoxDownload k(Class var1_1, b var2_7) throws IllegalAccessException, InstantiationException, BoxException {
            block37: {
                block36: {
                    block39: {
                        block38: {
                            block35: {
                                var1_1 = var2_7.d();
                                var11_9 = var2_7.e().getContentEncoding();
                                if (Thread.currentThread().isInterrupted()) {
                                    this.b(var2_7);
                                }
                                if (var2_7.f() == 429) {
                                    return (BoxDownload)this.i(var2_7);
                                }
                                if (var2_7.f() == 202) {
                                    block34: {
                                        block33: {
                                            try {
                                                var3_10 = this.d;
                                                if (var3_10 >= 2) break block33;
                                                this.d = var3_10 + 1;
                                                this.e = BoxRequest.a.c(var2_7, 1);
                                                break block34;
                                            }
                                            catch (InterruptedException var1_2) {
                                                throw new BoxException(var1_2.getMessage(), var2_7);
                                            }
                                        }
                                        var3_10 = this.e;
                                        if (var3_10 >= 90000) {
                                            var1_1 = new BoxException.MaxAttemptsExceeded("Max wait time exceeded.", this.d);
                                            throw var1_1;
                                        }
                                        this.e = (int)((double)var3_10 * (Math.random() + 1.5));
                                    }
                                    Thread.sleep(this.e);
                                    return (BoxDownload)((BoxRequestDownload)this.a).x();
                                }
                                if (var2_7.f() != 200) {
                                    if (var2_7.f() != 206) return new BoxDownload(null, 0L, null, null, null, null);
                                }
                                var8_11 = var2_7.e().getHeaderField("Content-Length");
                                var7_14 = var2_7.e().getHeaderField("Content-Disposition");
                                try {
                                    var5_17 = Long.parseLong((String)var8_11);
                                }
                                catch (Exception var8_12) {
                                    var5_17 = -1L;
                                }
                                var12_18 = new BoxDownload(this, (String)var7_14, var5_17, (String)var1_1, var2_7.e().getHeaderField("Content-Range"), var2_7.e().getHeaderField("Date"), var2_7.e().getHeaderField("Expiration")){
                                    final DownloadRequestHandler this$0;
                                    {
                                        this.this$0 = downloadRequestHandler;
                                        super(string, l8, string2, string3, string4, string5);
                                    }

                                    @Override
                                    public File D() {
                                        if (((BoxRequestDownload)this.this$0.a).F() == null) {
                                            return null;
                                        }
                                        if (((BoxRequestDownload)this.this$0.a).F().isFile()) {
                                            return ((BoxRequestDownload)this.this$0.a).F();
                                        }
                                        if (!SdkUtils.l(this.C())) {
                                            return new File(((BoxRequestDownload)this.this$0.a).F(), this.C());
                                        }
                                        return super.D();
                                    }
                                };
                                ((BoxRequestDownload)this.a).getClass();
                                var9_19 = null;
                                var10_21 = null;
                                var1_1 = var10_21;
                                var8_11 = var9_19;
                                try {
                                    if (((BoxRequestDownload)this.a).q == null) break block35;
                                    var1_1 = var10_21;
                                    var8_11 = var9_19;
                                    var1_1 = var10_21;
                                    var8_11 = var9_19;
                                    var7_14 = new f(this.j(var12_18), ((BoxRequestDownload)this.a).q, var5_17);
                                }
                                catch (Exception var7_16) {
                                    break block36;
                                }
                                try {
                                    ((BoxRequestDownload)this.a).q.a(0L, var5_17);
                                    ** GOTO lbl68
                                }
                                catch (Throwable var8_13) {
                                    var1_1 = var7_14;
                                    var7_14 = var8_13;
                                    break block37;
                                }
                                catch (Exception var1_3) {
                                    var8_11 = var7_14;
                                    var7_14 = var1_3;
                                    break block36;
                                }
                                catch (Throwable var7_15) {
                                    break block37;
                                }
                            }
                            var1_1 = var10_21;
                            var8_11 = var9_19;
                            {
                                var7_14 = this.j(var12_18);
lbl68:
                                // 2 sources

                                var1_1 = var7_14;
                                var8_11 = var7_14;
                                if (TextUtils.isEmpty((CharSequence)BoxRequestDownload.E((BoxRequestDownload)this.a))) {
                                    var1_1 = var7_14;
                                    var8_11 = var7_14;
                                    SdkUtils.c(var2_7.a(), (OutputStream)var7_14);
                                    break block38;
                                }
                                var1_1 = var7_14;
                                var8_11 = var7_14;
                                var9_19 = SdkUtils.e(var2_7.a(), (OutputStream)var7_14);
                                var1_1 = var7_14;
                                var8_11 = var7_14;
                                var4_22 = BoxRequestDownload.E((BoxRequestDownload)this.a).equals(var9_19);
                                if (!var4_22) break block39;
                            }
                        }
                        try {
                            var2_7.a().close();
                        }
                        catch (IOException var1_4) {
                            ax.H3.b.c("error closing inputstream", var1_4);
                        }
                        if (((BoxRequestDownload)this.a).G() != null) return var12_18;
                        try {
                            var7_14.close();
                            return var12_18;
                        }
                        catch (IOException var1_5) {
                            ax.H3.b.c("error closing outputstream", var1_5);
                        }
                        return var12_18;
                    }
                    var1_1 = var7_14;
                    var8_11 = var7_14;
                    {
                        var1_1 = var7_14;
                        var8_11 = var7_14;
                        var10_21 = new BoxException.CorruptedContentException("Sha1 checks failed", BoxRequestDownload.E((BoxRequestDownload)this.a), (String)var9_19);
                        var1_1 = var7_14;
                        var8_11 = var7_14;
                        throw var10_21;
                    }
                }
                var1_1 = var8_11;
                var9_19 = ((BoxRequestDownload)this.a).m();
                if (var9_19 != null && var11_9 != null) {
                    var1_1 = var8_11;
                    var4_22 = var11_9.equalsIgnoreCase("gzip");
                    if (var4_22) {
                        var1_1 = var8_11;
                        try {
                            var9_19.close();
                        }
                        catch (Exception var9_20) {
                            var1_1 = var8_11;
                            ax.H3.b.c("error closing socket", var9_20);
                        }
                    }
                }
                var1_1 = var8_11;
                if (var7_14 instanceof BoxException) {
                    var1_1 = var8_11;
                    throw (BoxException)var7_14;
                }
                var1_1 = var8_11;
                if (var7_14 instanceof SSLException) {
                    var1_1 = var8_11;
                    var1_1 = var8_11;
                    var9_19 = new BoxException.DownloadSSLException(var7_14.getMessage(), (SSLException)var7_14);
                    var1_1 = var8_11;
                    throw var9_19;
                }
                var1_1 = var8_11;
                var1_1 = var8_11;
                var9_19 = new BoxException(var7_14.getMessage(), (Throwable)var7_14);
                var1_1 = var8_11;
                throw var9_19;
            }
            try {
                var2_7.a().close();
            }
            catch (IOException var2_8) {
                ax.H3.b.c("error closing inputstream", var2_8);
            }
            if (((BoxRequestDownload)this.a).G() != null) throw var7_14;
            try {
                var1_1.close();
                throw var7_14;
            }
            catch (IOException var1_6) {
                ax.H3.b.c("error closing outputstream", var1_6);
            }
            throw var7_14;
        }
    }
}

