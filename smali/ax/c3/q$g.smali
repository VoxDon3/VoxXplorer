.class public Lax/c3/q$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/c3/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/voxdon/xplorer/file/n;",
        ">;"
    }
.end annotation


# instance fields
.field c0:Ljava/text/Collator;

.field q:Lax/u3/a;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lax/c3/q$g;->c0:Ljava/text/Collator;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    :try_start_a
    invoke-virtual {v0, v1}, Ljava/text/Collator;->setDecomposition(I)V
    :try_end_d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a .. :try_end_d} :catch_e

    .line 12
    .line 13
    .line 14
    goto :goto_2b

    .line 15
    :catch_e
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "COLLATOR EXCEPTION 2"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 42
    .line 43
    .line 44
    :goto_2b
    iget-object v0, p0, Lax/c3/q$g;->c0:Ljava/text/Collator;

    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    invoke-virtual {v0, v1}, Ljava/text/Collator;->setStrength(I)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Lax/u3/a;

    .line 51
    .line 52
    iget-object v1, p0, Lax/c3/q$g;->c0:Ljava/text/Collator;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Lax/u3/a;-><init>(Ljava/text/Collator;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lax/c3/q$g;->q:Lax/u3/a;

    .line 58
    .line 59
    return-void
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
.method public a(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)I
    .registers 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/c3/q$g;->q:Lax/u3/a;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v1, v2}, Lax/u3/a;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_e} :catch_f

    .line 15
    return p1

    .line 16
    :catch_f
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "ALPHANUM EXCEPTION 2"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v2, "name:"

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, ","

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lax/c3/q$g;->c0:Ljava/text/Collator;

    .line 71
    .line 72
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v0, p2, p1}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    return p1
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

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    check-cast p2, Lcom/voxdon/xplorer/file/n;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lax/c3/q$g;->a(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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
