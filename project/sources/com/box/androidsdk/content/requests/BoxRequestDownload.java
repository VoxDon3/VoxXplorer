package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxObject;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class BoxRequestDownload<E extends BoxObject, R extends BoxRequest<E, R>> extends BoxRequest<E, R> {
    protected ax.F3.a mDownloadStartListener;
    protected OutputStream mFileOutputStream;
    protected String mId;
    protected long mRangeEnd;
    protected long mRangeStart;
    private String mSha1;
    protected File mTarget;

    public static class DownloadRequestHandler extends BoxRequest.a<BoxRequestDownload> {
        protected int d;
        protected int e;

        public DownloadRequestHandler(BoxRequestDownload boxRequestDownload) {
            super(boxRequestDownload);
            this.d = 0;
            this.e = 1000;
        }

        protected OutputStream j(BoxDownload boxDownload) throws FileNotFoundException, IOException {
            R r = this.a;
            if (((BoxRequestDownload) r).mFileOutputStream != null) {
                return ((BoxRequestDownload) r).mFileOutputStream;
            }
            if (!boxDownload.D().exists()) {
                boxDownload.D().createNewFile();
            }
            return new FileOutputStream(boxDownload.D());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[SYNTHETIC] */
        @Override // com.box.androidsdk.content.requests.BoxRequest.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.box.androidsdk.content.models.BoxDownload h(java.lang.Class r23, com.box.androidsdk.content.requests.b r24) throws java.lang.IllegalAccessException, java.lang.InstantiationException, com.box.androidsdk.content.BoxException {
            /*
                Method dump skipped, instructions count: 479
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.box.androidsdk.content.requests.BoxRequestDownload.DownloadRequestHandler.h(java.lang.Class, com.box.androidsdk.content.requests.b):com.box.androidsdk.content.models.BoxDownload");
        }
    }

    public BoxRequestDownload(String str, Class<E> cls, OutputStream outputStream, String str2, BoxSession boxSession) {
        super(cls, str2, boxSession);
        this.mRangeStart = -1L;
        this.mRangeEnd = -1L;
        this.mId = str;
        this.mRequestMethod = BoxRequest.Methods.GET;
        this.mRequestUrlString = str2;
        this.mFileOutputStream = outputStream;
        C(new DownloadRequestHandler(this));
        this.mRequiresSocket = true;
        this.mQueryMap.put("log_content_access", Boolean.toString(true));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.c0 = new DownloadRequestHandler(this);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    @Override // com.box.androidsdk.content.requests.BoxRequest
    protected void B(a aVar) {
        super.B(aVar);
        long j = this.mRangeStart;
        if (j == -1 || this.mRangeEnd == -1) {
            return;
        }
        aVar.a("Range", String.format("bytes=%s-%s", Long.toString(j), Long.toString(this.mRangeEnd)));
    }

    public File F() {
        return this.mTarget;
    }

    public OutputStream G() {
        return this.mFileOutputStream;
    }

    public R H(long j, long j2) {
        this.mRangeStart = j;
        this.mRangeEnd = j2;
        return this;
    }

    @Override // com.box.androidsdk.content.requests.BoxRequest
    protected void r(b bVar) throws BoxException {
        s();
        ax.H3.b.d("BoxContentSdk", String.format(Locale.ENGLISH, "Response (%s)", Integer.valueOf(bVar.f())));
    }

    public BoxRequestDownload(String str, Class<E> cls, File file, String str2, BoxSession boxSession) {
        super(cls, str2, boxSession);
        this.mRangeStart = -1L;
        this.mRangeEnd = -1L;
        this.mId = str;
        this.mRequestMethod = BoxRequest.Methods.GET;
        this.mRequestUrlString = str2;
        this.mTarget = file;
        C(new DownloadRequestHandler(this));
        this.mRequiresSocket = true;
        this.mQueryMap.put("log_content_access", Boolean.toString(true));
    }
}
