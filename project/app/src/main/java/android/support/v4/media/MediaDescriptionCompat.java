/*
 * Decompiled with CFR 0.152.
 */
package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import ax.f.a;

@SuppressLint(value={"BanParcelableUsage"})
public final class MediaDescriptionCompat
implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>(){

        public MediaDescriptionCompat a(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public MediaDescriptionCompat[] b(int n8) {
            return new MediaDescriptionCompat[n8];
        }
    };
    private final CharSequence c0;
    private final CharSequence d0;
    private final CharSequence e0;
    private final Bitmap f0;
    private final Uri g0;
    private final Bundle h0;
    private final Uri i0;
    private MediaDescription j0;
    private final String q;

    MediaDescriptionCompat(String string, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.q = string;
        this.c0 = charSequence;
        this.d0 = charSequence2;
        this.e0 = charSequence3;
        this.f0 = bitmap;
        this.g0 = uri;
        this.h0 = bundle;
        this.i0 = uri2;
    }

    public static MediaDescriptionCompat a(Object object) {
        Object object2 = null;
        Object var3_2 = null;
        if (object != null) {
            int n8 = Build.VERSION.SDK_INT;
            d d8 = new d();
            MediaDescription mediaDescription = (MediaDescription)object;
            d8.f(b.g(mediaDescription));
            d8.i(b.i(mediaDescription));
            d8.h(b.h(mediaDescription));
            d8.b(b.c(mediaDescription));
            d8.d(b.e(mediaDescription));
            d8.e(b.f(mediaDescription));
            object2 = b.d(mediaDescription);
            object = object2;
            if (object2 != null) {
                object = MediaSessionCompat.r(object2);
            }
            if ((object2 = object != null ? (Uri)object.getParcelable("android.support.v4.media.description.MEDIA_URI") : null) != null) {
                if (object.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && object.size() == 2) {
                    object = var3_2;
                } else {
                    object.remove("android.support.v4.media.description.MEDIA_URI");
                    object.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            d8.c((Bundle)object);
            if (object2 != null) {
                d8.g((Uri)object2);
            } else if (n8 >= 23) {
                d8.g(c.a(mediaDescription));
            }
            object2 = d8.a();
            object2.j0 = mediaDescription;
        }
        return object2;
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

    public int describeContents() {
        return 0;
    }

    public Object e() {
        MediaDescription mediaDescription;
        MediaDescription mediaDescription2 = mediaDescription = this.j0;
        if (mediaDescription == null) {
            int n8 = Build.VERSION.SDK_INT;
            mediaDescription = b.b();
            b.n((MediaDescription.Builder)mediaDescription, this.q);
            b.p((MediaDescription.Builder)mediaDescription, this.c0);
            b.o((MediaDescription.Builder)mediaDescription, this.d0);
            b.j((MediaDescription.Builder)mediaDescription, this.e0);
            b.l((MediaDescription.Builder)mediaDescription, this.f0);
            b.m((MediaDescription.Builder)mediaDescription, this.g0);
            if (n8 < 23 && this.i0 != null) {
                if (this.h0 == null) {
                    mediaDescription2 = new Bundle();
                    mediaDescription2.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    mediaDescription2 = new Bundle(this.h0);
                }
                mediaDescription2.putParcelable("android.support.v4.media.description.MEDIA_URI", (Parcelable)this.i0);
                b.k((MediaDescription.Builder)mediaDescription, (Bundle)mediaDescription2);
            } else {
                b.k((MediaDescription.Builder)mediaDescription, this.h0);
            }
            if (n8 >= 23) {
                c.b((MediaDescription.Builder)mediaDescription, this.i0);
            }
            this.j0 = mediaDescription2 = b.a((MediaDescription.Builder)mediaDescription);
        }
        return mediaDescription2;
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.c0);
        stringBuilder.append(", ");
        stringBuilder.append((Object)this.d0);
        stringBuilder.append(", ");
        stringBuilder.append((Object)this.e0);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        ((MediaDescription)this.e()).writeToParcel(parcel, n8);
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

        static void n(MediaDescription.Builder builder, String string) {
            builder.setMediaId(string);
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
            return ax.f.b.a(mediaDescription);
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            a.a(builder, uri);
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

        public d f(String string) {
            this.a = string;
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
}

