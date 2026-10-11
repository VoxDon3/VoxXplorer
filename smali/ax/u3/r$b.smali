.class public Lax/u3/r$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/u3/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:Ljava/io/DataOutputStream;

.field b:Ljava/io/BufferedReader;

.field c:Ljava/io/BufferedReader;

.field d:Z

.field e:Z

.field f:Z

.field g:Ljava/lang/Process;


# direct methods
.method constructor <init>(Z)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lax/u3/r$b;->d:Z

    .line 5
    .line 6
    return-void
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

.method private a()V
    .registers 8

    .line 1
    iget-boolean v0, p0, Lax/u3/r$b;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_7
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "su"

    .line 13
    .line 14
    const-string v4, "--mount-master"

    .line 15
    .line 16
    const-string v5, "-c"

    .line 17
    .line 18
    const-string v6, "echo"

    .line 19
    .line 20
    filled-new-array {v3, v4, v5, v6}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Process;->waitFor()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_24

    .line 33
    .line 34
    iput-boolean v1, p0, Lax/u3/r$b;->f:Z

    .line 35
    .line 36
    goto :goto_29

    .line 37
    :cond_24
    iput-boolean v0, p0, Lax/u3/r$b;->f:Z
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_26} :catch_27

    .line 38
    .line 39
    goto :goto_29

    .line 40
    :catch_27
    iput-boolean v0, p0, Lax/u3/r$b;->f:Z

    .line 41
    .line 42
    :goto_29
    iput-boolean v1, p0, Lax/u3/r$b;->e:Z

    .line 43
    .line 44
    return-void
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

.method private e()Ljava/util/ArrayList;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_5
    iget-object v1, p0, Lax/u3/r$b;->c:Ljava/io/BufferedReader;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_32

    .line 13
    .line 14
    const-string v2, "END_OF_CMD"

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_16

    .line 21
    .line 22
    goto :goto_32

    .line 23
    :cond_16
    invoke-static {}, Lax/u3/r;->a()Ljava/util/logging/Logger;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v3, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v4, "root execute error : "

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_32
    :goto_32
    return-object v0
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

.method private f()Ljava/util/ArrayList;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_5
    iget-object v1, p0, Lax/u3/r$b;->b:Ljava/io/BufferedReader;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_1a

    .line 13
    .line 14
    const-string v2, "END_OF_CMD"

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_16

    .line 21
    .line 22
    goto :goto_1a

    .line 23
    :cond_16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    goto :goto_5

    .line 27
    :cond_1a
    :goto_1a
    return-object v0
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

.method private g()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/u3/r$a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/u3/r$b;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lax/u3/r$b;->h()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    new-instance v0, Lax/u3/r$a;

    .line 12
    .line 13
    invoke-direct {v0}, Lax/u3/r$a;-><init>()V

    .line 14
    .line 15
    .line 16
    throw v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private i(Ljava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/u3/r$b;->a:Ljava/io/DataOutputStream;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p1, "\n"

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lax/u3/r$b;->a:Ljava/io/DataOutputStream;

    .line 28
    .line 29
    const-string v0, "echo END_OF_CMD\n"

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/u3/r$b;->a:Ljava/io/DataOutputStream;

    .line 39
    .line 40
    const-string v0, ">&2 echo END_OF_CMD\n"

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lax/u3/r$b;->a:Ljava/io/DataOutputStream;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    .line 52
    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public b()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/u3/r$b;->a:Ljava/io/DataOutputStream;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_c

    .line 5
    .line 6
    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lax/u3/r$b;->a:Ljava/io/DataOutputStream;
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_a} :catch_b

    .line 10
    .line 11
    goto :goto_c

    .line 12
    :catch_b
    nop

    .line 13
    :cond_c
    :goto_c
    iget-object v0, p0, Lax/u3/r$b;->b:Ljava/io/BufferedReader;

    .line 14
    .line 15
    if-eqz v0, :cond_17

    .line 16
    .line 17
    :try_start_10
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lax/u3/r$b;->b:Ljava/io/BufferedReader;
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_15} :catch_16

    .line 21
    .line 22
    goto :goto_17

    .line 23
    :catch_16
    nop

    .line 24
    :cond_17
    :goto_17
    iget-object v0, p0, Lax/u3/r$b;->c:Ljava/io/BufferedReader;

    .line 25
    .line 26
    if-eqz v0, :cond_20

    .line 27
    .line 28
    :try_start_1b
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lax/u3/r$b;->c:Ljava/io/BufferedReader;
    :try_end_20
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_20} :catch_20

    .line 32
    .line 33
    :catch_20
    :cond_20
    return-void
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

