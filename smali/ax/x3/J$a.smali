.class Lax/x3/J$a;
.super Landroidx/recyclerview/widget/RecyclerView$F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/x3/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private final u:Landroid/widget/TextView;

.field private final v:Landroid/widget/ImageView;

.field final synthetic w:Lax/x3/J;


# direct methods
.method public constructor <init>(Lax/x3/J;Landroid/view/View;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/x3/J$a;->w:Lax/x3/J;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$F;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lax/x3/J$a$a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lax/x3/J$a$a;-><init>(Lax/x3/J$a;Lax/x3/J;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    .line 13
    .line 14
    const p1, 0x7f0a0321

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/widget/TextView;

    .line 22
    .line 23
    iput-object p1, p0, Lax/x3/J$a;->u:Landroid/widget/TextView;

    .line 24
    .line 25
    const p1, 0x7f0a024f

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Landroid/widget/ImageView;

    .line 33
    .line 34
    iput-object p1, p0, Lax/x3/J$a;->v:Landroid/widget/ImageView;

    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method public N(Lax/o3/o;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/x3/J$a;->u:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/o3/o;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lax/o3/o;->f()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, 0x2

    .line 15
    if-eq p1, v0, :cond_31

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    if-eq p1, v0, :cond_28

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    if-eq p1, v0, :cond_1f

    .line 22
    .line 23
    iget-object p1, p0, Lax/x3/J$a;->v:Landroid/widget/ImageView;

    .line 24
    .line 25
    const v0, 0x7f0801fb

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1f
    iget-object p1, p0, Lax/x3/J$a;->v:Landroid/widget/ImageView;

    .line 33
    .line 34
    const v0, 0x7f080205

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_28
    iget-object p1, p0, Lax/x3/J$a;->v:Landroid/widget/ImageView;

    .line 42
    .line 43
    const v0, 0x7f0801b6

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_31
    iget-object p1, p0, Lax/x3/J$a;->v:Landroid/widget/ImageView;

    .line 51
    .line 52
    const v0, 0x7f080204

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 56
    .line 57
    .line 58
    return-void
    .line 59
    .line 60
    .line 61
.end method
