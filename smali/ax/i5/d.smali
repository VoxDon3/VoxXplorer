.class public Lax/i5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/h5/b;


# static fields
.field private static final e:Ljava/lang/String; = "d"


# instance fields
.field private a:Lax/i5/c;

.field private b:Lax/i5/b;

.field private c:Lax/i5/j;

.field private d:Lax/i5/f;


# direct methods
.method static constructor <clinit>()V
    .registers 0

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

.method private constructor <init>(Lax/e5/a;Ljava/nio/ByteBuffer;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lax/i5/c;->m(Ljava/nio/ByteBuffer;)Lax/i5/c;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iput-object p2, p0, Lax/i5/d;->a:Lax/i5/c;

    .line 9
    .line 10
    invoke-virtual {p2}, Lax/i5/c;->f()S

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iget-object v0, p0, Lax/i5/d;->a:Lax/i5/c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lax/i5/c;->b()S

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    mul-int p2, p2, v0

    .line 21
    .line 22
    invoke-static {p1, p2}, Lax/i5/j;->d(Lax/e5/a;I)Lax/i5/j;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, Lax/i5/d;->c:Lax/i5/j;

    .line 27
    .line 28
    new-instance p2, Lax/i5/b;

    .line 29
    .line 30
    iget-object v0, p0, Lax/i5/d;->a:Lax/i5/c;

    .line 31
    .line 32
    iget-object v1, p0, Lax/i5/d;->c:Lax/i5/j;

    .line 33
    .line 34
    invoke-direct {p2, p1, v0, v1}, Lax/i5/b;-><init>(Lax/e5/a;Lax/i5/c;Lax/i5/j;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Lax/i5/d;->b:Lax/i5/b;

    .line 38
    .line 39
    iget-object v0, p0, Lax/i5/d;->a:Lax/i5/c;

    .line 40
    .line 41
    invoke-static {p1, p2, v0}, Lax/i5/f;->m(Lax/e5/a;Lax/i5/b;Lax/i5/c;)Lax/i5/f;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lax/i5/d;->d:Lax/i5/f;

    .line 46
    .line 47
    sget-object p1, Lax/i5/d;->e:Ljava/lang/String;

    .line 48
    .line 49
    iget-object p2, p0, Lax/i5/d;->a:Lax/i5/c;

    .line 50
    .line 51
    invoke-virtual {p2}, Lax/i5/c;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    return-void
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

.method public static f(Lax/e5/a;)Lax/i5/d;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0x200

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-interface {p0, v1, v2, v0}, Lax/e5/a;->i(JLjava/nio/ByteBuffer;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x52

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-char v1, v1

    .line 22
    const/16 v2, 0x46

    .line 23
    .line 24
    if-ne v1, v2, :cond_67

    .line 25
    .line 26
    const/16 v1, 0x53

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    int-to-char v1, v1

    .line 33
    const/16 v2, 0x41

    .line 34
    .line 35
    if-ne v1, v2, :cond_67

    .line 36
    .line 37
    const/16 v1, 0x54

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    int-to-char v2, v2

    .line 44
    if-ne v2, v1, :cond_67

    .line 45
    .line 46
    const/16 v1, 0x55

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    int-to-char v1, v1

    .line 53
    const/16 v2, 0x33

    .line 54
    .line 55
    if-ne v1, v2, :cond_67

    .line 56
    .line 57
    const/16 v1, 0x56

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    int-to-char v1, v1

    .line 64
    const/16 v2, 0x32

    .line 65
    .line 66
    if-ne v1, v2, :cond_67

    .line 67
    .line 68
    const/16 v1, 0x57

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    int-to-char v1, v1

    .line 75
    const/16 v2, 0x20

    .line 76
    .line 77
    if-ne v1, v2, :cond_67

    .line 78
    .line 79
    const/16 v1, 0x58

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    int-to-char v1, v1

    .line 86
    if-ne v1, v2, :cond_67

    .line 87
    .line 88
    const/16 v1, 0x59

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    int-to-char v1, v1

    .line 95
    if-eq v1, v2, :cond_61

    .line 96
    .line 97
    goto :goto_67

    .line 98
    :cond_61
    new-instance v1, Lax/i5/d;

    .line 99
    .line 100
    invoke-direct {v1, p0, v0}, Lax/i5/d;-><init>(Lax/e5/a;Ljava/nio/ByteBuffer;)V

    .line 101
    .line 102
    .line 103
    return-object v1

    .line 104
    :cond_67
    :goto_67
    const/4 p0, 0x0

    .line 105
    return-object p0
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
.end method


# virtual methods
.method public a()I
    .registers 2

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
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

.method public b()J
    .registers 5

    .line 1
    iget-object v0, p0, Lax/i5/d;->a:Lax/i5/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i5/c;->j()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lax/i5/d;->a:Lax/i5/c;

    .line 8
    .line 9
    invoke-virtual {v2}, Lax/i5/c;->b()S

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    int-to-long v2, v2

    .line 14
    mul-long v0, v0, v2

    .line 15
    .line 16
    return-wide v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public c()J
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/i5/d;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, Lax/i5/d;->e()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    sub-long/2addr v0, v2

    .line 10
    return-wide v0
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

.method public d()Lax/h5/e;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i5/d;->d:Lax/i5/f;

    .line 2
    .line 3
    return-object v0
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

.method public e()J
    .registers 5

    .line 1
    iget-object v0, p0, Lax/i5/d;->c:Lax/i5/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i5/j;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lax/i5/d;->a:Lax/i5/c;

    .line 8
    .line 9
    invoke-virtual {v2}, Lax/i5/c;->a()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    int-to-long v2, v2

    .line 14
    mul-long v0, v0, v2

    .line 15
    .line 16
    return-wide v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
