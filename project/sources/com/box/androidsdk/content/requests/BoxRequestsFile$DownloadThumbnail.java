package com.box.androidsdk.content.requests;

import android.text.TextUtils;
import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxSession;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* loaded from: classes.dex */
public class BoxRequestsFile$DownloadThumbnail extends BoxRequestDownload<BoxDownload, BoxRequestsFile$DownloadThumbnail> {
    public static int e0 = 32;
    public static int f0 = 64;
    public static int g0 = 94;
    public static int h0 = 128;
    public static int i0 = 160;
    public static int j0 = 256;
    private static final long serialVersionUID = 8123965031279971587L;
    protected Format mFormat;

    public enum Format {
        JPG(".jpg"),
        PNG(".png");

        private final String mExt;

        Format(String str) {
            this.mExt = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mExt;
        }
    }

    public BoxRequestsFile$DownloadThumbnail(String str, OutputStream outputStream, String str2, BoxSession boxSession) {
        super(str, BoxDownload.class, outputStream, str2, boxSession);
        this.mFormat = null;
    }

    public Integer I() {
        if (this.mQueryMap.containsKey("max_height")) {
            return Integer.valueOf(Integer.parseInt(this.mQueryMap.get("max_height")));
        }
        return null;
    }

    public Integer J() {
        if (this.mQueryMap.containsKey("max_width")) {
            return Integer.valueOf(Integer.parseInt(this.mQueryMap.get("max_width")));
        }
        return null;
    }

    public Integer K() {
        if (this.mQueryMap.containsKey("min_height")) {
            return Integer.valueOf(Integer.parseInt(this.mQueryMap.get("min_height")));
        }
        return null;
    }

    public Integer L() {
        if (this.mQueryMap.containsKey("min_width")) {
            return Integer.valueOf(Integer.parseInt(this.mQueryMap.get("min_width")));
        }
        return null;
    }

    protected String M() {
        Format format = this.mFormat;
        if (format != null) {
            return format.toString();
        }
        Integer L = L() != null ? L() : K() != null ? K() : J() != null ? J() : I() != null ? I() : null;
        if (L == null) {
            return Format.JPG.toString();
        }
        int intValue = L.intValue();
        return intValue <= e0 ? Format.PNG.toString() : intValue <= f0 ? Format.PNG.toString() : intValue <= g0 ? Format.JPG.toString() : intValue <= h0 ? Format.PNG.toString() : intValue <= i0 ? Format.JPG.toString() : intValue <= j0 ? Format.PNG.toString() : Format.JPG.toString();
    }

    public BoxRequestsFile$DownloadThumbnail N(int i) {
        this.mQueryMap.put("min_height", Integer.toString(i));
        return this;
    }

    public BoxRequestsFile$DownloadThumbnail O(int i) {
        P(i);
        N(i);
        return this;
    }

    public BoxRequestsFile$DownloadThumbnail P(int i) {
        this.mQueryMap.put("min_width", Integer.toString(i));
        return this;
    }

    @Override // com.box.androidsdk.content.requests.BoxRequest
    protected URL d() throws MalformedURLException, UnsupportedEncodingException {
        String j = j(this.mQueryMap);
        Locale locale = Locale.ENGLISH;
        String format = String.format(locale, "%s%s", this.mRequestUrlString, M());
        return TextUtils.isEmpty(j) ? new URL(format) : new URL(String.format(locale, "%s?%s", format, j));
    }
}
