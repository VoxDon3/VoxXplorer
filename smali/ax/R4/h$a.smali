.class Lax/R4/h$a;
.super Lax/P4/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/R4/h;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lax/R4/h;


# direct methods
.method constructor <init>(Lax/R4/h;Ljava/lang/String;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 2
    .line 3
    iput-object p2, p0, Lax/R4/h$a;->a:Ljava/lang/String;

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
    .registers 5

    .line 1
    iget-object p1, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 2
    .line 3
    invoke-static {p1, p3}, Lax/R4/h;->d(Lax/R4/h;Landroid/graphics/Bitmap;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, 0x0

    .line 8
    if-nez p1, :cond_a

    .line 9
    .line 10
    move-object p3, p2

    .line 11
    :cond_a
    iget-object p1, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 12
    .line 13
    invoke-static {p1, p4}, Lax/R4/h;->d(Lax/R4/h;Landroid/graphics/Bitmap;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_13

    .line 18
    .line 19
    move-object p4, p2

    .line 20
    :cond_13
    if-nez p3, :cond_19

    .line 21
    .line 22
    if-nez p4, :cond_19

    .line 23
    .line 24
    goto/16 :goto_98

    .line 25
    .line 26
    :cond_19
    iget-object p1, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 27
    .line 28
    invoke-static {p1}, Lax/R4/h;->b(Lax/R4/h;)Lax/Q4/b;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p2, p0, Lax/R4/h$a;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1, p2, p3, p4}, Lax/Q4/b;->u(Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 38
    .line 39
    invoke-virtual {p1}, Lax/R4/h;->i()Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-nez p1, :cond_2d

    .line 44
    .line 45
    goto :goto_98

    .line 46
    :cond_2d
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->c()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->f()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Lax/S4/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p2, p0, Lax/R4/h$a;->a:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_98

    .line 65
    .line 66
    :try_start_41
    iget-object p1, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 67
    .line 68
    invoke-static {p1}, Lax/R4/h;->c(Lax/R4/h;)Lax/R4/h$b;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p2, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 73
    .line 74
    invoke-static {p2}, Lax/R4/h;->b(Lax/R4/h;)Lax/Q4/b;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    iget-object p3, p0, Lax/R4/h$a;->a:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p2, p3}, Lax/Q4/b;->e(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-interface {p1, p2}, Lax/R4/h$b;->u(Landroid/support/v4/media/MediaMetadataCompat;)V
    :try_end_56
    .catch Ljava/lang/IllegalArgumentException; {:try_start_41 .. :try_end_56} :catch_78
    .catch Ljava/lang/RuntimeException; {:try_start_41 .. :try_end_56} :catch_57

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :catch_57
    iget-object p1, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 89
    .line 90
    invoke-static {p1}, Lax/R4/h;->b(Lax/R4/h;)Lax/Q4/b;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-object p2, p0, Lax/R4/h$a;->a:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Lax/Q4/b;->b(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 100
    .line 101
    invoke-static {p1}, Lax/R4/h;->c(Lax/R4/h;)Lax/R4/h$b;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object p2, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 106
    .line 107
    invoke-static {p2}, Lax/R4/h;->b(Lax/R4/h;)Lax/Q4/b;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    iget-object p3, p0, Lax/R4/h$a;->a:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {p2, p3}, Lax/Q4/b;->e(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-interface {p1, p2}, Lax/R4/h$b;->u(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 118
    .line 119
    .line 120
    goto :goto_98

    .line 121
    :catch_78
    iget-object p1, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 122
    .line 123
    invoke-static {p1}, Lax/R4/h;->b(Lax/R4/h;)Lax/Q4/b;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iget-object p2, p0, Lax/R4/h$a;->a:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Lax/Q4/b;->b(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 133
    .line 134
    invoke-static {p1}, Lax/R4/h;->c(Lax/R4/h;)Lax/R4/h$b;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iget-object p2, p0, Lax/R4/h$a;->b:Lax/R4/h;

    .line 139
    .line 140
    invoke-static {p2}, Lax/R4/h;->b(Lax/R4/h;)Lax/Q4/b;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    iget-object p3, p0, Lax/R4/h$a;->a:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {p2, p3}, Lax/Q4/b;->e(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-interface {p1, p2}, Lax/R4/h$b;->u(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 151
    .line 152
    .line 153
    :cond_98
    :goto_98
    return-void
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
