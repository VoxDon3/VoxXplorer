.class public Lax/r3/b;
.super Lax/ga/a;
.source "SourceFile"


# static fields
.field private static final e:Landroid/graphics/Bitmap;


# instance fields
.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 3
    .line 4
    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lax/r3/b;->e:Landroid/graphics/Bitmap;

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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/ga/a;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lax/r3/b;->d:Landroid/content/Context;

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
.end method

.method public static final n()Ljava/io/InputStream;
    .registers 4

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lax/r3/b;->e:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v1, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 21
    .line 22
    .line 23
    return-object v1
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
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
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
.end method


# virtual methods
.method protected i(Ljava/lang/String;Ljava/lang/Object;)Ljava/io/InputStream;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v1}, Lax/Q2/f;->E(Ljava/lang/String;)Lax/Q2/f;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    sget-object v5, Lax/Q2/f;->V0:Lax/Q2/f;

    .line 22
    .line 23
    if-ne v4, v5, :cond_23

    .line 24
    .line 25
    iget-object p1, p0, Lax/r3/b;->d:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {p1}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1, v0}, Lax/U2/d;->J(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_23
    sget-object v5, Lax/Q2/f;->q1:Lax/Q2/f;

    .line 37
    .line 38
    if-eq v4, v5, :cond_85

    .line 39
    .line 40
    sget-object v5, Lax/Q2/f;->r1:Lax/Q2/f;

    .line 41
    .line 42
    if-ne v4, v5, :cond_2c

    .line 43
    .line 44
    goto :goto_85

    .line 45
    :cond_2c
    if-eqz v4, :cond_80

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_3a

    .line 56
    .line 57
    const/4 p2, 0x0

    .line 58
    goto :goto_42

    .line 59
    :cond_3a
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    :goto_42
    sget-object v0, Lax/Q2/f;->l1:Lax/Q2/f;

    .line 68
    .line 69
    if-ne v4, v0, :cond_6e

    .line 70
    .line 71
    if-nez p2, :cond_6e

    .line 72
    .line 73
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v5, "!!APP CACHE SCHEME!!"

    .line 82
    .line 83
    invoke-virtual {v0, v5}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    new-instance v5, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v6, "uri:"

    .line 93
    .line 94
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 109
    .line 110
    .line 111
    :cond_6e
    sget-object p1, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 112
    .line 113
    if-ne v4, p1, :cond_77

    .line 114
    .line 115
    invoke-static {v2}, Lax/c3/x;->g(Ljava/lang/String;)Lcom/voxdon/xplorer/file/o;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    goto :goto_7b

    .line 120
    :cond_77
    invoke-static {v4, p2}, Lax/c3/x;->d(Lax/Q2/f;I)Lcom/voxdon/xplorer/file/o;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :goto_7b
    invoke-virtual {p1, v1, v2, v3}, Lcom/voxdon/xplorer/file/o;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    :cond_80
    invoke-super {p0, p1, p2}, Lax/ga/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/io/InputStream;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    return-object p1

    .line 134
    :cond_85
    :goto_85
    invoke-static {}, Lax/u3/b;->f()V

    .line 135
    .line 136
    .line 137
    const/4 p1, 0x0

    .line 138
    return-object p1
    .line 139
.end method
