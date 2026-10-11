.class Lax/P4/d$b;
.super Lax/P4/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/P4/d;->m(Ljava/lang/String;Lax/P/l$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/P/l$d;

.field final synthetic b:Lax/P4/d;


# direct methods
.method constructor <init>(Lax/P4/d;Lax/P/l$d;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/P4/d$b;->b:Lax/P4/d;

    .line 2
    .line 3
    iput-object p2, p0, Lax/P4/d$b;->a:Lax/P/l$d;

    .line 4
    .line 5
    invoke-direct {p0}, Lax/P4/a$a;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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


# virtual methods
.method public c(Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .registers 7

    .line 1
    iget-object p2, p0, Lax/P4/d$b;->b:Lax/P4/d;

    .line 2
    .line 3
    invoke-static {p2}, Lax/P4/d;->e(Lax/P4/d;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_58

    .line 8
    .line 9
    iget-object p2, p0, Lax/P4/d$b;->b:Lax/P4/d;

    .line 10
    .line 11
    invoke-static {p2}, Lax/P4/d;->e(Lax/P4/d;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Landroid/support/v4/media/MediaMetadataCompat;->e()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2}, Landroid/support/v4/media/MediaDescriptionCompat;->d()Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-eqz p2, :cond_58

    .line 24
    .line 25
    iget-object p2, p0, Lax/P4/d$b;->b:Lax/P4/d;

    .line 26
    .line 27
    invoke-static {p2}, Lax/P4/d;->e(Lax/P4/d;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Landroid/support/v4/media/MediaMetadataCompat;->e()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2}, Landroid/support/v4/media/MediaDescriptionCompat;->d()Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_58

    .line 48
    .line 49
    invoke-static {}, Lax/P4/d;->b()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    const/4 p4, 0x2

    .line 54
    new-array p4, p4, [Ljava/lang/Object;

    .line 55
    .line 56
    const-string v0, "fetchBitmapFromURLAsync: set bitmap to "

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    aput-object v0, p4, v1

    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    aput-object p1, p4, v0

    .line 63
    .line 64
    invoke-static {p2, p4}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lax/P4/d$b;->a:Lax/P/l$d;

    .line 68
    .line 69
    invoke-virtual {p1, p3}, Lax/P/l$d;->n(Landroid/graphics/Bitmap;)Lax/P/l$d;

    .line 70
    .line 71
    .line 72
    :try_start_47
    iget-object p1, p0, Lax/P4/d$b;->b:Lax/P4/d;

    .line 73
    .line 74
    invoke-static {p1}, Lax/P4/d;->d(Lax/P4/d;)Lax/P/p;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p2, p0, Lax/P4/d$b;->a:Lax/P/l$d;

    .line 79
    .line 80
    invoke-virtual {p2}, Lax/P/l$d;->c()Landroid/app/Notification;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    const/16 p3, 0x19c

    .line 85
    .line 86
    invoke-virtual {p1, p3, p2}, Lax/P/p;->f(ILandroid/app/Notification;)V
    :try_end_58
    .catch Ljava/lang/RuntimeException; {:try_start_47 .. :try_end_58} :catch_58

    .line 87
    .line 88
    .line 89
    :catch_58
    :cond_58
    return-void
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
