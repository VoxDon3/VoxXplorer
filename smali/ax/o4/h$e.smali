.class Lax/o4/h$e;
.super Lax/o4/h$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field private e:Landroid/graphics/Path;

.field final synthetic f:Lax/o4/h;


# direct methods
.method constructor <init>(Lax/o4/h;Landroid/graphics/Path;FF)V
    .registers 5

    .line 1
    iput-object p1, p0, Lax/o4/h$e;->f:Lax/o4/h;

    .line 2
    .line 3
    invoke-direct {p0, p1, p3, p4}, Lax/o4/h$f;-><init>(Lax/o4/h;FF)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lax/o4/h$e;->e:Landroid/graphics/Path;

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


# virtual methods
.method public b(Ljava/lang/String;)V
    .registers 15

    .line 1
    iget-object v0, p0, Lax/o4/h$e;->f:Lax/o4/h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/o4/h;->b(Lax/o4/h;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4f

    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/h$e;->f:Lax/o4/h;

    .line 10
    .line 11
    invoke-static {v0}, Lax/o4/h;->c(Lax/o4/h;)Lax/o4/h$h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v0, v0, Lax/o4/h$h;->b:Z

    .line 16
    .line 17
    if-eqz v0, :cond_2b

    .line 18
    .line 19
    iget-object v0, p0, Lax/o4/h$e;->f:Lax/o4/h;

    .line 20
    .line 21
    invoke-static {v0}, Lax/o4/h;->d(Lax/o4/h;)Landroid/graphics/Canvas;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v3, p0, Lax/o4/h$e;->e:Landroid/graphics/Path;

    .line 26
    .line 27
    iget v4, p0, Lax/o4/h$f;->b:F

    .line 28
    .line 29
    iget v5, p0, Lax/o4/h$f;->c:F

    .line 30
    .line 31
    iget-object v0, p0, Lax/o4/h$e;->f:Lax/o4/h;

    .line 32
    .line 33
    invoke-static {v0}, Lax/o4/h;->c(Lax/o4/h;)Lax/o4/h$h;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v6, v0, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 38
    .line 39
    move-object v2, p1

    .line 40
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    move-object v2, p1

    .line 45
    :goto_2c
    iget-object p1, p0, Lax/o4/h$e;->f:Lax/o4/h;

    .line 46
    .line 47
    invoke-static {p1}, Lax/o4/h;->c(Lax/o4/h;)Lax/o4/h$h;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-boolean p1, p1, Lax/o4/h$h;->c:Z

    .line 52
    .line 53
    if-eqz p1, :cond_50

    .line 54
    .line 55
    iget-object p1, p0, Lax/o4/h$e;->f:Lax/o4/h;

    .line 56
    .line 57
    invoke-static {p1}, Lax/o4/h;->d(Lax/o4/h;)Landroid/graphics/Canvas;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    iget-object v9, p0, Lax/o4/h$e;->e:Landroid/graphics/Path;

    .line 62
    .line 63
    iget v10, p0, Lax/o4/h$f;->b:F

    .line 64
    .line 65
    iget v11, p0, Lax/o4/h$f;->c:F

    .line 66
    .line 67
    iget-object p1, p0, Lax/o4/h$e;->f:Lax/o4/h;

    .line 68
    .line 69
    invoke-static {p1}, Lax/o4/h;->c(Lax/o4/h;)Lax/o4/h$h;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object v12, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 74
    .line 75
    move-object v8, v2

    .line 76
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 77
    .line 78
    .line 79
    goto :goto_50

    .line 80
    :cond_4f
    move-object v2, p1

    .line 81
    :cond_50
    :goto_50
    iget p1, p0, Lax/o4/h$f;->b:F

    .line 82
    .line 83
    iget-object v0, p0, Lax/o4/h$e;->f:Lax/o4/h;

    .line 84
    .line 85
    invoke-static {v0}, Lax/o4/h;->c(Lax/o4/h;)Lax/o4/h$h;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v0, v0, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 90
    .line 91
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    add-float/2addr p1, v0

    .line 96
    iput p1, p0, Lax/o4/h$f;->b:F

    .line 97
    .line 98
    return-void
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
.end method
