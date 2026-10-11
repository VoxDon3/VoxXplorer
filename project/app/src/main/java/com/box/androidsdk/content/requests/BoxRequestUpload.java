/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxIterator;
import com.box.androidsdk.content.models.BoxIteratorBoxEntity;
import com.box.androidsdk.content.models.BoxJsonObject;
import com.box.androidsdk.content.models.BoxObject;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestItem;
import com.box.androidsdk.content.requests.b;
import com.box.androidsdk.content.requests.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Date;

public abstract class BoxRequestUpload<E extends BoxJsonObject, R extends BoxRequest<E, R>>
extends BoxRequestItem<E, R> {
    Date mCreatedDate;
    File mFile;
    String mFileName;
    Date mModifiedDate;
    String mSha1;
    InputStream mStream;
    long mUploadSize;

    public BoxRequestUpload(Class<E> clazz, InputStream inputStream, String string, BoxSession boxSession) {
        super(clazz, null, string, boxSession);
        this.mRequestMethod = BoxRequest.Methods.c0;
        this.mStream = inputStream;
        this.mFileName = "";
        this.mContentType = null;
        this.C(new a(this));
    }

    @Override
    protected void B(com.box.androidsdk.content.requests.a a8) {
        super.B(a8);
        String string = this.mSha1;
        if (string != null) {
            a8.a("Content-MD5", string);
        }
    }

    protected c F() throws IOException, BoxException {
        c c8 = new c(this.d(), this.mRequestMethod, this.q);
        this.B(c8);
        c8.g(this.G(), this.mFileName, this.mUploadSize);
        Date date = this.mCreatedDate;
        if (date != null) {
            c8.e("content_created_at", date);
        }
        if ((date = this.mModifiedDate) != null) {
            c8.e("content_modified_at", date);
        }
        return c8;
    }

    protected InputStream G() throws FileNotFoundException {
        InputStream inputStream = this.mStream;
        if (inputStream != null) {
            return inputStream;
        }
        return new FileInputStream(this.mFile);
    }

    public R H(Date date) {
        this.mModifiedDate = date;
        return (R)this;
    }

    public R I(ax.F3.b b8) {
        this.q = b8;
        return (R)this;
    }

    @Override
    protected com.box.androidsdk.content.requests.a i() throws IOException, BoxException {
        return this.F();
    }

    @Override
    protected b y(com.box.androidsdk.content.requests.a a8, HttpURLConnection httpURLConnection) throws IOException, BoxException {
        if (a8 instanceof c) {
            ((c)a8).h(httpURLConnection, this.q);
        }
        return super.y(a8, httpURLConnection);
    }

    public static class a
    extends BoxRequest.a<BoxRequestUpload> {
        public a(BoxRequestUpload boxRequestUpload) {
            super(boxRequestUpload);
        }

        @Override
        public <T extends BoxObject> T h(Class<T> clazz, b b8) throws IllegalAccessException, InstantiationException, BoxException {
            return (T)((BoxIterator)super.h(BoxIteratorBoxEntity.class, b8)).D(0);
        }
    }
}

