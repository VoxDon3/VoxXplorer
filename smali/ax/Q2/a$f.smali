.class public Lax/Q2/a$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/Q2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# direct methods
.method public static a(I)Ljava/lang/String;
    .registers 2

    .line 1
    if-nez p0, :cond_5

    .line 2
    .line 3
    const-string p0, "0"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    const/16 v0, 0x64

    .line 7
    .line 8
    if-ge p0, v0, :cond_c

    .line 9
    .line 10
    const-string p0, "100"

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_c
    const/16 v0, 0x3e8

    .line 14
    .line 15
    if-ge p0, v0, :cond_13

    .line 16
    .line 17
    const-string p0, "1000"

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_13
    const/16 v0, 0x7d0

    .line 21
    .line 22
    if-ge p0, v0, :cond_1a

    .line 23
    .line 24
    const-string p0, "2000"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1a
    const/16 v0, 0xbb8

    .line 28
    .line 29
    if-ge p0, v0, :cond_21

    .line 30
    .line 31
    const-string p0, "3000"

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_21
    const/16 v0, 0x1388

    .line 35
    .line 36
    if-ge p0, v0, :cond_28

    .line 37
    .line 38
    const-string p0, "5000"

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_28
    const/16 v0, 0x2710

    .line 42
    .line 43
    if-ge p0, v0, :cond_2f

    .line 44
    .line 45
    const-string p0, "10000"

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2f
    const-string p0, "More than 10000"

    .line 49
    .line 50
    return-object p0
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
