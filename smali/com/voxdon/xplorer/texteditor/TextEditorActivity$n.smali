.class Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/texteditor/TextEditorActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "n"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private h:Z

.field i:Z

.field j:Z

.field k:Ljava/lang/Throwable;

.field final synthetic l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Z)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->d0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput-boolean p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->i:Z

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

.method private A()V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "\r\n"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_3
    iget-object v2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 5
    .line 6
    invoke-static {v2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    instance-of v3, v2, Lcom/voxdon/xplorer/file/x;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v3, :cond_22

    .line 18
    .line 19
    check-cast v2, Lcom/voxdon/xplorer/file/x;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 22
    .line 23
    invoke-static {v3}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->L(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2, v3, v4}, Lcom/voxdon/xplorer/file/x;->c(Ljava/lang/String;Z)Ljava/io/OutputStream;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    goto :goto_37

    .line 32
    :catchall_1f
    move-exception v0

    .line 33
    goto/16 :goto_cd

    .line 34
    .line 35
    :cond_22
    instance-of v3, v2, Lcom/voxdon/xplorer/file/h;

    .line 36
    .line 37
    if-eqz v3, :cond_33

    .line 38
    .line 39
    check-cast v2, Lcom/voxdon/xplorer/file/h;

    .line 40
    .line 41
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 42
    .line 43
    invoke-static {v3}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->L(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v2, v3, v4}, Lcom/voxdon/xplorer/file/h;->c(Ljava/lang/String;Z)Ljava/io/OutputStream;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    goto :goto_37

    .line 52
    :cond_33
    invoke-static {}, Lax/u3/b;->f()V

    .line 53
    .line 54
    .line 55
    move-object v2, v1

    .line 56
    :goto_37
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 57
    .line 58
    invoke-static {v3}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->R(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    new-instance v5, Ljava/io/BufferedWriter;

    .line 67
    .line 68
    new-instance v6, Ljava/io/OutputStreamWriter;

    .line 69
    .line 70
    iget-object v7, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 71
    .line 72
    invoke-static {v7}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->T(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/nio/charset/Charset;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-direct {v6, v2, v7}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v5, v6}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_51
    .catchall {:try_start_3 .. :try_end_51} :catchall_1f

    .line 80
    .line 81
    .line 82
    :try_start_51
    invoke-virtual {p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->x()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_c6

    .line 87
    .line 88
    :goto_57
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 89
    .line 90
    invoke-static {v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-ge v4, v1, :cond_c6

    .line 99
    .line 100
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 101
    .line 102
    invoke-static {v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 111
    .line 112
    if-eqz v3, :cond_97

    .line 113
    .line 114
    iget-object v2, v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 115
    .line 116
    if-eqz v2, :cond_97

    .line 117
    .line 118
    invoke-static {}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->V()Ljava/util/regex/Pattern;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    if-nez v2, :cond_88

    .line 123
    .line 124
    const-string v2, "(?<!\r)\n"

    .line 125
    .line 126
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-static {v2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->W(Ljava/util/regex/Pattern;)Ljava/util/regex/Pattern;

    .line 131
    .line 132
    .line 133
    goto :goto_88

    .line 134
    :catchall_85
    move-exception v0

    .line 135
    move-object v1, v5

    .line 136
    goto :goto_cd

    .line 137
    :cond_88
    :goto_88
    invoke-static {}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->V()Ljava/util/regex/Pattern;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget-object v1, v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    goto :goto_99

    .line 152
    :cond_97
    iget-object v1, v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 153
    .line 154
    :goto_99
    iget-object v2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 155
    .line 156
    invoke-static {v2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    add-int/lit8 v2, v2, -0x1

    .line 165
    .line 166
    if-ne v4, v2, :cond_ab

    .line 167
    .line 168
    invoke-virtual {v5, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_c3

    .line 172
    :cond_ab
    new-instance v2, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 181
    .line 182
    invoke-static {v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->R(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v5, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :goto_c3
    add-int/lit8 v4, v4, 0x1

    .line 197
    .line 198
    goto :goto_57

    .line 199
    :cond_c6
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->flush()V
    :try_end_c9
    .catchall {:try_start_51 .. :try_end_c9} :catchall_85

    .line 200
    .line 201
    .line 202
    :try_start_c9
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->close()V
    :try_end_cc
    .catch Ljava/io/IOException; {:try_start_c9 .. :try_end_cc} :catch_cc

    .line 203
    .line 204
    .line 205
    :catch_cc
    return-void

    .line 206
    :goto_cd
    if-eqz v1, :cond_d2

    .line 207
    .line 208
    :try_start_cf
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_d2
    .catch Ljava/io/IOException; {:try_start_cf .. :try_end_d2} :catch_d2

    .line 209
    .line 210
    .line 211
    :catch_d2
    :cond_d2
    throw v0
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->w([Ljava/lang/Void;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected o()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 13
    .line 14
    .line 15
    iput-boolean v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->h:Z

    .line 16
    .line 17
    :cond_10
    iget-boolean v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->j:Z

    .line 18
    .line 19
    if-nez v0, :cond_19

    .line 20
    .line 21
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->M(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V

    .line 24
    .line 25
    .line 26
    :cond_19
    return-void
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->y(Ljava/lang/Boolean;)V

    .line 4
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

.method protected r()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->D0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput-boolean v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->j:Z

    .line 17
    .line 18
    if-nez v0, :cond_18

    .line 19
    .line 20
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->I(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V

    .line 23
    .line 24
    .line 25
    :cond_18
    return-void
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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Boolean;
    .registers 10

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->A()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->J(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lax/Z2/k;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_94

    .line 11
    .line 12
    iget-boolean p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->j:Z
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_d} :catch_84

    .line 13
    .line 14
    if-nez p1, :cond_94

    .line 15
    .line 16
    :try_start_f
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 17
    .line 18
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->J(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lax/Z2/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lax/Z2/k;->d()Lax/c3/K;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/o;->a()Z

    .line 31
    .line 32
    .line 33
    move-result p1
    :try_end_21
    .catch Lax/b3/j; {:try_start_f .. :try_end_21} :catch_8a
    .catch Lax/b3/a; {:try_start_f .. :try_end_21} :catch_87
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_21} :catch_84

    .line 34
    if-nez p1, :cond_3f

    .line 35
    .line 36
    const-wide/16 v0, 0x2710

    .line 37
    .line 38
    :try_start_25
    invoke-virtual {v2, v0, v1}, Lcom/voxdon/xplorer/file/o;->i(J)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2c

    .line 43
    .line 44
    goto :goto_3f

    .line 45
    :cond_2c
    new-instance p1, Ljava/io/IOException;

    .line 46
    .line 47
    const-string v0, "Not connected to network storage"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
    :try_end_34
    .catch Lax/b3/j; {:try_start_25 .. :try_end_34} :catch_3d
    .catch Lax/b3/a; {:try_start_25 .. :try_end_34} :catch_39
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_34} :catch_34

    .line 53
    :catch_34
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    move-object v4, p0

    .line 56
    goto/16 :goto_b4

    .line 57
    .line 58
    :catch_39
    move-exception v0

    .line 59
    :goto_3a
    move-object p1, v0

    .line 60
    move-object v4, p0

    .line 61
    goto :goto_8c

    .line 62
    :catch_3d
    move-exception v0

    .line 63
    goto :goto_3a

    .line 64
    :cond_3f
    :goto_3f
    :try_start_3f
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 65
    .line 66
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->J(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lax/Z2/k;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v2, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 79
    .line 80
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 85
    .line 86
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->L(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->N()Ljava/io/File;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 99
    .line 100
    .line 101
    move-result-wide v6

    .line 102
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 103
    .line 104
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v5, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n$a;

    .line 109
    .line 110
    invoke-direct {v5, p0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n$a;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;)V
    :try_end_70
    .catch Lax/b3/j; {:try_start_3f .. :try_end_70} :catch_8a
    .catch Lax/b3/a; {:try_start_3f .. :try_end_70} :catch_87
    .catch Ljava/io/IOException; {:try_start_3f .. :try_end_70} :catch_84

    .line 111
    .line 112
    .line 113
    move-object v4, p0

    .line 114
    :try_start_71
    invoke-virtual/range {v0 .. v5}, Lcom/voxdon/xplorer/file/o;->t0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lax/o3/e;->b()Lax/o3/e;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1, v3, v6, v7}, Lax/o3/e;->j(Lcom/voxdon/xplorer/file/n;J)V
    :try_end_7b
    .catch Lax/b3/j; {:try_start_71 .. :try_end_7b} :catch_82
    .catch Lax/b3/a; {:try_start_71 .. :try_end_7b} :catch_7f
    .catch Ljava/io/IOException; {:try_start_71 .. :try_end_7b} :catch_7c

    .line 122
    .line 123
    .line 124
    goto :goto_95

    .line 125
    :catch_7c
    move-exception v0

    .line 126
    :goto_7d
    move-object p1, v0

    .line 127
    goto :goto_b4

    .line 128
    :catch_7f
    move-exception v0

    .line 129
    :goto_80
    move-object p1, v0

    .line 130
    goto :goto_8c

    .line 131
    :catch_82
    move-exception v0

    .line 132
    goto :goto_80

    .line 133
    :catch_84
    move-exception v0

    .line 134
    move-object v4, p0

    .line 135
    goto :goto_7d

    .line 136
    :catch_87
    move-exception v0

    .line 137
    :goto_88
    move-object v4, p0

    .line 138
    goto :goto_80

    .line 139
    :catch_8a
    move-exception v0

    .line 140
    goto :goto_88

    .line 141
    :goto_8c
    :try_start_8c
    iput-object p1, v4, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->k:Ljava/lang/Throwable;

    .line 142
    .line 143
    new-instance v0, Ljava/io/IOException;

    .line 144
    .line 145
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_94
    move-object v4, p0

    .line 150
    :goto_95
    invoke-static {}, Lax/X2/Q;->X1()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_b1

    .line 155
    .line 156
    iget-object p1, v4, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 157
    .line 158
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->Y()Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_b1

    .line 167
    .line 168
    iget-object p1, v4, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 169
    .line 170
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    const/4 v0, 0x0

    .line 175
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/o;->n(Lax/g3/i;)V

    .line 176
    .line 177
    .line 178
    :cond_b1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_b3
    .catch Ljava/io/IOException; {:try_start_8c .. :try_end_b3} :catch_7c

    .line 179
    .line 180
    return-object p1

    .line 181
    :goto_b4
    iget-object v0, v4, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->k:Ljava/lang/Throwable;

    .line 182
    .line 183
    if-nez v0, :cond_ba

    .line 184
    .line 185
    iput-object p1, v4, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->k:Ljava/lang/Throwable;

    .line 186
    .line 187
    :cond_ba
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 188
    .line 189
    return-object p1
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

.method x()Z
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v0, v2, :cond_23

    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_23

    .line 34
    .line 35
    return v2

    .line 36
    :cond_23
    return v1
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

.method protected y(Ljava/lang/Boolean;)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 13
    .line 14
    .line 15
    iput-boolean v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->h:Z

    .line 16
    .line 17
    :cond_10
    iget-boolean v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->j:Z

    .line 18
    .line 19
    if-nez v0, :cond_19

    .line 20
    .line 21
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->M(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V

    .line 24
    .line 25
    .line 26
    :cond_19
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_30

    .line 31
    .line 32
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 33
    .line 34
    sget-object v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;->e0:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

    .line 35
    .line 36
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;)V

    .line 37
    .line 38
    .line 39
    iget-boolean p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->i:Z

    .line 40
    .line 41
    if-eqz p1, :cond_2f

    .line 42
    .line 43
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 46
    .line 47
    .line 48
    :cond_2f
    return-void

    .line 49
    :cond_30
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 50
    .line 51
    invoke-static {p1}, Lax/t3/j;->o(Landroid/content/Context;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    const v0, 0x7f130140

    .line 56
    .line 57
    .line 58
    if-eqz p1, :cond_60

    .line 59
    .line 60
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->k:Ljava/lang/Throwable;

    .line 61
    .line 62
    if-eqz p1, :cond_60

    .line 63
    .line 64
    new-instance p1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, " : "

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->k:Ljava/lang/Throwable;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    goto :goto_66

    .line 97
    :cond_60
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :goto_66
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->z(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void
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

.method z(Ljava/lang/String;)V
    .registers 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "<font color=\'red\'>"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "</font>"

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$n;->l:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 28
    .line 29
    const v1, 0x1020002

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-static {v0, p1, v1}, Lax/u3/B;->T(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->a0()V

    .line 42
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
.end method
