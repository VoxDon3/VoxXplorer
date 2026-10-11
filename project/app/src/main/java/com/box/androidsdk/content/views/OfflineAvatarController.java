/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.views;

import android.content.Context;
import ax.E3.h;
import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.views.BoxAvatarView;
import com.box.androidsdk.content.views.DefaultAvatarController;
import java.io.File;

public class OfflineAvatarController
extends DefaultAvatarController {
    final Context mContext;

    public OfflineAvatarController(Context context) {
        super(null);
        this.mContext = context.getApplicationContext();
    }

    @Override
    public h<BoxDownload> b(String string, BoxAvatarView boxAvatarView) {
        return null;
    }

    @Override
    protected File f(String object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mContext.getFilesDir().getAbsolutePath());
        String string = File.separator;
        stringBuilder.append(string);
        stringBuilder.append((String)object);
        stringBuilder.append(string);
        stringBuilder.append("avatar");
        object = new File(stringBuilder.toString());
        this.c((File)object, 30);
        return object;
    }
}

