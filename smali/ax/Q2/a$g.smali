.class public Lax/Q2/a$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/Q2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# direct methods
.method public static a(J)Ljava/lang/String;
    .registers 5

    .line 1
    const-wide/16 v0, 0x3e8

    .line 2
    .line 3
    div-long/2addr p0, v0

    .line 4
    const-wide/16 v0, 0x1e

    .line 5
    .line 6
    cmp-long v2, p0, v0

    .line 7
    .line 8
    if-gez v2, :cond_c

    .line 9
    .line 10
    const-string p0, "30sec"

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_c
    const-wide/16 v0, 0x3c

    .line 14
    .line 15
    cmp-long v2, p0, v0

    .line 16
    .line 17
    if-gez v2, :cond_15

    .line 18
    .line 19
    const-string p0, "60sec"

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_15
    const-wide/16 v0, 0x12c

    .line 23
    .line 24
    cmp-long v2, p0, v0

    .line 25
    .line 26
    if-gez v2, :cond_1e

    .line 27
    .line 28
    const-string p0, "5min"

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1e
    const-wide/16 v0, 0x258

    .line 32
    .line 33
    cmp-long v2, p0, v0

    .line 34
    .line 35
    if-gez v2, :cond_27

    .line 36
    .line 37
    const-string p0, "10min"

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_27
    const-wide/16 v0, 0x708

    .line 41
    .line 42
    cmp-long v2, p0, v0

    .line 43
    .line 44
    if-gez v2, :cond_30

    .line 45
    .line 46
    const-string p0, "30min"

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_30
    const-wide/16 v0, 0xe10

    .line 50
    .line 51
    cmp-long v2, p0, v0

    .line 52
    .line 53
    if-gez v2, :cond_39

    .line 54
    .line 55
    const-string p0, "60min"

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_39
    const-string p0, "More than 60min"

    .line 59
    .line 60
    return-object p0
    .line 61
.end method
