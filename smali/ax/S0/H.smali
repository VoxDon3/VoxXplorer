.class public final Lax/S0/H;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(II)I
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_1
    const/4 v1, 0x2

    .line 3
    if-gt v0, v1, :cond_12

    .line 4
    .line 5
    add-int v1, p0, v0

    .line 6
    .line 7
    rem-int/lit8 v1, v1, 0x3

    .line 8
    .line 9
    invoke-static {v1, p1}, Lax/S0/H;->b(II)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_12
    return p0
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

.method public static b(II)Z
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_16

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eq p0, v0, :cond_10

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eq p0, v2, :cond_a

    .line 9
    .line 10
    return v1

    .line 11
    :cond_a
    and-int/lit8 p0, p1, 0x2

    .line 12
    .line 13
    if-eqz p0, :cond_f

    .line 14
    .line 15
    return v0

    .line 16
    :cond_f
    return v1

    .line 17
    :cond_10
    and-int/lit8 p0, p1, 0x1

    .line 18
    .line 19
    if-eqz p0, :cond_15

    .line 20
    .line 21
    return v0

    .line 22
    :cond_15
    return v1

    .line 23
    :cond_16
    return v0
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
