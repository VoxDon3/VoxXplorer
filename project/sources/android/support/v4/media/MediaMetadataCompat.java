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

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    static final ax.B.a<String, Integer> e0;
    private static final String[] f0;
    private static final String[] g0;
    private static final String[] h0;
    private MediaMetadata c0;
    private MediaDescriptionCompat d0;
    final Bundle q;

    class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        ax.B.a<String, Integer> aVar = new ax.B.a<>();
        e0 = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f0 = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        g0 = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        h0 = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.q = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    public static MediaMetadataCompat b(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.c0 = mediaMetadata;
        return createFromParcel;
    }

    public boolean a(String str) {
        return this.q.containsKey(str);
    }

    public Bitmap c(String str) {
        try {
            return (Bitmap) this.q.getParcelable(str);
        } catch (Exception e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    public Bundle d() {
        return new Bundle(this.q);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat e() {
        Bitmap bitmap;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.d0;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String i = i("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence j = j("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(j)) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < 3) {
                String[] strArr = f0;
                if (i3 >= strArr.length) {
                    break;
                }
                int i4 = i3 + 1;
                CharSequence j2 = j(strArr[i3]);
                if (!TextUtils.isEmpty(j2)) {
                    charSequenceArr[i2] = j2;
                    i2++;
                }
                i3 = i4;
            }
        } else {
            charSequenceArr[0] = j;
            charSequenceArr[1] = j("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = j("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i5 = 0;
        while (true) {
            String[] strArr2 = g0;
            if (i5 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = c(strArr2[i5]);
            if (bitmap != null) {
                break;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            String[] strArr3 = h0;
            if (i6 >= strArr3.length) {
                uri = null;
                break;
            }
            String i7 = i(strArr3[i6]);
            if (!TextUtils.isEmpty(i7)) {
                uri = Uri.parse(i7);
                break;
            }
            i6++;
        }
        String i8 = i("android.media.metadata.MEDIA_URI");
        Uri parse = TextUtils.isEmpty(i8) ? null : Uri.parse(i8);
        MediaDescriptionCompat.d dVar = new MediaDescriptionCompat.d();
        dVar.f(i);
        dVar.i(charSequenceArr[0]);
        dVar.h(charSequenceArr[1]);
        dVar.b(charSequenceArr[2]);
        dVar.d(bitmap);
        dVar.e(uri);
        dVar.g(parse);
        Bundle bundle = new Bundle();
        if (this.q.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", f("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.q.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", f("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            dVar.c(bundle);
        }
        MediaDescriptionCompat a2 = dVar.a();
        this.d0 = a2;
        return a2;
    }

    public long f(String str) {
        return this.q.getLong(str, 0L);
    }

    public Object g() {
        if (this.c0 == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : this.q.keySet()) {
                Integer num = e0.get(str);
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue == 0) {
                    builder.putLong(str, this.q.getLong(str, 0L));
                } else if (intValue == 1) {
                    builder.putText(str, this.q.getCharSequence(str));
                } else if (intValue == 2) {
                    builder.putBitmap(str, (Bitmap) this.q.getParcelable(str));
                } else if (intValue != 3) {
                    Object obj = this.q.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Bitmap) {
                        builder.putBitmap(str, (Bitmap) obj);
                    } else if (obj instanceof Rating) {
                        builder.putRating(str, (Rating) obj);
                    }
                } else {
                    builder.putRating(str, (Rating) this.q.getParcelable(str));
                }
            }
            this.c0 = builder.build();
        }
        return this.c0;
    }

    public String i(String str) {
        CharSequence charSequence = this.q.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence j(String str) {
        return this.q.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.q);
    }

    public static final class b {
        private final Bundle a;

        public b() {
            this.a = new Bundle();
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.a);
        }

        public b b(String str, Bitmap bitmap) {
            ax.B.a<String, Integer> aVar = MediaMetadataCompat.e0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 2) {
                this.a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public b c(String str, long j) {
            ax.B.a<String, Integer> aVar = MediaMetadataCompat.e0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 0) {
                this.a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public b d(String str, String str2) {
            ax.B.a<String, Integer> aVar = MediaMetadataCompat.e0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 1) {
                this.a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.q);
            this.a = bundle;
            MediaSessionCompat.a(bundle);
        }
    }

    MediaMetadataCompat(Parcel parcel) {
        this.q = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
