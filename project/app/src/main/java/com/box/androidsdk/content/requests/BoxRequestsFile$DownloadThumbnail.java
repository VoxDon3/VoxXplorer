/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import android.text.TextUtils;
import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequestDownload;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

public class BoxRequestsFile$DownloadThumbnail
extends BoxRequestDownload<BoxDownload, BoxRequestsFile$DownloadThumbnail> {
    public static int e0 = 32;
    public static int f0 = 64;
    public static int g0 = 94;
    public static int h0 = 128;
    public static int i0 = 160;
    public static int j0 = 256;
    private static final long serialVersionUID = 8123965031279971587L;
    protected Format mFormat = null;

    public BoxRequestsFile$DownloadThumbnail(String string, OutputStream outputStream, String string2, BoxSession boxSession) {
        super(string, BoxDownload.class, outputStream, string2, boxSession);
    }

    public Integer I() {
        if (this.mQueryMap.containsKey("max_height")) {
            return Integer.parseInt(this.mQueryMap.get("max_height"));
        }
        return null;
    }

    public Integer J() {
        if (this.mQueryMap.containsKey("max_width")) {
            return Integer.parseInt(this.mQueryMap.get("max_width"));
        }
        return null;
    }

    public Integer K() {
        if (this.mQueryMap.containsKey("min_height")) {
            return Integer.parseInt(this.mQueryMap.get("min_height"));
        }
        return null;
    }

    public Integer L() {
        if (this.mQueryMap.containsKey("min_width")) {
            return Integer.parseInt(this.mQueryMap.get("min_width"));
        }
        return null;
    }

    protected String M() {
        Object object = this.mFormat;
        if (object != null) {
            return object.toString();
        }
        object = this.L() != null ? this.L() : (this.K() != null ? this.K() : (this.J() != null ? this.J() : (this.I() != null ? this.I() : null)));
        if (object == null) {
            return Format.q.toString();
        }
        int n8 = (Integer)object;
        if (n8 <= e0) {
            return Format.c0.toString();
        }
        if (n8 <= f0) {
            return Format.c0.toString();
        }
        if (n8 <= g0) {
            return Format.q.toString();
        }
        if (n8 <= h0) {
            return Format.c0.toString();
        }
        if (n8 <= i0) {
            return Format.q.toString();
        }
        if (n8 <= j0) {
            return Format.c0.toString();
        }
        return Format.q.toString();
    }

    public BoxRequestsFile$DownloadThumbnail N(int n8) {
        this.mQueryMap.put("min_height", Integer.toString(n8));
        return this;
    }

    public BoxRequestsFile$DownloadThumbnail O(int n8) {
        this.P(n8);
        this.N(n8);
        return this;
    }

    public BoxRequestsFile$DownloadThumbnail P(int n8) {
        this.mQueryMap.put("min_width", Integer.toString(n8));
        return this;
    }

    @Override
    protected URL d() throws MalformedURLException, UnsupportedEncodingException {
        String string = this.j(this.mQueryMap);
        Locale locale = Locale.ENGLISH;
        String string2 = String.format(locale, "%s%s", this.mRequestUrlString, this.M());
        if (TextUtils.isEmpty((CharSequence)string)) {
            return new URL(string2);
        }
        return new URL(String.format(locale, "%s?%s", string2, string));
    }

    public static final class Format
    extends Enum<Format> {
        public static final /* enum */ Format c0;
        private static final Format[] d0;
        public static final /* enum */ Format q;
        private final String mExt;

        static {
            q = new Format(".jpg");
            c0 = new Format(".png");
            d0 = Format.d();
        }

        private Format(String string2) {
            this.mExt = string2;
        }

        private static /* synthetic */ Format[] d() {
            return new Format[]{q, c0};
        }

        public static Format valueOf(String string) {
            return Enum.valueOf(Format.class, string);
        }

        public static Format[] values() {
            return (Format[])d0.clone();
        }

        public String toString() {
            return this.mExt;
        }
    }
}

