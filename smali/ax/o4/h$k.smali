.class Lax/o4/h$k;
.super Lax/o4/h$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "k"
.end annotation


# instance fields
.field b:F

.field final synthetic c:Lax/o4/h;


# direct methods
.method private constructor <init>(Lax/o4/h;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/o4/h$k;->c:Lax/o4/h;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lax/o4/h$j;-><init>(Lax/o4/h;Lax/o4/h$a;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lax/o4/h$k;->b:F

    return-void
.end method

.method synthetic constructor <init>(Lax/o4/h;Lax/o4/h$a;)V
    .registers 3

    .line 3
    invoke-direct {p0, p1}, Lax/o4/h$k;-><init>(Lax/o4/h;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .registers 4

    .line 1
    iget v0, p0, Lax/o4/h$k;->b:F

    .line 2
    .line 3
    iget-object v1, p0, Lax/o4/h$k;->c:Lax/o4/h;

    .line 4
    .line 5
    invoke-static {v1}, Lax/o4/h;->c(Lax/o4/h;)Lax/o4/h$h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    add-float/2addr v0, p1

    .line 16
    iput v0, p0, Lax/o4/h$k;->b:F

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method
