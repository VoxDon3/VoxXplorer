.class public Lcom/voxdon/xplorer/widget/PieProgress;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:Landroid/graphics/RectF;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p1, p2, v0}, Lcom/voxdon/xplorer/widget/PieProgress;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 7

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, -0x1

    .line 2
    iput p3, p0, Lcom/voxdon/xplorer/widget/PieProgress;->d:I

    const v0, -0x77000001

    .line 3
    iput v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->e:I

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->f:I

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v2, Lax/Q2/n;->D1:[I

    invoke-virtual {p1, p2, v2, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 6
    :try_start_18
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    iput p2, p0, Lcom/voxdon/xplorer/widget/PieProgress;->f:I

    const/4 p2, 0x1

    .line 7
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->d:I

    const/4 v2, 0x2

    if-ne v1, p3, :cond_2d

    .line 8
    iput v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->e:I

    goto :goto_3d

    :catchall_2b
    move-exception p2

    goto :goto_4d

    .line 9
    :cond_2d
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result p3

    .line 10
    iget v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->d:I

    const v1, 0xffffff

    and-int/2addr v0, v1

    div-int/2addr p3, v2

    shl-int/lit8 p3, p3, 0x18

    or-int/2addr p3, v0

    iput p3, p0, Lcom/voxdon/xplorer/widget/PieProgress;->e:I

    .line 11
    :goto_3d
    iget p3, p0, Lcom/voxdon/xplorer/widget/PieProgress;->f:I

    if-lez p3, :cond_44

    .line 12
    iput p2, p0, Lcom/voxdon/xplorer/widget/PieProgress;->g:I

    goto :goto_46

    .line 13
    :cond_44
    iput v2, p0, Lcom/voxdon/xplorer/widget/PieProgress;->g:I
    :try_end_46
    .catchall {:try_start_18 .. :try_end_46} :catchall_2b

    .line 14
    :goto_46
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 15
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/PieProgress;->a()V

    return-void

    .line 16
    :goto_4d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 17
    throw p2
.end method

.method private a()V
    .registers 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method


# virtual methods
.method public b(II)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I
    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I
    move-result v1

    iget-object v5, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    sget-object v7, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;
    invoke-virtual {v5, v7},Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    mul-int/lit8 v2, v0, 60
    div-int/lit16 v2, v2, 100
    int-to-float v2, v2

    mul-int/lit8 v3, v0, 94
    div-int/lit16 v3, v3, 100
    int-to-float v3, v3

    mul-int/lit8 v4, v0, 77
    div-int/lit16 v4, v4, 100
    int-to-float v4, v4

    mul-int/lit8 v7, v1, 6
    div-int/lit16 v7, v7, 100
    int-to-float v7, v7

    mul-int/lit8 v8, v1, 94
    div-int/lit16 v8, v8, 100
    int-to-float v8, v8

    iget-object v6, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;
    invoke-virtual {v6, v2, v7, v3, v8},Landroid/graphics/RectF;->set(FFFF)V

    const v9, 0xff0c1622
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v10, 0x41c00000
    const/high16 v11, 0x41c00000
    move-object v8, p1
    move-object v9, v6
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    mul-int/lit8 v7, v1, 8
    div-int/lit16 v7, v7, 100
    int-to-float v7, v7

    mul-int/lit8 v8, v1, 31
    div-int/lit16 v8, v8, 100
    int-to-float v8, v8

    iget-object v6, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;
    invoke-virtual {v6, v2, v7, v3, v8},Landroid/graphics/RectF;->set(FFFF)V

    const v9, 0xffff4d6d
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v10, 0x41b00000
    const/high16 v11, 0x41b00000
    move-object v8, p1
    move-object v9, v6
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const v9, 0xffff4d6d
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v9, 0x41e00000
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setTextSize(F)V

    mul-int/lit8 v10, v0, 3
    div-int/lit16 v10, v10, 100
    int-to-float v10, v10

    mul-int/lit8 v11, v1, 20
    div-int/lit16 v11, v11, 100
    int-to-float v11, v11

    const-string v9, "video"
    move-object v8, p1
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const v9, 0xff0a1218
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v9, 0x42000000
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setTextSize(F)V

    mul-int/lit8 v11, v1, 20
    div-int/lit16 v11, v11, 100
    int-to-float v11, v11

    const-string v13, "30%"
    invoke-virtual {v5, v13},Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
    move-result v7
    const/high16 v8, 0x3f000000
    mul-float v7, v7, v8
    sub-float v10, v4, v7

    const-string v9, "30%"
    move-object v8, p1
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    mul-int/lit8 v7, v1, 33
    div-int/lit16 v7, v7, 100
    int-to-float v7, v7

    mul-int/lit8 v8, v1, 56
    div-int/lit16 v8, v8, 100
    int-to-float v8, v8

    iget-object v6, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;
    invoke-virtual {v6, v2, v7, v3, v8},Landroid/graphics/RectF;->set(FFFF)V

    const v9, 0xff00e5ff
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v10, 0x41b00000
    const/high16 v11, 0x41b00000
    move-object v8, p1
    move-object v9, v6
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const v9, 0xff00e5ff
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v9, 0x41e00000
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setTextSize(F)V

    mul-int/lit8 v10, v0, 3
    div-int/lit16 v10, v10, 100
    int-to-float v10, v10

    mul-int/lit8 v11, v1, 45
    div-int/lit16 v11, v11, 100
    int-to-float v11, v11

    const-string v9, "file"
    move-object v8, p1
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const v9, 0xff0a1218
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v9, 0x42000000
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setTextSize(F)V

    mul-int/lit8 v11, v1, 45
    div-int/lit16 v11, v11, 100
    int-to-float v11, v11

    const-string v13, "30%"
    invoke-virtual {v5, v13},Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
    move-result v7
    const/high16 v8, 0x3f000000
    mul-float v7, v7, v8
    sub-float v10, v4, v7

    const-string v9, "30%"
    move-object v8, p1
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    mul-int/lit8 v7, v1, 58
    div-int/lit16 v7, v7, 100
    int-to-float v7, v7

    mul-int/lit8 v8, v1, 74
    div-int/lit16 v8, v8, 100
    int-to-float v8, v8

    iget-object v6, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;
    invoke-virtual {v6, v2, v7, v3, v8},Landroid/graphics/RectF;->set(FFFF)V

    const v9, 0xffb388ff
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v10, 0x41b00000
    const/high16 v11, 0x41b00000
    move-object v8, p1
    move-object v9, v6
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const v9, 0xffb388ff
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v9, 0x41e00000
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setTextSize(F)V

    mul-int/lit8 v10, v0, 3
    div-int/lit16 v10, v10, 100
    int-to-float v10, v10

    mul-int/lit8 v11, v1, 66
    div-int/lit16 v11, v11, 100
    int-to-float v11, v11

    const-string v9, "système"
    move-object v8, p1
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const v9, 0xff0a1218
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v9, 0x42000000
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setTextSize(F)V

    mul-int/lit8 v11, v1, 66
    div-int/lit16 v11, v11, 100
    int-to-float v11, v11

    const-string v13, "20%"
    invoke-virtual {v5, v13},Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
    move-result v7
    const/high16 v8, 0x3f000000
    mul-float v7, v7, v8
    sub-float v10, v4, v7

    const-string v9, "20%"
    move-object v8, p1
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    mul-int/lit8 v7, v1, 76
    div-int/lit16 v7, v7, 100
    int-to-float v7, v7

    mul-int/lit8 v8, v1, 92
    div-int/lit16 v8, v8, 100
    int-to-float v8, v8

    iget-object v6, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;
    invoke-virtual {v6, v2, v7, v3, v8},Landroid/graphics/RectF;->set(FFFF)V

    const v9, 0xff69f0ae
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v10, 0x41b00000
    const/high16 v11, 0x41b00000
    move-object v8, p1
    move-object v9, v6
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const v9, 0xff69f0ae
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v9, 0x41e00000
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setTextSize(F)V

    mul-int/lit8 v10, v0, 3
    div-int/lit16 v10, v10, 100
    int-to-float v10, v10

    mul-int/lit8 v11, v1, 84
    div-int/lit16 v11, v11, 100
    int-to-float v11, v11

    const-string v9, "app"
    move-object v8, p1
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const v9, 0xff0a1218
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setColor(I)V

    const/high16 v9, 0x42000000
    invoke-virtual {v5, v9},Landroid/graphics/Paint;->setTextSize(F)V

    mul-int/lit8 v11, v1, 84
    div-int/lit16 v11, v11, 100
    int-to-float v11, v11

    const-string v13, "20%"
    invoke-virtual {v5, v13},Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
    move-result v7
    const/high16 v8, 0x3f000000
    mul-float v7, v7, v8
    sub-float v10, v4, v7

    const-string v9, "20%"
    move-object v8, p1
    move-object v12, v5
    invoke-virtual/range {v8 .. v12},Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public setProgressAngle(I)V
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->c:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setProgressPercent(I)V
    .registers 2

    .line 1
    mul-int/lit16 p1, p1, 0x168

    .line 2
    .line 3
    div-int/lit8 p1, p1, 0x64

    .line 4
    .line 5
    iput p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
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

.method public setStrokeWidth(I)V
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->f:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setStyle(I)V
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->g:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
