/*
 * Decompiled with CFR 0.152.
 */
package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

@SuppressLint(value={"BanParcelableUsage"})
public final class RatingCompat
implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>(){

        public RatingCompat a(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public RatingCompat[] b(int n8) {
            return new RatingCompat[n8];
        }
    };
    private final float c0;
    private Object d0;
    private final int q;

    RatingCompat(int n8, float f8) {
        this.q = n8;
        this.c0 = f8;
    }

    public static RatingCompat a(Object object) {
        Object object2 = null;
        if (object != null) {
            object2 = (Rating)object;
            int n8 = b.b(object2);
            if (b.e(object2)) {
                switch (n8) {
                    default: {
                        return null;
                    }
                    case 6: {
                        object2 = RatingCompat.c(b.a(object2));
                        break;
                    }
                    case 3: 
                    case 4: 
                    case 5: {
                        object2 = RatingCompat.d(n8, b.c(object2));
                        break;
                    }
                    case 2: {
                        object2 = RatingCompat.e(b.f(object2));
                        break;
                    }
                    case 1: {
                        object2 = RatingCompat.b(b.d(object2));
                        break;
                    }
                }
            } else {
                object2 = RatingCompat.f(n8);
            }
            object2.d0 = object;
        }
        return object2;
    }

    public static RatingCompat b(boolean bl) {
        float f8 = bl ? 1.0f : 0.0f;
        return new RatingCompat(1, f8);
    }

    public static RatingCompat c(float f8) {
        if (!(f8 < 0.0f) && !(f8 > 100.0f)) {
            return new RatingCompat(6, f8);
        }
        Log.e((String)"Rating", (String)"Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat d(int n8, float f8) {
        float f9;
        if (n8 != 3) {
            if (n8 != 4) {
                if (n8 != 5) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid rating style (");
                    stringBuilder.append(n8);
                    stringBuilder.append(") for a star rating");
                    Log.e((String)"Rating", (String)stringBuilder.toString());
                    return null;
                }
                f9 = 5.0f;
            } else {
                f9 = 4.0f;
            }
        } else {
            f9 = 3.0f;
        }
        if (!(f8 < 0.0f) && !(f8 > f9)) {
            return new RatingCompat(n8, f8);
        }
        Log.e((String)"Rating", (String)"Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat e(boolean bl) {
        float f8 = bl ? 1.0f : 0.0f;
        return new RatingCompat(2, f8);
    }

    public static RatingCompat f(int n8) {
        switch (n8) {
            default: {
                return null;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
        }
        return new RatingCompat(n8, -1.0f);
    }

    public int describeContents() {
        return this.q;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rating:style=");
        stringBuilder.append(this.q);
        stringBuilder.append(" rating=");
        float f8 = this.c0;
        String string = f8 < 0.0f ? "unrated" : String.valueOf(f8);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.q);
        parcel.writeFloat(this.c0);
    }

    private static class b {
        static float a(Rating rating) {
            return rating.getPercentRating();
        }

        static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        static float c(Rating rating) {
            return rating.getStarRating();
        }

        static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        static boolean e(Rating rating) {
            return rating.isRated();
        }

        static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        static Rating g(boolean bl) {
            return Rating.newHeartRating((boolean)bl);
        }

        static Rating h(float f8) {
            return Rating.newPercentageRating((float)f8);
        }

        static Rating i(int n8, float f8) {
            return Rating.newStarRating((int)n8, (float)f8);
        }

        static Rating j(boolean bl) {
            return Rating.newThumbRating((boolean)bl);
        }

        static Rating k(int n8) {
            return Rating.newUnratedRating((int)n8);
        }
    }
}

