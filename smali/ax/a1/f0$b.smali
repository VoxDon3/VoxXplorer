.class final Lax/a1/f0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a1/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method public static a(Landroid/media/AudioTrack;Lax/a1/f0$h;)J
    .registers 9

    .line 1
    iget v0, p1, Lax/a1/f0$h;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    invoke-static {p0}, Lax/a1/h0;->a(Landroid/media/AudioTrack;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-long v0, p0

    .line 10
    invoke-virtual {p1, v0, v1}, Lax/a1/f0$h;->d(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0

    .line 15
    :cond_e
    invoke-static {p0}, Lax/a1/h0;->a(Landroid/media/AudioTrack;)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    int-to-long v0, p0

    .line 20
    iget p0, p1, Lax/a1/f0$h;->g:I

    .line 21
    .line 22
    invoke-static {p0}, Lax/a1/f0;->Q(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    int-to-long v4, p0

    .line 27
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 28
    .line 29
    const-wide/32 v2, 0xf4240

    .line 30
    .line 31
    .line 32
    invoke-static/range {v0 .. v6}, Lax/S0/d0;->r1(JJJLjava/math/RoundingMode;)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    return-wide p0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public static b(Landroid/media/AudioTrack;Lax/a1/k;)V
    .registers 2

    .line 1
    if-nez p1, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_6

    .line 5
    :cond_4
    iget-object p1, p1, Lax/a1/k;->a:Landroid/media/AudioDeviceInfo;

    .line 6
    .line 7
    :goto_6
    invoke-static {p0, p1}, Lax/a1/g0;->a(Landroid/media/AudioTrack;Landroid/media/AudioDeviceInfo;)Z

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
