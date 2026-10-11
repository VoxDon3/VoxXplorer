package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    private final CharSequence c0;
    private final CharSequence d0;
    private final CharSequence e0;
    private final Bitmap f0;
    private final Uri g0;
    private final Bundle h0;
    private final Uri i0;
    private MediaDescription j0;
    private final String q;

    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            Uri mediaUri;
            mediaUri = mediaDescription.getMediaUri();
            return mediaUri;
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {
        private String a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private Bitmap e;
        private Uri f;
        private Bundle g;
        private Uri h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public d b(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f = uri;
            return this;
        }

        public d f(String str) {
            this.a = str;
            return this;
        }

        public d g(Uri uri) {
            this.h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.q = str;
        this.c0 = charSequence;
        this.d0 = charSequence2;
        this.e0 = charSequence3;
        this.f0 = bitmap;
        this.g0 = uri;
        this.h0 = bundle;
        this.i0 = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L7f
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$d r2 = new android.support.v4.media.MediaDescriptionCompat$d
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = android.support.v4.media.MediaDescriptionCompat.b.g(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.i(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.h(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.c(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.MediaDescriptionCompat.b.e(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.MediaDescriptionCompat.b.f(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.MediaDescriptionCompat.b.d(r9)
            if (r3 == 0) goto L40
            android.os.Bundle r3 = android.support.v4.media.session.MediaSessionCompat.r(r3)
        L40:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4b
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L4c
        L4b:
            r5 = r0
        L4c:
            if (r5 == 0) goto L64
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L5e
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L5e
            goto L65
        L5e:
            r3.remove(r4)
            r3.remove(r6)
        L64:
            r0 = r3
        L65:
            r2.c(r0)
            if (r5 == 0) goto L6e
            r2.g(r5)
            goto L79
        L6e:
            r0 = 23
            if (r1 < r0) goto L79
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.c.a(r9)
            r2.g(r0)
        L79:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.j0 = r9
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public CharSequence b() {
        return this.e0;
    }

    public Bitmap c() {
        return this.f0;
    }

    public Uri d() {
        return this.g0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object e() {
        Bundle bundle;
        MediaDescription mediaDescription = this.j0;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        int i = Build.VERSION.SDK_INT;
        MediaDescription.Builder b2 = b.b();
        b.n(b2, this.q);
        b.p(b2, this.c0);
        b.o(b2, this.d0);
        b.j(b2, this.e0);
        b.l(b2, this.f0);
        b.m(b2, this.g0);
        if (i >= 23 || this.i0 == null) {
            b.k(b2, this.h0);
        } else {
            if (this.h0 == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(this.h0);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.i0);
            b.k(b2, bundle);
        }
        if (i >= 23) {
            c.b(b2, this.i0);
        }
        MediaDescription a2 = b.a(b2);
        this.j0 = a2;
        return a2;
    }

    public String f() {
        return this.q;
    }

    public CharSequence g() {
        return this.d0;
    }

    public CharSequence i() {
        return this.c0;
    }

    public String toString() {
        return ((Object) this.c0) + ", " + ((Object) this.d0) + ", " + ((Object) this.e0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) e()).writeToParcel(parcel, i);
    }
}
