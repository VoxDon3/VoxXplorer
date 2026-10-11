.class Lax/y0/a$a;
.super Landroid/media/MediaDataSource;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/y0/a;->q(Lax/y0/a$g;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lax/y0/a$g;

.field final synthetic d0:Lax/y0/a;

.field q:J


# direct methods
.method constructor <init>(Lax/y0/a;Lax/y0/a$g;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/y0/a$a;->d0:Lax/y0/a;

    .line 2
    .line 3
    iput-object p2, p0, Lax/y0/a$a;->c0:Lax/y0/a$g;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

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
.method public close()V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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

.method public getSize()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    return-wide v0
    .line 4
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

.method public readAt(J[BII)I
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-nez p5, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_4
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    cmp-long v3, p1, v0

    .line 9
    .line 10
    if-gez v3, :cond_c

    .line 11
    .line 12
    return v2

    .line 13
    :cond_c
    :try_start_c
    iget-wide v3, p0, Lax/y0/a$a;->q:J

    .line 14
    .line 15
    cmp-long v5, v3, p1

    .line 16
    .line 17
    if-eqz v5, :cond_2a

    .line 18
    .line 19
    cmp-long v5, v3, v0

    .line 20
    .line 21
    if-ltz v5, :cond_23

    .line 22
    .line 23
    iget-object v0, p0, Lax/y0/a$a;->c0:Lax/y0/a$g;

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/y0/a$b;->available()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-long v0, v0

    .line 30
    add-long/2addr v3, v0

    .line 31
    cmp-long v0, p1, v3

    .line 32
    .line 33
    if-ltz v0, :cond_23

    .line 34
    .line 35
    return v2

    .line 36
    :cond_23
    iget-object v0, p0, Lax/y0/a$a;->c0:Lax/y0/a$g;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p2}, Lax/y0/a$g;->g(J)V

    .line 39
    .line 40
    .line 41
    iput-wide p1, p0, Lax/y0/a$a;->q:J

    .line 42
    .line 43
    :cond_2a
    iget-object p1, p0, Lax/y0/a$a;->c0:Lax/y0/a$g;

    .line 44
    .line 45
    invoke-virtual {p1}, Lax/y0/a$b;->available()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-le p5, p1, :cond_38

    .line 50
    .line 51
    iget-object p1, p0, Lax/y0/a$a;->c0:Lax/y0/a$g;

    .line 52
    .line 53
    invoke-virtual {p1}, Lax/y0/a$b;->available()I

    .line 54
    .line 55
    .line 56
    move-result p5

    .line 57
    :cond_38
    iget-object p1, p0, Lax/y0/a$a;->c0:Lax/y0/a$g;

    .line 58
    .line 59
    invoke-virtual {p1, p3, p4, p5}, Lax/y0/a$b;->read([BII)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-ltz p1, :cond_47

    .line 64
    .line 65
    iget-wide p2, p0, Lax/y0/a$a;->q:J

    .line 66
    .line 67
    int-to-long p4, p1

    .line 68
    add-long/2addr p2, p4

    .line 69
    iput-wide p2, p0, Lax/y0/a$a;->q:J
    :try_end_46
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_46} :catch_47

    .line 70
    .line 71
    return p1

    .line 72
    :catch_47
    :cond_47
    const-wide/16 p1, -0x1

    .line 73
    .line 74
    iput-wide p1, p0, Lax/y0/a$a;->q:J

    .line 75
    .line 76
    return v2
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
