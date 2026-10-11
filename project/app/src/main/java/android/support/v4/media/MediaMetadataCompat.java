/*
 * Decompiled with CFR 0.152.
 */
package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import ax.B.a;

@SuppressLint(value={"BanParcelableUsage"})
public final class MediaMetadataCompat
implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    static final a<String, Integer> e0;
    private static final String[] f0;
    private static final String[] g0;
    private static final String[] h0;
    private MediaMetadata c0;
    private MediaDescriptionCompat d0;
    final Bundle q;

    static {
        a<String, Integer> a8 = new a<String, Integer>();
        e0 = a8;
        Integer n8 = 1;
        a8.put("android.media.metadata.TITLE", n8);
        a8.put("android.media.metadata.ARTIST", n8);
        Integer n9 = 0;
        a8.put("android.media.metadata.DURATION", n9);
        a8.put("android.media.metadata.ALBUM", n8);
        a8.put("android.media.metadata.AUTHOR", n8);
        a8.put("android.media.metadata.WRITER", n8);
        a8.put("android.media.metadata.COMPOSER", n8);
        a8.put("android.media.metadata.COMPILATION", n8);
        a8.put("android.media.metadata.DATE", n8);
        a8.put("android.media.metadata.YEAR", n9);
        a8.put("android.media.metadata.GENRE", n8);
        a8.put("android.media.metadata.TRACK_NUMBER", n9);
        a8.put("android.media.metadata.NUM_TRACKS", n9);
        a8.put("android.media.metadata.DISC_NUMBER", n9);
        a8.put("android.media.metadata.ALBUM_ARTIST", n8);
        Integer n10 = 2;
        a8.put("android.media.metadata.ART", n10);
        a8.put("android.media.metadata.ART_URI", n8);
        a8.put("android.media.metadata.ALBUM_ART", n10);
        a8.put("android.media.metadata.ALBUM_ART_URI", n8);
        Integer n11 = 3;
        a8.put("android.media.metadata.USER_RATING", n11);
        a8.put("android.media.metadata.RATING", n11);
        a8.put("android.media.metadata.DISPLAY_TITLE", n8);
        a8.put("android.media.metadata.DISPLAY_SUBTITLE", n8);
        a8.put("android.media.metadata.DISPLAY_DESCRIPTION", n8);
        a8.put("android.media.metadata.DISPLAY_ICON", n10);
        a8.put("android.media.metadata.DISPLAY_ICON_URI", n8);
        a8.put("android.media.metadata.MEDIA_ID", n8);
        a8.put("android.media.metadata.BT_FOLDER_TYPE", n9);
        a8.put("android.media.metadata.MEDIA_URI", n8);
        a8.put("android.media.metadata.ADVERTISEMENT", n9);
        a8.put("android.media.metadata.DOWNLOAD_STATUS", n9);
        f0 = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        g0 = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        h0 = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new Parcelable.Creator<MediaMetadataCompat>(){

            public MediaMetadataCompat a(Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }

            public MediaMetadataCompat[] b(int n8) {
                return new MediaMetadataCompat[n8];
            }
        };
    }

    MediaMetadataCompat(Bundle bundle) {
        this.q = bundle = new Bundle(bundle);
        MediaSessionCompat.a(bundle);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.q = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat b(Object object) {
        if (object != null) {
            Parcel parcel = Parcel.obtain();
            MediaMetadata mediaMetadata = (MediaMetadata)object;
            mediaMetadata.writeToParcel(parcel, 0);
            parcel.setDataPosition(0);
            object = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
            parcel.recycle();
            ((MediaMetadataCompat)object).c0 = mediaMetadata;
            return object;
        }
        return null;
    }

    public boolean a(String string) {
        return this.q.containsKey(string);
    }

    public Bitmap c(String string) {
        try {
            string = (Bitmap)this.q.getParcelable(string);
            return string;
        }
        catch (Exception exception) {
            Log.w((String)"MediaMetadata", (String)"Failed to retrieve a key as Bitmap.", (Throwable)exception);
            return null;
        }
    }

    public Bundle d() {
        return new Bundle(this.q);
    }

    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat e() {
        Uri uri;
        Uri uri2;
        CharSequence[] charSequenceArray;
        String string;
        Object object;
        block13: {
            int n8;
            block12: {
                int n9;
                object = this.d0;
                if (object != null) {
                    return object;
                }
                string = this.i("android.media.metadata.MEDIA_ID");
                charSequenceArray = new CharSequence[3];
                object = this.j("android.media.metadata.DISPLAY_TITLE");
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    charSequenceArray[0] = object;
                    charSequenceArray[1] = this.j("android.media.metadata.DISPLAY_SUBTITLE");
                    charSequenceArray[2] = this.j("android.media.metadata.DISPLAY_DESCRIPTION");
                } else {
                    int n10 = 0;
                    for (n8 = 0; n10 < 3 && n8 < ((String[])(object = f0)).length; ++n8) {
                        object = this.j(object[n8]);
                        n9 = n10;
                        if (!TextUtils.isEmpty((CharSequence)object)) {
                            charSequenceArray[n10] = object;
                            n9 = n10 + 1;
                        }
                        n10 = n9;
                    }
                }
                n8 = 0;
                while (true) {
                    object = g0;
                    n9 = ((String[])object).length;
                    uri2 = null;
                    if (n8 >= n9) break;
                    if ((object = this.c(object[n8])) == null) {
                        ++n8;
                        continue;
                    }
                    break block12;
                    break;
                }
                object = null;
            }
            for (n8 = 0; n8 < ((String[])(uri = h0)).length; ++n8) {
                if (TextUtils.isEmpty((CharSequence)(uri = this.i(uri[n8])))) continue;
                uri = Uri.parse((String)uri);
                break block13;
            }
            uri = null;
        }
        Object object2 = this.i("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty((CharSequence)object2)) {
            uri2 = Uri.parse((String)object2);
        }
        object2 = new MediaDescriptionCompat.d();
        ((MediaDescriptionCompat.d)object2).f(string);
        ((MediaDescriptionCompat.d)object2).i(charSequenceArray[0]);
        ((MediaDescriptionCompat.d)object2).h(charSequenceArray[1]);
        ((MediaDescriptionCompat.d)object2).b(charSequenceArray[2]);
        ((MediaDescriptionCompat.d)object2).d((Bitmap)object);
        ((MediaDescriptionCompat.d)object2).e(uri);
        ((MediaDescriptionCompat.d)object2).g(uri2);
        object = new Bundle();
        if (this.q.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            object.putLong("android.media.extra.BT_FOLDER_TYPE", this.f("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.q.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            object.putLong("android.media.extra.DOWNLOAD_STATUS", this.f("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!object.isEmpty()) {
            ((MediaDescriptionCompat.d)object2).c((Bundle)object);
        }
        object = ((MediaDescriptionCompat.d)object2).a();
        this.d0 = object;
        return object;
    }

    public long f(String string) {
        return this.q.getLong(string, 0L);
    }

    public Object g() {
        if (this.c0 == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String string : this.q.keySet()) {
                int n8;
                Integer n9 = e0.get((Object)string);
                Object object = n9;
                if (n9 == null) {
                    object = -1;
                }
                if ((n8 = ((Integer)object).intValue()) != 0) {
                    if (n8 != 1) {
                        if (n8 != 2) {
                            if (n8 != 3) {
                                object = this.q.get(string);
                                if (object != null && !(object instanceof CharSequence)) {
                                    if (object instanceof Long) {
                                        builder.putLong(string, ((Long)object).longValue());
                                        continue;
                                    }
                                    if (object instanceof Bitmap) {
                                        builder.putBitmap(string, (Bitmap)object);
                                        continue;
                                    }
                                    if (!(object instanceof Rating)) continue;
                                    builder.putRating(string, (Rating)object);
                                    continue;
                                }
                                builder.putText(string, (CharSequence)object);
                                continue;
                            }
                            builder.putRating(string, (Rating)this.q.getParcelable(string));
                            continue;
                        }
                        builder.putBitmap(string, (Bitmap)this.q.getParcelable(string));
                        continue;
                    }
                    builder.putText(string, this.q.getCharSequence(string));
                    continue;
                }
                builder.putLong(string, this.q.getLong(string, 0L));
            }
            this.c0 = builder.build();
        }
        return this.c0;
    }

    public String i(String charSequence) {
        if ((charSequence = this.q.getCharSequence((String)charSequence)) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence j(String string) {
        return this.q.getCharSequence(string);
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeBundle(this.q);
    }

    public static final class b {
        private final Bundle a;

        public b() {
            this.a = new Bundle();
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            mediaMetadataCompat = new Bundle(mediaMetadataCompat.q);
            this.a = mediaMetadataCompat;
            MediaSessionCompat.a((Bundle)mediaMetadataCompat);
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.a);
        }

        public b b(String string, Bitmap object) {
            a<String, Integer> a8 = e0;
            if (a8.containsKey((Object)string) && a8.get((Object)string) != 2) {
                object = new StringBuilder();
                ((StringBuilder)object).append("The ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" key cannot be used to put a Bitmap");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            this.a.putParcelable(string, (Parcelable)object);
            return this;
        }

        public b c(String string, long l8) {
            a<String, Integer> a8 = e0;
            if (a8.containsKey((Object)string) && a8.get((Object)string) != 0) {
                a8 = new StringBuilder();
                ((StringBuilder)((Object)a8)).append("The ");
                ((StringBuilder)((Object)a8)).append(string);
                ((StringBuilder)((Object)a8)).append(" key cannot be used to put a long");
                throw new IllegalArgumentException(((StringBuilder)((Object)a8)).toString());
            }
            this.a.putLong(string, l8);
            return this;
        }

        public b d(String string, String charSequence) {
            a<String, Integer> a8 = e0;
            if (a8.containsKey((Object)string) && a8.get((Object)string) != 1) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("The ");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append(" key cannot be used to put a String");
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
            this.a.putCharSequence(string, charSequence);
            return this;
        }
    }
}

