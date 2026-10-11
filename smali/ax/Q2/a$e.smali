.class public Lax/Q2/a$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/Q2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# direct methods
.method public static a(Ljava/util/List;)Ljava/lang/String;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, ""

    .line 3
    .line 4
    move-object v3, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    if-ge v0, v4, :cond_4d

    .line 14
    .line 15
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, Lcom/voxdon/xplorer/file/n;

    .line 20
    .line 21
    invoke-interface {v4}, Lax/c3/b;->isDirectory()Z

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    if-eqz v8, :cond_22

    .line 26
    .line 27
    if-nez v2, :cond_1e

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    goto :goto_4a

    .line 31
    :cond_1e
    if-ne v2, v6, :cond_4a

    .line 32
    .line 33
    const/4 v2, 0x3

    .line 34
    goto :goto_4a

    .line 35
    :cond_22
    if-nez v2, :cond_26

    .line 36
    .line 37
    const/4 v2, 0x2

    .line 38
    goto :goto_29

    .line 39
    :cond_26
    if-ne v2, v7, :cond_29

    .line 40
    .line 41
    const/4 v2, 0x3

    .line 42
    :cond_29
    :goto_29
    if-ne v2, v6, :cond_4a

    .line 43
    .line 44
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    if-nez v5, :cond_36

    .line 49
    .line 50
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    goto :goto_3a

    .line 55
    :cond_36
    invoke-virtual {v5}, Lax/c3/z;->h()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    :goto_3a
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_42

    .line 64
    .line 65
    move-object v3, v4

    .line 66
    goto :goto_4a

    .line 67
    :cond_42
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_4a

    .line 72
    .line 73
    const-string v3, "file_mixed"

    .line 74
    .line 75
    :cond_4a
    :goto_4a
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_4d
    if-eqz v2, :cond_81

    .line 79
    .line 80
    if-eq v2, v7, :cond_75

    .line 81
    .line 82
    if-eq v2, v6, :cond_59

    .line 83
    .line 84
    if-eq v2, v5, :cond_56

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_56
    const-string p0, "mixed"

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_59
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-ne p0, v7, :cond_6a

    .line 95
    .line 96
    const-string p0, "file"

    .line 97
    .line 98
    filled-new-array {p0, v3}, [Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Lax/Q2/a;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :cond_6a
    const-string p0, "files"

    .line 108
    .line 109
    filled-new-array {p0, v3}, [Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0}, Lax/Q2/a;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_75
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-ne p0, v7, :cond_7e

    .line 123
    .line 124
    const-string p0, "dir"

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_7e
    const-string p0, "dirs"

    .line 128
    .line 129
    return-object p0

    .line 130
    :cond_81
    const-string p0, "unknown"

    .line 131
    .line 132
    return-object p0
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
