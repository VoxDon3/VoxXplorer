/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import android.text.TextUtils;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.models.BoxFile;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestUpload;
import com.box.androidsdk.content.requests.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public class BoxRequestsFile$UploadNewVersion
extends BoxRequestUpload<BoxFile, BoxRequestsFile$UploadNewVersion> {
    private static String f0 = "{\"name\": \"%s\"}";

    public BoxRequestsFile$UploadNewVersion(InputStream inputStream, String string, BoxSession boxSession) {
        super(BoxFile.class, inputStream, string, boxSession);
    }

    @Override
    protected c F() throws IOException, BoxException {
        c c8 = super.F();
        if (!TextUtils.isEmpty((CharSequence)this.mFileName)) {
            c8.d("attributes", String.format(Locale.ENGLISH, f0, this.mFileName));
        }
        return c8;
    }
}