.method public c(Ljava/lang/String;)Ljava/util/ArrayList;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/u3/r$a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/u3/r$b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v0, :cond_16

    .line 10
    .line 11
    iget-object v0, p0, Lax/u3/r$b;->a:Ljava/io/DataOutputStream;

    .line 12
    .line 13
    if-eqz v0, :cond_16

    .line 14
    .line 15
    iget-object v0, p0, Lax/u3/r$b;->c:Ljava/io/BufferedReader;

    .line 16
    .line 17
    if-eqz v0, :cond_16

    .line 18
    .line 19
    iget-object v0, p0, Lax/u3/r$b;->b:Ljava/io/BufferedReader;

    .line 20
    .line 21
    if-nez v0, :cond_40

    .line 22
    .line 23
    :cond_16
    invoke-direct {p0}, Lax/u3/r$b;->g()V

    .line 24
    .line 25
    .line 26
    :try_start_19
    iget-object v0, p0, Lax/u3/r$b;->c:Ljava/io/BufferedReader;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_40

    .line 33
    .line 34
    invoke-direct {p0}, Lax/u3/r$b;->e()Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-lez v4, :cond_40

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_40

    .line 55
    .line 56
    if-eqz v0, :cond_40

    .line 57
    .line 58
    invoke-static {v0}, Lax/u3/r;->b(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_40

    .line 63
    .line 64
    return-object v3

    .line 65
    :cond_40
    iget-object v0, p0, Lax/u3/r$b;->c:Ljava/io/BufferedReader;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v4, -0x1

    .line 72
    if-eqz v0, :cond_62

    .line 73
    .line 74
    const-string v0, "error reader already has something"

    .line 75
    .line 76
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_4e
    :goto_4e
    iget-object v0, p0, Lax/u3/r$b;->c:Ljava/io/BufferedReader;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_62

    .line 86
    .line 87
    iget-object v0, p0, Lax/u3/r$b;->c:Ljava/io/BufferedReader;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-ne v0, v4, :cond_4e

    .line 94
    .line 95
    invoke-direct {p0}, Lax/u3/r$b;->g()V

    .line 96
    .line 97
    .line 98
    goto :goto_4e

    .line 99
    :cond_62
    iget-object v0, p0, Lax/u3/r$b;->b:Ljava/io/BufferedReader;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_83

    .line 106
    .line 107
    const-string v0, "input reader already has something"

    .line 108
    .line 109
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_6f
    :goto_6f
    iget-object v0, p0, Lax/u3/r$b;->b:Ljava/io/BufferedReader;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_83

    .line 119
    .line 120
    iget-object v0, p0, Lax/u3/r$b;->b:Ljava/io/BufferedReader;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-ne v0, v4, :cond_6f

    .line 127
    .line 128
    invoke-direct {p0}, Lax/u3/r$b;->g()V

    .line 129
    .line 130
    .line 131
    goto :goto_6f

    .line 132
    :cond_83
    invoke-direct {p0, p1}, Lax/u3/r$b;->i(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-direct {p0}, Lax/u3/r$b;->f()Ljava/util/ArrayList;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-direct {p0}, Lax/u3/r$b;->e()Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-lez v4, :cond_a9

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_a9

    .line 160
    .line 161
    if-eqz v0, :cond_a9

    .line 162
    .line 163
    invoke-static {v0}, Lax/u3/r;->b(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v0
    :try_end_a6
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_a6} :catch_aa

    .line 167
    if-nez v0, :cond_a9

    .line 168
    .line 169
    return-object v3

    .line 170
    :cond_a9
    return-object p1

    .line 171
    :catch_aa
    invoke-virtual {p0}, Lax/u3/r$b;->b()V

    .line 172
    .line 173
    .line 174
    return-object v3
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public d()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/u3/r$b;->g:Ljava/lang/Process;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Process;->exitValue()I
    :try_end_9
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_6 .. :try_end_9} :catch_a

    .line 8
    .line 9
    .line 10
    return v1

    .line 11
    :catch_a
    const/4 v0, 0x1

    .line 12
    return v0
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

.method public h()Z
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    iget-boolean v1, p0, Lax/u3/r$b;->d:Z

    .line 3
    .line 4
    if-eqz v1, :cond_14

    .line 5
    .line 6
    invoke-direct {p0}, Lax/u3/r$b;->a()V

    .line 7
    .line 8
    .line 9
    iget-boolean v1, p0, Lax/u3/r$b;->f:Z

    .line 10
    .line 11
    if-eqz v1, :cond_11

    .line 12
    .line 13
    const-string v1, "su --mount-master"

    .line 14
    .line 15
    goto :goto_16

    .line 16
    :catch_f
    move-exception v1

    .line 17
    goto :goto_5a

    .line 18
    :cond_11
    const-string v1, "su"

    .line 19
    .line 20
    goto :goto_16

    .line 21
    :cond_14
    const-string v1, "sh"

    .line 22
    .line 23
    :goto_16
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, p0, Lax/u3/r$b;->g:Ljava/lang/Process;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_27

    .line 38
    .line 39
    return v0

    .line 40
    :cond_27
    new-instance v2, Ljava/io/DataOutputStream;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Lax/u3/r$b;->a:Ljava/io/DataOutputStream;

    .line 46
    .line 47
    iget-object v1, p0, Lax/u3/r$b;->g:Ljava/lang/Process;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-nez v1, :cond_37

    .line 54
    .line 55
    return v0

    .line 56
    :cond_37
    new-instance v2, Ljava/io/BufferedReader;

    .line 57
    .line 58
    new-instance v3, Ljava/io/InputStreamReader;

    .line 59
    .line 60
    invoke-direct {v3, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 64
    .line 65
    .line 66
    iput-object v2, p0, Lax/u3/r$b;->b:Ljava/io/BufferedReader;

    .line 67
    .line 68
    iget-object v1, p0, Lax/u3/r$b;->g:Ljava/lang/Process;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-nez v1, :cond_4c

    .line 75
    .line 76
    return v0

    .line 77
    :cond_4c
    new-instance v2, Ljava/io/BufferedReader;

    .line 78
    .line 79
    new-instance v3, Ljava/io/InputStreamReader;

    .line 80
    .line 81
    invoke-direct {v3, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 85
    .line 86
    .line 87
    iput-object v2, p0, Lax/u3/r$b;->c:Ljava/io/BufferedReader;
    :try_end_58
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_58} :catch_f

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    return v0

    .line 91
    :goto_5a
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-eqz v2, :cond_6d

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    const-string v3, "Permission denied"

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_6d

    .line 108
    .line 109
    goto :goto_82

    .line 110
    :cond_6d
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const-string v3, "Root command start error"

    .line 119
    .line 120
    invoke-virtual {v2, v3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v2, v1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 129
    .line 130
    .line 131
    :goto_82
    invoke-virtual {p0}, Lax/u3/r$b;->b()V

    .line 132
    .line 133
    .line 134
    return v0
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method
