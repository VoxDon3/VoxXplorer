.class public abstract Lax/t4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/TimeZone;

.field private static final b:[Ljava/lang/String;

.field private static final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 14

    .line 1
    const-string v0, "UTC"

    .line 2
    .line 3
    invoke-static {v0}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/t4/c;->a:Ljava/util/TimeZone;

    .line 8
    .line 9
    const-string v7, "Fri"

    .line 10
    .line 11
    const-string v8, "Sat"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const-string v2, "Sun"

    .line 15
    .line 16
    const-string v3, "Mon"

    .line 17
    .line 18
    const-string v4, "Tue"

    .line 19
    .line 20
    const-string v5, "Wed"

    .line 21
    .line 22
    const-string v6, "Thu"

    .line 23
    .line 24
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lax/t4/c;->b:[Ljava/lang/String;

    .line 29
    .line 30
    const-string v12, "Dec"

    .line 31
    .line 32
    const/4 v13, 0x0

    .line 33
    const-string v1, "Jan"

    .line 34
    .line 35
    const-string v2, "Feb"

    .line 36
    .line 37
    const-string v3, "Mar"

    .line 38
    .line 39
    const-string v4, "Apr"

    .line 40
    .line 41
    const-string v5, "May"

    .line 42
    .line 43
    const-string v6, "Jun"

    .line 44
    .line 45
    const-string v7, "Jul"

    .line 46
    .line 47
    const-string v8, "Aug"

    .line 48
    .line 49
    const-string v9, "Sep"

    .line 50
    .line 51
    const-string v10, "Oct"

    .line 52
    .line 53
    const-string v11, "Nov"

    .line 54
    .line 55
    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lax/t4/c;->c:[Ljava/lang/String;

    .line 60
    .line 61
    return-void
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;Lax/T4/g;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lax/T4/g;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lax/t4/c;->c(Ljava/lang/Object;Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method

.method public final c(Ljava/lang/Object;Z)Ljava/lang/String;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_5
    sget-object v1, Lax/t4/b;->l:Lax/T4/e;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lax/T4/e;->p(Ljava/io/OutputStream;)Lax/T4/g;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz p2, :cond_14

    .line 13
    .line 14
    invoke-virtual {v1}, Lax/T4/g;->f()Lax/T4/g;

    .line 15
    .line 16
    .line 17
    move-result-object v1
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_11} :catch_12

    .line 18
    goto :goto_14

    .line 19
    :catch_12
    move-exception p1

    .line 20
    goto :goto_2b

    .line 21
    :cond_14
    :goto_14
    :try_start_14
    invoke-virtual {p0, p1, v1}, Lax/t4/c;->a(Ljava/lang/Object;Lax/T4/g;)V
    :try_end_17
    .catchall {:try_start_14 .. :try_end_17} :catchall_26

    .line 22
    .line 23
    .line 24
    :try_start_17
    invoke-virtual {v1}, Lax/T4/g;->flush()V

    .line 25
    .line 26
    .line 27
    new-instance p1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const-string v0, "UTF-8"

    .line 34
    .line 35
    invoke-direct {p1, p2, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :catchall_26
    move-exception p1

    .line 40
    invoke-virtual {v1}, Lax/T4/g;->flush()V

    .line 41
    .line 42
    .line 43
    throw p1
    :try_end_2b
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_2b} :catch_12

    .line 44
    :goto_2b
    const-string p2, "Impossible"

    .line 45
    .line 46
    invoke-static {p2, p1}, Lax/w4/d;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    throw p1
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
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method
