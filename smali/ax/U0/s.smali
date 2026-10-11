.class public Lax/U0/s;
.super Lax/U0/h;
.source "SourceFile"


# instance fields
.field public final c0:Lax/U0/k;

.field public final d0:I


# direct methods
.method public constructor <init>(Lax/U0/k;II)V
    .registers 4

    .line 1
    invoke-static {p2, p3}, Lax/U0/s;->b(II)I

    move-result p2

    invoke-direct {p0, p2}, Lax/U0/h;-><init>(I)V

    .line 2
    iput-object p1, p0, Lax/U0/s;->c0:Lax/U0/k;

    .line 3
    iput p3, p0, Lax/U0/s;->d0:I

    return-void
.end method

.method public constructor <init>(Ljava/io/IOException;Lax/U0/k;II)V
    .registers 5

    .line 7
    invoke-static {p3, p4}, Lax/U0/s;->b(II)I

    move-result p3

    invoke-direct {p0, p1, p3}, Lax/U0/h;-><init>(Ljava/lang/Throwable;I)V

    .line 8
    iput-object p2, p0, Lax/U0/s;->c0:Lax/U0/k;

    .line 9
    iput p4, p0, Lax/U0/s;->d0:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lax/U0/k;II)V
    .registers 5

    .line 4
    invoke-static {p3, p4}, Lax/U0/s;->b(II)I

    move-result p3

    invoke-direct {p0, p1, p3}, Lax/U0/h;-><init>(Ljava/lang/String;I)V

    .line 5
    iput-object p2, p0, Lax/U0/s;->c0:Lax/U0/k;

    .line 6
    iput p4, p0, Lax/U0/s;->d0:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/IOException;Lax/U0/k;II)V
    .registers 6

    .line 10
    invoke-static {p4, p5}, Lax/U0/s;->b(II)I

    move-result p4

    invoke-direct {p0, p1, p2, p4}, Lax/U0/h;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 11
    iput-object p3, p0, Lax/U0/s;->c0:Lax/U0/k;

    .line 12
    iput p5, p0, Lax/U0/s;->d0:I

    return-void
.end method

.method private static b(II)I
    .registers 3

    .line 1
    const/16 v0, 0x7d0

    .line 2
    .line 3
    if-ne p0, v0, :cond_9

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_9

    .line 7
    .line 8
    const/16 p0, 0x7d1

    .line 9
    .line 10
    :cond_9
    return p0
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

.method public static c(Ljava/io/IOException;Lax/U0/k;I)Lax/U0/s;
    .registers 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, p0, Ljava/net/SocketTimeoutException;

    .line 6
    .line 7
    const/16 v2, 0x7d7

    .line 8
    .line 9
    if-eqz v1, :cond_d

    .line 10
    .line 11
    const/16 v0, 0x7d2

    .line 12
    .line 13
    goto :goto_27

    .line 14
    :cond_d
    instance-of v1, p0, Ljava/io/InterruptedIOException;

    .line 15
    .line 16
    if-eqz v1, :cond_14

    .line 17
    .line 18
    const/16 v0, 0x3ec

    .line 19
    .line 20
    goto :goto_27

    .line 21
    :cond_14
    if-eqz v0, :cond_25

    .line 22
    .line 23
    invoke-static {v0}, Lax/q7/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "cleartext.*not permitted.*"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_25

    .line 34
    .line 35
    const/16 v0, 0x7d7

    .line 36
    .line 37
    goto :goto_27

    .line 38
    :cond_25
    const/16 v0, 0x7d1

    .line 39
    .line 40
    :goto_27
    if-ne v0, v2, :cond_2f

    .line 41
    .line 42
    new-instance p2, Lax/U0/r;

    .line 43
    .line 44
    invoke-direct {p2, p0, p1}, Lax/U0/r;-><init>(Ljava/io/IOException;Lax/U0/k;)V

    .line 45
    .line 46
    .line 47
    return-object p2

    .line 48
    :cond_2f
    new-instance v1, Lax/U0/s;

    .line 49
    .line 50
    invoke-direct {v1, p0, p1, v0, p2}, Lax/U0/s;-><init>(Ljava/io/IOException;Lax/U0/k;II)V

    .line 51
    .line 52
    .line 53
    return-object v1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method
