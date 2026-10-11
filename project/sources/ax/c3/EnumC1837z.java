package ax.c3;

/* renamed from: ax.c3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1837z {
    AUDIO("Audio"),
    AUDIO_EXTRA("AudioExtra"),
    VIDEO("Video"),
    IMAGE("Image"),
    IMAGE_EXTRA("ImageExtra"),
    TEXT("Text"),
    PLAIN_TEXT("PlainText"),
    APP_TEXT("AppText"),
    WORD("Word"),
    EXCEL("Excel"),
    PPT("PowerPoint"),
    PDF("PDF"),
    PRESENTATION("Presentation"),
    SPREADSHEET("Spreadsheet"),
    EBOOK("Ebook"),
    ARCHIVE("Archive"),
    APK("Apk"),
    LINK("Link"),
    OTHERS("Others"),
    GROUP_DOCUMENT("Document");

    String q;

    EnumC1837z(String str) {
        this.q = str;
    }

    public String h() {
        return this.q;
    }
}
